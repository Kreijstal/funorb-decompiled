/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends id {
    static int field_t;
    static boolean field_v;
    private int field_r;
    private int field_q;
    private int field_p;
    private pb[] field_s;
    static pf field_u;

    final static ek[] a(int param0, int param1, int param2, pf param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ek[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ek[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4_int = 9;
            if (tl.a(param3, (byte) -5, param2, param1)) {
              stackOut_3_0 = rb.g(1851);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ek[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("b.D(").append(-127).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static boolean a(char param0, byte param1) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (!od.a(param0, false)) {
            if (param0 != 45) {
              if (160 != param0) {
                if (param0 != 32) {
                  if (param0 == 95) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void b(boolean param0) {
        field_u = null;
    }

    final static void a(String param0, byte param1, long param2, String param3, java.applet.Applet param4) {
        try {
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var8 = param4.getParameter("cookiehost");
                    var7 = var8;
                    var7 = var8;
                    var9 = param3 + "=" + param0 + "; version=1; path=/; domain=" + var8;
                    var7 = var9;
                    var7 = var9;
                    if (param2 < 0L) {
                      var7 = var9 + "; Discard;";
                      break L1;
                    } else {
                      var7 = var9 + "; Expires=" + od.a(10, param2 * 1000L + ih.a((byte) -98)) + "; Max-Age=" + param2;
                      break L1;
                    }
                  }
                  sh.a(-13847, "document.cookie=\"" + var7 + "\"", param4);
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var6_ref;
                stackOut_7_1 = new StringBuilder().append("b.F(");
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L2;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L2;
                }
              }
              L3: {
                stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(38).append(',').append(param2).append(',');
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param3 == null) {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L3;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L3;
                }
              }
              L4: {
                stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param4 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L4;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L4;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public b() {
        this(2188450, 2591221, 9543);
    }

    final static void a(int param0, int param1) {
        if (param0 != 0) {
          L0: {
            if (param0 == 1) {
              e.field_e = 1;
              stellarshard.field_U[6] = stellarshard.field_U[6] + 1;
              break L0;
            } else {
              break L0;
            }
          }
          if (2 != param0) {
            if (3 != param0) {
              L1: {
                if (param0 == 4) {
                  e.field_e = 4;
                  stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 == 5) {
                  e.field_e = 5;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (param0 == 6) {
                  e.field_e = 6;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param0 == 7) {
                  e.field_e = 7;
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            } else {
              L5: {
                e.field_e = 3;
                stellarshard.field_U[7] = stellarshard.field_U[7] + 1;
                if (param0 == 4) {
                  e.field_e = 4;
                  stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (param0 == 5) {
                  e.field_e = 5;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (param0 == 6) {
                  e.field_e = 6;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (param0 == 7) {
                  e.field_e = 7;
                  break L8;
                } else {
                  break L8;
                }
              }
              return;
            }
          } else {
            e.field_e = 2;
            if (3 != param0) {
              L9: {
                if (param0 == 4) {
                  e.field_e = 4;
                  stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (param0 == 5) {
                  e.field_e = 5;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (param0 == 6) {
                  e.field_e = 6;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (param0 == 7) {
                  e.field_e = 7;
                  break L12;
                } else {
                  break L12;
                }
              }
              return;
            } else {
              L13: {
                e.field_e = 3;
                stellarshard.field_U[7] = stellarshard.field_U[7] + 1;
                if (param0 == 4) {
                  e.field_e = 4;
                  stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (param0 == 5) {
                  e.field_e = 5;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (param0 == 6) {
                  e.field_e = 6;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (param0 == 7) {
                  e.field_e = 7;
                  break L16;
                } else {
                  break L16;
                }
              }
              return;
            }
          }
        } else {
          L17: {
            e.field_e = 0;
            stellarshard.field_U[2] = stellarshard.field_U[2] + 1;
            if (param0 == 1) {
              e.field_e = 1;
              stellarshard.field_U[6] = stellarshard.field_U[6] + 1;
              break L17;
            } else {
              break L17;
            }
          }
          if (2 == param0) {
            e.field_e = 2;
            if (3 == param0) {
              L18: {
                e.field_e = 3;
                stellarshard.field_U[7] = stellarshard.field_U[7] + 1;
                if (param0 == 4) {
                  e.field_e = 4;
                  stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (param0 == 5) {
                  e.field_e = 5;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (param0 == 6) {
                  e.field_e = 6;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (param0 == 7) {
                  e.field_e = 7;
                  break L21;
                } else {
                  break L21;
                }
              }
              return;
            } else {
              L22: {
                if (param0 == 4) {
                  e.field_e = 4;
                  stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
                  break L22;
                } else {
                  break L22;
                }
              }
              L23: {
                if (param0 == 5) {
                  e.field_e = 5;
                  break L23;
                } else {
                  break L23;
                }
              }
              L24: {
                if (param0 == 6) {
                  e.field_e = 6;
                  break L24;
                } else {
                  break L24;
                }
              }
              L25: {
                if (param0 == 7) {
                  e.field_e = 7;
                  break L25;
                } else {
                  break L25;
                }
              }
              return;
            }
          } else {
            if (3 != param0) {
              L26: {
                if (param0 == 4) {
                  e.field_e = 4;
                  stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
                  break L26;
                } else {
                  break L26;
                }
              }
              L27: {
                if (param0 == 5) {
                  e.field_e = 5;
                  break L27;
                } else {
                  break L27;
                }
              }
              L28: {
                if (param0 == 6) {
                  e.field_e = 6;
                  break L28;
                } else {
                  break L28;
                }
              }
              L29: {
                if (param0 == 7) {
                  e.field_e = 7;
                  break L29;
                } else {
                  break L29;
                }
              }
              return;
            } else {
              L30: {
                e.field_e = 3;
                stellarshard.field_U[7] = stellarshard.field_U[7] + 1;
                if (param0 == 4) {
                  e.field_e = 4;
                  stellarshard.field_U[14] = stellarshard.field_U[14] + 1;
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                if (param0 == 5) {
                  e.field_e = 5;
                  break L31;
                } else {
                  break L31;
                }
              }
              L32: {
                if (param0 == 6) {
                  e.field_e = 6;
                  break L32;
                } else {
                  break L32;
                }
              }
              L33: {
                if (param0 == 7) {
                  e.field_e = 7;
                  break L33;
                } else {
                  break L33;
                }
              }
              return;
            }
          }
        }
    }

    private b(int param0, int param1, int param2) {
        ((b) this).field_a = s.field_c;
        ((b) this).field_r = param0;
        ((b) this).field_p = param2;
        ((b) this).field_q = param1;
        ((b) this).field_s = mh.field_i;
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (!param3.field_q) {
                if (param3.e(0)) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 1;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (!(param3 instanceof ig)) {
                break L2;
              } else {
                param0 = param0 & ((ig) (Object) param3).field_E;
                break L2;
              }
            }
            if (param4 == 4549) {
              L3: {
                if (!param0) {
                  stackOut_14_0 = ((b) this).field_p;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  if (var6_int == 0) {
                    stackOut_13_0 = ((b) this).field_r;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  } else {
                    stackOut_12_0 = ((b) this).field_q;
                    stackIn_15_0 = stackOut_12_0;
                    break L3;
                  }
                }
              }
              L4: {
                var7 = stackIn_15_0;
                if (!param0) {
                  stackOut_17_0 = 7105644;
                  stackIn_18_0 = stackOut_17_0;
                  break L4;
                } else {
                  stackOut_16_0 = 16777215;
                  stackIn_18_0 = stackOut_16_0;
                  break L4;
                }
              }
              var8 = stackIn_18_0;
              af.a(-57, var7, param3.field_p, param3.field_k + param2 + (param3.field_t + -((b) this).field_s[0].field_x >> 1), ((b) this).field_s, param3.field_w + param1);
              int discarded$1 = ((b) this).field_a.a(param3.field_m, param3.field_w + param1, param3.field_k + (param2 - 2), param3.field_p, param3.field_t, var8, -1, 1, 1, ((b) this).field_a.field_N);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("b.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param4 + ')');
        }
    }

    static {
    }
}
