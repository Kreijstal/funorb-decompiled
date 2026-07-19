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
          var2 = this.field_c.field_j;
          if (var2 != this.field_c) {
            var2.b(false);
            continue L0;
          } else {
            L1: {
              this.field_a = null;
              if (param0 == 1) {
                break L1;
              } else {
                field_h = (int[]) null;
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
        int decompiledRegionSelector0 = 0;
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
                var3 = this.field_c.field_j;
                break L1;
              }
            }
            if (this.field_c == var3) {
              this.field_a = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0 == -10) {
                  break L2;
                } else {
                  field_g = (String) null;
                  break L2;
                }
              }
              this.field_a = var3.field_j;
              stackOut_9_0 = (mc) (var3);
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("je.H(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (mc) ((Object) stackIn_6_0);
        } else {
          return stackIn_10_0;
        }
    }

    final mc a(byte param0) {
        mc var2 = this.field_a;
        if (!(this.field_c != var2)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_j;
        if (param0 != -70) {
            mc var3 = (mc) null;
            this.a((mc) null, -40);
        }
        return var2;
    }

    final mc d(boolean param0) {
        if (!param0) {
            field_b = (int[]) null;
        }
        mc var2 = this.field_c.field_e;
        if (!(this.field_c != var2)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_e;
        return var2;
    }

    final mc c(byte param0) {
        if (param0 < 123) {
            field_g = (String) null;
        }
        mc var2 = this.field_c.field_e;
        if (var2 == this.field_c) {
            return null;
        }
        var2.b(false);
        return var2;
    }

    final mc c(boolean param0) {
        if (param0) {
            mc var3 = (mc) null;
            this.a((mc) null, 0);
        }
        mc var2 = this.field_c.field_j;
        if (this.field_c == var2) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_j;
        return var2;
    }

    final boolean b(boolean param0) {
        if (!param0) {
            je.a(-87);
        }
        return this.field_c == this.field_c.field_j ? true : false;
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
            throw oi.a((Throwable) ((Object) runtimeException), "je.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_b = null;
        field_e = null;
        field_h = null;
        field_d = null;
        int var1 = -31 % ((param0 - -60) / 59);
    }

    final mc d(byte param0) {
        boolean discarded$0 = false;
        mc var2 = this.field_a;
        if (var2 == this.field_c) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_e;
        if (param0 != 14) {
            discarded$0 = this.b(true);
        }
        return var2;
    }

    final static void a(int param0) {
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        bh var5 = null;
        int var6 = 0;
        Throwable decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            var1 = vi.field_a;
            synchronized (var1) {
              L1: {
                L2: {
                  dh.field_m = bb.field_e;
                  if (param0 == 13397) {
                    break L2;
                  } else {
                    var5 = (bh) null;
                    je.a(15, 10, (bh) null, 22, 69);
                    break L2;
                  }
                }
                L3: {
                  wk.field_c = wk.field_c + 1;
                  if (-1 < (mh.field_b ^ -1)) {
                    var6 = 0;
                    var2 = var6;
                    L4: while (true) {
                      if (-113 >= (var6 ^ -1)) {
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
                        if (-1 < (var2 ^ -1)) {
                          sn.field_a[var2 ^ -1] = false;
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
          throw oi.a((Throwable) ((Object) var1_ref), "je.C(" + param0 + ')');
        }
    }

    final void a(mc param0, boolean param1) {
        mc discarded$0 = null;
        try {
            if (null != param0.field_e) {
                param0.b(false);
            }
            if (param1) {
                discarded$0 = this.d((byte) 106);
            }
            param0.field_j = this.field_c;
            param0.field_e = this.field_c.field_e;
            param0.field_e.field_j = param0;
            param0.field_j.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "je.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final mc a(boolean param0) {
        mc var2 = this.field_c.field_j;
        if (var2 == this.field_c) {
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
        String stackIn_4_0 = null;
        int stackIn_26_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_2_0 = null;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var10 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              ma.field_g = true;
              bm.field_q = param1;
              var11 = param2;
              if (!param0) {
                stackOut_3_0 = ug.field_X;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = hl.field_ub;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_4_0;
              if (bm.field_q != 0) {
                if (1 != bm.field_q) {
                  throw new IllegalArgumentException();
                } else {
                  var7 = t.a(480, 108, var11, jj.field_d, ko.field_u);
                  var8 = 2 - -var7;
                  bi.field_c = new int[var8];
                  hk.field_b = new String[var8];
                  var9 = 0;
                  L3: while (true) {
                    if (var8 <= var9) {
                      j.field_x = new int[1];
                      var9 = 0;
                      L4: while (true) {
                        if (var7 <= var9) {
                          hk.field_b[var8 - 2] = "";
                          hk.field_b[var8 + -1] = d.field_a;
                          bi.field_c[var8 + -1] = 0;
                          j.field_x[0] = 2;
                          break L2;
                        } else {
                          hk.field_b[var9] = jj.field_d[var9];
                          var9++;
                          continue L4;
                        }
                      }
                    } else {
                      bi.field_c[var9] = -1;
                      var9++;
                      continue L3;
                    }
                  }
                }
              } else {
                var7 = t.a(480, 118, var11, jj.field_d, ko.field_u);
                var8 = 3 - -var7;
                hk.field_b = new String[var8];
                bi.field_c = new int[var8];
                var9 = 0;
                L5: while (true) {
                  if (var8 <= var9) {
                    j.field_x = new int[2];
                    var9 = 0;
                    L6: while (true) {
                      if (var9 >= var7) {
                        hk.field_b[var8 - 3] = "";
                        hk.field_b[-2 + var8] = var6;
                        bi.field_c[var8 + -2] = 0;
                        j.field_x[0] = 1;
                        hk.field_b[var8 - 1] = d.field_a;
                        bi.field_c[var8 + -1] = 1;
                        j.field_x[1] = 2;
                        break L2;
                      } else {
                        hk.field_b[var9] = jj.field_d[var9];
                        var9++;
                        continue L6;
                      }
                    }
                  } else {
                    bi.field_c[var9] = -1;
                    var9++;
                    continue L5;
                  }
                }
              }
            }
            hb.field_a.field_g = j.field_x.length;
            var7 = 0;
            var8 = 0;
            L7: while (true) {
              if (hk.field_b.length <= var8) {
                L8: {
                  if (param4 == -1381732671) {
                    break L8;
                  } else {
                    field_e = (hl) null;
                    break L8;
                  }
                }
                hk.field_a = (hc.field_q - -cd.field_e << 1259457505) * hb.field_a.field_g;
                ja.field_j = nh.field_Nb + -(var7 >> -1121162719);
                hd.field_q = -(var7 >> -1381732671) + (var7 + nh.field_Nb);
                var8 = 0;
                L9: while (true) {
                  if (var8 >= hk.field_b.length) {
                    ab.field_Q = -(hk.field_a >> 517472449) + fk.field_S;
                    hb.field_a.a(ai.a(aa.field_Nb, a.field_a, 126), 0, param3, -98);
                    break L0;
                  } else {
                    L10: {
                      stackOut_37_0 = hk.field_a;
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_38_0 = stackOut_37_0;
                      if (-1 < (bi.field_c[var8] ^ -1)) {
                        stackOut_39_0 = stackIn_39_0;
                        stackOut_39_1 = hl.field_wb;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        break L10;
                      } else {
                        stackOut_38_0 = stackIn_38_0;
                        stackOut_38_1 = i.field_n;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        break L10;
                      }
                    }
                    hk.field_a = stackIn_40_0 + stackIn_40_1;
                    var8++;
                    continue L9;
                  }
                }
              } else {
                L11: {
                  if (bi.field_c[var8] < 0) {
                    stackOut_25_0 = 0;
                    stackIn_26_0 = stackOut_25_0;
                    break L11;
                  } else {
                    stackOut_24_0 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    break L11;
                  }
                }
                L12: {
                  var9 = tn.a(stackIn_26_0 != 0, 1, hk.field_b[var8]);
                  if (-1 != bi.field_c[var8]) {
                    var9 = var9 + 2 * ao.field_a;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (var9 > var7) {
                    var7 = var9;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var8++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var5);
            stackOut_43_1 = new StringBuilder().append("je.B(").append(param0).append(',').append(param1).append(',');
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L14;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L14;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(mc param0, int param1) {
        try {
            if (null != param0.field_e) {
                param0.b(false);
            }
            param0.field_e = this.field_c;
            param0.field_j = this.field_c.field_j;
            param0.field_e.field_j = param0;
            int var3_int = -56 / ((param1 - 37) / 58);
            param0.field_j.field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "je.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public je() {
        this.field_c = new mc();
        this.field_c.field_e = this.field_c;
        this.field_c.field_j = this.field_c;
    }

    static {
        field_b = new int[256];
        field_d = new db(14, 0, 4, 1);
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
