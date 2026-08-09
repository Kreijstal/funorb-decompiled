/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static ib field_e;
    private long field_f;
    private bf[] field_c;
    static int[] field_a;
    private bf field_d;
    private int field_b;

    final void a(bf param0, long param1, int param2) {
        if (param0.field_e != null) {
            param0.a(7847);
        }
        bf var5 = this.field_c[(int)(param1 & (long)(-1 + this.field_b))];
        param0.field_g = var5;
        if (param2 >= -55) {
            return;
        }
        try {
            param0.field_e = var5.field_e;
            param0.field_e.field_g = param0;
            param0.field_f = param1;
            param0.field_g.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "vd.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final bf b(int param0) {
        bf var2;
        bf var3;
        int var4;
        int stackIn_10_0 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (this.field_d != null) {
          var2 = this.field_c[(int)(this.field_f & (long)(this.field_b + -1))];
          L0: while (true) {
            L1: {
              L2: {
                if (var2 == this.field_d) {
                  break L2;
                } else {
                  stackIn_10_0 = ((this.field_f ^ -1L) < (this.field_d.field_f ^ -1L) ? -1 : ((this.field_f ^ -1L) == (this.field_d.field_f ^ -1L) ? 0 : 1));

                  if (var4 != 0) {
                    break L1;
                  } else {
                    if (stackIn_10_0 == 0) {
                      var3 = this.field_d;
                      this.field_d = this.field_d.field_g;
                      return var3;
                    } else {
                      this.field_d = this.field_d.field_g;
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              this.field_d = null;
              stackIn_10_0 = param0;
              break L1;
            }
            if (stackIn_10_0 < -28) {
              return null;
            } else {
              vd.a(true);
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static String a(CharSequence[] param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -115) {
                break L1;
              } else {
                field_e = (ib) null;
                break L1;
              }
            }
            stackIn_3_0 = k.a(0, param0.length, 0, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("vd.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final bf a(long param0, boolean param1) {
        bf var4;
        bf var5;
        int var6;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!param1) {
          this.field_f = param0;
          var4 = this.field_c[(int)((long)(-1 + this.field_b) & param0)];
          this.field_d = var4.field_g;
          L0: while (true) {
            if (var4 != this.field_d) {
              if (var6 == 0) {
                if ((param0 ^ -1L) != (this.field_d.field_f ^ -1L)) {
                  this.field_d = this.field_d.field_g;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    this.field_d = null;
                    return null;
                  }
                } else {
                  var5 = this.field_d;
                  this.field_d = this.field_d.field_g;
                  return var5;
                }
              } else {
                return null;
              }
            } else {
              this.field_d = null;
              return null;
            }
          }
        } else {
          this.field_d = (bf) null;
          this.field_f = param0;
          var4 = this.field_c[(int)((long)(-1 + this.field_b) & param0)];
          this.field_d = var4.field_g;
          L1: while (true) {
            if (var4 != this.field_d) {
              if (var6 == 0) {
                if ((param0 ^ -1L) != (this.field_d.field_f ^ -1L)) {
                  this.field_d = this.field_d.field_g;
                  if (var6 == 0) {
                    continue L1;
                  } else {
                    this.field_d = null;
                    return null;
                  }
                } else {
                  var5 = this.field_d;
                  this.field_d = this.field_d.field_g;
                  return var5;
                }
              } else {
                return null;
              }
            } else {
              this.field_d = null;
              return null;
            }
          }
        }
    }

    final static mj a(boolean param0) {
        if (param0) {
            field_e = (ib) null;
            return k.field_f;
        }
        return k.field_f;
    }

    final static vk a(boolean param0, String param1, ad param2, ad param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        vk stackIn_2_0 = null;
        vk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param3.c(param1, (byte) -105);
            if (param0) {
              var6 = param3.a(param4, var5_int, -28459);
              stackIn_4_0 = n.a(param3, param2, (byte) 125, var5_int, var6);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (vk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("vd.G(").append(param0).append(',');

            if (param1 == null) {
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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    vd(int param0) {
        bf dupTemp$1 = null;
        int var2 = 0;
        bf var3 = null;
        int var4 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = MonkeyPuzzle2.field_F ? 1 : 0;
                    this.field_c = new bf[param0];
                    this.field_b = param0;
                    var2 = 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (var2 >= param0) {
                        statePc = 5;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    dupTemp$1 = new bf();
                    var3 = dupTemp$1;
                    this.field_c[var2] = dupTemp$1;
                    var3.field_e = var3;
                    var3.field_g = var3;
                    var2++;
                    if (var4 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (var4 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        if (param0 <= 106) {
            vd.a(-53);
        }
    }

    static {
        field_a = new int[8192];
        field_e = new ib();
    }
}
