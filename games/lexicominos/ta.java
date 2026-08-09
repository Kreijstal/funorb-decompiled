/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    private ng field_a;
    static String field_b;
    static int field_g;
    static String field_d;
    private kd field_c;
    static long field_f;
    static long field_e;

    final kd b(int param0) {
        kd var2;
        var2 = this.field_a.field_b.field_c;
        if (this.field_a.field_b == var2) {
          this.field_c = null;
          return null;
        } else {
          if (param0 != 0) {
            this.b(91);
            this.field_c = var2.field_c;
            return var2;
          } else {
            this.field_c = var2.field_c;
            return var2;
          }
        }
    }

    final kd a(kd param0, byte param1) {
        kd var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        kd stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 != null) {
                  break L2;
                } else {
                  var3 = this.field_a.field_b.field_f;
                  if (!Lexicominos.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = param0;
              break L1;
            }
            if (var3 == this.field_a.field_b) {
              this.field_c = null;
              stackIn_6_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L3: {
                if (param1 <= -126) {
                  break L3;
                } else {
                  this.e(-9);
                  break L3;
                }
              }
              this.field_c = var3.field_f;
              stackIn_10_0 = (kd) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("ta.B(");

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
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (kd) ((Object) stackIn_6_0);
        } else {
          return stackIn_10_0;
        }
    }

    final kd e(int param0) {
        kd var2;
        var2 = this.field_c;
        if (param0 == 31842) {
          if (var2 == this.field_a.field_b) {
            this.field_c = null;
            return null;
          } else {
            this.field_c = var2.field_c;
            return var2;
          }
        } else {
          return (kd) null;
        }
    }

    final kd c(int param0) {
        kd var2 = this.field_c;
        if (param0 >= -49) {
            return (kd) null;
        }
        if (!(this.field_a.field_b != var2)) {
            this.field_c = null;
            return null;
        }
        this.field_c = var2.field_f;
        return var2;
    }

    final static mb a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        mb stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 250) {
                break L1;
              } else {
                ta.f(34);
                break L1;
              }
            }
            if (ca.field_i != ee.field_c) {
              L2: {
                if (c.field_o != ee.field_c) {
                  break L2;
                } else {
                  if (!param1.equals(ef.field_b)) {
                    break L2;
                  } else {
                    ee.field_c = c.field_m;
                    stackIn_8_0 = n.field_k;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              ef.field_b = param1;
              n.field_k = null;
              ee.field_c = ca.field_i;
              stackIn_10_0 = null;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("ta.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (mb) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return (mb) ((Object) stackIn_10_0);
          }
        }
    }

    final kd a(int param0) {
        kd var2;
        if (param0 == 250) {
          var2 = this.field_a.field_b.field_f;
          if (this.field_a.field_b == var2) {
            this.field_c = null;
            return null;
          } else {
            this.field_c = var2.field_f;
            return var2;
          }
        } else {
          this.field_a = (ng) null;
          var2 = this.field_a.field_b.field_f;
          if (this.field_a.field_b == var2) {
            this.field_c = null;
            return null;
          } else {
            this.field_c = var2.field_f;
            return var2;
          }
        }
    }

    final static void d(int param0) {
        if (mc.field_k != -tf.field_c + 0) {
          if (250 - tf.field_c == mc.field_k) {
            mc.field_k = mc.field_k + 1;
            if (param0 >= -30) {
              field_e = 88L;
              return;
            } else {
              return;
            }
          } else {
            mc.field_k = mc.field_k + 1;
            if (param0 >= -30) {
              field_e = 88L;
              return;
            } else {
              return;
            }
          }
        } else {
          mc.field_k = mc.field_k + 1;
          if (param0 >= -30) {
            field_e = 88L;
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        fk.field_e = param0;
        int var3 = 21 % ((param1 - 14) / 53);
        ch.field_e = param2;
    }

    ta(ng param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ta.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(int param0) {
        if (param0 != 0) {
            ta.a(123, 24, 83);
            field_b = null;
            field_d = null;
            return;
        }
        field_b = null;
        field_d = null;
    }

    final kd a(kd param0, int param1) {
        kd var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        kd stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 == null) {
                  break L2;
                } else {
                  var3 = param0;
                  if (!Lexicominos.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = this.field_a.field_b.field_c;
              break L1;
            }
            if (var3 != this.field_a.field_b) {
              L3: {
                this.field_c = var3.field_c;
                if (param1 >= 126) {
                  break L3;
                } else {
                  this.field_c = (kd) null;
                  break L3;
                }
              }
              stackIn_9_0 = (kd) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_c = null;
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("ta.C(");

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
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (kd) ((Object) stackIn_5_0);
        } else {
          return stackIn_9_0;
        }
    }

    static {
        field_b = "Please wait...";
    }
}
