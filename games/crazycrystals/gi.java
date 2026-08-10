/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends pn implements Cloneable {
    static dl field_n;
    static int field_m;
    private int field_o;
    private int field_p;

    final static int a(int param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == 26009) {
              stackIn_4_0 = pf.a(0, param1, param0, -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 94;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("gi.K(").append(param0).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
            nj var5 = (nj) null;
            this.a(-70, (nj) null);
        }
        return (f) (this);
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
                this.b(-112, 33, -8, true, -15, -44);
                break L1;
              }
            }
            stackIn_3_0 = ng.a(e.field_a, param1, new gi(this.field_p, new kp(-1)), (byte) -83, qd.field_p);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("gi.V(").append(param0).append(',');

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

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            return -86;
        }
        return 12;
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
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
            if (param0 == -21) {
              stackIn_3_0 = 1;
              break L0;
            } else {
              this.a(true, false);
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("gi.G(").append(param0).append(',');

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

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

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7;
        L0: {
          L1: {
            if (-25 != (param1 ^ -1)) {
              break L1;
            } else {
              if (-25 != (param2 ^ -1)) {
                break L1;
              } else {
                fl.field_i[this.field_o >> 1421964705].c(param4, -param2 + param5, f.field_g[this.field_p]);
                break L0;
              }
            }
          }
          fl.field_i[this.field_o >> -415815295].b(param4, -param2 + param5, param1 * 2, param2 * 3, f.field_g[this.field_p]);
          break L0;
        }
        var7 = 101 % ((74 - param0) / 41);
    }

    gi(int param0, f param1) {
        super(param1);
        this.field_o = 0;
        try {
            this.field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "gi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1) {
        if (param1 < 61) {
            return;
        }
        this.field_p = param0;
    }

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        try {
            if (param0 < 92) {
                this.field_p = 78;
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "gi.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        byte[] var6 = null;
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
              this.field_o = this.field_o + 1;
              if (param1 == 0) {
                break L1;
              } else {
                var6 = (byte[]) null;
                gi.a(103, (byte[]) null, -64);
                break L1;
              }
            }
            L2: {
              if (fl.field_i.length * 2 <= this.field_o) {
                this.field_o = 0;
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

            stackIn_8_1 = new StringBuilder().append("gi.W(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            gi.b(false);
        }
        field_n = null;
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        vh dupTemp$0 = null;
        int fieldTemp$1 = 0;
        f stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        vh var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        fq var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        var14 = CrazyCrystals.field_B;
        try {
          L0: {
            var15 = (fq) ((Object) param1);
            var9 = 0;
            var10 = 1;
            L1: while (true) {
              if (-1 + param6.length <= var10) {
                L2: {
                  if (param4 < -87) {
                    break L2;
                  } else {
                    field_n = (dl) null;
                    break L2;
                  }
                }
                L3: {
                  var10 = this.field_p;
                  if (-1 <= (var9 ^ -1)) {
                    so.field_g.a(128, 12 * (param5 - -param2), (param0 + param3) * 12, 0, (byte) -111);
                    break L3;
                  } else {
                    pm.field_b.a(128, 12 * (param2 + param5), (param3 + param0) * 12, 0, (byte) -111);
                    var10 += 4;
                    break L3;
                  }
                }
                L4: {
                  if (ab.field_D == null) {
                    L5: {
                      var11 = q.field_a[var15.field_u];
                      dupTemp$0 = q.field_a[var15.field_u];
                      fieldTemp$1 = dupTemp$0.field_m;
                      dupTemp$0.field_m = dupTemp$0.field_m + 1;
                      var12 = fieldTemp$1;
                      if (var12 < var11.field_c.length) {
                        break L5;
                      } else {
                        var17 = new int[4 + var12];
                        var16 = var17;
                        var13 = var16;
                        eg.a(var11.field_c, 0, var17, 0, var12);
                        var11.field_c = var13;
                        break L5;
                      }
                    }
                    var11.field_c[var12] = var10;
                    if (-1 <= (var9 ^ -1)) {
                      mb.field_g = mb.field_g + 300;
                      fn.field_j = fn.field_j + 350;
                      we.field_h = we.field_h + 20;
                      b.field_a = b.field_a + 10;
                      je.field_j = je.field_j + 10;
                      fp.field_a = fp.field_a + 20;
                      mb.field_g = mb.field_g + 10;
                      fn.field_j = fn.field_j + 10;
                      break L4;
                    } else {
                      fn.field_j = fn.field_j + 500;
                      mb.field_g = mb.field_g + 400;
                      fn.field_j = fn.field_j + 20;
                      mb.field_g = mb.field_g + 20;
                      fn.field_j = fn.field_j - wd.field_j;
                      ob.field_l = ob.field_l + 1;
                      ob.field_l = ob.field_l - 1;
                      fn.field_j = fn.field_j + wd.field_j;
                      we.field_h = we.field_h + 40;
                      fp.field_a = fp.field_a + 40;
                      b.field_a = b.field_a + 20;
                      je.field_j = je.field_j + 20;
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                this.field_l.a(1 << var15.field_u, true, tm.field_e);
                stackIn_20_0 = this.field_l.a(param0, param1, param2, param3, (byte) -93, param5, param6);
                break L0;
              } else {
                var11_int = 1;
                L6: while (true) {
                  if (var11_int >= -1 + param6[0].length) {
                    var10++;
                    continue L1;
                  } else {
                    var9 = var9 + param6[var10][var11_int].a(-9352, var11_int, var10, var15, this.field_p);
                    var11_int++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var8);

            stackIn_23_1 = new StringBuilder().append("gi.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ')');
        }
        return stackIn_20_0;
    }

    static {
        field_n = new dl(256, 25);
        field_m = 64;
    }
}
