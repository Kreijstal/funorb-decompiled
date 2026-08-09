/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qob implements ntb {
    static int field_b;
    private int field_c;
    private int field_a;

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        qob var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = (qob) ((Object) param0);
              var4 = 0;
              if (this.field_c == var5.field_c) {
                break L1;
              } else {
                var4 = 1;
                System.out.println("int x has changed. before=" + var5.field_c + ", now=" + this.field_c);
                break L1;
              }
            }
            L2: {
              if (var5.field_a != this.field_a) {
                var4 = 1;
                System.out.println("int y has changed. before=" + var5.field_a + ", now=" + this.field_a);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var4 != 0) {
                System.out.println("This instance of Nebula has changed");
                break L3;
              } else {
                break L3;
              }
            }
            if (param1 < -19) {
              break L0;
            } else {
              this.field_c = -50;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("qob.F(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        qob var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = (qob) ((Object) param1);
                var4 = -105 % ((param0 - 22) / 59);
                if (var3.field_c != this.field_c) {
                  break L2;
                } else {
                  if (var3.field_a == this.field_a) {
                    stackIn_5_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_5_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("qob.C(").append(param0).append(',');

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
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static void a(int param0) {
        int var1 = -119 / ((param0 - -46) / 50);
        if (!(hwa.field_o == null)) {
            hwa.field_o.l((byte) -106);
        }
        fib.field_j = new waa();
        s.field_o.b(fib.field_j, -116);
    }

    public final void b(faa param0, int param1) {
        try {
            if (param1 >= -109) {
                faa var4 = (faa) null;
                this.a((faa) null, true);
            }
            param0.a(-632, this.field_c, 32);
            param0.a(-632, this.field_a, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "qob.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
            return;
        }
        try {
            this.field_c = param0.i(0, 32);
            this.field_a = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "qob.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(vu param0, int param1, vu param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var3_int = -param0.field_yb + param2.field_yb;
              if (param2.field_Ab != kbb.field_q) {
                if (null != param2.field_Ab) {
                  break L1;
                } else {
                  var3_int += 200;
                  break L1;
                }
              } else {
                var3_int -= 200;
                break L1;
              }
            }
            L2: {
              if (param1 == 7569) {
                break L2;
              } else {
                qob.a(-48);
                break L2;
              }
            }
            L3: {
              if (kbb.field_q != param0.field_Ab) {
                if (param0.field_Ab == null) {
                  var3_int -= 200;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                var3_int += 200;
                break L3;
              }
            }
            L4: {
              if (-1 <= (var3_int ^ -1)) {
                stackIn_15_0 = 0;
                break L4;
              } else {
                stackIn_15_0 = 1;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("qob.E(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final int a(boolean param0) {
        if (!param0) {
            this.field_c = 7;
            return this.field_c;
        }
        return this.field_c;
    }

    final boolean a(byte param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int stackIn_4_0 = 0;
        if (param0 != 100) {
          return true;
        } else {
          L0: {
            var4 = -this.field_c + param1;
            var5 = -this.field_a + param2;
            var6 = ar.a(var4, (byte) 105, var5);
            if (var6 >= 32768) {
              stackIn_4_0 = 0;
              break L0;
            } else {
              stackIn_4_0 = 1;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final int a(byte param0) {
        if (param0 >= -49) {
            return 42;
        }
        return this.field_a;
    }

    private final int a(int param0, boolean param1) {
        if (!param1) {
          field_b = 68;
          return 8192 * (-(param0 % 3) + 3);
        } else {
          return 8192 * (-(param0 % 3) + 3);
        }
    }

    public final void b(byte param0, tv param1) {
        qob var5 = null;
        qob var6 = null;
        try {
            if (param0 < 54) {
                this.a(false);
            }
            var5 = (qob) ((Object) param1);
            var6 = var5;
            var6.field_c = this.field_c;
            var6.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "qob.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    qob() {
    }

    qob(int param0, int param1) {
        this.field_a = param1;
        this.field_c = param0;
    }

    final void a(sg param0, int param1, int param2, lta param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        aja var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        try {
          L0: {
            var6_int = param4 % 16 + -8;
            var7 = param3.b(this.field_c - -(fc.a(param2 * var6_int << 247592673, (byte) -127) >> -1595612796), -125);
            var8 = param3.c(0, this.field_a + (eu.a(param2 * var6_int << 1896834977, 116) >> -1421974748));
            if (param1 > 42) {
              L1: {
                var9 = this.a(param4, true);
                var10 = 200;
                var11 = 7842355;
                if (!li.field_i) {
                  break L1;
                } else {
                  if (1 == ki.field_o) {
                    L2: {
                      var12 = param4 % 3 + 8;
                      var13 = mmb.field_d[var12];
                      var14 = (int)((float)var9 * param3.field_a * 4.0f);
                      var15 = (int)var7 + -(var14 >> 1568429825);
                      var16 = -(var14 >> 106455297) + (int)var8;
                      var17 = var9 << 790183553;
                      if (param3.field_f[0] > this.field_c + var17) {
                        break L2;
                      } else {
                        if (-var17 + this.field_c >= param3.field_f[1]) {
                          break L2;
                        } else {
                          if (this.field_a + var17 < param3.field_f[2]) {
                            break L2;
                          } else {
                            if (param3.field_f[3] <= this.field_a + -var17) {
                              break L2;
                            } else {
                              var13.a(var15, var16, var14, var14, 2, var11, 1);
                              return;
                            }
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              jj.a(var11, (byte) 7, (int)var8, param3.field_a * (float)var9, var10, (int)var7);
              return;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("qob.L(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_b = 64;
    }
}
