/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static String[] field_a;
    static String field_c;
    private hj[] field_d;
    static hj field_b;

    final static wa a(int param0, int param1, ki param2, ki param3, int param4) {
        RuntimeException var5 = null;
        wa stackIn_6_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        wa stackOut_5_0 = null;
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
        try {
          L0: {
            if (pk.a(80, param0, param3, param4)) {
              L1: {
                if (param1 == -6) {
                  break L1;
                } else {
                  pf.a((byte) 9, 16);
                  break L1;
                }
              }
              stackOut_5_0 = i.a(false, param2.b(param0, false, param4));
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var5);
            stackOut_7_1 = new StringBuilder().append("pf.C(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param4 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_b = (hj) null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          L1: {
            var7 = OrbDefence.field_D ? 1 : 0;
            var2 = 0;
            var3 = ji.field_b;
            if (-6 >= (var3 ^ -1)) {
              break L1;
            } else {
              var2 = var3 * (var3 * 8192) / 1100;
              if (var7 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (105 > var3) {
              break L2;
            } else {
              if ((var3 ^ -1) <= -121) {
                break L0;
              } else {
                var3 = -var3 + 120;
                var2 = 8192 + -(var3 * var3 * 8192 / 3300);
                if (var7 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
          }
          var2 = (-40960 + 16384 * var3) / 220;
          break L0;
        }
        L3: {
          var4 = 1;
          var5 = 0;
          if ((param1 ^ -1) == -2) {
            var5 = 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if ((param1 ^ -1) != -4) {
            break L4;
          } else {
            var4 = -1;
            break L4;
          }
        }
        L5: {
          if (-5 != (param1 ^ -1)) {
            break L5;
          } else {
            var5 = 1;
            var4 = 1;
            break L5;
          }
        }
        L6: {
          if ((param1 ^ -1) == -6) {
            var5 = 1;
            var4 = -1;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (6 != param1) {
            break L7;
          } else {
            var4 = 1;
            var5 = -1;
            break L7;
          }
        }
        if ((param1 ^ -1) != -8) {
          if (-9 == (param1 ^ -1)) {
            L8: {
              var4 = -1;
              var5 = -1;
              var6 = -24 % ((param0 - 58) / 40);
              if (param1 == 11) {
                var4 = -1;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (12 == param1) {
                var4 = -1;
                var5 = -1;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (-14 == (param1 ^ -1)) {
                var5 = -1;
                var4 = 1;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (14 != param1) {
                break L11;
              } else {
                var4 = -1;
                var5 = 1;
                break L11;
              }
            }
            L12: {
              if (15 != param1) {
                break L12;
              } else {
                var4 = 1;
                var5 = 1;
                break L12;
              }
            }
            kg.field_i = dk.a(var4 * var2, var2 * var5, false);
            return;
          } else {
            L13: {
              var6 = -24 % ((param0 - 58) / 40);
              if (param1 == 11) {
                var4 = -1;
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              if (12 == param1) {
                var4 = -1;
                var5 = -1;
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (-14 == (param1 ^ -1)) {
                var5 = -1;
                var4 = 1;
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              if (14 != param1) {
                break L16;
              } else {
                var4 = -1;
                var5 = 1;
                break L16;
              }
            }
            L17: {
              if (15 != param1) {
                break L17;
              } else {
                var4 = 1;
                var5 = 1;
                break L17;
              }
            }
            kg.field_i = dk.a(var4 * var2, var2 * var5, false);
            return;
          }
        } else {
          L18: {
            var4 = -1;
            var5 = -1;
            var6 = -24 % ((param0 - 58) / 40);
            if (param1 == 11) {
              var4 = -1;
              break L18;
            } else {
              break L18;
            }
          }
          L19: {
            if (12 == param1) {
              var4 = -1;
              var5 = -1;
              break L19;
            } else {
              break L19;
            }
          }
          L20: {
            if (-14 == (param1 ^ -1)) {
              var5 = -1;
              var4 = 1;
              break L20;
            } else {
              break L20;
            }
          }
          L21: {
            if (14 != param1) {
              break L21;
            } else {
              var4 = -1;
              var5 = 1;
              break L21;
            }
          }
          L22: {
            if (15 != param1) {
              break L22;
            } else {
              var4 = 1;
              var5 = 1;
              break L22;
            }
          }
          kg.field_i = dk.a(var4 * var2, var2 * var5, false);
          return;
        }
    }

    pf(hj[] param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "pf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        bm.field_e = false;
        if (param0 < 73) {
          field_c = (String) null;
          sl.field_ab = -1;
          ce.field_c = null;
          uk.field_c = -1;
          sd.field_g = 0;
          return;
        } else {
          sl.field_ab = -1;
          ce.field_c = null;
          uk.field_c = -1;
          sd.field_g = 0;
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ti.a(param2, 6, param4, this.field_d, param1, param3);
        if (param0 >= -63) {
            pf.a(false);
        }
    }

    static {
        field_c = "Confirm Password: ";
        field_a = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
