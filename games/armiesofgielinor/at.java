/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class at {
    static int[] field_c;
    static boolean field_a;
    static int[] field_b;
    tc field_d;
    private tc field_e;

    final void a(boolean param0, at param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(this.field_d.field_b, param1, -41);
              if (param0) {
                break L1;
              } else {
                this.b(-29);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("at.I(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final tc a(int param0) {
        tc var2 = null;
        if (param0 == 0) {
          var2 = this.field_d.field_b;
          if (var2 == this.field_d) {
            return null;
          } else {
            var2.d(param0 + 101);
            return var2;
          }
        } else {
          field_a = false;
          var2 = this.field_d.field_b;
          if (var2 == this.field_d) {
            return null;
          } else {
            var2.d(param0 + 101);
            return var2;
          }
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 250) {
            field_b = (int[]) null;
        }
    }

    final tc e(byte param0) {
        tc var2 = null;
        var2 = this.field_d.field_b;
        if (this.field_d != var2) {
          this.field_e = var2.field_b;
          if (param0 <= 86) {
            field_c = (int[]) null;
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_e = null;
          return null;
        }
    }

    final tc a(boolean param0, tc param1) {
        tc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        tc stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tc stackOut_8_0 = null;
        Object stackOut_4_0 = null;
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
            L1: {
              L2: {
                if (param1 != null) {
                  break L2;
                } else {
                  var3 = this.field_d.field_b;
                  if (!ArmiesOfGielinor.field_M) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = param1;
              break L1;
            }
            if (this.field_d != var3) {
              L3: {
                if (param0) {
                  break L3;
                } else {
                  this.field_e = (tc) null;
                  break L3;
                }
              }
              this.field_e = var3.field_b;
              stackOut_8_0 = (tc) (var3);
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_e = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3_ref);
            stackOut_10_1 = new StringBuilder().append("at.J(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (tc) ((Object) stackIn_5_0);
        } else {
          return stackIn_9_0;
        }
    }

    final tc d(byte param0) {
        tc var2 = null;
        if (param0 < -69) {
          var2 = this.field_d.field_j;
          if (var2 == this.field_d) {
            this.field_e = null;
            return null;
          } else {
            this.field_e = var2.field_j;
            return var2;
          }
        } else {
          field_c = (int[]) null;
          var2 = this.field_d.field_j;
          if (var2 == this.field_d) {
            this.field_e = null;
            return null;
          } else {
            this.field_e = var2.field_j;
            return var2;
          }
        }
    }

    final tc c(byte param0) {
        boolean discarded$7 = false;
        tc var2 = null;
        var2 = this.field_d.field_j;
        if (param0 <= -120) {
          if (this.field_d == var2) {
            return null;
          } else {
            var2.d(127);
            return var2;
          }
        } else {
          discarded$7 = this.a(true);
          if (this.field_d == var2) {
            return null;
          } else {
            var2.d(127);
            return var2;
          }
        }
    }

    final void a(int param0, tc param1) {
        RuntimeException var3 = null;
        at var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param1.field_j == null) {
                break L1;
              } else {
                param1.d(66);
                break L1;
              }
            }
            param1.field_j = this.field_d;
            param1.field_b = this.field_d.field_b;
            param1.field_j.field_b = param1;
            param1.field_b.field_j = param1;
            if (param0 == 750) {
              break L0;
            } else {
              var4 = (at) null;
              this.a((tc) null, (at) null, -6);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("at.H(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final tc b(byte param0) {
        tc var2 = this.field_e;
        int var3 = -44 % ((param0 - -5) / 34);
        if (!(var2 != this.field_d)) {
            this.field_e = null;
            return null;
        }
        this.field_e = var2.field_j;
        return var2;
    }

    final tc a(byte param0) {
        tc var2 = null;
        var2 = this.field_e;
        if (this.field_d == var2) {
          this.field_e = null;
          return null;
        } else {
          if (param0 != 123) {
            field_a = false;
            this.field_e = var2.field_b;
            return var2;
          } else {
            this.field_e = var2.field_b;
            return var2;
          }
        }
    }

    final void b(int param0) {
        tc var2 = null;
        int var3 = 0;
        tc var4 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        L0: while (true) {
          var2 = this.field_d.field_b;
          if (this.field_d == var2) {
            this.field_e = null;
            if (param0 > 74) {
              return;
            } else {
              var4 = (tc) null;
              this.a((byte) -117, (tc) null);
              return;
            }
          } else {
            var2.d(-116);
            if (var3 != 0) {
              if (param0 <= 74) {
                var4 = (tc) null;
                this.a((byte) -117, (tc) null);
                return;
              } else {
                return;
              }
            } else {
              if (var3 == 0) {
                continue L0;
              } else {
                this.field_e = null;
                if (param0 > 74) {
                  return;
                } else {
                  var4 = (tc) null;
                  this.a((byte) -117, (tc) null);
                  return;
                }
              }
            }
          }
        }
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            this.field_e = (tc) null;
            if (this.field_d != this.field_d.field_b) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_d != this.field_d.field_b) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    private final void a(tc param0, at param1, int param2) {
        tc var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var4 = this.field_d.field_j;
            this.field_d.field_j = param0.field_j;
            var5 = 91 % ((61 - param2) / 58);
            param0.field_j.field_b = this.field_d;
            if (param0 == this.field_d) {
              break L0;
            } else {
              param0.field_j = param1.field_d.field_j;
              param0.field_j.field_b = param0;
              param1.field_d.field_j = var4;
              var4.field_b = param1.field_d;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var4_ref);
            stackOut_3_1 = new StringBuilder().append("at.O(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    final int b(boolean param0) {
        tc discarded$2 = null;
        int var2 = 0;
        tc var3 = null;
        if (param0) {
          discarded$2 = this.a(-77);
          var2 = 0;
          var3 = this.field_d.field_b;
          L0: while (true) {
            if (var3 == this.field_d) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_b;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          var3 = this.field_d.field_b;
          L1: while (true) {
            if (var3 == this.field_d) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_b;
              continue L1;
            }
          }
        }
    }

    final void a(byte param0, tc param1) {
        try {
            if (param1.field_j != null) {
                param1.d(param0 + 181);
            }
            param1.field_j = this.field_d.field_j;
            param1.field_b = this.field_d;
            if (param0 != -119) {
                field_a = true;
            }
            param1.field_j.field_b = param1;
            param1.field_b.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "at.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public at() {
        this.field_d = new tc();
        this.field_d.field_b = this.field_d;
        this.field_d.field_j = this.field_d;
    }

    static {
        field_c = new int[]{50, 100, 250, 500, 750, 1000, 2500, 5000, 7500, 10000};
    }
}
