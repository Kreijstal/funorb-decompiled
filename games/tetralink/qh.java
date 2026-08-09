/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends d implements ih, cg {
    static boolean field_k;
    hn field_m;
    static int field_n;
    static String field_l;

    final String e(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var2_int = this.field_m.g((byte) 12);
            if (param0 == 0) {
              L1: {
                var3 = this.field_m.a(false);
                var4 = this.field_m.f((byte) 94);
                var5 = df.a(true);
                if (var4 < 1890) {
                  break L1;
                } else {
                  if (var4 <= var5 - 3) {
                    if (!fk.a(var4, (byte) -40, var2_int, var3)) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_7_0 = sk.a(new String[]{"1890", Integer.toString(-3 + var5)}, fm.field_d, param0 + 122);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            decompiledRegionSelector0 = 2;
            break L2;
          }
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return nm.field_y;
          }
        }
    }

    public final void a(byte param0, nn param1) {
        try {
            int var3_int = -10 / ((-18 - param0) / 63);
            this.a(125);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "qh.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, int param1, byte param2, int param3, int param4, boolean param5, int param6) {
        L0: {
          if (!ak.a(3058)) {
            break L0;
          } else {
            L1: {
              we.a(param5, param0, param2 + 28, param4);
              if (null == hd.field_s) {
                break L1;
              } else {
                if (!hd.field_s.a(param4, param1, param5, (byte) 53, param6)) {
                  break L1;
                } else {
                  param5 = false;
                  gg.c((byte) 43);
                  break L1;
                }
              }
            }
            ej.a(param5, param4, (byte) 107);
            mn.a(param5, -1, param3);
            param5 = false;
            break L0;
          }
        }
        if (param2 != -30) {
          return true;
        } else {
          return param5;
        }
    }

    public static void d(byte param0) {
        if (param0 != -34) {
            field_k = false;
            field_l = null;
            return;
        }
        field_l = null;
    }

    final static void a(gd param0, int param1, int param2, int param3, int param4, int param5, rb param6) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        rb var12 = null;
        pf var13 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            gd.a(param0.field_Rb, 255, param0.field_Yb, -1, param6, (int[]) null, param0.field_Nb, param0, -1);
            hd.field_s.a(19, true);
            hd.field_s.a(0, (int[]) null, true);
            hd.field_s.a(true);
            var13 = hd.field_s;
            var8 = param1;
            var9 = param4;
            var10 = param5;
            var11 = param2;
            var13.field_j.a(var10, var9, -74, var11, var8);
            if (param3 < -48) {
              break L0;
            } else {
              var12 = (rb) null;
              qh.a((gd) null, 6, 79, 49, 30, -92, (rb) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("qh.B(");

            if (param0 == null) {
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
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    public final boolean b(int param0) {
        if (param0 != 13074) {
            return false;
        }
        return this.field_m.h(-30886);
    }

    final static void a(boolean param0, byte param1, int param2, ri param3, int param4) {
        try {
            bn.field_c.a(param3, param2, !param0 ? true : false, param4, 1000000, (byte) -128);
            int var5_int = 120 / ((param1 - -1) / 47);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "qh.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        rb var8;
        ck.field_bb.a((byte) -85, param2, param6, param3, param0);
        if (param4 == 1000000) {
          if (gl.field_o != null) {
            gl.field_o.a(param5, param3, param5 + -d.field_e, param1, param3, 0);
            return;
          } else {
            return;
          }
        } else {
          var8 = (rb) null;
          qh.a((gd) null, -102, -101, -48, -5, -49, (rb) null);
          if (gl.field_o == null) {
            return;
          } else {
            gl.field_o.a(param5, param3, param5 + -d.field_e, param1, param3, 0);
            return;
          }
        }
    }

    public final void a(nn param0, byte param1) {
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
              if (param1 == 101) {
                break L1;
              } else {
                this.field_m = (hn) null;
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

            stackIn_5_1 = new StringBuilder().append("qh.P(");

            if (param0 == null) {
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
          throw oi.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final jk a(boolean param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jk stackIn_3_0 = null;
        jk stackIn_7_0 = null;
        jk stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var2_int = this.field_m.g((byte) 12);
            var3 = this.field_m.a(param0);
            var4 = this.field_m.f((byte) 66);
            var5 = df.a(true);
            if ((var4 ^ -1) > -1891) {
              stackIn_3_0 = db.field_h;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var4 > -3 + var5) {
                stackIn_7_0 = db.field_h;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (fk.a(var4, (byte) -40, var2_int, var3)) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_10_0 = db.field_h;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return db.field_h;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return pf.field_a;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    public qh() {
    }

    static {
        field_l = "<%0> wants to join";
    }
}
