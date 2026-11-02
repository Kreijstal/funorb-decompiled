/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uja {
    static int[] field_e;
    static int[] field_c;
    static fma field_a;
    private IntrusiveDeque field_b;
    private IntrusiveNode field_d;

    final IntrusiveNode a(boolean param0) {
        IntrusiveNode var2 = this.field_b.sentinel.next;
        if (this.field_b.sentinel == var2) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.next;
        if (param0) {
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final IntrusiveNode a(IntrusiveNode param0, byte param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        IntrusiveNode stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_b.sentinel.previous;
          }
          if (param1 != -11) {
            this.field_b = (IntrusiveDeque) null;
          }
          if (var3 == this.field_b.sentinel) {
            this.field_d = null;
            stackIn_8_0 = null;
            return (IntrusiveNode) (stackIn_8_0);
          }
          this.field_d = var3.previous;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("uja.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode a(int param0) {
        IntrusiveNode var2 = this.field_d;
        if (var2 == this.field_b.sentinel) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.next;
        if (param0 == -1) {
          return var2;
        }
        return (IntrusiveNode) null;
    }

    public static void b(int param0) {
        field_e = null;
        field_a = null;
        field_c = null;
        if (param0 != 2) {
          field_a = (fma) null;
        }
    }

    final IntrusiveNode a(byte param0) {
        IntrusiveNode var2 = this.field_b.sentinel.previous;
        if (param0 < 37) {
          this.a((byte) -78);
          if (this.field_b.sentinel == var2) {
            this.field_d = null;
            return null;
          }
          this.field_d = var2.previous;
          return var2;
        }
        if (this.field_b.sentinel == var2) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.previous;
        return var2;
    }

    final IntrusiveNode c(int param0) {
        IntrusiveNode var2 = this.field_d;
        if (param0 < 28) {
          return (IntrusiveNode) null;
        }
        if (var2 == this.field_b.sentinel) {
          this.field_d = null;
          return null;
        }
        this.field_d = var2.previous;
        return var2;
    }

    final static ssa a(byte param0, GraphicsToolkit param1) {
        wl var2 = null;
        RuntimeException var2_ref = null;
        ssa var3 = null;
        GraphicsToolkit var4 = null;
        ssa stackIn_3_0 = null;
        ssa stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (DelegatingCanvas.field_c == param1) {
            stackIn_3_0 = sda.field_g;
            return stackIn_3_0;
          }
          var2 = (wl) (hla.field_ub.a((byte) -96, (long)param1.field_a));
          if (var2 != null &&
            var2.field_g == param1) {
            var3 = var2.field_j;
          } else {
            if (var2 != null) {
              var2.unlink(68);
            }
            var3 = new ssa(param1);
            hla.field_ub.a((long)param1.field_a, 109, new wl(param1, var3));
          }
          if (param0 != 65) {
            var4 = (GraphicsToolkit) null;
            uja.a((byte) -102, (GraphicsToolkit) null);
          }
          DelegatingCanvas.field_c = param1;
          sda.field_g = var3;
          stackIn_14_0 = var3;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("uja.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_98_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        stackIn_3_0 = ((1 & param1) == 0) ? 0 : 1;
        var2 = stackIn_3_0;
        stackIn_6_0 = ((2 & param1) == 0) ? 0 : 1;
        var3 = stackIn_6_0;
        stackIn_9_0 = ((param1 & 4) == 0) ? 0 : 1;
        var4 = stackIn_9_0;
        stackIn_12_0 = ((8 & param1) == 0) ? 0 : 1;
        var5 = stackIn_12_0;
        stackIn_15_0 = (0 == (16 & param1)) ? 0 : 1;
        var6 = stackIn_15_0;
        stackIn_18_0 = ((param1 & 32) == 0) ? 0 : 1;
        var7 = stackIn_18_0;
        var9 = 31 / ((param0 - 65) / 61);
        stackIn_21_0 = ((128 & param1) == 0) ? 0 : 1;
        var8 = stackIn_21_0;
        stackIn_24_0 = (0 == (256 & param1)) ? 0 : 1;
        var10 = stackIn_24_0;
        if (var4 != 0) {
          if (var5 == 0) {
            if (var2 != 0 &&
              var3 != 0) {
              var3 = 0;
              var2 = 0;
            }
            stackIn_32_0 = (0 == (param1 & 64)) ? 0 : 1;
            var11 = stackIn_32_0;
            if (var8 != 0) {
              var15 = 1;
              var18 = 0;
              var13 = 1;
              var12 = 1;
              var16 = var8;
              var14 = 1;
              var17 = var10;
            } else {
              if (var10 != 0) {
                var15 = 1;
                var18 = 0;
                var13 = 1;
                var12 = 1;
                var16 = var8;
                var14 = 1;
                var17 = var10;
                var19 = 0;
                if (var12 != 0) {
                  var19 = var19 | 1;
                }
                if (var13 != 0) {
                  var19 = var19 | 2;
                }
                if (var14 != 0) {
                  var19 = var19 | 4;
                }
                if (var15 != 0) {
                  var19 = var19 | 8;
                }
                if (var16 != 0) {
                  var19 = var19 | 16;
                }
                if (var17 != 0) {
                  var19 = var19 | 32;
                }
                if (var18 != 0) {
                  var19 = var19 | 64;
                }
                return var19;
              }
              var17 = var7;
              var13 = var3;
              var15 = var5;
              var16 = var6;
              var12 = var2;
              var14 = var4;
              var18 = var11;
            }
            var19Lifetime2 = 0;
            if (var12 != 0) {
              var19Lifetime2 = var19Lifetime2 | 1;
            }
            if (var13 != 0) {
              var19Lifetime2 = var19Lifetime2 | 2;
            }
            if (var14 != 0) {
              var19Lifetime2 = var19Lifetime2 | 4;
            }
            if (var15 != 0) {
              var19Lifetime2 = var19Lifetime2 | 8;
            }
            if (var16 != 0) {
              var19Lifetime2 = var19Lifetime2 | 16;
            }
            if (var17 != 0) {
              var19Lifetime2 = var19Lifetime2 | 32;
            }
            if (var18 != 0) {
              var19Lifetime2 = var19Lifetime2 | 64;
            }
            return var19Lifetime2;
          }
          var4 = 0;
          var5 = 0;
        }
        if (var2 != 0 &&
          var3 != 0) {
          var3 = 0;
          var2 = 0;
        }
        stackIn_98_0 = (0 == (param1 & 64)) ? 0 : 1;
        var11Lifetime1 = stackIn_98_0;
        if (var8 != 0) {
          var15Lifetime1 = 1;
          var18Lifetime1 = 0;
          var13Lifetime1 = 1;
          var12Lifetime1 = 1;
          var16Lifetime1 = var8;
          var14Lifetime1 = 1;
          var17Lifetime1 = var10;
        } else {
          if (var10 != 0) {
            var15Lifetime1 = 1;
            var18Lifetime1 = 0;
            var13Lifetime1 = 1;
            var12Lifetime1 = 1;
            var16Lifetime1 = var8;
            var14Lifetime1 = 1;
            var17Lifetime1 = var10;
          } else {
            var17Lifetime1 = var7;
            var13Lifetime1 = var3;
            var15Lifetime1 = var5;
            var16Lifetime1 = var6;
            var12Lifetime1 = var2;
            var14Lifetime1 = var4;
            var18Lifetime1 = var11Lifetime1;
          }
        }
        var19Lifetime1 = 0;
        if (var12Lifetime1 != 0) {
          var19Lifetime1 = var19Lifetime1 | 1;
        }
        if (var13Lifetime1 != 0) {
          var19Lifetime1 = var19Lifetime1 | 2;
        }
        if (var14Lifetime1 != 0) {
          var19Lifetime1 = var19Lifetime1 | 4;
        }
        if (var15Lifetime1 != 0) {
          var19Lifetime1 = var19Lifetime1 | 8;
        }
        if (var16Lifetime1 != 0) {
          var19Lifetime1 = var19Lifetime1 | 16;
        }
        if (var17Lifetime1 != 0) {
          var19Lifetime1 = var19Lifetime1 | 32;
        }
        if (var18Lifetime1 != 0) {
          var19Lifetime1 = var19Lifetime1 | 64;
        }
        return var19Lifetime1;
    }

    final IntrusiveNode a(int param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        IntrusiveNode stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_b.sentinel.next;
          }
          if (this.field_b.sentinel == var3) {
            this.field_d = null;
            stackIn_6_0 = null;
            return (IntrusiveNode) (stackIn_6_0);
          }
          if (param0 != 0) {
            stackIn_9_0 = (IntrusiveNode) null;
            return stackIn_9_0;
          }
          this.field_d = var3.next;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("uja.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    uja(IntrusiveDeque param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "uja.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[]{15, 12, 7, 18, 41, 16};
        field_c = new int[]{0, 0};
    }
}
