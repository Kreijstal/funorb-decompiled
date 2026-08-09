/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cqb extends wm implements ntb {
    static boolean field_e;
    private int field_d;
    private int field_c;
    static String field_f;

    final String a(int param0) {
        if (param0 != -1) {
          cqb.a(104, -21, -70, -33, (byte) -17);
          return "Variable " + this.field_c + " at least " + this.field_d;
        } else {
          return "Variable " + this.field_c + " at least " + this.field_d;
        }
    }

    public final boolean a(byte param0, tv param1) {
        cqb var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = (cqb) ((Object) param1);
                var4 = 7 % ((22 - param0) / 59);
                if (super.a((byte) 116, param1)) {
                  break L2;
                } else {
                  if (var3.field_c != this.field_c) {
                    break L2;
                  } else {
                    if (var3.field_d == this.field_d) {
                      stackIn_6_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackIn_6_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("cqb.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    public static void c(int param0) {
        int var1 = -104 / ((param0 - -54) / 51);
        field_f = null;
    }

    final boolean a(int param0, lbb param1, pe param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.field_d = 113;
                break L1;
              }
            }
            L2: {
              if (param1.b(7061, this.field_c) < this.field_d) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("cqb.G(").append(param0).append(',');

            if (param1 == null) {
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
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static rn d(int param0) {
        int var1_int = 0;
        rn var2 = null;
        rn stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        if (param0 == 10) {
          try {
            L0: {
              var1_int = 0;
              L1: while (true) {
                var2 = lnb.field_i.a((byte) -72, var1_int);
                if (var2.field_k) {
                  stackIn_6_0 = (rn) (var2);
                  break L0;
                } else {
                  var1_int++;
                  continue L1;
                }
              }
            }
          } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
            return null;
          }
          return stackIn_6_0;
        } else {
          return (rn) null;
        }
    }

    public final void b(byte param0, tv param1) {
        cqb var5 = null;
        cqb var6 = null;
        try {
            if (param0 <= 54) {
                this.a((byte) -47, -43);
            }
            super.b((byte) 82, param1);
            var5 = (cqb) ((Object) param1);
            var6 = var5;
            var6.field_d = this.field_d;
            var6.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "cqb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(byte param0) {
        pja.e(-110);
        int var1 = -25 / ((46 - param0) / 35);
    }

    final ucb[] a(pe param0, int param1) {
        RuntimeException var3 = null;
        ucb[] stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != -20605) {
              stackIn_3_0 = (ucb[]) null;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("cqb.I(");

            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    cqb() {
    }

    final void a(pe param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                this.field_c = param3;
                if (0 > this.field_c) {
                  this.field_c = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                this.field_d = param3;
                break L1;
              }
            }
            if (param1 == -2) {
              break L0;
            } else {
              cqb.c(80);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("cqb.E(");

            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -120);
        param0.a(-632, this.field_c, 32);
        if (param1 > -109) {
            return;
        }
        try {
            param0.a(-632, this.field_d, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "cqb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    cqb(int param0, int param1) {
        this.field_c = param0;
        this.field_d = param1;
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, param1);
            this.field_c = param0.i(0, 32);
            this.field_d = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "cqb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(int param0) {
        int var2;
        String[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        String[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        String stackIn_4_2 = null;
        String[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        String stackIn_13_2 = null;
        String[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        String[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        String stackIn_20_2 = null;
        String[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        String[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        String stackIn_27_2 = null;
        var2 = VoidHunters.field_G;
        if ((1 << vqa.field_g.field_L & vqa.field_g.field_m.field_k) == 0) {
          if (vqa.field_g.field_m.field_k != 0) {
            L0: {
              stackIn_26_0 = ifa.field_g;

              stackIn_26_1 = 10;

              if (vqa.field_g.field_h) {
                stackIn_27_0 = (String[]) ((Object) stackIn_26_0);
                stackIn_27_1 = stackIn_26_1;
                stackIn_27_2 = gdb.field_d;
                break L0;
              } else {
                stackIn_27_0 = (String[]) ((Object) stackIn_26_0);
                stackIn_27_1 = stackIn_26_1;
                stackIn_27_2 = wpb.field_o;
                break L0;
              }
            }
            stackIn_27_0[stackIn_27_1] = stackIn_27_2;
            if (param0 > -76) {
              field_e = false;
              return;
            } else {
              return;
            }
          } else {
            if ((vqa.field_g.field_B | 1 << vqa.field_g.field_L) == -1 + (1 << vqa.field_g.field_m.field_a)) {
              L1: {
                stackIn_19_0 = ifa.field_g;

                stackIn_19_1 = 10;

                if (!vqa.field_g.field_h) {
                  stackIn_20_0 = (String[]) ((Object) stackIn_19_0);
                  stackIn_20_1 = stackIn_19_1;
                  stackIn_20_2 = gs.field_d;
                  break L1;
                } else {
                  stackIn_20_0 = (String[]) ((Object) stackIn_19_0);
                  stackIn_20_1 = stackIn_19_1;
                  stackIn_20_2 = pva.field_e;
                  break L1;
                }
              }
              stackIn_20_0[stackIn_20_1] = stackIn_20_2;
              if (param0 > -76) {
                field_e = false;
                return;
              } else {
                return;
              }
            } else {
              L2: {
                stackIn_12_0 = ifa.field_g;

                stackIn_12_1 = 10;

                if (vqa.field_g.field_h) {
                  stackIn_13_0 = (String[]) ((Object) stackIn_12_0);
                  stackIn_13_1 = stackIn_12_1;
                  stackIn_13_2 = eua.field_a;
                  break L2;
                } else {
                  stackIn_13_0 = (String[]) ((Object) stackIn_12_0);
                  stackIn_13_1 = stackIn_12_1;
                  stackIn_13_2 = ffb.field_d;
                  break L2;
                }
              }
              stackIn_13_0[stackIn_13_1] = stackIn_13_2;
              if (param0 <= -76) {
                return;
              } else {
                field_e = false;
                return;
              }
            }
          }
        } else {
          L3: {
            stackIn_3_0 = ifa.field_g;

            stackIn_3_1 = 10;

            if (vqa.field_g.field_h) {
              stackIn_4_0 = (String[]) ((Object) stackIn_3_0);
              stackIn_4_1 = stackIn_3_1;
              stackIn_4_2 = csa.field_b;
              break L3;
            } else {
              stackIn_4_0 = (String[]) ((Object) stackIn_3_0);
              stackIn_4_1 = stackIn_3_1;
              stackIn_4_2 = fhb.field_o;
              break L3;
            }
          }
          stackIn_4_0[stackIn_4_1] = stackIn_4_2;
          if (param0 <= -76) {
            return;
          } else {
            field_e = false;
            return;
          }
        }
    }

    final int a(byte param0, int param1) {
        if (param0 >= -102) {
            return -56;
        }
        if (param1 != 0) {
            return this.field_d;
        }
        return this.field_c;
    }

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        cqb var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, -64);
              var5 = (cqb) ((Object) param0);
              var4 = 0;
              if (var5.field_c != this.field_c) {
                System.out.println("int index has changed. before=" + var5.field_c + ", now=" + this.field_c);
                var4 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var5.field_d == this.field_d) {
                break L2;
              } else {
                var4 = 1;
                System.out.println("int value has changed. before=" + var5.field_d + ", now=" + this.field_d);
                break L2;
              }
            }
            L3: {
              if (param1 <= -19) {
                break L3;
              } else {
                field_f = (String) null;
                break L3;
              }
            }
            if (var4 == 0) {
              break L0;
            } else {
              System.out.println("This instance of MissionConditionVariableAtLeast has changed");
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("cqb.F(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != -54) {
            return;
        }
        if (!(rb.field_c != null)) {
            return;
        }
        rb.field_c.b(-10258, new pd(param3, param2, param0, param1));
    }

    static {
        field_f = "You must play 1 more rated game before playing with the current options.";
    }
}
