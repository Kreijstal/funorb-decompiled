/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends wm implements ntb, hd {
    static String[] field_f;
    private int field_d;
    static int field_e;
    private int field_c;

    public static void b(int param0) {
        if (param0 != -10570) {
            return;
        }
        field_f = null;
    }

    final int a(byte param0, int param1) {
        if (param0 > -102) {
            return 17;
        }
        if (-1 != (param1 ^ -1)) {
            return this.field_d;
        }
        return this.field_c;
    }

    final boolean a(int param0, lbb param1, pe param2) {
        sg var4 = null;
        RuntimeException var4_ref = null;
        sg[] var5 = null;
        int var6 = 0;
        sg var7 = null;
        int var8 = 0;
        sg[] var9 = null;
        int stackIn_8_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == (this.field_c ^ -1)) {
              var9 = param2.d(param0 + 1000);
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var5.length) {
                  stackIn_20_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var7 = var5[var6];
                    if (var7 == null) {
                      break L2;
                    } else {
                      if (var7.q((byte) 120) != this.field_d) {
                        break L2;
                      } else {
                        if (var7.l((byte) -10)) {
                          break L2;
                        } else {
                          if (-1 >= (var7.o((byte) -117) ^ -1)) {
                            stackIn_17_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              L3: {
                var4 = param2.d(param0 ^ 1000)[this.field_c];
                if (var4 == null) {
                  break L3;
                } else {
                  if (var4.q((byte) 86) != this.field_d) {
                    break L3;
                  } else {
                    if (var4.l((byte) -10)) {
                      break L3;
                    } else {
                      if (-1 == var4.o((byte) -117)) {
                        break L3;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              }
              stackIn_8_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4_ref);

            stackIn_23_1 = new StringBuilder().append("ih.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    final ucb[] a(pe param0, int param1) {
        sg var3 = null;
        RuntimeException var3_ref = null;
        sg var4 = null;
        ucb[] stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((this.field_c ^ -1) == 0) {
                break L1;
              } else {
                var4 = param0.d(1000)[this.field_c];
                var3 = var4;
                if (var3 != null) {
                  stackIn_4_0 = new ucb[]{new ucb(var4.d(false), var4.g((byte) -58))};
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param1 != -20605) {
              field_e = 68;
              stackIn_8_0 = null;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("ih.I(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return (ucb[]) ((Object) stackIn_8_0);
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, param1);
            this.field_c = param0.i(0, 32);
            this.field_d = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ih.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(pe param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        anb var9 = null;
        int var10 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 == -2) {
                break L1;
              } else {
                this.a(57, (int[]) null);
                break L1;
              }
            }
            L2: {
              if (param2 == 0) {
                L3: {
                  if (this.field_c >= param3) {
                    stackIn_8_0 = -1;
                    break L3;
                  } else {
                    stackIn_8_0 = 1;
                    break L3;
                  }
                }
                var5_int = stackIn_8_0;
                var6 = 50;
                var7 = var5_int * var6 + param3;
                var8 = param3;
                L4: while (true) {
                  if (var7 == var8) {
                    break L2;
                  } else {
                    L5: {
                      L6: {
                        var9 = param0.d((byte) -27, var8);
                        if (var9 == null) {
                          break L6;
                        } else {
                          if (var9 instanceof sg) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (-1 == var8) {
                        break L5;
                      } else {
                        var8 = var8 + var5_int;
                        continue L4;
                      }
                    }
                    this.field_c = var8;
                    break L2;
                  }
                }
              } else {
                this.field_d = (so.field_b + param3) % so.field_b;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("ih.E(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        ih var4 = null;
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
                var3_int = -3 / ((22 - param0) / 59);
                var4 = (ih) ((Object) param1);
                if (super.a((byte) 89, param1)) {
                  break L2;
                } else {
                  if (this.field_c != var4.field_c) {
                    break L2;
                  } else {
                    if (var4.field_d == this.field_d) {
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

            stackIn_9_1 = new StringBuilder().append("ih.C(").append(param0).append(',');

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

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
            return;
        }
        try {
            super.b(param0, -122);
            param0.a(-632, this.field_c, 32);
            param0.a(-632, this.field_d, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ih.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int[] a(pe param0, int param1, int[] param2) {
        sg[] var5 = null;
        int var6 = 0;
        sg var7 = null;
        int var8 = 0;
        sg[] var9 = null;
        int[] stackIn_5_0 = null;
        int[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 >= 16) {
                break L1;
              } else {
                field_f = (String[]) null;
                break L1;
              }
            }
            if (this.field_c == -1) {
              var9 = param0.d(1000);
              var5 = var9;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var5.length) {
                  stackIn_18_0 = (int[]) (param2);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var7 = var5[var6];
                  if (var7 != null) {
                    if (var7.q((byte) 121) == this.field_d) {
                      if (!var7.l((byte) -10)) {
                        if (-1 >= (var7.o((byte) -117) ^ -1)) {
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
                }
              }
            } else {
              stackIn_5_0 = qi.a(this.field_c, true, param2, (byte) -14);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("ih.J(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_18_0;
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        ih var5 = null;
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
              super.a(param0, -86);
              var5 = (ih) ((Object) param0);
              if (param1 < -19) {
                break L1;
              } else {
                this.b((faa) null, -126);
                break L1;
              }
            }
            L2: {
              var4 = 0;
              if (this.field_c == var5.field_c) {
                break L2;
              } else {
                System.out.println("int ship_id has changed. before=" + var5.field_c + ", now=" + this.field_c);
                var4 = 1;
                break L2;
              }
            }
            L3: {
              if (this.field_d != var5.field_d) {
                var4 = 1;
                System.out.println("int team_id has changed. before=" + var5.field_d + ", now=" + this.field_d);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var4 == 0) {
                break L4;
              } else {
                System.out.println("This instance of MissionConditionShipOnTeam has changed");
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

            stackIn_12_1 = new StringBuilder().append("ih.F(");

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

    public final int[] a(int param0, int[] param1) {
        RuntimeException var3 = null;
        int[] stackIn_2_0 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 99) {
              L1: {
                if (this.field_c >= 0) {
                  param1 = qi.a(this.field_c, true, param1, (byte) -14);
                  break L1;
                } else {
                  break L1;
                }
              }
              stackIn_7_0 = (int[]) (param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (int[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ih.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    ih() {
    }

    final String a(int param0) {
        String var2 = "Ship " + this.field_c;
        if (this.field_c == param0) {
            var2 = "Any ship";
        }
        return var2 + " in team " + this.field_d;
    }

    ih(int param0, int param1) {
        this.field_d = param1;
        this.field_c = param0;
    }

    public final void b(byte param0, tv param1) {
        ih var4 = (ih) ((Object) param1);
        ih var3 = var4;
        if (param0 <= 54) {
            return;
        }
        try {
            super.b((byte) 110, param1);
            var4.field_d = this.field_d;
            var4.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ih.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
