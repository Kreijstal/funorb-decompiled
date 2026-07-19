/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static String field_c;
    br field_b;
    static String field_e;
    static String field_d;
    private br field_f;
    static String field_a;

    final br c(byte param0) {
        br var2 = null;
        var2 = this.field_f;
        if (var2 != this.field_b) {
          this.field_f = var2.field_b;
          if (param0 < 95) {
            field_c = (String) null;
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_f = null;
          return null;
        }
    }

    final boolean f(int param0) {
        br discarded$10 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 28113) {
          L0: {
            discarded$10 = this.c(-26);
            if (this.field_b != this.field_b.field_d) {
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
            if (this.field_b != this.field_b.field_d) {
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

    final br a(boolean param0) {
        br discarded$2 = null;
        br var2 = null;
        if (param0) {
          var2 = this.field_b.field_b;
          if (var2 == this.field_b) {
            return null;
          } else {
            var2.a(param0);
            return var2;
          }
        } else {
          discarded$2 = this.b(-47);
          var2 = this.field_b.field_b;
          if (var2 == this.field_b) {
            return null;
          } else {
            var2.a(param0);
            return var2;
          }
        }
    }

    final int a(int param0) {
        int var2 = 0;
        br var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = param0;
        var3 = this.field_b.field_d;
        L0: while (true) {
          L1: {
            if (var3 == this.field_b) {
              break L1;
            } else {
              var3 = var3.field_d;
              var2++;
              if (var4 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          return var2;
        }
    }

    final br c(int param0) {
        br discarded$0 = null;
        br var2 = null;
        if (param0 <= 38) {
            discarded$0 = this.c(-100);
            var2 = this.field_b.field_d;
            if (!(this.field_b != var2)) {
                this.field_f = null;
                return null;
            }
            this.field_f = var2.field_d;
            return var2;
        }
        var2 = this.field_b.field_d;
        if (!(this.field_b != var2)) {
            this.field_f = null;
            return null;
        }
        this.field_f = var2.field_d;
        return var2;
    }

    final br a(byte param0, br param1) {
        br var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_5_0 = null;
        br stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        br stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = -72 / ((param0 - 10) / 33);
                if (param1 != null) {
                  break L2;
                } else {
                  var3 = this.field_b.field_d;
                  if (!ZombieDawnMulti.field_E) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = param1;
              break L1;
            }
            if (this.field_b != var3) {
              this.field_f = var3.field_d;
              stackOut_6_0 = (br) (var3);
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_f = null;
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("th.E(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (br) ((Object) stackIn_5_0);
        } else {
          return stackIn_7_0;
        }
    }

    final void a(br param0, boolean param1) {
        if (!(param0.field_b == null)) {
            param0.a(!param1 ? true : false);
        }
        param0.field_d = this.field_b;
        param0.field_b = this.field_b.field_b;
        param0.field_b.field_d = param0;
        if (param1) {
            return;
        }
        try {
            param0.field_d.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "th.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        field_d = null;
        field_e = null;
        if (param0 <= 61) {
          field_d = (String) null;
          field_c = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          return;
        }
    }

    final br g(int param0) {
        boolean discarded$2 = false;
        br var2 = null;
        var2 = this.field_b.field_d;
        if (var2 != this.field_b) {
          var2.a(true);
          if (param0 <= 33) {
            discarded$2 = this.f(-15);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final void e(int param0) {
        br var2 = null;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == -30986) {
          L0: while (true) {
            L1: {
              L2: {
                var2 = this.field_b.field_d;
                if (this.field_b == var2) {
                  if (var3 != 0) {
                    break L2;
                  } else {
                    if (var3 == 0) {
                      break L1;
                    } else {
                      var2.a(true);
                      break L2;
                    }
                  }
                } else {
                  var2.a(true);
                  break L2;
                }
              }
              if (var3 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
            this.field_f = null;
            return;
          }
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        n discarded$19 = null;
        n discarded$20 = null;
        boolean discarded$21 = false;
        n discarded$22 = null;
        n discarded$23 = null;
        byte[] var1 = null;
        byte[] var2 = null;
        if (param0 == -61) {
          if (wc.j(112)) {
            fn.field_b = true;
            if (ZombieDawnMulti.field_E) {
              var2 = ll.field_k.f(-16613);
              var1 = var2;
              discarded$19 = da.a(-55, 6, var2);
              return;
            } else {
              return;
            }
          } else {
            var2 = ll.field_k.f(-16613);
            var1 = var2;
            discarded$20 = da.a(-55, 6, var2);
            return;
          }
        } else {
          discarded$21 = th.a(30, 99, -87, 29, -54, -51, -90);
          if (wc.j(112)) {
            fn.field_b = true;
            if (ZombieDawnMulti.field_E) {
              var2 = ll.field_k.f(-16613);
              var1 = var2;
              discarded$22 = da.a(-55, 6, var2);
              return;
            } else {
              return;
            }
          } else {
            var2 = ll.field_k.f(-16613);
            var1 = var2;
            discarded$23 = da.a(-55, 6, var2);
            return;
          }
        }
    }

    final br a(byte param0) {
        br var2 = null;
        int var3 = 0;
        var2 = this.field_b.field_b;
        if (var2 == this.field_b) {
          this.field_f = null;
          return null;
        } else {
          this.field_f = var2.field_b;
          var3 = 19 % ((param0 - 13) / 39);
          return var2;
        }
    }

    final void a(int param0, br param1) {
        br discarded$2 = null;
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (null != param1.field_b) {
                param1.a(true);
                break L1;
              } else {
                break L1;
              }
            }
            param1.field_b = this.field_b;
            param1.field_d = this.field_b.field_d;
            param1.field_b.field_d = param1;
            param1.field_d.field_b = param1;
            if (param0 == -25612) {
              break L0;
            } else {
              discarded$2 = this.b(78);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("th.A(").append(param0).append(',');
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
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        var7 = -3 / ((param6 - 47) / 40);
        if (param2 >= param1) {
          if (param2 < param3 + param1) {
            if (param4 <= param0) {
              if (param5 + param4 <= param0) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public th() {
        this.field_b = new br();
        this.field_b.field_b = this.field_b;
        this.field_b.field_d = this.field_b;
    }

    final br b(int param0) {
        br var2 = null;
        var2 = this.field_f;
        if (this.field_b != var2) {
          this.field_f = var2.field_d;
          if (param0 != 6) {
            return (br) null;
          } else {
            return var2;
          }
        } else {
          this.field_f = null;
          return null;
        }
    }

    static {
        field_e = "Add <%0> to friend list";
        field_d = "NEW";
        field_c = "Your ignore list is full. Max of 100 hit.";
        field_a = "Names cannot start or end with space or underscore";
    }
}
