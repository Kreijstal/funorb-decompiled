/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hd implements de, lg {
    qe field_f;
    int field_e;
    int field_c;
    int field_a;
    int field_k;
    private int field_n;
    int field_o;
    int field_b;
    int field_h;
    static String[] field_g;
    int field_d;
    private boolean field_l;
    int field_j;
    static String field_i;
    int field_m;
    static boolean field_p;

    private final void a(int param0, uj param1, byte param2, int param3) {
        this.a(param0, param3, 0, param1, ((hd) this).field_c, 0, 26296, ((hd) this).field_n);
        if (param2 >= -97) {
            ((hd) this).field_b = 76;
        }
    }

    hd(qe param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final void a(int param0, uj param1, int param2, int param3, int param4) {
        bd var13 = null;
        bd var14 = null;
        int var7 = 0;
        nh var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param0 != -3) {
            field_p = true;
        }
        if (param1.d(true)) {
            var13 = ((hd) this).a(param1, (byte) -41);
            var14 = var13;
            var7 = var14.a(param4, 0);
            var8 = var13.field_d[var7];
            var9 = var14.a((byte) -30, param4);
            var10 = this.a(param1, var9, (byte) 125, param2);
            var11 = ((hd) this).a((byte) -95, param1, param3) + Math.max(0, var8.field_g);
            var12 = ((hd) this).a((byte) -42, param1, param3) + Math.min(this.a(true, param1), Math.min(var8.field_c, var14.field_d.length <= var7 + 1 ? var8.field_c : var13.field_d[1 + var7].field_g));
            cl.a(true, param1.field_j + param3 + param1.field_f, param1.field_s + param2, param1.field_j + param3, param1.field_i + param1.field_s + param2);
            eh.field_j.a(((hd) this).field_j, var10, var11, var12, var10, false);
            wf.a(-82);
        }
    }

    private final int a(uj param0, int param1, byte param2, int param3) {
        if (param2 != 125) {
            ((hd) this).field_d = -27;
        }
        return param0.field_s + (param3 - -((hd) this).field_d) + (param0.field_n - -param1);
    }

    public final bd a(uj param0, byte param1) {
        if (!(null != param0.field_m)) {
            param0.field_m = (bd) (Object) new se();
        }
        if (((hd) this).field_l) {
            ((se) (Object) param0.field_m).a((byte) 104, ((hd) this).field_f, ((hd) this).field_h, ((hd) this).b(105, param0), this.a(true, param0), ((hd) this).field_a, ((hd) this).field_k, ((hd) this).a(param0, false));
        } else {
            this.c(0, param0);
        }
        if (param1 >= -36) {
            Object var4 = null;
            int discarded$0 = this.a(false, (uj) null);
        }
        return param0.field_m;
    }

    String a(uj param0, boolean param1) {
        if (param1) {
            return null;
        }
        return param0.field_k;
    }

    private final void a(int param0, int param1, int param2, uj param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = StarCannon.field_A;
          cl.a(true, param3.field_j + param1 - -param3.field_f, param3.field_s + param0, param3.field_j + param1, param3.field_s + (param0 + param3.field_i));
          var9 = ((hd) this).b(113, param3);
          var10 = this.a(true, param3);
          if (!((hd) this).field_l) {
            L1: {
              var12 = ((hd) this).field_a;
              if (var12 == 0) {
                var11 = ((hd) this).field_f.field_p;
                break L1;
              } else {
                if ((var12 ^ -1) != -3) {
                  L2: {
                    if ((var12 ^ -1) == -4) {
                      break L2;
                    } else {
                      if (1 == var12) {
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var11 = (-((hd) this).field_f.field_q + (var10 - ((hd) this).field_f.field_p) >> -103964319) + ((hd) this).field_f.field_p;
                  break L1;
                } else {
                  var11 = -((hd) this).field_f.field_q + var10;
                  break L1;
                }
              }
            }
            L3: {
              var12 = ((hd) this).field_h;
              if (var12 != 0) {
                if (3 == var12) {
                  break L3;
                } else {
                  if (1 != var12) {
                    if (var12 == 2) {
                      ((hd) this).field_f.c(((hd) this).a(param3, false), var9 + this.a(param3, param2, (byte) 125, param0), this.a(param3, param5, param1, false) + var11, param4, param7);
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    ((hd) this).field_f.b(((hd) this).a(param3, false), this.a(param3, param2, (byte) 125, param0) - -(var9 >> 1390790977), this.a(param3, param5, param1, false) - -var11, param4, param7);
                    break L0;
                  }
                }
              } else {
                break L3;
              }
            }
            ((hd) this).field_f.a(((hd) this).a(param3, false), this.a(param3, param2, (byte) 125, param0), this.a(param3, param5, param1, false) - -var11, param4, param7);
            break L0;
          } else {
            int discarded$1 = ((hd) this).field_f.a(((hd) this).a(param3, false), this.a(param3, param2, (byte) 125, param0), this.a(param3, param5, param1, false), var9, var10, param4, param7, ((hd) this).field_h, ((hd) this).field_a, ((hd) this).field_k);
            break L0;
          }
        }
        L4: {
          if (param6 == 26296) {
            break L4;
          } else {
            field_g = null;
            break L4;
          }
        }
        wf.a(param6 + -26355);
    }

    public final int a(int param0, uj param1) {
        bd discarded$6 = ((hd) this).a(param1, (byte) -119);
        if (param0 != 16293784) {
            ((hd) this).field_n = 62;
        }
        return param1.field_m.a(param0 ^ -16293862) - -((hd) this).field_e - -((hd) this).field_b;
    }

    public static void a(byte param0) {
        field_g = null;
        field_i = null;
        if (param0 != 125) {
            field_p = true;
        }
    }

    public final int a(int param0) {
        if (param0 != 0) {
            return -65;
        }
        return ((hd) this).field_f.field_q + ((hd) this).field_f.field_p;
    }

    public final int a(byte param0, uj param1, int param2) {
        if (param0 >= -31) {
            Object var5 = null;
            int discarded$0 = ((hd) this).b(13, (uj) null);
        }
        return this.a(param1, 0, param2, false);
    }

    public final int a(int param0, int param1, uj param2, int param3, int param4, boolean param5) {
        if (!param5) {
            Object var8 = null;
            ((hd) this).a(-92, (hd) null);
        }
        bd discarded$0 = ((hd) this).a(param2, (byte) -85);
        return param2.field_m.a(-((hd) this).a(param2, (byte) 12, param3) + param0, (byte) 19, -((hd) this).a((byte) -61, param2, param4) + param1);
    }

    public void a(int param0, boolean param1, int param2, int param3, uj param4) {
        if (!(null != ((hd) this).field_f)) {
            return;
        }
        this.a(param0, param4, (byte) -114, param3);
        int var6 = 78 % ((param2 - 2) / 54);
    }

    private final int a(uj param0, int param1, int param2, boolean param3) {
        if (param3) {
            ((hd) this).field_n = -81;
        }
        return param1 + param2 + (param0.field_j - (-((hd) this).field_e - param0.field_q));
    }

    public final int a(uj param0, int param1) {
        bd discarded$6 = ((hd) this).a(param0, (byte) -103);
        if (param1 != -26557) {
            Object var4 = null;
            int discarded$7 = ((hd) this).a(50, (uj) null);
        }
        return param0.field_m.c(119) - (-((hd) this).field_d - ((hd) this).field_o);
    }

    private final void c(int param0, uj param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = StarCannon.field_A;
          if (param1.field_m == null) {
            param1.field_m = (bd) (Object) new se();
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param0 == 0) {
            break L1;
          } else {
            var8 = null;
            this.c(114, (uj) null);
            break L1;
          }
        }
        L2: {
          var3 = ((hd) this).b(108, param1);
          var4 = this.a(true, param1);
          var6 = ((hd) this).field_a;
          if (var6 == 0) {
            var5 = ((hd) this).field_f.field_p;
            break L2;
          } else {
            if (-3 != (var6 ^ -1)) {
              L3: {
                if (var6 == 3) {
                  break L3;
                } else {
                  if (1 == var6) {
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              var5 = (-((hd) this).field_f.field_q + (-((hd) this).field_f.field_p + var4) >> 579360673) + ((hd) this).field_f.field_p;
              break L2;
            } else {
              var5 = -((hd) this).field_f.field_q + var4;
              break L2;
            }
          }
        }
        L4: {
          L5: {
            var6 = ((hd) this).field_h;
            if (var6 != 0) {
              if (3 != var6) {
                if (1 == var6) {
                  if (!(param1.field_m instanceof se)) {
                    break L4;
                  } else {
                    ((se) (Object) param1.field_m).a(((hd) this).field_f, ((hd) this).a(param1, false), 466572161, var3 >> -1785899327, var5);
                    break L4;
                  }
                } else {
                  if (2 == var6) {
                    if (!(param1.field_m instanceof se)) {
                      break L4;
                    } else {
                      ((se) (Object) param1.field_m).a(((hd) this).a(param1, false), var3, (byte) 127, var5, ((hd) this).field_f);
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
              } else {
                break L5;
              }
            } else {
              break L5;
            }
          }
          if (!(param1.field_m instanceof se)) {
            break L4;
          } else {
            ((se) (Object) param1.field_m).a(var5, 0, (byte) 111, ((hd) this).a(param1, false), ((hd) this).field_f);
            break L4;
          }
        }
    }

    final void a(int param0, hd param1) {
        param1.field_j = ((hd) this).field_j;
        param1.field_e = ((hd) this).field_e;
        param1.field_m = ((hd) this).field_m;
        param1.field_l = ((hd) this).field_l;
        param1.field_c = ((hd) this).field_c;
        param1.field_a = ((hd) this).field_a;
        param1.field_b = ((hd) this).field_b;
        param1.field_k = ((hd) this).field_k;
        param1.field_o = ((hd) this).field_o;
        param1.field_h = ((hd) this).field_h;
        param1.field_f = ((hd) this).field_f;
        param1.field_d = ((hd) this).field_d;
        if (param0 >= -17) {
            ((hd) this).field_n = 34;
        }
        param1.field_n = ((hd) this).field_n;
    }

    public final int a(uj param0, byte param1, int param2) {
        if (param1 != 12) {
            Object var5 = null;
            String discarded$0 = ((hd) this).a((uj) null, true);
        }
        return this.a(param0, 0, (byte) 125, param2);
    }

    protected hd() {
    }

    private final int a(boolean param0, uj param1) {
        if (!param0) {
            Object var4 = null;
            int discarded$0 = ((hd) this).a((byte) -63, (uj) null, 80);
        }
        return -((hd) this).field_b + param1.field_f + -((hd) this).field_e;
    }

    public final int b(int param0, uj param1) {
        if (param0 < 74) {
            ((hd) this).field_h = -39;
        }
        return param1.field_i + -((hd) this).field_d - ((hd) this).field_o;
    }

    public final void a(int param0, int param1, int param2, uj param3, byte param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        nh var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        bd var17 = null;
        bd var18 = null;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        var16 = StarCannon.field_A;
        if (param5 == param2) {
          return;
        } else {
          if (param4 > 54) {
            L0: {
              if (param3.d(true)) {
                L1: {
                  var17 = ((hd) this).a(param3, (byte) -104);
                  var18 = var17;
                  if (param5 < param2) {
                    var8 = param5;
                    var9 = param2;
                    break L1;
                  } else {
                    var8 = param2;
                    var9 = param5;
                    break L1;
                  }
                }
                var10 = var18.a(var8, 0);
                var11 = var18.a(var9, 0);
                cl.a(true, param3.field_f + param0 + param3.field_j, param1 + param3.field_s, param0 - -param3.field_j, param3.field_s + param1 + param3.field_i);
                var12 = var10;
                L2: while (true) {
                  if (var12 > var11) {
                    wf.a(-76);
                    break L0;
                  } else {
                    L3: {
                      var13 = var17.field_d[var12];
                      if (var12 == var10) {
                        stackOut_14_0 = var18.a((byte) -30, var8);
                        stackIn_15_0 = stackOut_14_0;
                        break L3;
                      } else {
                        stackOut_13_0 = var13.field_d[0];
                        stackIn_15_0 = stackOut_13_0;
                        break L3;
                      }
                    }
                    L4: {
                      var14 = stackIn_15_0;
                      if (var12 == var11) {
                        stackOut_19_0 = var18.a((byte) -30, var9);
                        stackIn_20_0 = stackOut_19_0;
                        break L4;
                      } else {
                        if (var13 == null) {
                          stackOut_18_0 = 0;
                          stackIn_20_0 = stackOut_18_0;
                          break L4;
                        } else {
                          stackOut_17_0 = var13.field_d[-1 + var13.field_d.length];
                          stackIn_20_0 = stackOut_17_0;
                          break L4;
                        }
                      }
                    }
                    var15 = stackIn_20_0;
                    eh.field_j.a(((hd) this).field_m >>> 16293784, ((hd) this).field_m, var13.field_g + param3.field_q + ((hd) this).field_e + (param0 + param3.field_j), -var14 + var15, this.a(param3, var14, (byte) 125, param1), var13.field_c, (byte) 113);
                    var12++;
                    continue L2;
                  }
                }
              } else {
                break L0;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    hd(qe param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((hd) this).field_c = param5;
        ((hd) this).field_o = param2;
        ((hd) this).field_m = param11;
        ((hd) this).field_l = param12 ? true : false;
        ((hd) this).field_k = param9;
        ((hd) this).field_j = param10;
        ((hd) this).field_b = param4;
        ((hd) this).field_h = param7;
        ((hd) this).field_e = param3;
        ((hd) this).field_d = param1;
        ((hd) this).field_a = param8;
        ((hd) this).field_f = param0;
        ((hd) this).field_n = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_i = "Reload game";
    }
}
