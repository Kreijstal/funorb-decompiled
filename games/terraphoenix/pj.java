/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static int[] field_l;
    private int field_u;
    private int field_p;
    static bm field_q;
    private int field_o;
    private int field_k;
    private float field_r;
    static String field_v;
    private int field_i;
    private int field_m;
    private int field_s;
    private int field_e;
    private int field_g;
    static int field_t;
    private int field_c;
    private ni field_j;
    private int field_d;
    private int field_w;
    private int field_f;
    private boolean field_h;
    private int field_n;
    static int[] field_a;
    private int field_b;

    final void a(int param0) {
        int var2 = 91 % ((5 - param0) / 40);
        this.field_j.a(9887, this.field_e, this.field_m);
    }

    final boolean c(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 7468) {
          L0: {
            L1: {
              if (this.field_c > qb.field_g) {
                break L1;
              } else {
                if (-1 <= (me.field_o ^ -1)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        var2 = this.field_w;
        var3 = this.field_s;
        if (!this.c(7468)) {
          this.field_h = false;
          return;
        } else {
          L0: {
            if (this.field_b >= var3) {
              if (this.field_n > var3) {
                var3 = this.field_n;
                break L0;
              } else {
                break L0;
              }
            } else {
              var3 = this.field_b;
              break L0;
            }
          }
          L1: {
            if (this.field_k < var2) {
              var2 = this.field_k;
              break L1;
            } else {
              if (var2 < this.field_o) {
                var2 = this.field_o;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (this.field_r > 0.0f) {
              var4 = (int)(0.5f + (float)var3 * this.field_r);
              if (var2 >= var4) {
                if (var2 <= var4) {
                  break L2;
                } else {
                  var2 = var4;
                  break L2;
                }
              } else {
                var3 = (int)((float)var2 / this.field_r);
                break L2;
              }
            } else {
              break L2;
            }
          }
          L3: {
            if (param0 >= 75) {
              break L3;
            } else {
              this.b((byte) -11);
              break L3;
            }
          }
          L4: {
            L5: {
              if (var2 != ja.field_j) {
                break L5;
              } else {
                if (var3 != wc.field_p) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            this.field_j.a(9887, var3, var2);
            break L4;
          }
          L6: {
            if ((this.field_w ^ -1) >= -1) {
              break L6;
            } else {
              ng.field_v = (this.field_w - ja.field_j) / 2;
              break L6;
            }
          }
          return;
        }
    }

    final static oa a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        oa stackIn_3_0 = null;
        oa stackIn_7_0 = null;
        oa stackIn_16_0 = null;
        oa stackIn_19_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        oa stackOut_6_0 = null;
        oa stackOut_18_0 = null;
        oa stackOut_15_0 = null;
        oa stackOut_2_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            var2_int = param1.length();
            if (-1 != (var2_int ^ -1)) {
              if (var2_int > 63) {
                stackOut_6_0 = lg.field_j;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = 15 % ((44 - param0) / 54);
                var3 = 0;
                L1: while (true) {
                  if (var3 < var2_int) {
                    L2: {
                      var5 = param1.charAt(var3);
                      if (var5 != 45) {
                        if (0 != (ge.field_f.indexOf(var5) ^ -1)) {
                          break L2;
                        } else {
                          stackOut_18_0 = ge.field_a;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        L3: {
                          if (var3 == 0) {
                            break L3;
                          } else {
                            if (-1 + var2_int != var3) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackOut_15_0 = ge.field_a;
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    continue L1;
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_2_0 = b.field_f;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("pj.D(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              return stackIn_19_0;
            }
          }
        }
    }

    public static void d(int param0) {
        if (param0 <= 109) {
            return;
        }
        field_v = null;
        field_l = null;
        field_q = null;
        field_a = null;
    }

    final ck b(int param0) {
        this.field_m = ja.field_j;
        this.field_e = wc.field_p;
        this.field_j.a(9887, this.field_p, this.field_u);
        ai.field_h = false;
        ck var2 = jb.a(this.field_p, this.field_u, param0, 0, (byte) 109, nj.field_l);
        if (!(var2 != null)) {
            this.a(param0 + 97);
        }
        return var2;
    }

    final void a(byte param0) {
        int fieldTemp$1 = 0;
        if (a.field_b != null) {
          return;
        } else {
          L0: {
            if ((me.field_o ^ -1) < -1) {
              break L0;
            } else {
              this.field_h = false;
              break L0;
            }
          }
          if (!this.field_h) {
            L1: {
              if (this.field_w > ja.field_j) {
                ng.field_v = (this.field_w - ja.field_j) / 2;
                break L1;
              } else {
                if ((this.field_w ^ -1) < -1) {
                  ng.field_v = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (ja.field_j != this.field_g) {
                  break L3;
                } else {
                  if (this.field_d != wc.field_p) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_j.a(param0 + 9795, this.field_d, this.field_g);
              break L2;
            }
            return;
          } else {
            fieldTemp$1 = this.field_i - 1;
            this.field_i = this.field_i - 1;
            if (fieldTemp$1 <= 0) {
              L4: {
                if (param0 == 92) {
                  break L4;
                } else {
                  this.a((byte) 40);
                  break L4;
                }
              }
              this.field_i = this.field_f;
              if (qb.field_g >= this.field_c) {
                this.b((byte) 78);
                return;
              } else {
                this.field_h = false;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(byte param0, boolean param1, int param2, int param3, int param4) {
        if (param0 < 36) {
            pj.d(-99);
        }
        int var5 = 256 + -param2;
        int var6 = l.field_i[param4];
        int var7 = ((16711680 & param3) >> -1986506000) * param2 + var5 * (var6 >> 849544784 & 255) >> 201178408;
        int var8 = (255 & param3 >> 863857416) * param2 + var5 * ((65280 & var6) >> 41944136) >> -1204005816;
        int var9 = param2 * (param3 & 255) + var5 * (var6 & 255) >> 695670792;
        l.field_i[param4] = var9 + 65536 * var7 - -(var8 * 256);
    }

    final void a(byte param0, int param1, int param2) {
        this.field_s = param2;
        if (param0 <= 48) {
            this.b((byte) -79);
        }
        this.field_w = param1;
    }

    private pj() throws Throwable {
        throw new Error();
    }

    static {
        field_v = "RECRUIT";
        field_a = new int[8192];
    }
}
