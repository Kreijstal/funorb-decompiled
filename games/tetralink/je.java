/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static hl field_e;
    static db field_d;
    static int[] field_b;
    mc field_c;
    static int field_f;
    private mc field_a;
    static String field_g;
    static int[] field_h;

    final void b(int param0) {
        mc var2 = null;
        int var3 = 0;
        var3 = TetraLink.field_J;
        L0: while (true) {
          var2 = ((je) this).field_c.field_j;
          if (var2 != ((je) this).field_c) {
            var2.b(false);
            continue L0;
          } else {
            L1: {
              ((je) this).field_a = null;
              if (param0 == 1) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            return;
          }
        }
    }

    final mc a(byte param0, mc param1) {
        mc var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_6_0 = null;
        mc stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        mc stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                var3 = param1;
                break L1;
              } else {
                var3 = ((je) this).field_c.field_j;
                break L1;
              }
            }
            if (((je) this).field_c == var3) {
              ((je) this).field_a = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              return (mc) (Object) stackIn_6_0;
            } else {
              L2: {
                if (param0 == -10) {
                  break L2;
                } else {
                  field_g = null;
                  break L2;
                }
              }
              ((je) this).field_a = var3.field_j;
              stackOut_9_0 = (mc) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("je.H(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final mc a(byte param0) {
        mc var2 = ((je) this).field_a;
        if (!(((je) this).field_c != var2)) {
            ((je) this).field_a = null;
            return null;
        }
        ((je) this).field_a = var2.field_j;
        if (param0 != -70) {
            Object var3 = null;
            ((je) this).a((mc) null, -40);
        }
        return var2;
    }

    final mc d(boolean param0) {
        if (!param0) {
            field_b = null;
        }
        mc var2 = ((je) this).field_c.field_e;
        if (!(((je) this).field_c != var2)) {
            ((je) this).field_a = null;
            return null;
        }
        ((je) this).field_a = var2.field_e;
        return var2;
    }

    final mc c(byte param0) {
        if (param0 < 123) {
            field_g = null;
        }
        mc var2 = ((je) this).field_c.field_e;
        if (var2 == ((je) this).field_c) {
            return null;
        }
        var2.b(false);
        return var2;
    }

    final mc c(boolean param0) {
        if (param0) {
            Object var3 = null;
            ((je) this).a((mc) null, 0);
        }
        mc var2 = ((je) this).field_c.field_j;
        if (((je) this).field_c == var2) {
            ((je) this).field_a = null;
            return null;
        }
        ((je) this).field_a = var2.field_j;
        return var2;
    }

    final boolean b(boolean param0) {
        if (!param0) {
            je.a(-87);
        }
        return ((je) this).field_c == ((je) this).field_c.field_j ? true : false;
    }

    final static void a(int param0, int param1, bh param2, int param3, int param4) {
        param2.a(12, false);
        param2.b(17, false);
        param2.b(param1, false);
        param2.b(param4, false);
        if (param0 >= -32) {
            return;
        }
        try {
            param2.a(param3, false);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "je.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_b = null;
        field_e = null;
        field_h = null;
        field_d = null;
        int var1 = 0;
    }

    final mc d(byte param0) {
        mc var2 = ((je) this).field_a;
        if (var2 == ((je) this).field_c) {
            ((je) this).field_a = null;
            return null;
        }
        ((je) this).field_a = var2.field_e;
        if (param0 != 14) {
            boolean discarded$0 = ((je) this).b(true);
        }
        return var2;
    }

    final static void a(int param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        Throwable decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            var1 = (Object) (Object) vi.field_a;
            synchronized (var1) {
              L1: {
                L2: {
                  dh.field_m = bb.field_e;
                  if (param0 == 13397) {
                    break L2;
                  } else {
                    var5 = null;
                    je.a(15, 10, (bh) null, 22, 69);
                    break L2;
                  }
                }
                L3: {
                  wk.field_c = wk.field_c + 1;
                  if (mh.field_b < 0) {
                    var6 = 0;
                    var2 = var6;
                    L4: while (true) {
                      if (var6 >= 112) {
                        mh.field_b = s.field_d;
                        break L3;
                      } else {
                        sn.field_a[var6] = false;
                        var6++;
                        continue L4;
                      }
                    }
                  } else {
                    L5: while (true) {
                      if (s.field_d == mh.field_b) {
                        break L3;
                      } else {
                        var2 = ah.field_g[s.field_d];
                        s.field_d = 127 & 1 + s.field_d;
                        if (var2 < 0) {
                          sn.field_a[~var2] = false;
                          continue L5;
                        } else {
                          sn.field_a[var2] = true;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                bb.field_e = eh.field_n;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1_ref, "je.C(" + param0 + ')');
        }
    }

    final void a(mc param0, boolean param1) {
        try {
            if (null != param0.field_e) {
                param0.b(false);
            }
            if (param1) {
                mc discarded$0 = ((je) this).d((byte) 106);
            }
            param0.field_j = ((je) this).field_c;
            param0.field_e = ((je) this).field_c.field_e;
            param0.field_e.field_j = param0;
            param0.field_j.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "je.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final mc a(boolean param0) {
        mc var2 = ((je) this).field_c.field_j;
        if (var2 == ((je) this).field_c) {
            return null;
        }
        var2.b(param0);
        return var2;
    }

    final static void a(boolean param0, int param1, String param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int stackIn_23_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var10 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              ma.field_g = true;
              bm.field_q = param1;
              var11 = param2;
              var6 = hl.field_ub;
              if (bm.field_q != 0) {
                if (1 != bm.field_q) {
                  throw new IllegalArgumentException();
                } else {
                  var7 = t.a(480, 108, var11, jj.field_d, ko.field_u);
                  var8 = 2 - -var7;
                  bi.field_c = new int[var8];
                  hk.field_b = new String[var8];
                  var9 = 0;
                  L2: while (true) {
                    if (var8 <= var9) {
                      j.field_x = new int[1];
                      var9 = 0;
                      L3: while (true) {
                        if (var7 <= var9) {
                          hk.field_b[var8 - 2] = "";
                          hk.field_b[var8 + -1] = d.field_a;
                          bi.field_c[var8 + -1] = 0;
                          j.field_x[0] = 2;
                          break L1;
                        } else {
                          hk.field_b[var9] = jj.field_d[var9];
                          var9++;
                          continue L3;
                        }
                      }
                    } else {
                      bi.field_c[var9] = -1;
                      var9++;
                      continue L2;
                    }
                  }
                }
              } else {
                var7 = t.a(480, 118, var11, jj.field_d, ko.field_u);
                var8 = 3 - -var7;
                hk.field_b = new String[var8];
                bi.field_c = new int[var8];
                var9 = 0;
                L4: while (true) {
                  if (var8 <= var9) {
                    j.field_x = new int[2];
                    var9 = 0;
                    L5: while (true) {
                      if (var9 >= var7) {
                        hk.field_b[var8 - 3] = "";
                        hk.field_b[-2 + var8] = var6;
                        bi.field_c[var8 + -2] = 0;
                        j.field_x[0] = 1;
                        hk.field_b[var8 - 1] = d.field_a;
                        bi.field_c[var8 + -1] = 1;
                        j.field_x[1] = 2;
                        break L1;
                      } else {
                        hk.field_b[var9] = jj.field_d[var9];
                        var9++;
                        continue L5;
                      }
                    }
                  } else {
                    bi.field_c[var9] = -1;
                    var9++;
                    continue L4;
                  }
                }
              }
            }
            hb.field_a.field_g = j.field_x.length;
            var7 = 0;
            var8 = 0;
            L6: while (true) {
              if (hk.field_b.length <= var8) {
                hk.field_a = (hc.field_q - -cd.field_e << 1) * hb.field_a.field_g;
                ja.field_j = nh.field_Nb + -(var7 >> 1);
                hd.field_q = -(var7 >> 1) + (var7 + nh.field_Nb);
                var8 = 0;
                L7: while (true) {
                  if (var8 >= hk.field_b.length) {
                    ab.field_Q = -(hk.field_a >> 1) + fk.field_S;
                    hb.field_a.a(ai.a(aa.field_Nb, a.field_a, 126), 0, param3, -98);
                    break L0;
                  } else {
                    L8: {
                      stackOut_34_0 = hk.field_a;
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_35_0 = stackOut_34_0;
                      if (bi.field_c[var8] < 0) {
                        stackOut_36_0 = stackIn_36_0;
                        stackOut_36_1 = hl.field_wb;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        break L8;
                      } else {
                        stackOut_35_0 = stackIn_35_0;
                        stackOut_35_1 = i.field_n;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        break L8;
                      }
                    }
                    hk.field_a = stackIn_37_0 + stackIn_37_1;
                    var8++;
                    continue L7;
                  }
                }
              } else {
                L9: {
                  if (bi.field_c[var8] < 0) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    break L9;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    break L9;
                  }
                }
                L10: {
                  var9 = tn.a(stackIn_23_0 != 0, 1, hk.field_b[var8]);
                  if (-1 != bi.field_c[var8]) {
                    var9 = var9 + 2 * ao.field_a;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var9 > var7) {
                    var7 = var9;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var8++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var5;
            stackOut_40_1 = new StringBuilder().append("je.B(").append(true).append(',').append(param1).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param2 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L12;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L12;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + ',' + param3 + ',' + -1381732671 + ')');
        }
    }

    final void a(mc param0, int param1) {
        try {
            if (null != param0.field_e) {
                param0.b(false);
            }
            param0.field_e = ((je) this).field_c;
            param0.field_j = ((je) this).field_c.field_j;
            param0.field_e.field_j = param0;
            int var3_int = -56 / ((param1 - 37) / 58);
            param0.field_j.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "je.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public je() {
        ((je) this).field_c = new mc();
        ((je) this).field_c.field_e = ((je) this).field_c;
        ((je) this).field_c.field_j = ((je) this).field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[256];
        field_d = new db(14, 0, 4, 1);
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
