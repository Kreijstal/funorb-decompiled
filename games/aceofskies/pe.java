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
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 1) {
              if (param0.equals("B")) {
                stackIn_6_0 = Byte.TYPE;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!param0.equals("I")) {
                  if (param0.equals("S")) {
                    stackIn_13_0 = Short.TYPE;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!param0.equals("J")) {
                      if (param0.equals("Z")) {
                        stackIn_20_0 = Boolean.TYPE;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (param0.equals("F")) {
                          stackIn_24_0 = Float.TYPE;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (!param0.equals("D")) {
                            if (param0.equals("C")) {
                              stackIn_31_0 = Character.TYPE;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              return Class.forName(param0);
                            }
                          } else {
                            stackIn_27_0 = Double.TYPE;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    } else {
                      stackIn_16_0 = Long.TYPE;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_9_0 = Integer.TYPE;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = (Class) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var2);

            stackIn_34_1 = new StringBuilder().append("pe.A(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L1;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
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
        wf[] fieldTemp$4 = null;
        int fieldTemp$5 = 0;
        int var2;
        var2 = AceOfSkies.field_G ? 1 : 0;
        if (this.field_d != this.field_e.field_a[-1 + this.field_a]) {
          return true;
        } else {
          L0: while (true) {
            if (this.field_a >= this.field_e.field_c) {
              return false;
            } else {
              fieldTemp$4 = this.field_e.field_a;
              fieldTemp$5 = this.field_a;
              this.field_a = this.field_a + 1;
              if (fieldTemp$4[fieldTemp$5].field_a != this.field_e.field_a[this.field_a + -1]) {
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
        int var4_int = 0;
        int var5 = AceOfSkies.field_G ? 1 : 0;
        try {
            oo.field_ab = new vd[2];
            for (var4_int = 0; oo.field_ab.length > var4_int; var4_int++) {
                oo.field_ab[var4_int] = vd.b(param3, "aceofskies", "background" + var4_int);
            }
            jd.field_d = new vd[8][];
            for (var4_int = 0; (var4_int ^ -1) > -9; var4_int++) {
                jd.field_d[var4_int] = vd.a(param3, "aceofskies", "plane" + var4_int);
            }
            if (param1 <= 22) {
                field_c = (String) null;
            }
            na.field_c = new vd[1];
            for (var4_int = 0; -2 < (var4_int ^ -1); var4_int++) {
                na.field_c[var4_int] = vd.b(param3, "aceofskies", "cloud" + var4_int);
            }
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
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "pe.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
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
