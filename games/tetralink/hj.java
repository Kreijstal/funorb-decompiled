/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj {
    private ah field_d;
    static int field_a;
    static String[] field_c;
    private ah field_b;
    static ve field_e;
    private ec field_f;

    public static void a(int param0) {
        if (param0 != 32768) {
            return;
        }
        field_c = null;
        field_e = null;
    }

    final static void b(byte param0) {
        jo.a(gk.field_d, 6, -13850);
        jo.a(il.field_T, 8, -13850);
        if (!wk.a((byte) 122)) {
            jo.a(in.field_c, 2, -13850);
            jo.a(qj.field_b, 3, -13850);
            jo.a(wg.field_f, 4, -13850);
            jo.a(od.field_Y, 5, -13850);
            if (param0 <= -45) {
                hg.field_b[8] = hg.field_b[8] + 32;
                return;
            }
            hj.b((byte) 99);
            hg.field_b[8] = hg.field_b[8] + 32;
            return;
        }
        if (param0 > -45) {
            hj.b((byte) 99);
            hg.field_b[8] = hg.field_b[8] + 32;
            return;
        }
        hg.field_b[8] = hg.field_b[8] + 32;
    }

    final static sj a(String param0, int param1, boolean param2) {
        sj var3 = null;
        RuntimeException var3_ref = null;
        sj stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        sj stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new sj(param2);
            var3.field_i = param0;
            var3.field_d = param1;
            stackOut_0_0 = (sj) (var3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3_ref);
            stackOut_2_1 = new StringBuilder().append("hj.F(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            if (param0 == -93) {
              var1_int = ug.field_bb[0];
              var2 = 1;
              L1: while (true) {
                if (var2 >= ug.field_bb.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3 = ug.field_bb[var2];
                  rd.a(lg.field_ab, var2 << 2040505732, lg.field_ab, var1_int, var3);
                  var1_int = var1_int + var3;
                  var2++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "hj.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final qa a(int param0, boolean param1) {
        byte[] var4 = null;
        if (!param1) {
            return (qa) null;
        }
        qa var3 = (qa) (this.field_f.a((byte) 120, (long)param0));
        if (!(var3 == null)) {
            return var3;
        }
        if (32768 > param0) {
            var4 = this.field_b.a(-86, param0, 0);
        } else {
            var4 = this.field_d.a(-103, param0 & 32767, 0);
        }
        var3 = new qa();
        if (var4 != null) {
            var3.a(new bh(var4), 0);
            if (!(32768 > param0)) {
                var3.g(32768);
            }
            this.field_f.a(var3, (long)param0, (byte) 50);
            return var3;
        }
        if (!(32768 > param0)) {
            var3.g(32768);
        }
        this.field_f.a(var3, (long)param0, (byte) 50);
        return var3;
    }

    hj(int param0, ah param1, ah param2) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        this.field_f = new ec(64);
        try {
          L0: {
            L1: {
              this.field_b = param1;
              this.field_d = param2;
              if (this.field_b == null) {
                break L1;
              } else {
                discarded$4 = this.field_b.b(-23126, 0);
                break L1;
              }
            }
            L2: {
              if (this.field_d == null) {
                break L2;
              } else {
                discarded$5 = this.field_d.b(-23126, 0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("hj.<init>(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        if (!hi.field_a) {
          return;
        } else {
          ck.field_bb.a(0, param0);
          var4 = gl.field_o.c(param3) ? 1 : 0;
          if (!param3) {
            L0: {
              if (0 == tm.field_t) {
                break L0;
              } else {
                if (var4 == 0) {
                  fk.e((byte) -8);
                  param0 = false;
                  break L0;
                } else {
                  L1: {
                    if (param0) {
                      gl.field_o.a(0, param1, param2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (var4 != 0) {
                      ck.field_bb.a(0, param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var5 = gl.field_o.h(0) - -gl.field_o.field_eb;
                  if (640 < var5) {
                    d.field_e = d.field_e + 5;
                    return;
                  } else {
                    if ((var5 ^ -1) > -636) {
                      if (-1 > (d.field_e ^ -1)) {
                        d.field_e = d.field_e - 5;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            L3: {
              if (param0) {
                gl.field_o.a(0, param1, param2);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var4 != 0) {
                ck.field_bb.a(0, param0);
                break L4;
              } else {
                break L4;
              }
            }
            var5 = gl.field_o.h(0) - -gl.field_o.field_eb;
            if (640 < var5) {
              d.field_e = d.field_e + 5;
              return;
            } else {
              if ((var5 ^ -1) <= -636) {
                return;
              } else {
                if (-1 > (d.field_e ^ -1)) {
                  d.field_e = d.field_e - 5;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        field_c = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
