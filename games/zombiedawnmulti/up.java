/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class up implements Iterator {
    private int field_a;
    static cj field_g;
    private br field_b;
    static ja field_f;
    static int field_d;
    private wh field_h;
    static String field_c;
    private br field_e;

    public final void remove() {
        if (null == this.field_b) {
            throw new IllegalStateException();
        }
        this.field_b.a(true);
        this.field_b = null;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        pd var9 = null;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_12_0 = 0;
        pd stackIn_17_0 = null;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        pd stackOut_16_0 = null;
        pd stackOut_15_0 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1_int = mc.field_e - ch.field_i;
            ch.field_i = aq.field_x - (var1_int >> -1147096319);
            mc.field_e = ch.field_i - -var1_int;
            eb.field_M = pm.field_Q + -(pl.field_F >> -1997436479);
            var2 = eb.field_M;
            var3 = 0;
            L1: while (true) {
              L2: {
                if (var3 >= eo.field_e.length) {
                  stackOut_25_0 = -17;
                  stackOut_25_1 = (param0 - -59) / 46;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  break L2;
                } else {
                  var4 = dn.field_a[var3];
                  stackOut_3_0 = -1;
                  stackOut_3_1 = var4 ^ -1;
                  stackIn_26_0 = stackOut_3_0;
                  stackIn_26_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (var10 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (stackIn_4_0 < stackIn_4_1) {
                          break L4;
                        } else {
                          L5: {
                            if (var4 == mo.field_Jb.field_d) {
                              break L5;
                            } else {
                              var5 = sb.field_c;
                              if (var10 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var5 = ua.field_N;
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var5 = kk.field_x;
                      break L3;
                    }
                    L6: {
                      var6 = eo.field_e[var3];
                      if ((var4 ^ -1) > -1) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        break L6;
                      } else {
                        stackOut_10_0 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        break L6;
                      }
                    }
                    L7: {
                      var7 = vh.a(stackIn_12_0 != 0, -76, var6);
                      var8 = -(var7 >> 518455937) + aq.field_x;
                      if (-1 >= (var4 ^ -1)) {
                        L8: {
                          var2 = var2 + pb.field_b;
                          if (var4 == mo.field_Jb.field_d) {
                            stackOut_16_0 = vk.field_I;
                            stackIn_17_0 = stackOut_16_0;
                            break L8;
                          } else {
                            stackOut_15_0 = li.field_E;
                            stackIn_17_0 = stackOut_15_0;
                            break L8;
                          }
                        }
                        L9: {
                          var9 = stackIn_17_0;
                          if (var9 != null) {
                            var9.a(var2, -wb.field_db + var8, (wb.field_db << -1309194655) + var7, (ne.field_tb << 1954103137) + po.field_n, 12018);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var2 = var2 + ne.field_tb;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L10: {
                      L11: {
                        if (-1 < (var4 ^ -1)) {
                          break L11;
                        } else {
                          wn.field_u.c(var6, var8, var2 - -tk.field_n, var5, -1);
                          var2 = var2 + (po.field_n + (pb.field_b + ne.field_tb));
                          if (var10 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      e.field_c.c(var6, var8, mg.field_H + var2, var5, -1);
                      var2 = var2 + dq.field_l;
                      break L10;
                    }
                    var3++;
                    continue L1;
                  }
                }
              }
              var4 = stackIn_26_0 / stackIn_26_1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "up.C(" + param0 + ')');
        }
    }

    public final Object next() {
        br[] fieldTemp$2 = null;
        int fieldTemp$3 = 0;
        int var2 = 0;
        br var3 = null;
        br var4 = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_h.field_a[-1 + this.field_a] == this.field_e) {
          L0: while (true) {
            if (this.field_a < this.field_h.field_d) {
              fieldTemp$2 = this.field_h.field_a;
              fieldTemp$3 = this.field_a;
              this.field_a = this.field_a + 1;
              var3 = fieldTemp$2[fieldTemp$3].field_d;
              if (this.field_h.field_a[this.field_a - 1] == var3) {
                if (var2 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              } else {
                this.field_e = var3.field_d;
                this.field_b = var3;
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = this.field_e;
          this.field_e = var4.field_d;
          this.field_b = var4;
          return var4;
        }
    }

    final static void a(boolean param0) {
        cj stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        cj stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        cj stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        cj stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        cj stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        cj stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        L0: {
          stackOut_0_0 = dm.field_ac;
          stackOut_0_1 = 18;
          stackOut_0_2 = 0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          if (!tb.field_u) {
            stackOut_2_0 = (cj) ((Object) stackIn_2_0);
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            break L0;
          } else {
            stackOut_1_0 = (cj) ((Object) stackIn_1_0);
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = 40 + (2 + (qa.field_o - -2));
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            break L0;
          }
        }
        ((cj) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, -stackIn_3_3 + pd.field_b.field_zb, 0, -3344);
        mo.field_Hb.a(18, 0, 42 + qa.field_o, -2 + (pd.field_b.field_zb + (-qa.field_o - 40)), -3344);
        if (param0) {
          field_g = (cj) null;
          hf.field_e.a(qa.field_o, 2, pd.field_b.field_zb, 0, pd.field_b.field_z + -20, -31465, 20);
          return;
        } else {
          hf.field_e.a(qa.field_o, 2, pd.field_b.field_zb, 0, pd.field_b.field_z + -20, -31465, 20);
          return;
        }
    }

    public final boolean hasNext() {
        br[] fieldTemp$2 = null;
        int fieldTemp$3 = 0;
        int var2 = 0;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_h.field_a[-1 + this.field_a] == this.field_e) {
          L0: while (true) {
            if (this.field_a < this.field_h.field_d) {
              fieldTemp$2 = this.field_h.field_a;
              fieldTemp$3 = this.field_a;
              this.field_a = this.field_a + 1;
              if (fieldTemp$2[fieldTemp$3].field_d == this.field_h.field_a[-1 + this.field_a]) {
                this.field_e = this.field_h.field_a[-1 + this.field_a];
                if (var2 == 0) {
                  continue L0;
                } else {
                  this.field_e = this.field_h.field_a[this.field_a - 1].field_d;
                  return true;
                }
              } else {
                this.field_e = this.field_h.field_a[this.field_a - 1].field_d;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static String a(int param0) {
        int var1 = 57 % ((param0 - 77) / 49);
        if (cb.field_l) {
            return null;
        }
        if (l.field_a < um.field_h) {
            return null;
        }
        if (!(br.field_a + um.field_h <= l.field_a)) {
            return kg.field_k;
        }
        return null;
    }

    private final void c(int param0) {
        this.field_e = this.field_h.field_a[0].field_d;
        this.field_a = param0;
        this.field_b = null;
    }

    public static void a(byte param0) {
        field_g = null;
        field_f = null;
        field_c = null;
        if (param0 < -8) {
            return;
        }
        field_d = -60;
    }

    up(wh param0) {
        this.field_b = null;
        try {
            this.field_h = param0;
            this.c(1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "up.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Go!";
    }
}
