/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static ph field_c;
    static int field_d;
    static int field_h;
    private ko field_a;
    static int field_e;
    private ma field_g;
    static String field_f;
    static vh field_b;

    final ma b(int param0) {
        ma discarded$2 = null;
        ma var2 = null;
        if (param0 <= -79) {
          var2 = this.field_g;
          if (var2 == this.field_a.field_e) {
            this.field_g = null;
            return null;
          } else {
            this.field_g = var2.field_d;
            return var2;
          }
        } else {
          discarded$2 = this.c((byte) 37);
          var2 = this.field_g;
          if (var2 == this.field_a.field_e) {
            this.field_g = null;
            return null;
          } else {
            this.field_g = var2.field_d;
            return var2;
          }
        }
    }

    public static void a(byte param0) {
        i var2 = null;
        field_f = null;
        if (param0 != -5) {
          var2 = (i) null;
          aa.a(true, (i) null, 8);
          field_b = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_c = null;
          return;
        }
    }

    final ma b(byte param0) {
        ma var2 = this.field_a.field_e.field_d;
        if (param0 != -92) {
            return (ma) null;
        }
        if (!(var2 != this.field_a.field_e)) {
            this.field_g = null;
            return null;
        }
        this.field_g = var2.field_d;
        return var2;
    }

    final ma c(byte param0) {
        ma var2 = null;
        var2 = this.field_g;
        if (this.field_a.field_e != var2) {
          if (param0 != -71) {
            this.field_g = (ma) null;
            this.field_g = var2.field_k;
            return var2;
          } else {
            this.field_g = var2.field_k;
            return var2;
          }
        } else {
          this.field_g = null;
          return null;
        }
    }

    final ma a(ma param0, int param1) {
        ma var3 = null;
        RuntimeException var3_ref = null;
        ma stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        ma stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        ma stackOut_4_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                var3 = this.field_a.field_e.field_k;
                break L1;
              } else {
                var3 = param0;
                break L1;
              }
            }
            if (param1 <= -96) {
              if (this.field_a.field_e != var3) {
                this.field_g = var3.field_k;
                stackOut_9_0 = (ma) (var3);
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.field_g = null;
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_4_0 = (ma) null;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("aa.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ma) ((Object) stackIn_8_0);
          } else {
            return stackIn_10_0;
          }
        }
    }

    final ma a(int param0) {
        ma var2 = null;
        var2 = this.field_a.field_e.field_k;
        if (this.field_a.field_e != var2) {
          if (param0 != 0) {
            field_c = (ph) null;
            this.field_g = var2.field_k;
            return var2;
          } else {
            this.field_g = var2.field_k;
            return var2;
          }
        } else {
          this.field_g = null;
          return null;
        }
    }

    final ma a(ma param0, boolean param1) {
        ma var3 = null;
        RuntimeException var3_ref = null;
        ma stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        ma stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        ma stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!param1) {
              L1: {
                if (param0 != null) {
                  var3 = param0;
                  break L1;
                } else {
                  var3 = this.field_a.field_e.field_d;
                  break L1;
                }
              }
              if (var3 != this.field_a.field_e) {
                this.field_g = var3.field_d;
                stackOut_9_0 = (ma) (var3);
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.field_g = null;
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = (ma) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("aa.E(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ma) ((Object) stackIn_8_0);
          } else {
            return stackIn_10_0;
          }
        }
    }

    final static void a(boolean param0, i param1, int param2) {
        try {
            ue.field_b.b((byte) 85, param1);
            if (param0) {
                field_h = -20;
            }
            gp.a(param2, param1, -6725);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "aa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(ko param0, boolean param1) {
        ma discarded$0 = null;
        try {
            if (param1) {
                ma var4 = (ma) null;
                discarded$0 = this.a((ma) null, -99);
            }
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "aa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public aa() {
    }

    aa(ko param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "aa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 0;
        field_d = 3;
        field_f = "<%0> is not on your friend list.";
        field_c = new ph();
    }
}
