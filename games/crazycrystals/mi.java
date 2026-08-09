/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends ea implements Cloneable {
    static int[] field_A;
    private transient boolean field_w;
    private dl[] field_y;
    transient fq field_C;
    transient fq field_z;
    transient int field_u;
    private boolean field_B;
    int field_E;
    transient int field_t;
    static fp field_D;
    static int field_v;
    static dl[] field_x;

    final boolean a(mj param0, boolean param1, f[][] param2) {
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
            if (param1) {
              stackIn_4_0 = 1;
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
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("mi.PA(");

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


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

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

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        f stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_l.a(param0, param3, (byte) 40, param1);
              var5_int = 67 / ((param2 - -43) / 51);
              if (-1 != ((this.field_s | this.field_o) ^ -1)) {
                aa.field_a.a(128, 12 * param3 - -(this.field_m * this.field_o), this.field_m * this.field_s + 12 * param1, 0, (byte) -111);
                break L1;
              } else {
                break L1;
              }
            }
            stackIn_4_0 = super.b(param0, param1, (byte) -110, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("mi.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final static db c(int param0, int param1) {
        if (param1 > -94) {
            return (db) null;
        }
        return qk.a(param0, -114, false, true, false, 1);
    }

    public static void h(int param0) {
        field_A = null;
        if (param0 != -20188) {
            return;
        }
        field_x = null;
        field_D = null;
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 23525) {
                break L1;
              } else {
                this.e(115, 40, (f[][]) null, -25);
                break L1;
              }
            }
            stackIn_3_0 = ng.a(ec.field_n, param1, new mi(new kp(-1), true), (byte) -83, ch.field_c);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("mi.V(").append(param0).append(',');

            if (param1 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static dl[] b(int param0, int param1) {
        int var3 = -18 % ((param0 - -26) / 60);
        dl[] var4 = new dl[9];
        dl[] var2 = var4;
        var4[4] = mc.a(64, -64, param1);
        return var2;
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
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
              this.field_t = param2;
              this.field_u = param3;
              if (param0 == -35) {
                break L1;
              } else {
                this.field_w = false;
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

            stackIn_5_1 = new StringBuilder().append("mi.KC(").append(param0).append(',');

            if (param1 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        f var5 = null;
        int var6 = 0;
        f stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              var5 = this.field_l;
              if (param3 > 120) {
                break L1;
              } else {
                this.b((f[][]) null, -56, (byte) -57, -94);
                break L1;
              }
            }
            L2: while (true) {
              if (!(var5 instanceof ma)) {
                if (var5 instanceof pn) {
                  var5 = ((pn) ((Object) var5)).field_l;
                  continue L2;
                } else {
                  this.field_l = this.field_l.a(param0, (byte) -110, param1);
                  stackIn_10_0 = this;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_5_0 = this.a(param2, param0, (f) (this), 11460, param1);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5_ref);

            stackIn_13_1 = new StringBuilder().append("mi.OA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return (f) (this);
        }
    }

    final static int e(byte param0) {
        if (param0 != 125) {
            mi.h(-58);
            return jf.field_a;
        }
        return jf.field_a;
    }

    final f a(sl param0, f[][] param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
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
              je.field_j = je.field_j + 20;
              we.field_h = we.field_h + 40;
              fp.field_a = fp.field_a + 40;
              b.field_a = b.field_a + 20;
              this.field_t = param6;
              if (param4 == 17512) {
                break L1;
              } else {
                mi.e((byte) -65);
                break L1;
              }
            }
            mb.field_g = mb.field_g - 10;
            fn.field_j = fn.field_j - 10;
            this.field_u = param3;
            stackIn_3_0 = super.a(param0, param1, param2, param3, 17512, param5, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("mi.I(");

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
        return stackIn_3_0;
    }

    final int a(boolean param0, int param1) {
        if (param1 != 0) {
            return -65;
        }
        return 3;
    }

    final f a(mj param0, byte param1, boolean param2, f[][] param3) {
        Object var5 = null;
        ma stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5 = this;
              if (param1 <= -74) {
                break L1;
              } else {
                this.e(18, 7, (f[][]) null, -101);
                break L1;
              }
            }
            L2: {
              if (!param2) {
                break L2;
              } else {
                if (this.field_p >= 2 * this.field_m) {
                  var5 = this.a(param0.field_c, param0.field_b, param0.field_a, -119, param3);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            stackIn_7_0 = new ma(param0.b((byte) 84), (f) (var5), param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = var5;

            stackIn_10_1 = new StringBuilder().append("mi.S(");

            if (param0 == null) {
              stackIn_11_0 = stackIn_10_0;
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = stackIn_10_0;
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {

              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {

              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return (f) ((Object) stackIn_7_0);
    }

    final f a(f[][] param0, f param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        f stackIn_2_0 = null;
        Object stackIn_6_0 = null;
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
            if (this.field_p > this.field_m * 2) {
              L1: {
                if (param4) {
                  break L1;
                } else {
                  field_A = (int[]) null;
                  break L1;
                }
              }
              stackIn_6_0 = this;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = this.a(-this.field_s + param2, param3 + -this.field_o, param1, -124, param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("mi.GB(");

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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (f) (this);
        }
    }

    final sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var8 = 0;
        sl stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              aa.field_a.a(128, param4 * 12, param1 * 12, 0, (byte) -111);
              if (0 >= param3) {
                if (-1 < (param3 ^ -1)) {
                  this.field_y = al.field_h;
                  break L1;
                } else {
                  if (0 < param5) {
                    this.field_y = ag.field_c;
                    break L1;
                  } else {
                    this.field_y = sa.field_qb;
                    break L1;
                  }
                }
              } else {
                this.field_y = cp.field_d;
                break L1;
              }
            }
            L2: {
              if (!param2) {
                break L2;
              } else {
                this.field_C = (fq) null;
                break L2;
              }
            }
            stackIn_11_0 = super.a(param0, param1, false, param3, param4, param5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var7);

            stackIn_14_1 = new StringBuilder().append("mi.R(");

            if (param0 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_11_0;
    }

    mi(f param0) {
        this(param0, false);
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        dl stackIn_6_0 = null;
        dl stackIn_20_0 = null;
        dl stackIn_31_0 = null;
        dl stackIn_40_0 = null;
        dl stackIn_48_0 = null;
        dl stackIn_60_0 = null;
        dl stackIn_69_0 = null;
        dl stackIn_77_0 = null;
        dl var7;
        int var8;
        f var9;
        L0: {
          var8 = CrazyCrystals.field_B;
          if (param5 == 4261) {
            break L0;
          } else {
            var9 = (f) null;
            this.a((f[][]) null, (f) null, -83, 121, true);
            break L0;
          }
        }
        if (0 == this.field_m) {
          if (24 != param2) {
            if (this.field_z == null) {
              if (null != this.field_C) {
                L1: {
                  vj.field_a[19][this.field_C.field_B >> uc.field_c[17]].b(param2 + param1, -param3 + param4, param2, 3 * param3, ek.field_f[this.field_C.field_u]);
                  if (this.field_B) {
                    stackIn_48_0 = pa.field_H;
                    break L1;
                  } else {
                    stackIn_48_0 = this.field_y[(this.field_E + this.field_m) % 12];
                    break L1;
                  }
                }
                L2: {
                  var7 = stackIn_48_0;
                  if (-25 != (param2 ^ -1)) {
                    break L2;
                  } else {
                    if (24 != param3) {
                      break L2;
                    } else {
                      var7.a(param1, -param3 + param4);
                      return;
                    }
                  }
                }
                var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
                return;
              } else {
                L3: {
                  if (this.field_B) {
                    stackIn_40_0 = pa.field_H;
                    break L3;
                  } else {
                    stackIn_40_0 = this.field_y[(this.field_E + this.field_m) % 12];
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_40_0;
                  if (-25 != (param2 ^ -1)) {
                    break L4;
                  } else {
                    if (24 != param3) {
                      break L4;
                    } else {
                      var7.a(param1, -param3 + param4);
                      return;
                    }
                  }
                }
                var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
                return;
              }
            } else {
              L5: {
                vj.field_a[18][this.field_z.field_B >> uc.field_c[16]].b(param1, param4 + -param3, param2, param3 * 3, ek.field_f[this.field_z.field_u]);
                if (null == this.field_C) {
                  break L5;
                } else {
                  vj.field_a[19][this.field_C.field_B >> uc.field_c[17]].b(param2 + param1, -param3 + param4, param2, 3 * param3, ek.field_f[this.field_C.field_u]);
                  break L5;
                }
              }
              L6: {
                if (this.field_B) {
                  stackIn_31_0 = pa.field_H;
                  break L6;
                } else {
                  stackIn_31_0 = this.field_y[(this.field_E + this.field_m) % 12];
                  break L6;
                }
              }
              L7: {
                L8: {
                  var7 = stackIn_31_0;
                  if (-25 != (param2 ^ -1)) {
                    break L8;
                  } else {
                    if (24 != param3) {
                      break L8;
                    } else {
                      var7.a(param1, -param3 + param4);
                      break L7;
                    }
                  }
                }
                var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
                break L7;
              }
              return;
            }
          } else {
            if (param3 == 24) {
              if (null == this.field_z) {
                if (null != this.field_C) {
                  L9: {
                    vj.field_a[19][this.field_C.field_B >> uc.field_c[17]].c(param1 + param2, param4 - param3, ek.field_f[this.field_C.field_u]);
                    if (this.field_B) {
                      stackIn_77_0 = pa.field_H;
                      break L9;
                    } else {
                      stackIn_77_0 = this.field_y[(this.field_E + this.field_m) % 12];
                      break L9;
                    }
                  }
                  L10: {
                    var7 = stackIn_77_0;
                    if (-25 != (param2 ^ -1)) {
                      break L10;
                    } else {
                      if (24 != param3) {
                        break L10;
                      } else {
                        var7.a(param1, -param3 + param4);
                        return;
                      }
                    }
                  }
                  var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
                  return;
                } else {
                  L11: {
                    if (this.field_B) {
                      stackIn_69_0 = pa.field_H;
                      break L11;
                    } else {
                      stackIn_69_0 = this.field_y[(this.field_E + this.field_m) % 12];
                      break L11;
                    }
                  }
                  L12: {
                    var7 = stackIn_69_0;
                    if (-25 != (param2 ^ -1)) {
                      break L12;
                    } else {
                      if (24 != param3) {
                        break L12;
                      } else {
                        var7.a(param1, -param3 + param4);
                        return;
                      }
                    }
                  }
                  var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
                  return;
                }
              } else {
                L13: {
                  vj.field_a[18][this.field_z.field_B >> uc.field_c[16]].c(param1, -param3 + param4, ek.field_f[this.field_z.field_u]);
                  if (null != this.field_C) {
                    vj.field_a[19][this.field_C.field_B >> uc.field_c[17]].c(param1 + param2, param4 - param3, ek.field_f[this.field_C.field_u]);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (this.field_B) {
                    stackIn_60_0 = pa.field_H;
                    break L14;
                  } else {
                    stackIn_60_0 = this.field_y[(this.field_E + this.field_m) % 12];
                    break L14;
                  }
                }
                L15: {
                  var7 = stackIn_60_0;
                  if (-25 != (param2 ^ -1)) {
                    break L15;
                  } else {
                    if (24 != param3) {
                      break L15;
                    } else {
                      var7.a(param1, -param3 + param4);
                      return;
                    }
                  }
                }
                var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
                return;
              }
            } else {
              L16: {
                if (this.field_z == null) {
                  break L16;
                } else {
                  vj.field_a[18][this.field_z.field_B >> uc.field_c[16]].b(param1, param4 + -param3, param2, param3 * 3, ek.field_f[this.field_z.field_u]);
                  break L16;
                }
              }
              L17: {
                if (null == this.field_C) {
                  break L17;
                } else {
                  vj.field_a[19][this.field_C.field_B >> uc.field_c[17]].b(param2 + param1, -param3 + param4, param2, 3 * param3, ek.field_f[this.field_C.field_u]);
                  break L17;
                }
              }
              L18: {
                if (this.field_B) {
                  stackIn_20_0 = pa.field_H;
                  break L18;
                } else {
                  stackIn_20_0 = this.field_y[(this.field_E + this.field_m) % 12];
                  break L18;
                }
              }
              L19: {
                L20: {
                  var7 = stackIn_20_0;
                  if (-25 != (param2 ^ -1)) {
                    break L20;
                  } else {
                    if (24 != param3) {
                      break L20;
                    } else {
                      var7.a(param1, -param3 + param4);
                      break L19;
                    }
                  }
                }
                var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
                break L19;
              }
              return;
            }
          }
        } else {
          L21: {
            if (this.field_B) {
              stackIn_6_0 = pa.field_H;
              break L21;
            } else {
              stackIn_6_0 = this.field_y[(this.field_E + this.field_m) % 12];
              break L21;
            }
          }
          L22: {
            L23: {
              var7 = stackIn_6_0;
              if (-25 != (param2 ^ -1)) {
                break L23;
              } else {
                if (24 != param3) {
                  break L23;
                } else {
                  var7.a(param1, -param3 + param4);
                  break L22;
                }
              }
            }
            var7.b(param1, -param3 + param4, 2 * param2, param3 * 3);
            break L22;
          }
          return;
        }
    }

    final static void i(int param0) {
        double var1;
        double var3;
        double var5;
        double var7;
        var1 = td.field_c[0] / td.field_c[2] - cn.field_d[0] / cn.field_d[2];
        var3 = -(cn.field_d[1] / cn.field_d[2]) + td.field_c[1] / td.field_c[2];
        var5 = Math.log(td.field_c[2] / cn.field_d[2]) * 24.0;
        if (param0 != 22075) {
          field_A = (int[]) null;
          var7 = Math.sqrt(var5 * var5 + (var3 * var3 + var1 * var1));
          ia.field_g = (int)(Math.sqrt(var7) * 12.0);
          return;
        } else {
          var7 = Math.sqrt(var5 * var5 + (var3 * var3 + var1 * var1));
          ia.field_g = (int)(Math.sqrt(var7) * 12.0);
          return;
        }
    }

    final void c(boolean param0, boolean param1) {
        if (param1) {
            return;
        }
        if (!param0) {
            mi.i(-117);
            pm.field_d = pm.field_d + 1;
            return;
        }
        pm.field_d = pm.field_d + 1;
    }

    mi(f param0, boolean param1) {
        super(param0);
        this.field_w = false;
        this.field_y = al.field_h;
        this.field_B = false;
        this.field_z = null;
        this.field_C = null;
        try {
            this.field_B = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "mi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final f a(f[][] param0, int param1, f param2, int param3, int param4) {
        vh dupTemp$0 = null;
        f stackIn_16_0 = null;
        f stackIn_19_0 = null;
        f stackIn_23_0 = null;
        ji stackIn_27_0 = null;
        ji stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7_int = 0;
        ji var7 = null;
        int var8 = 0;
        sl var9 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (null != ab.field_D) {
                break L1;
              } else {
                pm.field_d = pm.field_d - 1;
                if (param2 == null) {
                  break L1;
                } else {
                  var6_int = param2.a(false);
                  var7_int = 0;
                  L2: while (true) {
                    if (-4 >= (var7_int ^ -1)) {
                      ol.field_B = ol.field_B | 8;
                      break L1;
                    } else {
                      L3: {
                        if ((var6_int & 1 << var7_int) != 0) {
                          L4: {
                            dupTemp$0 = q.field_a[var7_int];
                            dupTemp$0.field_d = dupTemp$0.field_d + 1;
                            fp.field_a = fp.field_a + 5;
                            b.field_a = b.field_a + 2;
                            je.field_j = je.field_j + 2;
                            we.field_h = we.field_h + 5;
                            we.field_h = we.field_h + 4;
                            fp.field_a = fp.field_a + 4;
                            je.field_j = je.field_j + 2;
                            b.field_a = b.field_a + 2;
                            mb.field_g = mb.field_g + 400;
                            fn.field_j = fn.field_j + 500;
                            fn.field_j = fn.field_j + 20;
                            mb.field_g = mb.field_g + 20;
                            if (pm.field_d != 0) {
                              break L4;
                            } else {
                              ol.field_B = ol.field_B | 1 << var7_int;
                              break L4;
                            }
                          }
                          wd.field_j = wd.field_j + 1;
                          fn.field_j = fn.field_j - ob.field_l;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var7_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            L5: {
              if (param2 instanceof qf) {
                break L5;
              } else {
                if (param2 instanceof ig) {
                  break L5;
                } else {
                  if (param3 == 11460) {
                    bn.field_h.a(192, this.field_o * this.field_m + 12 * param4, 12 * param1 - -(this.field_s * this.field_m), 0, (byte) -111);
                    if ((this.field_s | this.field_o) == 0) {
                      stackIn_29_0 = new ji(this.field_l, 0, 0);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var9 = this.d(param1, param4, param0, 85);
                      if (-1 <= (this.field_s ^ -1)) {
                        L6: {
                          ob.field_l = ob.field_l + 1;
                          mb.field_g = mb.field_g + wd.field_j;
                          var7 = new ji(this.field_l, this.field_m * this.field_o, this.field_s * this.field_m);
                          if (-1 != (this.field_s ^ -1)) {
                            break L6;
                          } else {
                            var9.field_l = (f) ((Object) new tn(var9.field_l, var7, this.field_o, 0));
                            break L6;
                          }
                        }
                        stackIn_27_0 = (ji) (var7);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        var9.field_l = (f) ((Object) new ji(var9.field_l, 0, -12 + this.field_m * this.field_s));
                        stackIn_23_0 = this.field_l;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_19_0 = (f) null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            wp.field_b.a(256, this.field_o * this.field_m + 12 * param4, this.field_m * this.field_s + param1 * 12, 0, (byte) -111);
            stackIn_16_0 = this.field_l;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var6);

            stackIn_32_1 = new StringBuilder().append("mi.VA(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L8;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L8;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_19_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (f) ((Object) stackIn_27_0);
              } else {
                return (f) ((Object) stackIn_29_0);
              }
            }
          }
        }
    }

    final void c(int param0, int param1, int param2) {
        this.field_u = param2;
        if (param1 != -5) {
            return;
        }
        this.field_t = param0;
    }

    final void f(int param0, int param1, f[][] param2, int param3) {
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        f var5 = null;
        RuntimeException var5_ref = null;
        pf var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                this.f(126, -128, (f[][]) null, 20);
                break L1;
              }
            }
            var5 = this.field_l;
            L2: while (true) {
              L3: {
                if (!(var5 instanceof pf)) {
                  stackIn_15_0 = var5 instanceof pn;
                  if (stackIn_15_0) {
                    var5 = ((pn) ((Object) var5)).field_l;
                    continue L2;
                  } else {
                    break L3;
                  }
                } else {
                  var6 = (pf) ((Object) var5);
                  if (var6.field_r) {
                    mb.field_g = mb.field_g - wd.field_j;
                    ob.field_l = ob.field_l - 1;
                    var7 = var6.field_u;
                    var8 = var6.field_v;
                    if (0 != (var8 | var7)) {
                      if (!param2[var8 + param1][var7 + param3].a(16736352, param2, false, var8, param1, param3, (ea) (this), var7)) {
                        break L3;
                      } else {
                        L4: {
                          this.a(1 << var6.field_w, true, var6.field_p);
                          if (!this.field_w) {
                            this.field_l.a(1 << var6.field_w, true, var6.field_p);
                            this.field_w = true;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        this.a(param2, param1, false, var8, param3, var7);
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5_ref);

            stackIn_21_1 = new StringBuilder().append("mi.LA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param3 + ')');
        }
    }

    final f a(int param0, int param1, f[][] param2, int param3, int param4, int param5, ea param6) {
        RuntimeException var8 = null;
        Object stackIn_3_0 = null;
        f stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param6 instanceof fq) {
              stackIn_3_0 = this;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param3 == -31135) {
                  break L1;
                } else {
                  this.f(78, -21, (f[][]) null, 71);
                  break L1;
                }
              }
              b.field_a = b.field_a + 1;
              fp.field_a = fp.field_a + 2;
              je.field_j = je.field_j + 1;
              we.field_h = we.field_h + 2;
              stackIn_7_0 = this.a(param4, param1, param6, 13, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var8);

            stackIn_10_1 = new StringBuilder().append("mi.P(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (f) (this);
        } else {
          return stackIn_7_0;
        }
    }

    static {
        field_D = new fp();
        field_v = 20;
    }
}
