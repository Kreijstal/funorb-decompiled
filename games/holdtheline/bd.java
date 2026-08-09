/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends cj {
    private ia field_U;
    static int field_S;
    private int field_N;
    static gn field_Q;
    static int[] field_R;
    private hj field_T;
    static int[] field_V;
    private String field_P;
    static int field_W;

    final boolean a(n param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -25823) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_V = (int[]) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("bd.NB(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        oc.field_c = null;
        lc.field_g = 0;
        tl.field_y = null;
        if (param1 != 8077) {
            field_Q = (gn) null;
            var2 = lg.field_e;
            lg.field_e = fh.field_g;
            fh.field_g = var2;
            if ((param0 ^ -1) != -52) {
                if (-51 == (param0 ^ -1)) {
                    ce.field_n.field_f = 5;
                    ce.field_n.field_c = ce.field_n.field_c + 1;
                    if (-3 < (ce.field_n.field_c ^ -1)) {
                        if (-3 >= (ce.field_n.field_c ^ -1)) {
                            if (!((param0 ^ -1) != -51)) {
                                return 5;
                            }
                        }
                        if (4 > ce.field_n.field_c) {
                            return -1;
                        }
                        return 1;
                    }
                    if (51 == param0) {
                        return 2;
                    }
                    if (-3 >= (ce.field_n.field_c ^ -1)) {
                        if (!((param0 ^ -1) != -51)) {
                            return 5;
                        }
                    }
                    if (4 > ce.field_n.field_c) {
                        return -1;
                    }
                    return 1;
                }
                ce.field_n.field_f = 1;
                ce.field_n.field_c = ce.field_n.field_c + 1;
                if (-3 < (ce.field_n.field_c ^ -1)) {
                    if (-3 >= (ce.field_n.field_c ^ -1)) {
                        if (!((param0 ^ -1) != -51)) {
                            return 5;
                        }
                    }
                    if (4 > ce.field_n.field_c) {
                        return -1;
                    }
                    return 1;
                }
                if (51 == param0) {
                    return 2;
                }
                if (-3 >= (ce.field_n.field_c ^ -1)) {
                    if (!((param0 ^ -1) != -51)) {
                        return 5;
                    }
                }
                if (4 > ce.field_n.field_c) {
                    return -1;
                }
                return 1;
            }
            ce.field_n.field_f = 2;
            ce.field_n.field_c = ce.field_n.field_c + 1;
            if (-3 < (ce.field_n.field_c ^ -1)) {
                if (-3 >= (ce.field_n.field_c ^ -1)) {
                    if (!((param0 ^ -1) != -51)) {
                        return 5;
                    }
                }
                if (4 > ce.field_n.field_c) {
                    return -1;
                }
                return 1;
            }
            if (51 == param0) {
                return 2;
            }
            if (-3 >= (ce.field_n.field_c ^ -1)) {
                if (!((param0 ^ -1) != -51)) {
                    return 5;
                }
            }
            if (4 <= ce.field_n.field_c) {
                return 1;
            }
            return -1;
        }
        var2 = lg.field_e;
        lg.field_e = fh.field_g;
        fh.field_g = var2;
        if ((param0 ^ -1) != -52) {
            if (-51 == (param0 ^ -1)) {
                ce.field_n.field_f = 5;
                ce.field_n.field_c = ce.field_n.field_c + 1;
                if (-3 >= (ce.field_n.field_c ^ -1) && 51 == param0) {
                    return 2;
                }
                if (-3 >= (ce.field_n.field_c ^ -1)) {
                    if ((param0 ^ -1) != -51) {
                        if (4 <= ce.field_n.field_c) {
                            return 1;
                        }
                        return -1;
                    }
                    return 5;
                }
                if (4 <= ce.field_n.field_c) {
                    return 1;
                }
                return -1;
            }
            ce.field_n.field_f = 1;
            ce.field_n.field_c = ce.field_n.field_c + 1;
            if (-3 >= (ce.field_n.field_c ^ -1) && 51 == param0) {
                return 2;
            }
            if (-3 >= (ce.field_n.field_c ^ -1)) {
                if ((param0 ^ -1) != -51) {
                    if (4 <= ce.field_n.field_c) {
                        return 1;
                    }
                    return -1;
                }
                return 5;
            }
            if (4 <= ce.field_n.field_c) {
                return 1;
            }
            return -1;
        }
        ce.field_n.field_f = 2;
        ce.field_n.field_c = ce.field_n.field_c + 1;
        if (-3 >= (ce.field_n.field_c ^ -1) && 51 == param0) {
            return 2;
        }
        if (-3 >= (ce.field_n.field_c ^ -1)) {
            if ((param0 ^ -1) != -51) {
                if (4 <= ce.field_n.field_c) {
                    return 1;
                }
                return -1;
            }
            return 5;
        }
        if (4 <= ce.field_n.field_c) {
            return 1;
        }
        return -1;
    }

    public static void a(boolean param0) {
        if (!param0) {
          bd.a(77, -61);
          field_V = null;
          field_Q = null;
          field_R = null;
          return;
        } else {
          field_V = null;
          field_Q = null;
          field_R = null;
          return;
        }
    }

    final String f(int param0) {
        if (param0 == 0) {
            return null;
        }
        field_S = -9;
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5;
        fd var6;
        int var13;
        vc var8;
        int var9;
        int var10;
        int var11;
        int var12;
        hj var15;
        hj var16;
        hj var17;
        hj var18;
        L0: {
          L1: {
            L2: {
              var13 = HoldTheLine.field_D;
              var6 = this.field_U.b(-7447);
              if (hh.field_d == var6) {
                break L2;
              } else {
                if (um.field_a == var6) {
                  break L2;
                } else {
                  var5 = this.field_U.b((byte) -59);
                  if (var5 == null) {
                    var5 = this.field_P;
                    break L1;
                  } else {
                    if (var5.equals(this.field_q)) {
                      break L0;
                    } else {
                      this.field_q = var5;
                      this.j(0);
                      break L0;
                    }
                  }
                }
              }
            }
            var5 = hg.field_N;
            break L1;
          }
          if (var5.equals(this.field_q)) {
            break L0;
          } else {
            this.field_q = var5;
            this.j(0);
            break L0;
          }
        }
        super.a(param0, param1, param2, param3);
        var6 = this.field_U.b(-7447);
        var8 = (vc) ((Object) this.field_l);
        var9 = this.field_k + param2;
        var10 = var8.a(-1337403295, (n) (this), param1) + (var8.a((byte) 20, (n) (this)).a(-93) >> -1538885919);
        if (hh.field_d == var6) {
          var18 = ef.field_i[0];
          var11 = var18.field_o << 1548729569;
          var12 = var18.field_v << 8149921;
          if (null != this.field_T) {
            if (var11 <= this.field_T.field_s) {
              if (this.field_T.field_y < var12) {
                this.field_T = new hj(var11, var12);
                hf.a(this.field_T, -1);
                var18.b(112, 144, var18.field_o << -1276764156, var18.field_v << 984784676, -this.field_N << 156687434, 4096);
                dm.b((byte) -10);
                this.field_T.b(-(var18.field_o >> 1172819553) + var9, -var18.field_v + var10, 256);
                return;
              } else {
                hf.a(this.field_T, -1);
                tc.c();
                var18.b(112, 144, var18.field_o << -1276764156, var18.field_v << 984784676, -this.field_N << 156687434, 4096);
                dm.b((byte) -10);
                this.field_T.b(-(var18.field_o >> 1172819553) + var9, -var18.field_v + var10, 256);
                return;
              }
            } else {
              this.field_T = new hj(var11, var12);
              hf.a(this.field_T, -1);
              var18.b(112, 144, var18.field_o << -1276764156, var18.field_v << 984784676, -this.field_N << 156687434, 4096);
              dm.b((byte) -10);
              this.field_T.b(-(var18.field_o >> 1172819553) + var9, -var18.field_v + var10, 256);
              return;
            }
          } else {
            this.field_T = new hj(var11, var12);
            hf.a(this.field_T, -1);
            var18.b(112, 144, var18.field_o << -1276764156, var18.field_v << 984784676, -this.field_N << 156687434, 4096);
            dm.b((byte) -10);
            this.field_T.b(-(var18.field_o >> 1172819553) + var9, -var18.field_v + var10, 256);
            return;
          }
        } else {
          if (var6 != um.field_a) {
            if (g.field_k == var6) {
              var15 = ef.field_i[2];
              var15.b(var9, var10 - (var15.field_y >> 1302600929), 256);
              return;
            } else {
              L3: {
                if (tg.field_d != var6) {
                  break L3;
                } else {
                  var16 = ef.field_i[1];
                  var16.b(var9, var10 + -(var16.field_y >> 332629249), 256);
                  break L3;
                }
              }
              return;
            }
          } else {
            var17 = ef.field_i[0];
            var11 = var17.field_o << 1548729569;
            var12 = var17.field_v << 8149921;
            if (null != this.field_T) {
              if (var11 <= this.field_T.field_s) {
                if (this.field_T.field_y < var12) {
                  this.field_T = new hj(var11, var12);
                  hf.a(this.field_T, -1);
                  var17.b(112, 144, var17.field_o << -1276764156, var17.field_v << 984784676, -this.field_N << 156687434, 4096);
                  dm.b((byte) -10);
                  this.field_T.b(-(var17.field_o >> 1172819553) + var9, -var17.field_v + var10, 256);
                  return;
                } else {
                  hf.a(this.field_T, -1);
                  tc.c();
                  var17.b(112, 144, var17.field_o << -1276764156, var17.field_v << 984784676, -this.field_N << 156687434, 4096);
                  dm.b((byte) -10);
                  this.field_T.b(-(var17.field_o >> 1172819553) + var9, -var17.field_v + var10, 256);
                  return;
                }
              } else {
                this.field_T = new hj(var11, var12);
                hf.a(this.field_T, -1);
                var17.b(112, 144, var17.field_o << -1276764156, var17.field_v << 984784676, -this.field_N << 156687434, 4096);
                dm.b((byte) -10);
                this.field_T.b(-(var17.field_o >> 1172819553) + var9, -var17.field_v + var10, 256);
                return;
              }
            } else {
              this.field_T = new hj(var11, var12);
              hf.a(this.field_T, -1);
              var17.b(112, 144, var17.field_o << -1276764156, var17.field_v << 984784676, -this.field_N << 156687434, 4096);
              dm.b((byte) -10);
              this.field_T.b(-(var17.field_o >> 1172819553) + var9, -var17.field_v + var10, 256);
              return;
            }
          }
        }
    }

    bd(ia param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, cj.k(105));
        try {
            this.field_P = param1;
            this.field_U = param0;
            this.a(param2, (byte) 122, param3, param5, param4);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "bd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static kk a(byte param0, ee param1, el param2, int param3) {
        kk var4 = null;
        RuntimeException var4_ref = null;
        kk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = mo.a(param3, 2931, param1, param2);
              if (param0 > 2) {
                break L1;
              } else {
                field_W = 35;
                break L1;
              }
            }
            rl.field_J.a((byte) -73, var4);
            stackIn_3_0 = (kk) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("bd.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static ui a(int param0, int param1, int param2, el param3) {
        RuntimeException var4 = null;
        ui stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 17405) {
                break L1;
              } else {
                bd.a(34, 10);
                break L1;
              }
            }
            stackIn_3_0 = lg.a(db.a(param3, 100, param1, param2), (byte) -68);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("bd.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, n param1, int param2, byte param3) {
        try {
            this.field_N = this.field_N + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "bd.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_R = new int[4];
        field_S = -20;
        field_V = new int[4];
    }
}
