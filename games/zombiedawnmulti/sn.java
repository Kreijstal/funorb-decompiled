/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends cj {
    private int field_Qb;
    static String field_Yb;
    static String field_Zb;
    private int field_Pb;
    static String field_Ib;
    static String field_Mb;
    private int field_Wb;
    private int field_Ob;
    private cj field_Rb;
    static boolean field_Hb;
    static String field_Sb;
    private ja[] field_Ub;
    static int field_Lb;
    private int field_Kb;
    private cj field_Fb;
    private int[] field_Xb;
    private int field_Jb;
    static ja[] field_Nb;
    static String field_Gb;
    private int field_Vb;
    private mo[] field_Tb;

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int statePc = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (0 != this.field_Vb) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.field_Tb[this.field_Vb] = new mo(0L, (cj) null, (cj) null, this.field_Fb, (ja) null, bg.field_a);
                    this.field_Tb[this.field_Vb].field_lb = 1;
                    this.a((byte) 50, this.field_Tb[this.field_Vb]);
                    this.field_Xb[this.field_Vb] = -1;
                    this.field_Vb = this.field_Vb + 1;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6 = 0;
                    var7 = 0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var7 >= this.field_Vb) {
                        statePc = 11;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var8 = this.field_Tb[var7].a(this.field_Pb, false, this.field_Kb);
                    var13 = var6;
                    var12 = var8;
                    if (var11 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (var12 <= var13) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var12 == var13) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var6 = var8;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    var7++;
                    if (var11 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var6 = var6 + this.field_Jb * 2;
                    var7 = this.field_Qb + this.field_Qb + this.field_Vb * this.field_Wb;
                    if (param0 == 4542) {
                        statePc = 21;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    return;
                }
                case 13: {
                    var8 = qp.a(param1, (byte) 30, var6, param4);
                    var9 = br.a(true, param3, param2, var7);
                    this.a(var7, var9, var6, var8, -3344);
                    var10 = 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (this.field_Vb > var10) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    return;
                }
                case 17: {
                    this.field_Tb[var10].a(this.field_Kb, param0 + -4540, this.field_Wb, var6 - this.field_Jb * 2, this.field_Jb, this.field_Wb * var10 + this.field_Qb, this.field_Pb);
                    var10++;
                    if (var11 == 0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return;
                }
                case 19: {
                    if (var11 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                case 21: {
                    var8 = qp.a(param1, (byte) 30, var6, param4);
                    var9 = br.a(true, param3, param2, var7);
                    this.a(var7, var9, var6, var8, -3344);
                    var10 = 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (this.field_Vb > var10) {
                        statePc = 25;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    return;
                }
                case 25: {
                    this.field_Tb[var10].a(this.field_Kb, param0 + -4540, this.field_Wb, var6 - this.field_Jb * 2, this.field_Jb, this.field_Wb * var10 + this.field_Qb, this.field_Pb);
                    var10++;
                    if (var11 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    return;
                }
                case 27: {
                    if (var11 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int e(boolean param0, int param1) {
        int var3;
        int var4;
        String var5;
        int var6;
        int var7;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        this.a(-11838, param0);
        if (!param0) {
          return -2;
        } else {
          var3 = 0;
          L0: while (true) {
            L1: {
              if (this.field_Vb <= var3) {
                break L1;
              } else {
                var7 = this.field_Tb[var3].field_T;
                var6 = 0;
                if (var4 != 0) {
                  if (var6 == var7) {
                    if (kd.field_b != 0) {
                      return -1;
                    } else {
                      return this.field_Ob;
                    }
                  } else {
                    var5 = (String) null;
                    this.a((byte) 97, (String) null, -128);
                    if (kd.field_b != 0) {
                      return -1;
                    } else {
                      return this.field_Ob;
                    }
                  }
                } else {
                  if (var6 == var7) {
                    var3++;
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  } else {
                    return this.field_Xb[var3];
                  }
                }
              }
            }
            if (param1 == -1839469055) {
              if (kd.field_b != 0) {
                return -1;
              } else {
                return this.field_Ob;
              }
            } else {
              var5 = (String) null;
              this.a((byte) 97, (String) null, -128);
              if (kd.field_b != 0) {
                return -1;
              } else {
                return this.field_Ob;
              }
            }
          }
        }
    }

    sn(sn param0) {
        this(param0, param0.field_Ub, param0.field_Fb, param0.field_Rb, param0.field_Jb, param0.field_Pb, param0.field_Kb, param0.field_Qb, param0.field_Wb);
    }

    final boolean d(byte param0) {
        k var3;
        if (param0 >= 71) {
          if (1 != (this.field_Ob ^ -1)) {
            return false;
          } else {
            if (-14 == (sj.field_p ^ -1)) {
              this.field_Ob = -1;
              return true;
            } else {
              return true;
            }
          }
        } else {
          var3 = (k) null;
          sn.a(3, (k) null);
          if (1 != (this.field_Ob ^ -1)) {
            return false;
          } else {
            if (-14 != (sj.field_p ^ -1)) {
              return true;
            } else {
              this.field_Ob = -1;
              return true;
            }
          }
        }
    }

    public static void c(byte param0) {
        field_Zb = null;
        field_Sb = null;
        field_Gb = null;
        field_Yb = null;
        field_Mb = null;
        if (param0 < 112) {
          field_Nb = (ja[]) null;
          field_Ib = null;
          field_Nb = null;
          return;
        } else {
          field_Ib = null;
          field_Nb = null;
          return;
        }
    }

    final static void a(int param0, k param1) {
        int var2_int = 0;
        try {
            vn.field_e = param1.d((byte) 69) << -1312942235;
            var2_int = param1.g(param0 + 27315);
            ao.field_c = (var2_int & 7) << 1661435922;
            vn.field_e = vn.field_e + (var2_int >> 586295075);
            ao.field_c = ao.field_c + (param1.d((byte) 69) << -1069205950);
            var2_int = param1.g(31365);
            ao.field_c = ao.field_c + (var2_int >> 1168306726);
            jq.field_a = var2_int << 262229007 & 2064384;
            if (param0 != 4050) {
                sn.c((byte) 16);
            }
            jq.field_a = jq.field_a + (param1.g(31365) << -96414937);
            var2_int = param1.g(31365);
            qc.field_q = var2_int << -843569712 & 65536;
            jq.field_a = jq.field_a + (var2_int >> -1839469055);
            qc.field_q = qc.field_q + param1.d((byte) 69);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sn.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    sn(cj param0, ja[] param1, cj param2, cj param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        this.field_Ob = -2;
        this.field_Xb = new int[256];
        this.field_Tb = new mo[256];
        try {
            this.field_Rb = param3;
            this.field_Ub = param1;
            this.field_Qb = param7;
            this.field_Pb = param5;
            this.field_Wb = param8;
            this.field_Jb = param4;
            this.field_Fb = param2;
            this.field_Kb = param6;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(byte param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_Tb[this.field_Vb] = new mo(0L, (cj) null, (cj) null, this.field_Rb, (ja) null, param1);
              this.field_Tb[this.field_Vb].field_X = this.field_Ub;
              this.field_Tb[this.field_Vb].field_ib = true;
              this.field_Tb[this.field_Vb].field_lb = 1;
              this.a((byte) 50, this.field_Tb[this.field_Vb]);
              this.field_Xb[this.field_Vb] = param2;
              this.field_Vb = this.field_Vb + 1;
              if (param0 == -118) {
                break L1;
              } else {
                this.d((byte) 122);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("sn.GA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final void a(ja param0, int param1, String param2, boolean param3) {
        try {
            this.field_Tb[this.field_Vb] = new mo(0L, (cj) null, (cj) null, this.field_Rb, param0, param2);
            this.field_Tb[this.field_Vb].field_X = this.field_Ub;
            this.field_Tb[this.field_Vb].field_ib = param3 ? true : false;
            this.field_Tb[this.field_Vb].field_lb = 1;
            this.a((byte) 50, this.field_Tb[this.field_Vb]);
            this.field_Xb[this.field_Vb] = param1;
            this.field_Vb = this.field_Vb + 1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "sn.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_Sb = "You know what you want, they should too.";
        field_Yb = "EXCLUSIVE";
        field_Mb = "Achievements this game:";
        field_Gb = "Play rated game";
        field_Zb = "Back";
    }
}
