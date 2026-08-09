/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jsb extends wm implements ntb {
    static int field_d;
    private int field_c;
    static String[] field_e;

    public final void a(tv param0, int param1) {
        jsb var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              super.a(param0, -47);
              var3 = (jsb) ((Object) param0);
              var4 = 0;
              if (var3.field_c == this.field_c) {
                break L1;
              } else {
                var4 = 1;
                System.out.println("int team_id has changed. before=" + var3.field_c + ", now=" + this.field_c);
                break L1;
              }
            }
            L2: {
              if (var4 != 0) {
                System.out.println("This instance of MissionConditionShipJustSpawned has changed");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 < -19) {
                break L3;
              } else {
                field_d = -49;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("jsb.F(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final ucb[] a(pe param0, int param1) {
        RuntimeException var3 = null;
        ucb[] stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != -20605) {
              stackIn_3_0 = (ucb[]) null;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("jsb.I(");

            if (param0 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final int[] a(pe param0, int param1, int[] param2) {
        sg[] var4 = null;
        sg[] var5 = null;
        int var6 = 0;
        sg var7 = null;
        int var8 = 0;
        int[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4 = param0.d(1000);
              if (param1 > 16) {
                break L1;
              } else {
                this.a(-56);
                break L1;
              }
            }
            var5 = var4;
            var6 = 0;
            L2: while (true) {
              if (var5.length <= var6) {
                stackIn_17_0 = (int[]) (param2);
                break L0;
              } else {
                var7 = var5[var6];
                if (var7 != null) {
                  if (var7.q((byte) 114) == this.field_c) {
                    if (!var7.l((byte) -10)) {
                      if (var7.o((byte) -117) >= 0) {
                        if (var7.field_D) {
                          param2 = qi.a(var7.c(false), true, param2, (byte) -14);
                          var6++;
                          continue L2;
                        } else {
                          var6++;
                          continue L2;
                        }
                      } else {
                        var6++;
                        continue L2;
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  } else {
                    var6++;
                    continue L2;
                  }
                } else {
                  var6++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4_ref);

            stackIn_20_1 = new StringBuilder().append("jsb.J(");

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
          L4: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ')');
        }
        return stackIn_17_0;
    }

    final boolean a(int param0, lbb param1, pe param2) {
        RuntimeException var4 = null;
        sg[] var5 = null;
        int var6 = 0;
        sg var7 = null;
        int var8 = 0;
        sg[] var9 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var9 = param2.d(param0 ^ 1000);
            var5 = var9;
            var6 = param0;
            L1: while (true) {
              if (var6 >= var5.length) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var7 = var5[var6];
                  if (var7 == null) {
                    break L2;
                  } else {
                    if (var7.q((byte) 93) != this.field_c) {
                      break L2;
                    } else {
                      if (var7.field_D) {
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("jsb.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          return stackIn_11_0 != 0;
        }
    }

    public static void b(byte param0) {
        if (param0 != 11) {
            jsb.b((byte) 113);
        }
        field_e = null;
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        jsb var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = -112 % ((param0 - 22) / 59);
                var4 = (jsb) ((Object) param1);
                if (super.a((byte) -56, param1)) {
                  break L2;
                } else {
                  if (this.field_c == var4.field_c) {
                    stackIn_5_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_5_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("jsb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    public final void b(byte param0, tv param1) {
        jsb var6 = null;
        jsb var7 = null;
        try {
            var6 = (jsb) ((Object) param1);
            var7 = var6;
            if (param0 <= 54) {
                pe var4 = (pe) null;
                this.a((pe) null, -15);
            }
            super.b((byte) 81, param1);
            var7.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "jsb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    jsb() {
    }

    final String a(int param0) {
        if (param0 != -1) {
            return (String) null;
        }
        String var2 = "Any ship just spawned";
        return var2 + " onto team " + this.field_c;
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, param1);
            this.field_c = param0.i(0, 8);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "jsb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    jsb(int param0) {
        this.field_c = param0;
    }

    final int a(byte param0, int param1) {
        if (param0 >= -102) {
            pe var4 = (pe) null;
            this.a((pe) null, 9);
        }
        return this.field_c;
    }

    final void a(pe param0, int param1, int param2, int param3) {
        if (param1 != -2) {
            return;
        }
        try {
            this.field_c = (so.field_b + param3) % so.field_b;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "jsb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -116);
        if (param1 > -109) {
            return;
        }
        try {
            param0.a(-632, this.field_c, 8);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "jsb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_d = 1;
    }
}
