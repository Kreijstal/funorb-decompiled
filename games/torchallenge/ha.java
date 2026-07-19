/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    private da[] field_e;
    private int field_b;
    private da field_f;
    static int field_d;
    private da field_c;
    private int field_a;

    final static int a(int param0, int param1, int param2) {
        int discarded$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_8_0 = 0;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 <= -21) {
                break L1;
              } else {
                discarded$2 = ha.a(-128, -24, 80);
                break L1;
              }
            }
            var3_int = 0;
            var4 = jl.field_e;
            L2: while (true) {
              if (gf.field_s.length <= var3_int) {
                stackOut_14_0 = -1;
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = dl.field_s[var3_int];
                  if ((var5 ^ -1) > -1) {
                    var4 = var4 + ok.field_e;
                    break L3;
                  } else {
                    var6 = ki.a((byte) -18, true, gf.field_s[var3_int]);
                    var7 = -(var6 >> -1485722847) + dg.field_ab;
                    var4 = var4 + uc.field_Y;
                    if (kg.a((byte) -121, var4, var6 - -(ni.field_i << -369282527), var7 + -ni.field_i, param1, param0, (ai.field_a << -540477311) + sl.field_f)) {
                      stackOut_8_0 = var5;
                      stackIn_9_0 = stackOut_8_0;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var4 = var4 + (sl.field_f + (uc.field_Y + (ai.field_a << -939582943)));
                      break L3;
                    }
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "ha.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_15_0;
        }
    }

    final da a(int param0) {
        int discarded$4 = 0;
        int fieldTemp$5 = 0;
        int discarded$6 = 0;
        int fieldTemp$7 = 0;
        int var3 = 0;
        da var4 = null;
        da var5 = null;
        da var6 = null;
        da var9 = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (0 < this.field_a) {
          if (this.field_e[this.field_a - 1] == this.field_c) {
            L0: while (true) {
              if (this.field_a >= this.field_b) {
                if (param0 == -27377) {
                  return null;
                } else {
                  discarded$4 = ha.a(-111, 26, -58);
                  return null;
                }
              } else {
                fieldTemp$5 = this.field_a;
                this.field_a = this.field_a + 1;
                var4 = this.field_e[fieldTemp$5].field_f;
                var6 = var4;
                if (var4 == this.field_e[-1 + this.field_a]) {
                  continue L0;
                } else {
                  this.field_c = var6.field_f;
                  return var6;
                }
              }
            }
          } else {
            var9 = this.field_c;
            this.field_c = var9.field_f;
            return var9;
          }
        } else {
          L1: while (true) {
            if (this.field_a >= this.field_b) {
              if (param0 == -27377) {
                return null;
              } else {
                discarded$6 = ha.a(-111, 26, -58);
                return null;
              }
            } else {
              fieldTemp$7 = this.field_a;
              this.field_a = this.field_a + 1;
              var4 = this.field_e[fieldTemp$7].field_f;
              var5 = var4;
              if (var4 == this.field_e[-1 + this.field_a]) {
                continue L1;
              } else {
                this.field_c = var5.field_f;
                return var5;
              }
            }
          }
        }
    }

    ha(int param0) {
        da dupTemp$2 = null;
        int var2 = 0;
        da var3 = null;
        this.field_a = 0;
        this.field_b = param0;
        this.field_e = new da[param0];
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            dupTemp$2 = new da();
            var3 = dupTemp$2;
            this.field_e[var2] = dupTemp$2;
            var3.field_f = var3;
            var3.field_h = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final da a(byte param0) {
        if (param0 != -73) {
            return (da) null;
        }
        this.field_a = 0;
        return this.a(-27377);
    }

    final da a(byte param0, long param1) {
        da var4 = null;
        da var5 = null;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        var4 = this.field_e[(int)(param1 & (long)(-1 + this.field_b))];
        this.field_f = var4.field_f;
        L0: while (true) {
          if (var4 == this.field_f) {
            this.field_f = null;
            if (param0 >= 88) {
              return null;
            } else {
              this.field_e = (da[]) null;
              return null;
            }
          } else {
            if ((param1 ^ -1L) == (this.field_f.field_d ^ -1L)) {
              var5 = this.field_f;
              this.field_f = this.field_f.field_f;
              return var5;
            } else {
              this.field_f = this.field_f.field_f;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, da param1, long param2) {
        da var5 = null;
        try {
            if (param1.field_h != null) {
                param1.a(true);
            }
            var5 = this.field_e[(int)((long)(this.field_b - 1) & param2)];
            param1.field_h = var5.field_h;
            param1.field_f = var5;
            param1.field_h.field_f = param1;
            param1.field_f.field_h = param1;
            int var6 = 80 / ((-24 - param0) / 40);
            param1.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ha.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_d = 0;
    }
}
