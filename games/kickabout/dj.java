/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class dj extends qt {
    static int field_A;
    static hd field_D;
    int field_C;
    static String field_B;

    final void h(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -76) {
                break L1;
              } else {
                ((dj) this).field_C = 32;
                break L1;
              }
            }
            L2: {
              ((dj) this).field_C = ((dj) this).field_C - 1;
              if (((dj) this).field_C < 0) {
                ((dj) this).field_C = 0;
                break L2;
              } else {
                break L2;
              }
            }
            kj.a((byte) -103);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "dj.JA(" + param0 + ')');
        }
    }

    final boolean a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_13_0 = 0;
        boolean stackOut_15_0 = false;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (((dj) this).field_i[param0].field_m != 21) {
                break L1;
              } else {
                if (this.g((byte) -122)) {
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            if (param1 == -95) {
              L2: {
                if (((dj) this).field_i[param0].field_m != 22) {
                  break L2;
                } else {
                  if (this.b(false)) {
                    break L2;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                }
              }
              stackOut_15_0 = super.a(param0, (byte) -95);
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "dj.U(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    boolean a(int param0, int param1, char param2) {
        RuntimeException var4 = null;
        int stackIn_7_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        boolean stackOut_11_0 = false;
        try {
          L0: {
            L1: {
              ((dj) this).field_x.a(1, true);
              if (((dj) this).field_x.field_e < 0) {
                break L1;
              } else {
                if (((dj) this).field_x.c(-1)) {
                  ((dj) this).field_i[((dj) this).field_x.field_e].a(-1, false);
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 < -5) {
                break L2;
              } else {
                field_D = null;
                break L2;
              }
            }
            stackOut_11_0 = super.a(param0, -53, param2);
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var4, "dj.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String[] var3_array = null;
        int var4_int = 0;
        String var4 = null;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              if (!this.g((byte) -120)) {
                var3_int = ((dj) this).field_i[0].field_d;
                var4_int = ((dj) this).field_i[0].field_h;
                var5_int = ((dj) this).b(0, -22667) + (((dj) this).field_j + -(var3_int >> -1522629823));
                var6 = ((dj) this).a(-124, 0) - (var4_int >> 758989121);
                on.a(var5_int - 4, -4 + var6, 8 + var3_int, var4_int + 8, 10, 0, 128);
                eo.field_r[0][3].c(var5_int, var6);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!this.b(false)) {
                var3_int = ((dj) this).field_i[2].field_d;
                var4_int = ((dj) this).field_i[2].field_h;
                var5_int = -(var3_int >> 1468389729) + (((dj) this).b(2, param0 ^ 22670) - -((dj) this).field_j);
                var6 = -(var4_int >> 1779281729) + ((dj) this).a(101, 2);
                on.a(-4 + var5_int, -4 + var6, 8 + var3_int, var4_int - -8, 10, 0, 128);
                eo.field_c[0][3].c(var5_int, var6);
                break L2;
              } else {
                break L2;
              }
            }
            on.a(((dj) this).field_j + 15, 60, 610, 355, 10, 0, 128);
            var3_array = this.a(true);
            var4 = var3_array[((dj) this).field_C].toUpperCase();
            on.a(((dj) this).field_j + 40, 76, 560, 36, 10, 65793, 140);
            un.field_d.d(var4, ((dj) this).field_j + 320, 101, 16777215, -1);
            var5 = ((dj) this).field_C - -1 + " / " + var3_array.length;
            un.field_d.c(var5, 580 - -((dj) this).field_j, 101, 16777215, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "dj.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static StringBuilder a(int param0, char param1, int param2, StringBuilder param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        StringBuilder stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var4_int = param3.length();
              param3.setLength(param0);
              if (param2 == -11407) {
                break L1;
              } else {
                field_B = null;
                break L1;
              }
            }
            var5 = var4_int;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var5 <= ~param0) {
                    break L4;
                  } else {
                    stackOut_6_0 = (StringBuilder) param3;
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      ((StringBuilder) (Object) stackIn_7_0).setCharAt(var5, param1);
                      var5++;
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_10_0 = (StringBuilder) param3;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("dj.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_11_0;
    }

    void a(byte param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a((byte) 98, param1);
              var3_int = -34 / ((param0 - 38) / 60);
              if (((dj) this).field_x.field_e != 0) {
                break L1;
              } else {
                if (this.g((byte) -93)) {
                  break L1;
                } else {
                  ((dj) this).field_x.a((byte) 68, 1);
                  break L1;
                }
              }
            }
            L2: {
              if (((dj) this).field_x.field_e != 2) {
                break L2;
              } else {
                if (!this.b(false)) {
                  ((dj) this).field_x.a((byte) 68, 1);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "dj.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final String[] a(boolean param0) {
        RuntimeException var2 = null;
        String[] stackIn_2_0 = null;
        String[] stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        String[] stackIn_13_0 = null;
        String[] stackIn_18_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_6_0 = null;
        String[] stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        String[] stackOut_12_0 = null;
        Object stackOut_9_0 = null;
        String[] stackOut_1_0 = null;
        try {
          L0: {
            if (((dj) this).field_c != 19) {
              if (20 == ((dj) this).field_c) {
                stackOut_6_0 = uv.field_d;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param0) {
                  if (((dj) this).field_c != 21) {
                    if (((dj) this).field_c == 22) {
                      stackOut_17_0 = pt.field_l;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    } else {
                      stackOut_19_0 = null;
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    }
                  } else {
                    stackOut_12_0 = ue.field_g;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                } else {
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  return (String[]) (Object) stackIn_10_0;
                }
              }
            } else {
              stackOut_1_0 = iq.field_a;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "dj.DA(" + param0 + ')');
        }
        return (String[]) (Object) stackIn_20_0;
    }

    final void f(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((dj) this).field_C = ((dj) this).field_C + 1;
              var2_int = this.a(true).length;
              if (~((dj) this).field_C <= ~var2_int) {
                ((dj) this).field_C = var2_int + -1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              kj.a((byte) 58);
              if (param0 == 21) {
                break L2;
              } else {
                ((dj) this).field_C = 21;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw nb.a((Throwable) (Object) runtimeException, "dj.EA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2) {
        try {
            super.a(param0, param1, param2);
            ((dj) this).field_C = 0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "dj.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean b(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            if (((dj) this).field_C == -1 + this.a(true).length) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  ((dj) this).a((byte) -54, true);
                  break L1;
                }
              }
              stackOut_8_0 = 1;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "dj.HA(" + param0 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final int b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == -22667) {
                break L1;
              } else {
                boolean discarded$2 = this.g((byte) 91);
                break L1;
              }
            }
            stackOut_3_0 = 320 - -(70 * (-1 + param0));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "dj.S(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public static void e(int param0) {
        try {
            field_B = null;
            field_D = null;
            if (param0 != -29104) {
                StringBuilder discarded$0 = dj.a(40, 'ﾄ', 84, (StringBuilder) null);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "dj.IA(" + param0 + ')');
        }
    }

    private final boolean g(byte param0) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 <= -70) {
                break L1;
              } else {
                ((dj) this).field_C = -4;
                break L1;
              }
            }
            if (0 != ((dj) this).field_C) {
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "dj.FA(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    dj() {
    }

    final int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var3_int = -127 / ((param0 - -49) / 52);
            stackOut_0_0 = 457;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "dj.R(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = -1;
        field_B = "You cannot join this game - it is in progress";
    }
}
