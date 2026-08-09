/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    private gn field_a;
    private gn field_g;
    static String field_f;
    static gn field_c;
    static int field_b;
    private og field_d;
    private og field_e;

    public static void a(int param0) {
        field_c = null;
        int var1 = 99 / ((param0 - 4) / 49);
        field_f = null;
    }

    private final el a(int param0, int[] param1, String param2) {
        RuntimeException var4 = null;
        el stackIn_4_0 = null;
        el stackIn_6_0 = null;
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
              if (param0 == -1610608641) {
                break L1;
              } else {
                ld.a(64);
                break L1;
              }
            }
            if (!this.field_a.a("", true)) {
              stackIn_6_0 = this.a(param2, param1, param0 ^ -1610592021, "");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = this.a("", param1, 24340, param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ld.K(").append(param0).append(',');

            if (param1 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

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
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static int a(byte param0, int param1) {
        int var2;
        if (-1 != (param1 ^ -1)) {
          if (param0 <= -65) {
            if (param1 > 0) {
              L0: {
                var2 = 1;
                if (-65536 <= (param1 ^ -1)) {
                  break L0;
                } else {
                  var2 += 16;
                  param1 = param1 >> 16;
                  break L0;
                }
              }
              L1: {
                if (255 < param1) {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (15 < param1) {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (3 < param1) {
                  param1 = param1 >> 2;
                  var2 += 2;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param1 <= 1) {
                  break L4;
                } else {
                  param1 = param1 >> 1;
                  var2++;
                  break L4;
                }
              }
              return var2;
            } else {
              L5: {
                var2 = 2;
                if (param1 >= -65536) {
                  break L5;
                } else {
                  var2 += 16;
                  param1 = param1 >> 16;
                  break L5;
                }
              }
              L6: {
                if (param1 >= -256) {
                  break L6;
                } else {
                  param1 = param1 >> 8;
                  var2 += 8;
                  break L6;
                }
              }
              L7: {
                if (15 < (param1 ^ -1)) {
                  param1 = param1 >> 4;
                  var2 += 4;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (param1 >= -4) {
                  break L8;
                } else {
                  param1 = param1 >> 2;
                  var2 += 2;
                  break L8;
                }
              }
              L9: {
                if (-2 > param1) {
                  var2++;
                  param1 = param1 >> 1;
                  break L9;
                } else {
                  break L9;
                }
              }
              return var2;
            }
          } else {
            field_f = (String) null;
            if (param1 > 0) {
              L10: {
                var2 = 1;
                if (-65536 <= (param1 ^ -1)) {
                  break L10;
                } else {
                  var2 += 16;
                  param1 = param1 >> 16;
                  break L10;
                }
              }
              L11: {
                if (255 < param1) {
                  var2 += 8;
                  param1 = param1 >> 8;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (15 < param1) {
                  var2 += 4;
                  param1 = param1 >> 4;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (3 < param1) {
                  param1 = param1 >> 2;
                  var2 += 2;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (param1 <= 1) {
                  break L14;
                } else {
                  param1 = param1 >> 1;
                  var2++;
                  break L14;
                }
              }
              return var2;
            } else {
              L15: {
                var2 = 2;
                if (param1 >= -65536) {
                  break L15;
                } else {
                  var2 += 16;
                  param1 = param1 >> 16;
                  break L15;
                }
              }
              L16: {
                if (param1 >= -256) {
                  break L16;
                } else {
                  param1 = param1 >> 8;
                  var2 += 8;
                  break L16;
                }
              }
              L17: {
                if (15 < (param1 ^ -1)) {
                  param1 = param1 >> 4;
                  var2 += 4;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (param1 >= -4) {
                  break L18;
                } else {
                  param1 = param1 >> 2;
                  var2 += 2;
                  break L18;
                }
              }
              L19: {
                if (-2 > param1) {
                  var2++;
                  param1 = param1 >> 1;
                  break L19;
                } else {
                  break L19;
                }
              }
              return var2;
            }
          }
        } else {
          return 0;
        }
    }

    private final el a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        el var8 = null;
        pm var9 = null;
        el var10 = null;
        el stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        el stackIn_12_0 = null;
        el stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = (param3 >>> -1623309940 | (param3 & -1610608641) << -874076508) ^ param1;
            var5_int = var5_int | param3 << 453811120;
            var6 = (long)var5_int;
            var8 = (el) ((Object) this.field_e.a((byte) 114, var6));
            if (var8 == null) {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (param0[0] > 0) {
                    break L1;
                  } else {
                    stackIn_6_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var9 = pm.a(this.field_a, param3, param1);
              if (var9 != null) {
                var10 = var9.b();
                var8 = var10;
                this.field_e.a(var8, var6, false);
                if (param2 == -14322) {
                  L2: {
                    if (param0 != null) {
                      param0[0] = param0[0] - var10.field_n.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  stackIn_17_0 = (el) (var8);
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  stackIn_12_0 = (el) null;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                stackIn_9_0 = null;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = (el) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("ld.E(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (el) ((Object) stackIn_6_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (el) ((Object) stackIn_9_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                return stackIn_17_0;
              }
            }
          }
        }
    }

    final el a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        el stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -124 / ((-61 - param1) / 62);
            stackIn_1_0 = this.a(-1610608641, (int[]) null, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("ld.C(");

            if (param0 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final el a(int[] param0, int param1, byte param2) {
        RuntimeException var4 = null;
        CharSequence var5 = null;
        el stackIn_3_0 = null;
        el stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_g.b(-1) ^ -1) == -2) {
              stackIn_3_0 = this.a(param1, param0, 0, 0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param2 == 115) {
                  break L1;
                } else {
                  var5 = (CharSequence) null;
                  ld.a(false, true, (CharSequence) null);
                  break L1;
                }
              }
              if (1 != this.field_g.a((byte) 120, param1)) {
                throw new RuntimeException();
              } else {
                stackIn_8_0 = this.a(0, param0, 0, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("ld.D(");

            if (param0 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final el a(int param0, String param1) {
        RuntimeException var3 = null;
        el stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -32660) {
                break L1;
              } else {
                ld.a(49);
                break L1;
              }
            }
            stackIn_3_0 = this.a((int[]) null, param1, -343045972);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ld.G(").append(param0).append(',');

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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final el a(int param0, byte param1, int[] param2) {
        RuntimeException var4 = null;
        el stackIn_2_0 = null;
        el stackIn_6_0 = null;
        el stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_a.b(-1) != 1) {
              if ((this.field_a.a((byte) 125, param0) ^ -1) == -2) {
                stackIn_6_0 = this.a(param2, 0, -14322, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 >= 91) {
                  throw new RuntimeException();
                } else {
                  stackIn_9_0 = (el) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = this.a(param2, param0, -14322, 0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ld.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_9_0;
          }
        }
    }

    private final el a(int[] param0, String param1, int param2) {
        RuntimeException var4 = null;
        int[] var5 = null;
        el stackIn_2_0 = null;
        el stackIn_6_0 = null;
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
            if (!this.field_g.a("", true)) {
              L1: {
                if (param2 == -343045972) {
                  break L1;
                } else {
                  var5 = (int[]) null;
                  this.a(124, (byte) 87, (int[]) null);
                  break L1;
                }
              }
              stackIn_6_0 = this.a("", param0, (byte) 104, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = this.a(param1, param0, (byte) 104, "");
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ld.B(");

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final el a(String param0, int[] param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        el stackIn_9_0 = null;
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
            var5_int = this.field_a.c(param0, param2 + -24337);
            if ((var5_int ^ -1) <= -1) {
              var6 = this.field_a.a(var5_int, param3, false);
              if (var6 >= 0) {
                L1: {
                  if (param2 == 24340) {
                    break L1;
                  } else {
                    field_b = 100;
                    break L1;
                  }
                }
                stackIn_9_0 = this.a(param1, var6, param2 ^ -26854, var5_int);
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

            stackIn_12_1 = new StringBuilder().append("ld.J(");

            if (param0 == null) {
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

            if (param1 == null) {
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


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');

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
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_19_2 + ')');
        }
        return stackIn_9_0;
    }

    private final el a(String param0, int[] param1, byte param2, String param3) {
        el discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        el stackIn_9_0 = null;
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
              if (param2 == 104) {
                break L1;
              } else {
                var7 = (String) null;
                discarded$1 = this.a((String) null, (int[]) null, (byte) -52, (String) null);
                break L1;
              }
            }
            var5_int = this.field_g.c(param3, 3);
            if (0 <= var5_int) {
              var6 = this.field_g.a(var5_int, param0, false);
              if (var6 >= 0) {
                stackIn_9_0 = this.a(var6, param1, param2 + -104, var5_int);
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

            stackIn_12_1 = new StringBuilder().append("ld.F(");

            if (param0 == null) {
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

            if (param1 == null) {
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


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');

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
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_19_2 + ')');
        }
        return stackIn_9_0;
    }

    final static String a(boolean param0, boolean param1, CharSequence param2) {
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            if (param2 == null) {
              stackIn_4_0 = ao.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param2.length();
                if (1 > var3_int) {
                  break L1;
                } else {
                  if (var3_int <= 12) {
                    L2: {
                      if (!param0) {
                        break L2;
                      } else {
                        ld.a(18);
                        break L2;
                      }
                    }
                    L3: {
                      var4 = kf.a(param2, (byte) -98);
                      if (var4 == null) {
                        break L3;
                      } else {
                        if (var4.length() < 1) {
                          break L3;
                        } else {
                          L4: {
                            if (ag.a(-2821, var4.charAt(0))) {
                              break L4;
                            } else {
                              if (!ag.a(-2821, var4.charAt(-1 + var4.length()))) {
                                var5 = 0;
                                var6 = 0;
                                L5: while (true) {
                                  if (param2.length() <= var6) {
                                    if (0 < var5) {
                                      stackIn_36_0 = mj.field_b;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L6: {
                                      var7 = param2.charAt(var6);
                                      if (ag.a(-2821, (char) var7)) {
                                        var5++;
                                        break L6;
                                      } else {
                                        var5 = 0;
                                        break L6;
                                      }
                                    }
                                    L7: {
                                      if (-3 < (var5 ^ -1)) {
                                        break L7;
                                      } else {
                                        if (!param1) {
                                          stackIn_31_0 = kd.field_a;
                                          decompiledRegionSelector0 = 4;
                                          break L0;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L5;
                                  }
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          stackIn_21_0 = mj.field_b;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackIn_16_0 = ao.field_e;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_9_0 = ao.field_e;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var3);

            stackIn_40_1 = new StringBuilder().append("ld.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L8;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L8;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0;
                } else {
                  return stackIn_36_0;
                }
              }
            }
          }
        }
    }

    private final el a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        el var8 = null;
        sn var9 = null;
        el stackIn_2_0 = null;
        Object stackIn_15_0 = null;
        el stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param0 ^ (param3 >>> -343045972 | 65531 & param3 << 1687916868);
            var5_int = var5_int | param3 << 587235568;
            var6 = 4294967296L ^ (long)var5_int;
            var8 = (el) ((Object) this.field_e.a((byte) 121, var6));
            if (var8 == null) {
              L1: {
                if (param1 == null) {
                  break L1;
                } else {
                  if (param1[0] > 0) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              L2: {
                var9 = (sn) ((Object) this.field_d.a((byte) 120, var6));
                if (var9 == null) {
                  var9 = sn.a(this.field_g, param3, param0);
                  if (var9 != null) {
                    this.field_d.a(var9, var6, false);
                    break L2;
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              var8 = var9.a(param1);
              if (var8 != null) {
                var9.d(param2);
                this.field_e.a(var8, var6, false);
                stackIn_17_0 = (el) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_15_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (el) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("ld.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (el) ((Object) stackIn_15_0);
          } else {
            return stackIn_17_0;
          }
        }
    }

    ld(gn param0, gn param1) {
        this.field_d = new og(256);
        this.field_e = new og(256);
        try {
            this.field_g = param1;
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "ld.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Log in/Register";
        field_b = -1;
    }
}
