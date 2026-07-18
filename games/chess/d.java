/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends ci {
    static String field_Lb;
    private ci[] field_Kb;
    static boolean field_Gb;
    static char field_Ib;
    int field_Hb;
    static byte[] field_Jb;
    private ci field_Fb;
    private ci[] field_Eb;
    static dk field_Mb;

    final static boolean a(boolean param0) {
        sk.field_p = param0 ? true : false;
        ma.field_E = ud.a(2) + 15000L;
        return rm.field_Q == 11 ? true : false;
    }

    final static void a(vl param0, int param1, vl param2, jk param3, java.awt.Component param4, boolean param5, byte param6) {
        try {
            md.a(param1, param5, 10);
            mh.field_d = md.a(param3, param4, 0, 22050);
            kn.field_F = md.a(param3, param4, 1, 2048);
            h.field_s = new lb();
            kn.field_F.b((nm) (Object) h.field_s);
            fk.field_q = param2;
            fk.field_q.a(64 * bc.field_b / 80, (byte) -100);
            mh.field_d.b((nm) (Object) fk.field_q);
            if (param6 > -21) {
                field_Mb = null;
            }
            ka.field_a = param0;
            ka.field_a.a(lf.field_S * 64 / 80, (byte) -100);
            h.field_s.a((nm) (Object) ka.field_a);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "d.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = Chess.field_G;
        var4 = 0;
        L0: while (true) {
          if (((d) this).field_Eb.length <= var4) {
            ((d) this).field_Fb.a(0, ((d) this).field_M, -2147483648, ((d) this).field_pb + -param2, param2);
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (var8 >= ((d) this).field_Kb.length) {
                return;
              } else {
                ((d) this).field_Kb[var8].a(param1, -(2 * param1) + ((d) this).field_Fb.field_M, -2147483648, -(param1 * 2) + ((d) this).field_Fb.field_pb, param1);
                if (var8 != ((d) this).field_Hb) {
                  ((d) this).field_Kb[var8].field_mb = ((d) this).field_Kb[var8].field_mb + 10000;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var5 = ((d) this).field_M * var4 / ((d) this).field_Eb.length;
            var6 = (1 + var4) * ((d) this).field_M / ((d) this).field_Eb.length;
            ((d) this).field_Eb[var4].field_mb = var5;
            ((d) this).field_Eb[var4].field_V = 0;
            ((d) this).field_Eb[var4].field_M = -var5 + var6;
            ((d) this).field_Eb[var4].field_pb = param2;
            var4++;
            continue L0;
          }
        }
    }

    d(long param0, ci param1, String[] param2, ci param3, ci[] param4, int param5) {
        super(param0, (ci) null);
        RuntimeException var8 = null;
        int var8_int = 0;
        ci var9 = null;
        int var11 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            ((d) this).field_Eb = new ci[param2.length];
            ((d) this).field_Fb = new ci(0L, param3);
            ((d) this).field_Kb = param4;
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= param2.length) {
                ((d) this).a((byte) 127, ((d) this).field_Fb);
                var11 = 0;
                var8_int = var11;
                L2: while (true) {
                  if (param4.length <= var11) {
                    ((d) this).field_Hb = param5;
                    ((d) this).field_Eb[param5].field_gb = true;
                    break L0;
                  } else {
                    ((d) this).field_Fb.a((byte) 126, param4[var11]);
                    var11++;
                    continue L2;
                  }
                }
              } else {
                var9 = new ci(0L, param1);
                var9.field_db = param2[var8_int];
                ((d) this).field_Eb[var8_int] = var9;
                ((d) this).a((byte) 124, var9);
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var8;
            stackOut_9_1 = new StringBuilder().append("d.<init>(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param5 + ')');
        }
    }

    final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = Chess.field_G;
        var2 = 0;
        L0: while (true) {
          if (((d) this).field_Eb.length <= var2) {
            L1: {
              if (param0 == 109) {
                break L1;
              } else {
                var4 = null;
                d.a((vl) null, -126, (vl) null, (jk) null, (java.awt.Component) null, false, (byte) 69);
                break L1;
              }
            }
            return;
          } else {
            if (((d) this).field_Hb != var2) {
              if (((d) this).field_Eb[var2].field_L != 0) {
                ((d) this).field_Eb[((d) this).field_Hb].field_gb = false;
                ((d) this).field_Kb[((d) this).field_Hb].field_mb = ((d) this).field_Kb[((d) this).field_Hb].field_mb + 10000;
                ((d) this).field_Hb = var2;
                ((d) this).field_Eb[var2].field_gb = true;
                ((d) this).field_Kb[var2].field_mb = ((d) this).field_Kb[var2].field_mb - 10000;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static void l(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          L0: {
            var1_int = ge.field_eb[0];
            var2 = 1;
            L1: while (true) {
              if (var2 >= ge.field_eb.length) {
                break L0;
              } else {
                var3 = ge.field_eb[var2];
                ne.a(ve.field_Hb, var2 << 4, ve.field_Hb, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var1, "d.B(" + 465918340 + ')');
        }
    }

    final static void a(byte param0, ld param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ld var3 = null;
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = Chess.field_G;
        try {
          L0: {
            if (param1.field_n != null) {
              L1: {
                L2: {
                  if (0 != param1.field_e) {
                    break L2;
                  } else {
                    if (-1 == param1.field_q) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (var2_int >= qf.field_c) {
                    break L1;
                  } else {
                    L4: {
                      var3 = ik.field_i[var2_int];
                      if (-3 != var3.field_k) {
                        break L4;
                      } else {
                        if (param1.field_e != var3.field_e) {
                          break L4;
                        } else {
                          if (var3.field_q != param1.field_q) {
                            break L4;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (param1.field_l != null) {
                  ca.field_i = param1.field_l;
                  a.field_f = param1.field_m;
                  v.field_b = param1.field_i;
                  hn.field_s = param1.field_k;
                  break L5;
                } else {
                  break L5;
                }
              }
              var2_int = -79;
              ml.a((byte) 90, param1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("d.F(").append(126).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    public static void k(int param0) {
        int var1 = 0;
        field_Jb = null;
        field_Lb = null;
        field_Mb = null;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = -14 / ((param0 - -10) / 47);
        ((d) this).field_V = param1;
        ((d) this).field_M = param2;
        ((d) this).field_pb = param6;
        ((d) this).field_mb = param3;
        this.a(0, param4, param5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = "Add name";
    }
}
