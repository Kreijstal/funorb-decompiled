/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ea extends pn {
    static int field_r;
    transient int field_s;
    static wh field_q;
    transient int field_p;
    static int field_n;
    transient int field_o;
    transient int field_m;

    f a(sl param0, f[][] param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_j = true;
              if (param4 == 17512) {
                break L1;
              } else {
                this.a(-19, -65, -62, (f[][]) null, 68, 12, 92, -106);
                break L1;
              }
            }
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("ea.I(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return (f) (this);
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        f var7 = null;
        int var9 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_9_0;
        f stackIn_9_1;
        f stackIn_9_2;
        int stackIn_9_3;
        int stackIn_9_4;
        f[][] stackIn_9_5;
        Object stackIn_10_0 = null;
        f stackIn_10_1 = null;
        f stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        int stackIn_10_4 = 0;
        f[][] stackIn_10_5 = null;
        dl[] stackIn_10_6 = null;
        Object stackIn_12_0 = null;
        ig stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        ig var8 = null;
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            var7 = this.field_l;
            L1: while (true) {
              if (!(var7 instanceof ro)) {
                if (!(var7 instanceof pn)) {
                  L2: {
                    stackIn_9_0 = this;

                    stackIn_9_1 = this.field_l;

                    stackIn_9_2 = (f) (param0);

                    stackIn_9_3 = param1;

                    stackIn_9_4 = param2;

                    stackIn_9_5 = (f[][]) (param3);

                    if (!this.b((byte) 97)) {
                      stackIn_10_0 = this;
                      stackIn_10_1 = (f) ((Object) stackIn_9_1);
                      stackIn_10_2 = (f) ((Object) stackIn_9_2);
                      stackIn_10_3 = stackIn_9_3;
                      stackIn_10_4 = stackIn_9_4;
                      stackIn_10_5 = (f[][]) ((Object) stackIn_9_5);
                      stackIn_10_6 = null;
                      break L2;
                    } else {
                      stackIn_10_0 = this;
                      stackIn_10_1 = (f) ((Object) stackIn_9_1);
                      stackIn_10_2 = (f) ((Object) stackIn_9_2);
                      stackIn_10_3 = stackIn_9_3;
                      stackIn_10_4 = stackIn_9_4;
                      stackIn_10_5 = (f[][]) ((Object) stackIn_9_5);
                      stackIn_10_6 = (dl[]) (param4);
                      break L2;
                    }
                  }
                  ((ea) (this)).field_l = ((f) (Object) stackIn_10_1).a(stackIn_10_2, stackIn_10_3, stackIn_10_4, stackIn_10_5, stackIn_10_6, param5);
                  if (!this.a((byte) 42, param3, param0)) {
                    cn.field_e.a(64, param2 * 12, param1 * 12, 0, (byte) -111);
                    var8 = new ig(param0, bd.field_n, (f) null, true);
                    var8.field_l = this.a(param1, param2, var8, -122, param3);
                    stackIn_14_0 = (ig) (var8);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_12_0 = this;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  var7 = ((pn) ((Object) var7)).field_l;
                  continue L1;
                }
              } else {
                stackIn_4_0 = this;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var7_ref);

            stackIn_17_1 = new StringBuilder().append("ea.H(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), stackIn_24_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (f) (this);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (f) (this);
          } else {
            return (f) ((Object) stackIn_14_0);
          }
        }
    }

    private final boolean a(int param0, int param1, boolean param2, f[][] param3, int param4, fq param5, int param6) {
        boolean discarded$1 = false;
        RuntimeException var8 = null;
        ea var9 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              var9 = (ea) null;
              discarded$1 = this.a(59, -123, (f[][]) null, -125, (ea) null, -112, 91);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("ea.QA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    boolean a(int param0, int param1, int param2, f[][] param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        ea var9 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -1) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              var9 = (ea) null;
              this.a(-31, 46, (f[][]) null, -62, 17, -38, (ea) null);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("ea.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    abstract void a(boolean param0, int param1, int param2, int param3, int param4, int param5);

    void c(int param0, int param1, int param2) {
        if (param1 != -5) {
            this.field_s = -124;
        }
    }

    final f a(int param0, int param1, f param2, int param3, f[][] param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        f var7 = null;
        f stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var6_int = 21 % ((param3 - -63) / 52);
              var7 = this.a(param4, param0, param2, 11460, param1);
              if (var7 == this) {
                break L1;
              } else {
                if (-1 != ((this.field_s | this.field_o) ^ -1)) {
                  this.a(param1, param4, param0, (byte) -90);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            stackIn_5_0 = (f) (var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("ea.MA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0;
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        RuntimeException var8 = null;
        f stackIn_2_0 = null;
        f stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_l = this.field_l.a(param0, param1, param2, param3, (byte) -91, param5, param6);
            if (param4 <= -87) {
              L1: {
                if (this.field_o != param2) {
                  break L1;
                } else {
                  if (param0 != this.field_s) {
                    break L1;
                  } else {
                    if (param1.field_m * this.field_p < param1.field_p * this.field_m) {
                      stackIn_10_0 = this;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              stackIn_8_0 = this.a(param0, param5 + param2, param6, -31135, param0 + param3, param2, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (f) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var8);

            stackIn_13_1 = new StringBuilder().append("ea.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return (f) (this);
          }
        }
    }

    boolean g(int param0) {
        if (param0 != 0) {
            this.field_m = -77;
            return true;
        }
        return true;
    }

    f a(mj param0, byte param1, boolean param2, f[][] param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        f stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_s <= 0) {
              L1: {
                if (param1 <= -74) {
                  break L1;
                } else {
                  this.field_p = -83;
                  break L1;
                }
              }
              stackIn_6_0 = super.a(param0, (byte) -108, param2, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_l = this.field_l.a(param0, (byte) -101, param2, param3);
              stackIn_2_0 = this;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ea.S(");

            if (param0 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (f) (this);
        } else {
          return stackIn_6_0;
        }
    }

    boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        RuntimeException var9 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_9_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_l.a(param0, param1, param2, param3, param4, param5, param6, param7)) {
              L1: {
                if (this.field_o != param7) {
                  break L1;
                } else {
                  if (param3 != this.field_s) {
                    break L1;
                  } else {
                    if (-this.field_m + this.field_p < param6.field_p) {
                      stackIn_13_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              if ((this.field_o | this.field_s) != 0) {
                stackIn_11_0 = this.a(param4, param6, param5, param1, param7, false, param3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_9_0 = this.a(param0 + -16736253, param3, param1, param5, param6, param7, param4);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var9);

            stackIn_16_1 = new StringBuilder().append("ea.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    abstract int a(boolean param0, int param1);

    public static void f(int param0) {
        if (param0 != -1) {
            return;
        }
        field_q = null;
    }

    private final boolean a(int param0, int param1, f[][] param2, int param3, ea param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 14) {
                break L1;
              } else {
                this.c(-7, 39, -20);
                break L1;
              }
            }
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("ea.TA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final sl a(int param0, f[][] param1, int param2, byte param3) {
        sl stackIn_6_0 = null;
        sl stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sl var5 = null;
        f var5_ref = null;
        RuntimeException var5_ref2 = null;
        pn var6 = null;
        sl var7 = null;
        int var8 = 0;
        f var9 = null;
        sl var10 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              param2 = param2 + this.field_s;
              param0 = param0 + this.field_o;
              if (param3 <= -87) {
                break L1;
              } else {
                var9 = (f) null;
                this.a((f[][]) null, -82, (f) null, -14, 66);
                break L1;
              }
            }
            L2: {
              if (!(param1[param2][param0] instanceof sl)) {
                break L2;
              } else {
                if (this != ((sl) ((Object) param1[param2][param0])).field_o) {
                  break L2;
                } else {
                  var10 = (sl) ((Object) param1[param2][param0]);
                  var5 = var10;
                  param1[param2][param0] = var10.field_l;
                  stackIn_6_0 = (sl) (var5);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var5_ref = param1[param2][param0];
            L3: while (true) {
              L4: {
                var6 = (pn) ((Object) var5_ref);
                if (!(var6.field_l instanceof sl)) {
                  break L4;
                } else {
                  if (((sl) ((Object) var6.field_l)).field_o != this) {
                    break L4;
                  } else {
                    var7 = (sl) ((Object) var6.field_l);
                    var6.field_l = var7.field_l;
                    stackIn_11_0 = (sl) (var7);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var5_ref = var6.field_l;
              continue L3;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5_ref2);

            stackIn_15_1 = new StringBuilder().append("ea.EB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_11_0;
        }
    }

    f a(f[][] param0, int param1, f param2, int param3, int param4) {
        RuntimeException var6 = null;
        f stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 11460) {
                break L1;
              } else {
                this.a((f[][]) null, 39, 69, false);
                break L1;
              }
            }
            stackIn_3_0 = this.field_l;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("ea.VA(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    f b(f[][] param0, int param1, byte param2, int param3) {
        Object stackIn_4_0 = null;
        f stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        fm stackIn_32_0 = null;
        f stackIn_37_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        sl var7 = null;
        int var8 = 0;
        int var9 = 0;
        f var10 = null;
        f var11 = null;
        int var12 = 0;
        cb var13 = null;
        var12 = CrazyCrystals.field_B;
        try {
          L0: {
            var5_int = -13 / ((-43 - param2) / 51);
            if (0 == (this.field_s | this.field_o)) {
              var6 = this;
              L1: while (true) {
                L2: {
                  if (!(((pn) (var6)).field_l instanceof cb)) {
                    if (!(((pn) (var6)).field_l instanceof pn)) {
                      break L2;
                    } else {
                      var6 = (pn) ((Object) ((pn) (var6)).field_l);
                      continue L1;
                    }
                  } else {
                    var13 = (cb) ((Object) ((pn) (var6)).field_l);
                    if (-1 == ((var13.field_u | var13.field_v) ^ -1)) {
                      break L2;
                    } else {
                      var8 = param3 - -var13.field_v;
                      var9 = var13.field_u + param1;
                      if ((var8 ^ -1) > -1) {
                        break L2;
                      } else {
                        if (param0[0].length <= var8) {
                          break L2;
                        } else {
                          if ((var9 ^ -1) > -1) {
                            break L2;
                          } else {
                            if (var9 >= param0.length) {
                              break L2;
                            } else {
                              if (param0[var9][var8].e(-4128)) {
                                L3: {
                                  mb.field_g = mb.field_g + 10;
                                  fn.field_j = fn.field_j + 10;
                                  fp.field_a = fp.field_a + 20;
                                  we.field_h = we.field_h + 20;
                                  b.field_a = b.field_a + 10;
                                  je.field_j = je.field_j + 10;
                                  a.field_d.a(96, 12 * param3, param1 * 12, 60, (byte) -111);
                                  a.field_d.a(96, var8 * 12, var9 * 12, 60, (byte) -111);
                                  if (var13.field_o <= 0) {
                                    break L3;
                                  } else {
                                    L4: {
                                      var13.field_o = var13.field_o - 1;
                                      if (var13.field_o == 0) {
                                        ((pn) (var6)).field_l = var13.field_l;
                                        break L4;
                                      } else {
                                        break L4;
                                      }
                                    }
                                    ((pn) (var6)).field_l.a((byte) 94, (f) (this));
                                    break L3;
                                  }
                                }
                                L5: {
                                  var10 = this.field_l;
                                  this.field_l = param0[var9][var8];
                                  this.a((byte) 63, this.field_l);
                                  this.c(var8, -5, var9);
                                  var11 = this.e(var9, var8, param0, 123);
                                  if (var11 != this) {
                                    break L5;
                                  } else {
                                    this.field_k = true;
                                    break L5;
                                  }
                                }
                                param0[var9][var8] = var11;
                                var13.field_t = true;
                                stackIn_32_0 = new fm(var10);
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                b.field_a = b.field_a + 1;
                                we.field_h = we.field_h + 2;
                                fp.field_a = fp.field_a + 2;
                                je.field_j = je.field_j + 1;
                                this.a((byte) 86, param0[var9][var8]);
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackIn_37_0 = this.e(param1, param3, param0, 122);
                decompiledRegionSelector0 = 4;
                break L0;
              }
            } else {
              this.field_m = this.field_m + 1;
              if (this.field_m != this.field_p) {
                var6 = param0[this.field_s + param1][this.field_o + param3];
                L6: while (true) {
                  if (var6 instanceof ma) {
                    stackIn_9_0 = this.a(param0, (f) (this), this.field_s + param1, param3 - -this.field_o, true);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (var6 instanceof pn) {
                      var6 = ((pn) (var6)).field_l;
                      continue L6;
                    } else {
                      stackIn_14_0 = this;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              } else {
                this.b(param3, param1, -663, param0);
                var6 = this.field_l;
                var7 = this.a(param3, param0, param1, (byte) -88);
                this.field_l = param0[this.field_s + param1][this.field_o + param3];
                param0[this.field_s + param1][this.field_o + param3] = this.a(var7, param0, this.field_o, param1 + this.field_s, 17512, this.field_s, param3 - -this.field_o);
                this.field_m = 0;
                wd.field_j = wd.field_j - 1;
                mb.field_g = mb.field_g - ob.field_l;
                this.field_o = 0;
                this.field_s = 0;
                fn.field_j = fn.field_j - ob.field_l;
                wd.field_j = wd.field_j + 1;
                je.field_j = je.field_j + 15;
                fp.field_a = fp.field_a + 30;
                we.field_h = we.field_h + 30;
                b.field_a = b.field_a + 15;
                stackIn_4_0 = var6;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var5);

            stackIn_40_1 = new StringBuilder().append("ea.B(");

            if (param0 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L7;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L7;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (f) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (f) (this);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (f) ((Object) stackIn_32_0);
              } else {
                return stackIn_37_0;
              }
            }
          }
        }
    }

    f a(int param0, int param1, f[][] param2, int param3, int param4, int param5, ea param6) {
        RuntimeException var8 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == -31135) {
                break L1;
              } else {
                this.field_p = 33;
                break L1;
              }
            }
            stackIn_3_0 = this;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("ea.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return (f) (this);
    }

    boolean a(mj param0, boolean param1, f[][] param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.e(-66, -35, (f[][]) null, -13);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ea.PA(");

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
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static pp a(int param0, int param1, byte param2, int param3) {
        if (param2 < 59) {
            field_r = 106;
        }
        pp var4 = new pp();
        var4.field_g = new int[param1];
        var4.field_f = param0;
        nh.field_A.b(0, var4);
        pk.a(param3, var4, (byte) 113);
        return var4;
    }

    final f a(int param0, f[][] param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        f stackIn_7_0 = null;
        f stackIn_9_0 = null;
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
              if ((this.field_o | this.field_s) == 0) {
                break L1;
              } else {
                L2: {
                  if (-1 == (this.field_m ^ -1)) {
                    this.field_m = this.field_m + 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param1[param0 - -this.field_s][this.field_o + param3] = param1[this.field_s + param0][this.field_o + param3].a(this.field_s, (ea) (this), this.field_o, param0, (byte) -91, param3, param1);
                break L1;
              }
            }
            if (!param2) {
              stackIn_9_0 = super.a(param0, param1, false, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_7_0 = (f) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ea.HB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_9_0;
        }
    }

    f a(f[][] param0, f param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        f stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param4) {
              stackIn_4_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (f) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("ea.GB(");

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (f) (this);
        }
    }

    void a(f[][] param0, int param1, int param2, boolean param3) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        f var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            if (!param3) {
              L1: {
                if (-1 == ((this.field_o | this.field_s) ^ -1)) {
                  var5 = param0[param2][param1];
                  L2: while (true) {
                    L3: {
                      if (var5 instanceof ig) {
                        if (this.a((byte) 42, param0, var5)) {
                          break L3;
                        } else {
                          cn.field_e.a(64, param1 * 12, 12 * param2, 0, (byte) -111);
                          param0[param2][param1] = (f) ((Object) new ig(var5, bd.field_n, this.a(param2, param1, var5, 103, param0), true));
                          ob.field_l = ob.field_l - 1;
                          mb.field_g = mb.field_g - wd.field_j;
                          fp.field_a = fp.field_a + -4;
                          je.field_j = je.field_j + -2;
                          b.field_a = b.field_a + -2;
                          we.field_h = we.field_h + -4;
                          wd.field_j = wd.field_j + 1;
                          mb.field_g = mb.field_g + ob.field_l;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        if (var5 instanceof pn) {
                          var5 = ((pn) ((Object) var5)).field_l;
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    this.f(1, param2, param0, param1);
                    if ((this.field_s | this.field_o) == 0) {
                      break L1;
                    } else {
                      var5 = param0[param2 - -this.field_s][this.field_o + param1];
                      L4: while (true) {
                        if (var5 instanceof ig) {
                          if (this.a((byte) 42, param0, var5)) {
                            break L1;
                          } else {
                            cn.field_e.a(64, param1 * 12, 12 * param2, 0, (byte) -111);
                            param0[param2][param1] = this.a(param2, param1, var5, -119, param0);
                            param0[this.field_s + param2][this.field_o + param1] = (f) ((Object) new ig(var5, bd.field_n, param0[this.field_s + param2][this.field_o + param1], true));
                            mb.field_g = mb.field_g - wd.field_j;
                            ob.field_l = ob.field_l - 1;
                            mb.field_g = mb.field_g + ob.field_l;
                            wd.field_j = wd.field_j + 1;
                            je.field_j = je.field_j + -2;
                            fp.field_a = fp.field_a + -4;
                            b.field_a = b.field_a + -2;
                            we.field_h = we.field_h + -4;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        } else {
                          if (!(var5 instanceof pn)) {
                            break L1;
                          } else {
                            var5 = ((pn) ((Object) var5)).field_l;
                            continue L4;
                          }
                        }
                      }
                    }
                  }
                } else {
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
          L5: {
            var5_ref = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var5_ref);

            stackIn_26_1 = new StringBuilder().append("ea.UA(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    private final boolean a(int param0, ea param1, int param2, f[][] param3, int param4, boolean param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param5) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_q = (wh) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("ea.DB(").append(param0).append(',');

            if (param1 == null) {
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
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    f e(int param0, int param1, f[][] param2, int param3) {
        RuntimeException var5 = null;
        f stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 > 120) {
              stackIn_4_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (f) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("ea.OA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (f) (this);
        }
    }

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        ea var10 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          L0: {
            L1: {
              if (!this.g(0)) {
                break L1;
              } else {
                this.field_l.a(97, param1, param2, param3, param4, param5, param6, param7);
                break L1;
              }
            }
            L2: {
              if (param0 > 92) {
                break L2;
              } else {
                var10 = (ea) null;
                this.a(114, -55, (f[][]) null, -103, -43, -87, (ea) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var9);

            stackIn_7_1 = new StringBuilder().append("ea.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void a(f[][] param0, int param1, byte param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param2 == 40) {
                break L1;
              } else {
                this.b(0, 110, -35, (f[][]) null);
                break L1;
              }
            }
            L2: {
              if (this.g(0)) {
                this.field_l.a(param0, param1, (byte) 40, param3);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ea.EA(");

            if (param0 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7;
        wm var8;
        int var9;
        int var10;
        var7 = 54 / ((74 - param0) / 41);
        if (-1 <= (this.field_s ^ -1)) {
          var8 = jf.a(kh.field_j, param4, 0, param4 + 2 * param1, kh.field_b);
          if (var8 == null) {
            return;
          } else {
            var9 = 2 * this.field_m * param1 / this.field_p;
            var10 = param2 * (this.field_m * 2) / this.field_p;
            this.a(param3, var9 * this.field_o + param4, param1, param2, param5 - -(this.field_s * var10), 4261);
            var8.a((byte) -35);
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        Object stackIn_5_0 = null;
        mj stackIn_5_1 = null;
        Object stackIn_6_0 = null;
        mj stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                stackIn_5_0 = this;

                stackIn_5_1 = (mj) (param2);

                if (param0) {
                  stackIn_6_0 = this;
                  stackIn_6_1 = (mj) ((Object) stackIn_5_1);
                  stackIn_6_2 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = this;
                  stackIn_6_1 = (mj) ((Object) stackIn_5_1);
                  stackIn_6_2 = 1;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (!this.a(stackIn_6_1, stackIn_6_2 != 0, param1)) {
                    break L3;
                  } else {
                    if (!this.field_l.a(false, param1, param2)) {
                      break L3;
                    } else {
                      stackIn_10_0 = 1;
                      break L2;
                    }
                  }
                }
                stackIn_10_0 = 0;
                break L2;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ea.A(").append(param0).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    void a(int param0, int param1, int param2, int param3, boolean param4) {
        this.a(false, param1, param2, param0, param0 + param3, 4261);
        if (!param4) {
            field_q = (wh) null;
        }
    }

    ea(f param0) {
        super(param0);
        this.field_p = 12;
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_10_0 = false;
        boolean stackIn_12_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.field_l.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (this.field_o != param6) {
                  break L1;
                } else {
                  if (this.field_s != param3) {
                    break L1;
                  } else {
                    if (param5.field_p > -this.field_m + this.field_p) {
                      stackIn_14_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              if (-1 == ((this.field_o | this.field_s) ^ -1)) {
                stackIn_12_0 = this.a(param3, -1, param4, param1, param6, param5, param2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_10_0 = this.a(param2, param6, true, param1, param4, param5, param3);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var8);

            stackIn_17_1 = new StringBuilder().append("ea.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    void f(int param0, int param1, f[][] param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                this.g(113);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ea.LA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param3 + ')');
        }
    }

    final f a(int param0, byte param1, int param2) {
        L0: {
          if (!this.g(param1 ^ -110)) {
            break L0;
          } else {
            this.field_l = this.field_l.a(param0, (byte) -110, param2);
            break L0;
          }
        }
        if (param1 != -110) {
          return (f) null;
        } else {
          return (f) (this);
        }
    }

    final sl d(int param0, int param1, f[][] param2, int param3) {
        f var5 = null;
        int var6 = 0;
        sl stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param3 > 58) {
                break L1;
              } else {
                this.b((f[][]) null, 70, (byte) 75, -111);
                break L1;
              }
            }
            var5 = param2[param0 + this.field_s][this.field_o + param1];
            L2: while (true) {
              L3: {
                if (!(var5 instanceof sl)) {
                  break L3;
                } else {
                  if (this != ((sl) ((Object) var5)).field_o) {
                    break L3;
                  } else {
                    stackIn_7_0 = (sl) ((Object) var5);
                    break L0;
                  }
                }
              }
              var5 = ((pn) ((Object) var5)).field_l;
              continue L2;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5_ref);

            stackIn_11_1 = new StringBuilder().append("ea.WA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        sl var7 = null;
        RuntimeException var7_ref = null;
        sl var8 = null;
        sl stackIn_3_0 = null;
        sl stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_s | this.field_o) == 0) {
              this.field_s = param3;
              this.field_o = param5;
              param0[param3 + param1][param4 - -param5] = param0[param3 + param1][param5 + param4].a(param3, (ea) (this), param5, param1, (byte) -110, param4, param0);
              var8 = new sl((ea) (this), param0[param1 - -param3][param4 - -param5]);
              var7 = var8;
              param0[param3 + param1][param5 + param4] = var8.e((byte) -8);
              stackIn_3_0 = (sl) (var7);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2) {
                stackIn_7_0 = (sl) null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var7_ref);

            stackIn_11_1 = new StringBuilder().append("ea.R(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final int a(boolean param0, boolean param1) {
        int var3 = this.a(param1, 0);
        if (0 != (2 & var3)) {
            var3 = var3 | 12;
        }
        int var4 = this.field_l.a(param0, param1);
        if (!param0) {
            this.b(-122, 54, -56, (f[][]) null);
        }
        if (!((var4 & 2) == 0)) {
            var4 = var4 | 12;
        }
        return var3 & var4;
    }

    void b(int param0, int param1, int param2, f[][] param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == -663) {
                break L1;
              } else {
                this.field_s = -24;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ea.BB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    boolean a(byte param0, f[][] param1, f param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 42) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("ea.FB(").append(param0).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_q = new wh(0);
        field_n = -1;
    }
}
