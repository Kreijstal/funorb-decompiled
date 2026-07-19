/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pta implements fo {
    static String field_g;
    private la field_e;
    vna field_b;
    private c field_f;
    private vna field_c;
    static String field_d;
    private boolean field_a;

    public static void b(boolean param0) {
        field_d = null;
        field_g = null;
        if (param0) {
            return;
        }
        field_d = (String) null;
    }

    public final int e(byte param0) {
        if (param0 > -86) {
            this.field_e = (la) null;
            return 0;
        }
        return 0;
    }

    public final void f(int param0) {
        if (param0 == -4366) {
            return;
        }
        field_g = (String) null;
    }

    public final int c(byte param0) {
        boolean discarded$0 = false;
        if (param0 < 91) {
            CharSequence var3 = (CharSequence) null;
            discarded$0 = pta.a((CharSequence) null, -61);
            return 0;
        }
        return 0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        c var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var3 = -68 % ((-41 - param1) / 42);
        var4 = (c) ((Object) this.field_b.f(-80));
        L0: while (true) {
          if (var4 != null) {
            stackOut_3_0 = var4.a(param0, (byte) -39);
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var5 == 0) {
              param0 = stackIn_5_0;
              var4 = (c) ((Object) this.field_b.e(121));
              continue L0;
            } else {
              return stackIn_4_0;
            }
          } else {
            return param0;
          }
        }
    }

    final void a(uw param0, byte param1, boolean param2, int param3) {
        try {
            this.field_a = param2 ? true : false;
            if (!param2) {
                param0.a((byte) 83, param3, (fo) (this));
            }
            int var5_int = -45 / ((59 - param1) / 63);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pta.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(boolean param0) {
        c var2 = null;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (!param0) {
          var2 = (c) ((Object) this.field_b.f(-80));
          L0: while (true) {
            if (var2 != null) {
              System.out.println(var2);
              var2 = (c) ((Object) this.field_b.e(116));
              if (var3 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          field_d = (String) null;
          var2 = (c) ((Object) this.field_b.f(-80));
          L1: while (true) {
            if (var2 != null) {
              System.out.println(var2);
              var2 = (c) ((Object) this.field_b.e(116));
              if (var3 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(boolean param0, byte param1) {
        c var3 = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        int stackIn_8_0 = 0;
        boolean stackOut_2_0 = false;
        byte stackOut_7_0 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = (c) ((Object) this.field_b.f(-80));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                var3.a(-1, param0);
                stackOut_2_0 = var3.h(18407);
                stackIn_8_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0) {
                      var3.p(76);
                      this.field_c.b((byte) -88, var3);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var3 = (c) ((Object) this.field_b.e(127));
                  if (var4 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_7_0 = param1;
            stackIn_8_0 = stackOut_7_0;
            break L1;
          }
          if (stackIn_8_0 < -19) {
            return;
          } else {
            field_d = (String) null;
            return;
          }
        }
    }

    final void a(byte param0) {
        c var2 = null;
        int var3 = 0;
        uw var4 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = (c) ((Object) this.field_b.f(-80));
        L0: while (true) {
          if (var2 == null) {
            if (param0 <= 111) {
              var4 = (uw) null;
              this.a((uw) null, (byte) -42, false, 21);
              return;
            } else {
              return;
            }
          } else {
            var2.p(88);
            this.field_c.b((byte) -60, var2);
            var2 = (c) ((Object) this.field_b.e(112));
            if (var3 == 0) {
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            this.field_e = (la) null;
            return false;
        }
        return false;
    }

    final c a(int param0, int param1, int param2, uw param3, int param4) {
        c var6 = null;
        RuntimeException var6_ref = null;
        c stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        c stackOut_8_0 = null;
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
              if (param0 == -2698) {
                break L1;
              } else {
                this.a((byte) 28);
                break L1;
              }
            }
            L2: {
              L3: {
                if (!this.field_c.d((byte) 14)) {
                  break L3;
                } else {
                  var6 = this.field_f.d(true);
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var6 = (c) ((Object) this.field_c.c(param0 ^ 2800));
              var6.p(param0 + 2821);
              break L2;
            }
            L4: {
              var6.a(param4, (byte) -78, param1, param2);
              if (!this.field_a) {
                break L4;
              } else {
                if (param3 == null) {
                  break L4;
                } else {
                  var6.a(param3, param0 + 8163);
                  break L4;
                }
              }
            }
            this.field_b.b((byte) -109, var6);
            stackOut_8_0 = (c) (var6);
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var6_ref);
            stackOut_10_1 = new StringBuilder().append("pta.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param4 + ')');
        }
        return stackIn_9_0;
    }

    public final void a(int param0, iq param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        c var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5 = (c) ((Object) this.field_b.f(-80));
            if (param0 > 103) {
              L1: while (true) {
                if (var5 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5.a(104, param1);
                  var5 = (c) ((Object) this.field_b.e(121));
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("pta.DB(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final int b(byte param0) {
        int var2 = 35 / ((param0 - -23) / 53);
        return 0;
    }

    final void a(int param0) {
        int discarded$8 = 0;
        int var3 = 0;
        c var4 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 > 93) {
          var4 = (c) ((Object) this.field_b.f(-80));
          L0: while (true) {
            if (var4 != null) {
              var4.a(this.field_e, -63);
              var4 = (c) ((Object) this.field_b.e(109));
              if (var3 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          discarded$8 = this.e((byte) 14);
          var4 = (c) ((Object) this.field_b.f(-80));
          L1: while (true) {
            if (var4 != null) {
              var4.a(this.field_e, -63);
              var4 = (c) ((Object) this.field_b.e(109));
              if (var3 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_g = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = lg.a(false, param0, param1 + 1617);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("pta.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    pta(la param0, c param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        this.field_b = new vna();
        this.field_c = new vna();
        try {
          L0: {
            this.field_e = param0;
            this.field_f = param1;
            var4_int = 0;
            L1: while (true) {
              if (param2 <= var4_int) {
                break L0;
              } else {
                this.field_c.b((byte) -81, param1.d(true));
                var4_int++;
                if (var5 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("pta.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    static {
        field_g = "Name";
        field_d = "Similar rating";
    }
}
