/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ep extends f implements Cloneable {
    private int field_k;
    private f field_j;
    private int field_i;

    final void b(int param0, int param1, f[][] param2, int param3) {
        try {
            this.field_j.b(101, param1, param2, param3);
            if (param0 <= 24) {
                this.a((byte) 0);
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ep.CC(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int d(int param0) {
        if (param0 >= -77) {
            this.field_k = 30;
            return this.field_j.d(-82);
        }
        return this.field_j.d(-82);
    }

    final static boolean a(char param0, byte param1) {
        if (param1 == -14) {
          if (65 > param0) {
            if (param0 >= 97) {
              if (param0 <= 122) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (param0 > 90) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            return -79;
        }
        return 0;
    }

    final static wj[] a(db param0, String param1, String param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wj[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param0.a(param2, -1);
              if (!param3) {
                break L1;
              } else {
                ep.c((byte) -89);
                break L1;
              }
            }
            var5 = param0.a(-2862, param1, var4_int);
            stackIn_3_0 = qk.a(false, var4_int, param0, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ep.I(");

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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    protected final Object clone() {
        ep var1 = (ep) (super.clone());
        var1.field_j = (f) (this.field_j.clone());
        return var1;
    }

    final void a(int param0, int param1, int param2, DataInputStream param3, byte param4) throws IOException {
        RuntimeException var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_j = ff.a(param0, param1, 1, param2, param3);
            if (param4 == -35) {
              break L0;
            } else {
              this.a((byte) 87);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var6);

            stackIn_5_1 = new StringBuilder().append("ep.BC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != -29660) {
            this.field_i = -116;
        }
    }

    final static int c(byte param0) {
        if (param0 != 112) {
            return -103;
        }
        return lg.field_b;
    }

    final void b(boolean param0, boolean param1) {
        this.field_j.b(param0, param1);
    }

    final int a(byte param0) {
        if (param0 > -34) {
            this.field_i = -99;
            return this.field_j.a((byte) -39);
        }
        return this.field_j.a((byte) -39);
    }

    final int a(int param0, int param1, int param2, fq param3, int param4) {
        RuntimeException var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_k != param4) {
                break L1;
              } else {
                if (0 != this.field_i) {
                  break L1;
                } else {
                  mb.field_g = mb.field_g - 128;
                  fn.field_j = fn.field_j - 128;
                  fp.field_a = fp.field_a + 2;
                  we.field_h = we.field_h + 2;
                  je.field_j = je.field_j + 1;
                  b.field_a = b.field_a + 1;
                  fn.field_j = fn.field_j + ob.field_l;
                  wd.field_j = wd.field_j - 1;
                  pm.field_b.a(128, param1 * 12, 12 * param2, 0, (byte) -111);
                  this.field_i = 1;
                  this.a((byte) 74, param3);
                  this.field_j.a((byte) 87, param3);
                  stackIn_3_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param0 == -9352) {
              stackIn_7_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.d(-6);
              return 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("ep.AC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final void a(int param0, int param1) {
        if (param1 < 61) {
          this.a(-85, 60, 47, false, -57, 25);
          this.field_k = param0;
          return;
        } else {
          this.field_k = param0;
          return;
        }
    }

    final void a(int param0, int param1, int param2, f[][] param3) {
        try {
            this.field_j.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ep.UB(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int stackIn_3_0 = 0;
        L0: {
          this.field_j.a(param3, param4, false, param0, param5, param2);
          if (!param3) {
            stackIn_3_0 = this.field_i;
            break L0;
          } else {
            stackIn_3_0 = 18;
            break L0;
          }
        }
        var7 = stackIn_3_0;
        if (24 == param2) {
          if (param0 == 24) {
            if (var7 > 1) {
              bb.field_y[var7 / 2].c(param5, param4 + -param0, f.field_g[this.field_k]);
              var8 = ((24 - var7) * param2 + 23) / 24;
              var9 = (param0 * (-var7 + 24) - -23) / 24;
              if (var8 < param2) {
                if (param0 <= var9) {
                  v.field_b[var7 / 2].c(param5, param4 - param0, f.field_g[this.field_k]);
                  var8 = 32 % ((param1 - -70) / 33);
                  return;
                } else {
                  this.field_j.a(-125, param3, param2 - var8, var8 + param5, param4 - -var9, param0 + -var9);
                  v.field_b[var7 / 2].c(param5, param4 - param0, f.field_g[this.field_k]);
                  var8 = 32 % ((param1 - -70) / 33);
                  return;
                }
              } else {
                v.field_b[var7 / 2].c(param5, param4 - param0, f.field_g[this.field_k]);
                var8 = 32 % ((param1 - -70) / 33);
                return;
              }
            } else {
              v.field_b[var7 / 2].c(param5, param4 - param0, f.field_g[this.field_k]);
              var8 = 32 % ((param1 - -70) / 33);
              return;
            }
          } else {
            if (var7 > 1) {
              bb.field_y[var7 / 2].b(param5, param4 - param0, 2 * param2, param0 * 3, f.field_g[this.field_k]);
              var8 = ((24 + -var7) * param2 - -23) / 24;
              var9 = (param0 * (24 + -var7) + 23) / 24;
              if (param2 > var8) {
                if (param0 <= var9) {
                  v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[this.field_k]);
                  var8 = 32 % ((param1 - -70) / 33);
                  return;
                } else {
                  this.field_j.a(-128, param3, param2 - var8, param5 + var8, param4 - -var9, param0 + -var9);
                  v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[this.field_k]);
                  var8 = 32 % ((param1 - -70) / 33);
                  return;
                }
              } else {
                v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[this.field_k]);
                var8 = 32 % ((param1 - -70) / 33);
                return;
              }
            } else {
              v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[this.field_k]);
              var8 = 32 % ((param1 - -70) / 33);
              return;
            }
          }
        } else {
          if (var7 > 1) {
            bb.field_y[var7 / 2].b(param5, param4 - param0, 2 * param2, param0 * 3, f.field_g[this.field_k]);
            var8 = ((24 + -var7) * param2 - -23) / 24;
            var9 = (param0 * (24 + -var7) + 23) / 24;
            if (param2 > var8) {
              if (param0 <= var9) {
                v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[this.field_k]);
                var8 = 32 % ((param1 - -70) / 33);
                return;
              } else {
                this.field_j.a(-128, param3, param2 - var8, param5 + var8, param4 - -var9, param0 + -var9);
                v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[this.field_k]);
                var8 = 32 % ((param1 - -70) / 33);
                return;
              }
            } else {
              v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[this.field_k]);
              var8 = 32 % ((param1 - -70) / 33);
              return;
            }
          } else {
            v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[this.field_k]);
            var8 = 32 % ((param1 - -70) / 33);
            return;
          }
        }
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
                this.a(-24, -83, 51, true, 50, -127);
                break L1;
              }
            }
            stackIn_3_0 = ng.a(qh.field_g, param1, new ep(new kp(-1), this.field_k), (byte) -83, rb.field_j);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ep.V(").append(param0).append(',');

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

    final f a(int param0, int param1, f[][] param2, int param3) {
        RuntimeException var5 = null;
        f stackIn_2_0 = null;
        f stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 106) {
              L1: {
                if (this.field_i <= 0) {
                  break L1;
                } else {
                  this.field_i = this.field_i + 1;
                  if (24 == this.field_i) {
                    stackIn_7_0 = this.field_j;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_9_0 = this;
              decompiledRegionSelector0 = 2;
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
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("ep.EC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return (f) (this);
          }
        }
    }

    ep(f param0, int param1) {
        this.field_i = 0;
        try {
            this.field_j = param0;
            this.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ep.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
