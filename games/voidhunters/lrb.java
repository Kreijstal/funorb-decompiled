/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lrb extends rna implements ntb, hd {
    static dfa field_b;
    static String field_a;
    private int field_d;
    private int field_c;
    static boolean field_f;
    static int field_e;

    public final void b(byte param0, tv param1) {
        lrb var5 = null;
        lrb var6 = null;
        try {
            if (param0 < 54) {
                this.a(-15);
            }
            var5 = (lrb) ((Object) param1);
            var6 = var5;
            super.b((byte) 103, param1);
            var6.field_c = this.field_c;
            var6.field_d = this.field_d;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "lrb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        pe var5 = null;
        lrb var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -19) {
                break L1;
              } else {
                var5 = (pe) null;
                this.a((pe) null, 61);
                break L1;
              }
            }
            L2: {
              super.a(param0, -97);
              var6 = (lrb) ((Object) param0);
              var4 = 0;
              if (var6.field_d != this.field_d) {
                var4 = 1;
                System.out.println("int target_body has changed. before=" + var6.field_d + ", now=" + this.field_d);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (this.field_c != var6.field_c) {
                System.out.println("int team has changed. before=" + var6.field_c + ", now=" + this.field_c);
                var4 = 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var4 != 0) {
                System.out.println("This instance of MissionActionSetTeam has changed");
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("lrb.F(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
    }

    final void a(pe param0, boolean param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                L2: {
                  if (param3 <= this.field_d) {
                    stackIn_6_0 = -1;
                    break L2;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
                var5_int = stackIn_6_0;
                var6 = 50;
                var7 = param3 + var6 * var5_int;
                var8 = param3;
                L3: while (true) {
                  if (var8 == var7) {
                    break L1;
                  } else {
                    L4: {
                      if (null != param0.d((byte) -27, var8)) {
                        break L4;
                      } else {
                        if ((var8 ^ -1) == 0) {
                          break L4;
                        } else {
                          var8 = var8 + var5_int;
                          continue L3;
                        }
                      }
                    }
                    this.field_d = var8;
                    break L1;
                  }
                }
              } else {
                this.field_c = (param3 - -3) % 3;
                break L1;
              }
            }
            L5: {
              if (!param1) {
                break L5;
              } else {
                this.field_c = 56;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("lrb.K(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, param1);
            if (param1) {
                this.a(-27);
            }
            this.field_d = param0.i(0, 32);
            this.field_c = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "lrb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String a(int param0) {
        String var2 = "Set team of ship " + this.field_d;
        if (param0 != -1325) {
            tv var3 = (tv) null;
            this.a((tv) null, 8);
        }
        if (!(-1 != this.field_d)) {
            var2 = "Set team of whatever ship";
        }
        return var2 + " to " + this.field_c;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 <= 52) {
            lrb.a((byte) -16);
        }
    }

    public final void b(faa param0, int param1) {
        try {
            super.b(param0, -119);
            if (param1 > -109) {
                field_b = (dfa) null;
            }
            param0.a(-632, this.field_d, 32);
            param0.a(-632, this.field_c, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "lrb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        lrb var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = 38 / ((22 - param0) / 59);
                var3 = (lrb) ((Object) param1);
                if (super.a((byte) -44, param1)) {
                  break L2;
                } else {
                  if (this.field_d != var3.field_d) {
                    break L2;
                  } else {
                    if (this.field_c == var3.field_c) {
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
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("lrb.C(").append(param0).append(',');

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

    public final int[] a(int param0, int[] param1) {
        RuntimeException var3 = null;
        int[] stackIn_4_0 = null;
        int[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((this.field_d ^ -1) > -1) {
                break L1;
              } else {
                param1 = qi.a(this.field_d, true, param1, (byte) -14);
                break L1;
              }
            }
            if (param0 > 99) {
              stackIn_6_0 = (int[]) (param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = (int[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("lrb.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    private final void a(int param0, int param1, rsb param2) {
        anb var4 = null;
        sg var5 = null;
        rsb var6 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            L1: {
              var4 = param2.field_g.d((byte) -27, param0);
              if (var4 == null) {
                break L1;
              } else {
                if (!(var4 instanceof sg)) {
                  break L1;
                } else {
                  L2: {
                    var5 = (sg) ((Object) var4);
                    if (!param2.a(this.field_c, 0, var5.q((byte) 110))) {
                      L3: {
                        if (-1 == fw.field_a) {
                          break L3;
                        } else {
                          if (tg.field_o == var5.q((byte) 122)) {
                            break L3;
                          } else {
                            qha.b(false);
                            break L2;
                          }
                        }
                      }
                      fw.field_a = param0;
                      tg.field_o = var5.q((byte) 90);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                  var5.h(17704, this.field_c);
                  if (var5.o((byte) -117) < 0) {
                    break L1;
                  } else {
                    if (var5.o((byte) -117) < param2.field_c.length) {
                      param2.a(var5.o((byte) -117), (byte) 59).field_h = this.field_c;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L4: {
              if (param1 == 32) {
                break L4;
              } else {
                var6 = (rsb) null;
                this.a(90, -3, (rsb) null);
                break L4;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4_ref);

            stackIn_18_1 = new StringBuilder().append("lrb.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final ucb a(pe param0, int param1) {
        anb var3 = null;
        RuntimeException var3_ref = null;
        ucb stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = param0.d((byte) -27, this.field_d);
              if (param1 == 26964) {
                break L1;
              } else {
                this.field_d = -27;
                break L1;
              }
            }
            if (var3 != null) {
              stackIn_5_0 = new ucb(var3.d(false), var3.g((byte) 117));
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("lrb.I(");

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
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final int a(int param0, int param1) {
        if (param1 >= -100) {
            return -97;
        }
        if (0 == param0) {
            return this.field_d;
        }
        return this.field_c;
    }

    lrb() {
    }

    final void a(int param0, int[] param1, rsb param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if ((this.field_d ^ -1) != 0) {
                this.a(this.field_d, 32, param2);
                break L1;
              } else {
                if (param1 == null) {
                  break L1;
                } else {
                  if (param1.length <= 0) {
                    break L1;
                  } else {
                    var4_int = 0;
                    L2: while (true) {
                      if (var4_int >= param1.length) {
                        break L1;
                      } else {
                        this.a(param1[var4_int], 32, param2);
                        var4_int++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
            L3: {
              if (param0 == 1) {
                break L3;
              } else {
                lrb.a((byte) 94);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("lrb.E(").append(param0).append(',');

            if (param1 == null) {
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
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
    }

    lrb(int param0, int param1) {
        this.field_d = param0;
        this.field_c = param1;
    }

    static {
        field_a = "Suggested names: ";
        field_e = 0;
    }
}
