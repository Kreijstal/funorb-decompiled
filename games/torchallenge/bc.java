/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bc implements j, gd {
    static boolean[][][] field_h;
    int field_e;
    static boolean[] field_l;
    static int field_d;
    int field_n;
    int field_a;
    private int field_m;
    int field_q;
    int field_p;
    int field_r;
    int field_i;
    int field_c;
    eg field_g;
    private boolean field_j;
    static int field_o;
    int field_k;
    int field_b;
    static ka field_f;

    public final int a(int param0) {
        if (param0 != -1) {
            return -82;
        }
        return ((bc) this).field_g.field_K + ((bc) this).field_g.field_x;
    }

    public final int a(ee param0, int param1, int param2) {
        if (param1 != 3) {
            field_l = null;
        }
        return this.b(-161, param0, param2, 0);
    }

    private final void a(int param0, ee param1, int param2, int param3) {
        this.a(param0, param1, 0, param2, 0, ((bc) this).field_k, 3, ((bc) this).field_m);
        if (param3 != 1703945953) {
            boolean discarded$0 = bc.a(6, 'ﾓ');
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, int param4, ee param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        qi var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        lg var17 = null;
        lg var18 = null;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        var16 = TorChallenge.field_F ? 1 : 0;
        if (param3 == param2) {
          return;
        } else {
          L0: {
            if (!param5.c(param0 + 86)) {
              break L0;
            } else {
              L1: {
                var17 = ((bc) this).a(117, param5);
                var18 = var17;
                if (param2 < param3) {
                  var9 = param3;
                  var8 = param2;
                  break L1;
                } else {
                  var8 = param3;
                  var9 = param2;
                  break L1;
                }
              }
              var10 = var18.a((byte) 7, var8);
              var11 = var18.a((byte) 7, var9);
              bc.a(param5.field_l + (param5.field_i + param1), param5.field_m + param4, param1 - -param5.field_i, param5.field_p + (param4 + param5.field_m), 1);
              var12 = var10;
              L2: while (true) {
                if (var12 > var11) {
                  ie.b((byte) -9);
                  break L0;
                } else {
                  L3: {
                    var13 = var17.field_a[var12];
                    if (var10 == var12) {
                      stackOut_11_0 = var18.a(-120, var8);
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = var13.field_g[0];
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_12_0;
                    if (var12 != var11) {
                      if (var13 != null) {
                        stackOut_16_0 = var13.field_g[var13.field_g.length + -1];
                        stackIn_17_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_17_0 = stackOut_15_0;
                        break L4;
                      }
                    } else {
                      stackOut_13_0 = var18.a(param0 ^ -105, var9);
                      stackIn_17_0 = stackOut_13_0;
                      break L4;
                    }
                  }
                  var15 = stackIn_17_0;
                  kl.field_e.a(4, var15 + -var14, ((bc) this).field_q, var13.field_e, param5.field_i + param1 - (-((bc) this).field_a + -param5.field_j - var13.field_d), this.a(param4, var14, param5, true), ((bc) this).field_q >>> -1778036840);
                  var12++;
                  continue L2;
                }
              }
            }
          }
          L5: {
            if (param0 == 3) {
              break L5;
            } else {
              ((bc) this).field_a = 64;
              break L5;
            }
          }
          return;
        }
    }

    private final int d(ee param0, byte param1) {
        if (param1 != -4) {
            Object var4 = null;
            int discarded$0 = ((bc) this).c((ee) null, (byte) -125);
        }
        return -((bc) this).field_a + param0.field_l - ((bc) this).field_b;
    }

    private final int b(int param0, ee param1, int param2, int param3) {
        if (param0 != -161) {
            Object var6 = null;
            ((bc) this).a(36, -6, (ee) null, -5, (byte) 77);
        }
        return param1.field_j + (param1.field_i + param2) + ((bc) this).field_a + param3;
    }

    public final int a(ee param0, byte param1) {
        if (param1 != -1) {
            ((bc) this).field_q = 60;
        }
        return -((bc) this).field_r + param0.field_p - ((bc) this).field_p;
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -115) {
            break L0;
          } else {
            field_l = null;
            break L0;
          }
        }
        L1: {
          L2: {
            param2 = df.a(param2, '_', "", (byte) 125);
            var3 = je.a(param1, 0);
            if (param2.indexOf(param1) != -1) {
              break L2;
            } else {
              if (-1 == param2.indexOf(var3)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    private final void b(int param0, ee param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TorChallenge.field_F ? 1 : 0;
          if (null != param1.field_t) {
            break L0;
          } else {
            param1.field_t = (lg) (Object) new fa();
            break L0;
          }
        }
        var3 = ((bc) this).a(param1, (byte) -1);
        var4 = this.d(param1, (byte) -4);
        if (param0 == 1299932129) {
          L1: {
            var6 = ((bc) this).field_i;
            if (var6 != 0) {
              if (2 == var6) {
                var5 = -((bc) this).field_g.field_K + var4;
                break L1;
              } else {
                L2: {
                  if ((var6 ^ -1) != -4) {
                    if (var6 == 1) {
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var5 = ((bc) this).field_g.field_x - -(var4 + (-((bc) this).field_g.field_x - ((bc) this).field_g.field_K) >> -2107289119);
                break L1;
              }
            } else {
              var5 = ((bc) this).field_g.field_x;
              break L1;
            }
          }
          L3: {
            L4: {
              var6 = ((bc) this).field_e;
              if (var6 != -1) {
                if (var6 != 3) {
                  if (-2 != var6) {
                    if (var6 != 2) {
                      break L3;
                    } else {
                      if (param1.field_t instanceof fa) {
                        ((fa) (Object) param1.field_t).a(((bc) this).field_g, ((bc) this).a(param1, param0 ^ -1299937693), var3, (byte) -9, var5);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    if (!(param1.field_t instanceof fa)) {
                      break L3;
                    } else {
                      ((fa) (Object) param1.field_t).a(((bc) this).field_g, ((bc) this).a(param1, -6782), var3 >> 1299932129, -25602, var5);
                      break L3;
                    }
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            }
            if (!(param1.field_t instanceof fa)) {
              break L3;
            } else {
              ((fa) (Object) param1.field_t).b(((bc) this).field_g, ((bc) this).a(param1, -6782), var5, -119, 0);
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    bc(eg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final void a(int param0, int param1, ee param2, int param3, byte param4) {
        lg var13 = null;
        lg var14 = null;
        int var7 = 0;
        qi var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (!(!param2.c(92))) {
            var13 = ((bc) this).a(-89, param2);
            var14 = var13;
            var7 = var14.a((byte) 7, param3);
            var8 = var13.field_a[var7];
            var9 = var14.a(-105, param3);
            var10 = this.a(param0, var9, param2, true);
            var11 = ((bc) this).a(param2, 3, param1) - -Math.max(0, var8.field_d);
            var12 = ((bc) this).a(param2, 3, param1) + Math.min(this.d(param2, (byte) -4), Math.min(var8.field_e, var14.field_a.length > 1 + var7 ? var13.field_a[1 + var7].field_d : var8.field_e));
            bc.a(param2.field_l + param1 - -param2.field_i, param2.field_m + param0, param2.field_i + param1, param2.field_p + (param2.field_m + param0), 1);
            kl.field_e.a(var10, var11, (byte) -106, var10, ((bc) this).field_c, var12);
            ie.b((byte) -9);
        }
        if (param4 <= 60) {
            ((bc) this).field_k = -55;
        }
    }

    String a(ee param0, int param1) {
        if (param1 != -6782) {
            return null;
        }
        return param0.field_v;
    }

    public final lg a(int param0, ee param1) {
        int var3 = -31 % ((param0 - 35) / 52);
        if (!(null != param1.field_t)) {
            param1.field_t = (lg) (Object) new fa();
        }
        if (!((bc) this).field_j) {
            this.b(1299932129, param1);
        } else {
            ((fa) (Object) param1.field_t).a(((bc) this).a(param1, (byte) -1), ((bc) this).field_n, ((bc) this).field_e, ((bc) this).a(param1, -6782), ((bc) this).field_g, this.d(param1, (byte) -4), -1, ((bc) this).field_i);
        }
        return param1.field_t;
    }

    public final int c(ee param0, byte param1) {
        lg discarded$5 = ((bc) this).a(-96, param0);
        if (param1 > -91) {
            Object var4 = null;
            int discarded$6 = ((bc) this).b((ee) null, (byte) -62);
        }
        return param0.field_t.b((byte) 57) + (((bc) this).field_r + ((bc) this).field_p);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 1) {
            return;
        }
        wb.b((byte) -118);
        qg.a(param1, param2, param3, param0);
    }

    final static boolean a(int param0, char param1) {
        if (Character.isISOControl(param1)) {
            return false;
        }
        if (param0 < 75) {
            return false;
        }
        if (ea.a(param1, -121)) {
            return true;
        }
        if (45 != param1) {
            if (param1 != 160) {
                if (param1 != 32) {
                    if (95 != param1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final int a(int param0, int param1, ee param2, byte param3, int param4, int param5) {
        int var7 = -53 / ((param3 - 13) / 38);
        lg discarded$0 = ((bc) this).a(-127, param2);
        return param2.field_t.a(-((bc) this).a(param5, param2, false) + param1, (byte) -77, -((bc) this).a(param2, 3, param4) + param0);
    }

    final void a(int param0, bc param1) {
        param1.field_b = ((bc) this).field_b;
        param1.field_c = ((bc) this).field_c;
        param1.field_e = ((bc) this).field_e;
        param1.field_j = ((bc) this).field_j;
        if (param0 >= -93) {
            Object var4 = null;
            int discarded$0 = this.d((ee) null, (byte) 49);
        }
        param1.field_i = ((bc) this).field_i;
        param1.field_a = ((bc) this).field_a;
        param1.field_k = ((bc) this).field_k;
        param1.field_q = ((bc) this).field_q;
        param1.field_n = ((bc) this).field_n;
        param1.field_m = ((bc) this).field_m;
        param1.field_r = ((bc) this).field_r;
        param1.field_g = ((bc) this).field_g;
        param1.field_p = ((bc) this).field_p;
    }

    public final int a(int param0, ee param1, boolean param2) {
        if (param2) {
            Object var5 = null;
            this.b(46, (ee) null);
        }
        return this.a(param0, 0, param1, !param2 ? true : false);
    }

    public static void a(byte param0) {
        field_f = null;
        field_h = null;
        field_l = null;
        if (param0 != 46) {
            boolean discarded$0 = bc.a(58, 'j');
        }
    }

    public void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        if (((bc) this).field_g == null) {
            return;
        }
        if (param3 != 97) {
            return;
        }
        this.a(param2, param0, param1, param3 ^ 1703945856);
    }

    public final int b(ee param0, byte param1) {
        lg discarded$0 = ((bc) this).a(-105, param0);
        int var3 = -23 / ((-65 - param1) / 49);
        return param0.field_t.a((byte) -63) + (((bc) this).field_a - -((bc) this).field_b);
    }

    private final void a(int param0, ee param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = TorChallenge.field_F ? 1 : 0;
          bc.a(param1.field_i + param3 - -param1.field_l, param1.field_m + param0, param3 + param1.field_i, param1.field_p + param1.field_m + param0, 1);
          var9 = ((bc) this).a(param1, (byte) -1);
          if (param6 == 3) {
            break L0;
          } else {
            ((bc) this).field_c = -22;
            break L0;
          }
        }
        L1: {
          var10 = this.d(param1, (byte) -4);
          if (((bc) this).field_j) {
            int discarded$1 = ((bc) this).field_g.a(((bc) this).a(param1, -6782), this.a(param0, param4, param1, true), this.b(-161, param1, param3, param2), var9, var10, param5, param7, ((bc) this).field_e, ((bc) this).field_i, ((bc) this).field_n);
            break L1;
          } else {
            L2: {
              var12 = ((bc) this).field_i;
              if (-1 == (var12 ^ -1)) {
                var11 = ((bc) this).field_g.field_x;
                break L2;
              } else {
                if (var12 != 2) {
                  L3: {
                    if ((var12 ^ -1) != -4) {
                      if (var12 == 1) {
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var11 = (-((bc) this).field_g.field_x + var10 + -((bc) this).field_g.field_K >> 931194145) + ((bc) this).field_g.field_x;
                  break L2;
                } else {
                  var11 = var10 + -((bc) this).field_g.field_K;
                  break L2;
                }
              }
            }
            L4: {
              var12 = ((bc) this).field_e;
              if (var12 == 0) {
                break L4;
              } else {
                if (var12 == 3) {
                  break L4;
                } else {
                  if (1 == var12) {
                    ((bc) this).field_g.a(((bc) this).a(param1, -6782), (var9 >> 1703945953) + this.a(param0, param4, param1, true), var11 + this.b(param6 + -164, param1, param3, param2), param5, param7);
                    break L1;
                  } else {
                    if (2 == var12) {
                      ((bc) this).field_g.b(((bc) this).a(param1, -6782), var9 + this.a(param0, param4, param1, true), this.b(param6 ^ -164, param1, param3, param2) + var11, param5, param7);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            ((bc) this).field_g.c(((bc) this).a(param1, -6782), this.a(param0, param4, param1, true), var11 + this.b(-161, param1, param3, param2), param5, param7);
            break L1;
          }
        }
        ie.b((byte) -9);
    }

    protected bc() {
    }

    private final int a(int param0, int param1, ee param2, boolean param3) {
        if (!param3) {
            return -62;
        }
        return param2.field_u + (((bc) this).field_r + param0 + (param2.field_m + param1));
    }

    bc(eg param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((bc) this).field_n = param9;
        ((bc) this).field_c = param10;
        ((bc) this).field_i = param8;
        ((bc) this).field_r = param1;
        ((bc) this).field_a = param3;
        ((bc) this).field_e = param7;
        ((bc) this).field_j = param12 ? true : false;
        ((bc) this).field_k = param5;
        ((bc) this).field_q = param11;
        ((bc) this).field_b = param4;
        ((bc) this).field_m = param6;
        ((bc) this).field_p = param2;
        ((bc) this).field_g = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new boolean[][][]{new boolean[7][], new boolean[7][], new boolean[7][]};
        field_d = 0;
        field_l = new boolean[]{false, false, false, false, false, false, true, true, true, true};
    }
}
