/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    private ki field_a;
    private te field_b;
    static boolean[] field_d;
    private ki field_e;
    private te field_c;

    private final qp a(String param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        qp stackIn_4_0 = null;
        qp stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 16) {
                break L1;
              } else {
                this.field_c = (te) null;
                break L1;
              }
            }
            if (!this.field_a.b((byte) -125, "")) {
              stackIn_6_0 = this.a(88, param0, param2, "");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = this.a(45, "", param2, param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("og.D(");

            if (param0 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (param0) {
            field_d = (boolean[]) null;
        }
    }

    final qp b(int param0, String param1) {
        RuntimeException var3 = null;
        qp stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.field_a = (ki) null;
                break L1;
              }
            }
            stackIn_3_0 = this.a(-2, param1, (int[]) null);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("og.I(").append(param0).append(',');

            if (param1 == null) {
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
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 >= -5) {
          L0: {
            og.a(true);
            if (-25 != (oh.field_e ^ -1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-25 != (oh.field_e ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final qp a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        qp stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 91 / ((param0 - -31) / 58);
            stackIn_1_0 = this.a(param1, 80, (int[]) null);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("og.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    private final qp a(String param0, int param1, int[] param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        qp stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = this.field_e.a(0, param3);
            if (var5_int >= param1) {
              var6 = this.field_e.a(var5_int, param0, (byte) 127);
              if (-1 >= (var6 ^ -1)) {
                stackIn_7_0 = this.a(param2, param1 ^ 1026562700, var5_int, var6);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("og.E(");

            if (param0 == null) {
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
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (qp) ((Object) stackIn_2_0);
        } else {
          return stackIn_7_0;
        }
    }

    private final qp a(int[] param0, int param1, int param2, int param3) {
        qp discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        qp var8 = null;
        ae var9 = null;
        String var10 = null;
        qp var11 = null;
        qp stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        qp stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = ((-2147479553 & param2) << -83507708 | param2 >>> 1026562700) ^ param3;
              if (param1 == 1026562700) {
                break L1;
              } else {
                var10 = (String) null;
                discarded$1 = this.a((String) null, -18, (int[]) null, (String) null);
                break L1;
              }
            }
            var5_int = var5_int | param2 << 1307620880;
            var6 = (long)var5_int;
            var8 = (qp) ((Object) this.field_c.a(param1 ^ 1026562803, var6));
            if (var8 != null) {
              stackIn_5_0 = (qp) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0 == null) {
                  break L2;
                } else {
                  if (param0[0] > 0) {
                    break L2;
                  } else {
                    stackIn_9_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var9 = ae.a(this.field_e, param2, param3);
              if (var9 != null) {
                L3: {
                  var11 = var9.b();
                  var8 = var11;
                  this.field_c.a(var8, -1, var6);
                  if (param0 != null) {
                    param0[0] = param0[0] - var11.field_p.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                stackIn_17_0 = (qp) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("og.J(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (qp) ((Object) stackIn_9_0);
          } else {
            return stackIn_17_0;
          }
        }
    }

    private final qp a(int param0, int param1, boolean param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        qp var8 = null;
        q var9 = null;
        qp stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_16_0 = null;
        qp stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param0 ^ (param1 >>> 2055614412 | (1342181375 & param1) << -1105354012);
            var5_int = var5_int | param1 << -1109391440;
            var6 = (long)var5_int ^ 4294967296L;
            var8 = (qp) ((Object) this.field_c.a(127, var6));
            if (var8 != null) {
              stackIn_3_0 = (qp) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param3 == null) {
                  break L1;
                } else {
                  if (-1 > (param3[0] ^ -1)) {
                    break L1;
                  } else {
                    stackIn_7_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                var9 = (q) ((Object) this.field_b.a(118, var6));
                if (var9 == null) {
                  var9 = q.a(this.field_a, param1, param0);
                  if (var9 != null) {
                    this.field_b.a(var9, -1, var6);
                    break L2;
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              var8 = var9.a(param3);
              if (var8 != null) {
                var9.b(param2);
                this.field_c.a(var8, -1, var6);
                stackIn_18_0 = (qp) (var8);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_16_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("og.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (qp) ((Object) stackIn_7_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (qp) ((Object) stackIn_16_0);
            } else {
              return stackIn_18_0;
            }
          }
        }
    }

    private final qp a(int param0, String param1, int[] param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        qp stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = this.field_a.a(0, param1);
              if (param0 >= 33) {
                break L1;
              } else {
                og.a(30);
                break L1;
              }
            }
            if (var5_int >= 0) {
              var6 = this.field_a.a(var5_int, param3, (byte) 127);
              if (var6 >= 0) {
                stackIn_9_0 = this.a(var6, var5_int, false, param2);
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("og.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_19_2 + ')');
        }
        return stackIn_9_0;
    }

    final qp a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        qp stackIn_3_0 = null;
        qp stackIn_6_0 = null;
        qp stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_e.b(true) ^ -1) == -2) {
              stackIn_3_0 = this.a(param1, 1026562700, 0, param0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-2 != (this.field_e.a((byte) -65, param0) ^ -1)) {
                if (param2 == 10709) {
                  throw new RuntimeException();
                } else {
                  stackIn_9_0 = (qp) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.a(param1, param2 + 1026551991, param0, 0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("og.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    private final qp a(int param0, String param1, int[] param2) {
        RuntimeException var4 = null;
        qp stackIn_2_0 = null;
        qp stackIn_5_0 = null;
        qp stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -2) {
              if (!this.field_e.b((byte) 116, "")) {
                stackIn_7_0 = this.a("", 0, param2, param1);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = this.a(param1, 0, param2, "");
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (qp) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("og.H(").append(param0).append(',');

            if (param1 == null) {
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
          L2: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
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

    final qp b(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        qp stackIn_2_0 = null;
        qp stackIn_5_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_a.b(true) ^ -1) != -2) {
              if (1 != this.field_a.a((byte) -65, param2)) {
                L1: {
                  if (param0 <= -65) {
                    break L1;
                  } else {
                    this.field_a = (ki) null;
                    break L1;
                  }
                }
                throw new RuntimeException();
              } else {
                stackIn_5_0 = this.a(0, param2, false, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.a(param2, 0, false, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("og.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_5_0;
        }
    }

    og(ki param0, ki param1) {
        this.field_b = new te(256);
        this.field_c = new te(256);
        try {
            this.field_a = param1;
            this.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "og.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
