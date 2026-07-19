/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pe implements Iterator {
    static gl[] field_b;
    private lc field_e;
    private wf field_f;
    private wf field_d;
    private int field_a;
    static String field_c;
    static long field_g;

    final static Class a(String param0, int param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_6_0 = null;
        Class stackIn_9_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_16_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_27_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_5_0 = null;
        Class stackOut_12_0 = null;
        Class stackOut_19_0 = null;
        Class stackOut_23_0 = null;
        Class stackOut_30_0 = null;
        Class stackOut_26_0 = null;
        Class stackOut_15_0 = null;
        Class stackOut_8_0 = null;
        Class stackOut_1_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            if (param1 == 1) {
              if (param0.equals("B")) {
                stackOut_5_0 = Byte.TYPE;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!param0.equals("I")) {
                  if (param0.equals("S")) {
                    stackOut_12_0 = Short.TYPE;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param0.equals("J")) {
                      if (param0.equals("Z")) {
                        stackOut_19_0 = Boolean.TYPE;
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (param0.equals("F")) {
                          stackOut_23_0 = Float.TYPE;
                          stackIn_24_0 = stackOut_23_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (!param0.equals("D")) {
                            if (param0.equals("C")) {
                              stackOut_30_0 = Character.TYPE;
                              stackIn_31_0 = stackOut_30_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              return Class.forName(param0);
                            }
                          } else {
                            stackOut_26_0 = Double.TYPE;
                            stackIn_27_0 = stackOut_26_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackOut_15_0 = Long.TYPE;
                      stackIn_16_0 = stackOut_15_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackOut_8_0 = Integer.TYPE;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = (Class) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var2);
            stackOut_32_1 = new StringBuilder().append("pe.A(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L1;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_27_0;
                      } else {
                        return stackIn_31_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void a(boolean param0) {
        this.field_d = this.field_e.field_a[0].field_a;
        this.field_a = 1;
        if (!param0) {
            return;
        }
        this.field_f = null;
    }

    public final boolean hasNext() {
        wf[] fieldTemp$16 = null;
        int fieldTemp$17 = 0;
        int var2 = 0;
        var2 = AceOfSkies.field_G ? 1 : 0;
        if (this.field_d != this.field_e.field_a[-1 + this.field_a]) {
          return true;
        } else {
          L0: while (true) {
            if (this.field_a >= this.field_e.field_c) {
              return false;
            } else {
              fieldTemp$16 = this.field_e.field_a;
              fieldTemp$17 = this.field_a;
              this.field_a = this.field_a + 1;
              if (fieldTemp$16[fieldTemp$17].field_a != this.field_e.field_a[this.field_a + -1]) {
                this.field_d = this.field_e.field_a[this.field_a + -1].field_a;
                return true;
              } else {
                this.field_d = this.field_e.field_a[this.field_a - 1];
                continue L0;
              }
            }
          }
        }
    }

    final static void a(gk param0, byte param1, gk param2, gk param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            oo.field_ab = new vd[2];
            var4_int = 0;
            L1: while (true) {
              if (oo.field_ab.length <= var4_int) {
                jd.field_d = new vd[8][];
                var4_int = 0;
                L2: while (true) {
                  if ((var4_int ^ -1) <= -9) {
                    L3: {
                      if (param1 > 22) {
                        break L3;
                      } else {
                        field_c = (String) null;
                        break L3;
                      }
                    }
                    na.field_c = new vd[1];
                    var4_int = 0;
                    L4: while (true) {
                      if (-2 >= (var4_int ^ -1)) {
                        l.field_a = vd.b(param3, "aceofskies", "bullet");
                        tq.field_h = vd.a(param3, "aceofskies", "smoke");
                        ud.field_f = vd.a(param3, "aceofskies", "explosion");
                        gn.field_b = vd.a(param3, "aceofskies", "scorch");
                        fs.field_e = vd.b(param3, "", "titleimage");
                        ps.field_f = new vd[3][];
                        ps.field_f[0] = vd.a(param3, "aceofskies", "oilgauge");
                        ps.field_f[1] = vd.a(param3, "aceofskies", "heatgauge");
                        ps.field_f[2] = vd.a(param3, "aceofskies", "supergauge");
                        qq.field_e = vd.a(param3, "aceofskies", "upgrades");
                        o.field_a = vd.a(param3, "aceofskies", "radar");
                        eb.field_c = new vd[2];
                        eb.field_c[0] = vd.b(param3, "aceofskies", "scorecounter");
                        eb.field_c[1] = vd.b(param3, "aceofskies", "multiplier");
                        kb.field_D = vd.a(param3, "aceofskies", "scorenumbers");
                        hq.field_a = vd.a(param3, "aceofskies", "levelring");
                        qa.field_a = vd.a(param3, "", "keys");
                        dl.field_m = vd.a(param3, "", "fontalpha");
                        hi.field_v = tg.a(param0, 8191, "", "font");
                        q.field_o = vd.a(param3, "", "bigfontalpha");
                        kn.field_b = tg.a(param0, 8191, "", "bigfont");
                        nc.field_a = vd.a(param3, "", "titlefontalpha");
                        dp.field_h = tg.a(param0, 8191, "", "titlefont");
                        lt.field_v = vd.b(param3, "", "woodentile");
                        gu.field_a = vd.a(param3, "", "brassframe");
                        vl.field_b = vd.a(param3, "", "brassbutton");
                        qk.field_a = vd.a(param3, "", "brassslider");
                        ol.field_e = vd.a(param3, "aceofskies", "powerchutes");
                        nu.field_b = vd.a(param3, "aceofskies", "powericons");
                        tt.field_c = new vd[2];
                        tt.field_c[0] = vd.b(param3, "aceofskies", "glassbulb");
                        tt.field_c[1] = vd.b(param3, "aceofskies", "bulblight");
                        la.field_g = vd.a(param3, "", "achievements");
                        af.field_c = vd.a(param3, "", "medals");
                        vl.field_c = vd.b(param2, "basic", "orbcoin");
                        es.field_i = vd.b(param2, "basic", "locked");
                        uc.field_g = vd.b(param2, "basic", "unachieved");
                        break L0;
                      } else {
                        na.field_c[var4_int] = vd.b(param3, "aceofskies", "cloud" + var4_int);
                        var4_int++;
                        continue L4;
                      }
                    }
                  } else {
                    jd.field_d[var4_int] = vd.a(param3, "aceofskies", "plane" + var4_int);
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                oo.field_ab[var4_int] = vd.b(param3, "aceofskies", "background" + var4_int);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("pe.D(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    public final void remove() {
        if (!(null != this.field_f)) {
            throw new IllegalStateException();
        }
        this.field_f.c(-123);
        this.field_f = null;
    }

    public final Object next() {
        wf[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        wf var1 = null;
        int var2 = AceOfSkies.field_G ? 1 : 0;
        if (!(this.field_d == this.field_e.field_a[-1 + this.field_a])) {
            var1 = this.field_d;
            this.field_f = var1;
            this.field_d = var1.field_a;
            return var1;
        }
        do {
            if (this.field_a >= this.field_e.field_c) {
                return null;
            }
            fieldTemp$0 = this.field_e.field_a;
            fieldTemp$1 = this.field_a;
            this.field_a = this.field_a + 1;
            var1 = fieldTemp$0[fieldTemp$1].field_a;
        } while (this.field_e.field_a[-1 + this.field_a] == var1);
        this.field_f = var1;
        this.field_d = var1.field_a;
        return var1;
    }

    pe(lc param0) {
        this.field_f = null;
        try {
            this.field_e = param0;
            this.a(true);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 19592) {
            return;
        }
        field_c = null;
    }

    final static qm a(byte param0) {
        int var1 = 33 / ((14 - param0) / 58);
        if (!(ij.field_j != null)) {
            ij.field_j = new qm(oi.field_c, 20, 0, 0, 0, 11579568, -1, 0, 0, oi.field_c.field_I, -1, 2147483647, true);
        }
        return ij.field_j;
    }

    static {
        int var0 = 0;
        field_b = new gl[255];
        for (var0 = 0; field_b.length > var0; var0++) {
            field_b[var0] = new gl();
        }
        field_c = "This is a hidden Achievement";
    }
}
