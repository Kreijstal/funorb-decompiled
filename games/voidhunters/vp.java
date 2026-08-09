/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp extends wm implements ntb {
    private int field_c;
    private int field_d;
    static ri field_e;

    final void a(pe param0, int param1, int param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param1 == -2) {
              L1: {
                if (0 == param2) {
                  this.field_d = (param3 + so.field_b) % so.field_b;
                  break L1;
                } else {
                  this.field_c = (56 + param3) % 56;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("vp.E(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != -2404) {
            vp.b(-35);
        }
    }

    final int a(byte param0, int param1) {
        if (param0 >= -102) {
            return -124;
        }
        if (0 == param1) {
            return this.field_d;
        }
        return this.field_c;
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        vp var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              var5 = (vp) ((Object) param0);
              super.a(param0, -98);
              var4 = 0;
              if (this.field_d == var5.field_d) {
                break L1;
              } else {
                var4 = 1;
                System.out.println("int team_id has changed. before=" + var5.field_d + ", now=" + this.field_d);
                break L1;
              }
            }
            L2: {
              if (param1 <= -19) {
                break L2;
              } else {
                field_e = (ri) null;
                break L2;
              }
            }
            L3: {
              if (this.field_c != var5.field_c) {
                System.out.println("int component_type_id has changed. before=" + var5.field_c + ", now=" + this.field_c);
                var4 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var4 == 0) {
                break L4;
              } else {
                System.out.println("This instance of MissionConditionShipHoldsComponent has changed");
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("vp.F(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        vp var5 = null;
        vp var6 = null;
        super.b((byte) 69, param1);
        if (param0 <= 54) {
            return;
        }
        try {
            var5 = (vp) ((Object) param1);
            var6 = var5;
            var6.field_d = this.field_d;
            var6.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "vp.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
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
                    if (var7.q((byte) 105) != this.field_d) {
                      break L2;
                    } else {
                      if (0 < var7.field_k.a(this.field_c, 0)) {
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

            stackIn_14_1 = new StringBuilder().append("vp.G(").append(param0).append(',');

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

    public final void b(faa param0, int param1) {
        try {
            super.b(param0, -115);
            if (param1 >= -109) {
                this.field_d = -31;
            }
            param0.a(-632, this.field_d, 8);
            param0.a(-632, this.field_c, 8);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "vp.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, param1);
            this.field_d = param0.i(0, 8);
            this.field_c = param0.i(0, 8);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "vp.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ucb[] a(pe param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != -20605) {
              this.a((byte) -105, 11);
              stackIn_3_0 = null;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("vp.I(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (ucb[]) ((Object) stackIn_3_0);
    }

    final int[] a(pe param0, int param1, int[] param2) {
        sg[] var5 = null;
        int var6 = 0;
        sg var7 = null;
        int var8 = 0;
        sg[] var9 = null;
        int[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var9 = param0.d(1000);
              var5 = var9;
              if (param1 >= 16) {
                break L1;
              } else {
                this.a((pe) null, -9);
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              if (var6 >= var5.length) {
                stackIn_18_0 = (int[]) (param2);
                break L0;
              } else {
                var7 = var5[var6];
                if (var7 != null) {
                  if (var7.q((byte) 114) == this.field_d) {
                    if (!var7.l((byte) -10)) {
                      if ((var7.o((byte) -117) ^ -1) <= -1) {
                        L3: {
                          if ((var7.field_k.a(this.field_c, 0) ^ -1) < -1) {
                            param2 = qi.a(var7.c(false), true, param2, (byte) -14);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
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
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("vp.J(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        return stackIn_18_0;
    }

    final String a(int param0) {
        if (param0 != -1) {
            this.a(-64, (lbb) null, (pe) null);
        }
        String var2 = "Any ship ";
        return var2 + "on team " + this.field_d + " holds component " + obb.field_o[this.field_c];
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        vp var4 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 81 % ((22 - param0) / 59);
                var4 = (vp) ((Object) param1);
                if (super.a((byte) -76, param1)) {
                  break L2;
                } else {
                  if (var4.field_d != this.field_d) {
                    break L2;
                  } else {
                    if (var4.field_c == this.field_c) {
                      stackIn_6_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackIn_6_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("vp.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    vp() {
    }

    vp(int param0, int param1) {
        this.field_d = param0;
        this.field_c = param1;
    }

    static {
        field_e = new ri(0, 2, 2, 1);
    }
}
