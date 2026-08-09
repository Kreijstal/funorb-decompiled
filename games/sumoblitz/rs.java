/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs {
    private boolean field_b;
    private int[] field_a;
    private int field_f;
    private int field_d;
    static tf field_c;
    static int field_g;
    static int field_h;
    static ri field_e;

    final static int a(boolean param0, String param1, int param2, String param3, int param4, int param5, String param6) {
        lj var7 = null;
        RuntimeException var7_ref = null;
        lj var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = new lj(param1);
            if (param5 >= 115) {
              var8 = new lj(param3);
              stackIn_4_0 = jd.a(var7, param2, var8, param4, param0, 21, param6);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -95;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7_ref);

            stackIn_7_1 = new StringBuilder().append("rs.A(").append(param0).append(',');

            if (param1 == null) {
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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int d(int param0, int param1) {
        if (param0 > this.field_f) {
          throw new ArrayIndexOutOfBoundsException(param0);
        } else {
          if (param1 != -29816) {
            field_e = (ri) null;
            return this.field_a[param0];
          } else {
            return this.field_a[param0];
          }
        }
    }

    private final void a(int param0, int param1) {
        int var4 = -38 % ((-60 - param0) / 46);
        int[] var5 = new int[this.b(1, param1)];
        int[] var3 = var5;
        la.a(this.field_a, 0, var5, 0, this.field_a.length);
        this.field_a = var5;
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (!wi.field_o.startsWith("win")) {
                  stackIn_4_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    if (param0.startsWith("http://")) {
                      break L2;
                    } else {
                      if (param0.startsWith("https://")) {
                        break L2;
                      } else {
                        stackIn_8_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  if (param1 == -2528) {
                    var3 = 0;
                    L3: while (true) {
                      if (param0.length() <= var3) {
                        Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackIn_20_0 = 1;
                        decompiledRegionSelector0 = 4;
                        break L1;
                      } else {
                        if (-1 == var2.indexOf((int) param0.charAt(var3))) {
                          stackIn_17_0 = 0;
                          decompiledRegionSelector0 = 3;
                          break L1;
                        } else {
                          var3++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    stackIn_11_0 = 0;
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_22_0 = 0;
              return stackIn_22_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    decompiledRegionSelector1 = 3;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 4;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2_ref2);

            stackIn_25_1 = new StringBuilder().append("rs.G(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 3) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_20_0 != 0;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -26791) {
            return;
        }
        field_e = null;
        field_c = null;
    }

    final void a(byte param0, int param1) {
        if (param0 == 61) {
          if (param1 >= 0) {
            if (this.field_f < param1) {
              throw new ArrayIndexOutOfBoundsException(param1);
            } else {
              L0: {
                if (param1 != this.field_f) {
                  la.a(this.field_a, 1 + param1, this.field_a, param1, this.field_f + -param1);
                  break L0;
                } else {
                  break L0;
                }
              }
              this.field_f = this.field_f - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          field_g = 27;
          if (param1 >= 0) {
            if (this.field_f < param1) {
              throw new ArrayIndexOutOfBoundsException(param1);
            } else {
              L1: {
                if (param1 != this.field_f) {
                  la.a(this.field_a, 1 + param1, this.field_a, param1, this.field_f + -param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_f = this.field_f - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        }
    }

    private rs() throws Throwable {
        throw new Error();
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        String var5;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 1) {
          var5 = (String) null;
          rs.a(false, (String) null, 93, (String) null, -122, -38, (String) null);
          var3 = this.field_a.length;
          L0: while (true) {
            if (var3 > param1) {
              return var3;
            } else {
              if (!this.field_b) {
                var3 = var3 + this.field_d;
                continue L0;
              } else {
                if (0 == var3) {
                  var3 = 1;
                  continue L0;
                } else {
                  var3 = var3 * this.field_d;
                  continue L0;
                }
              }
            }
          }
        } else {
          var3 = this.field_a.length;
          L1: while (true) {
            if (var3 > param1) {
              return var3;
            } else {
              if (!this.field_b) {
                var3 = var3 + this.field_d;
                continue L1;
              } else {
                if (0 == var3) {
                  var3 = 1;
                  continue L1;
                } else {
                  var3 = var3 * this.field_d;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void c(int param0, int param1) {
        this.a(param1, 1 + this.field_f, false);
        int var3 = 29 % ((-83 - param0) / 33);
    }

    private final void a(int param0, int param1, boolean param2) {
        if (!param2) {
          if (param1 > this.field_f) {
            L0: {
              this.field_f = param1;
              if (param1 >= this.field_a.length) {
                this.a(99, param1);
                break L0;
              } else {
                break L0;
              }
            }
            this.field_a[param1] = param0;
            return;
          } else {
            L1: {
              if (param1 >= this.field_a.length) {
                this.a(99, param1);
                break L1;
              } else {
                break L1;
              }
            }
            this.field_a[param1] = param0;
            return;
          }
        } else {
          field_e = (ri) null;
          if (param1 <= this.field_f) {
            L2: {
              if (param1 >= this.field_a.length) {
                this.a(99, param1);
                break L2;
              } else {
                break L2;
              }
            }
            this.field_a[param1] = param0;
            return;
          } else {
            L3: {
              this.field_f = param1;
              if (param1 >= this.field_a.length) {
                this.a(99, param1);
                break L3;
              } else {
                break L3;
              }
            }
            this.field_a[param1] = param0;
            return;
          }
        }
    }

    final int a(byte param0) {
        if (param0 <= 28) {
            return 121;
        }
        return 1 + this.field_f;
    }

    static {
        field_c = new tf();
        field_g = 2;
        field_h = 4;
    }
}
