/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends ub {
    private int field_m;
    private int field_f;
    private String field_k;
    static ci field_i;
    private boolean field_j;
    private int field_n;
    private int field_l;
    private int field_o;
    static hg field_g;
    private lh field_h;

    final void a(int param0, String param1, int param2, int param3, lh param4) {
        if (param1 == null) {
            ((ah) this).field_a = null;
            return;
        }
        if (param4 == ((ah) this).field_h) {
            if (((ah) this).field_j) {
                if (((ah) this).field_l == 1) {
                    if (null != ((ah) this).field_k) {
                        if (((ah) this).field_k.equals((Object) (Object) param1)) {
                            return;
                        }
                    }
                }
            }
        }
        ((ah) this).field_j = true;
        ((ah) this).field_h = param4;
        ((ah) this).field_l = 1;
        fj var8 = this.a(param3, -110, param4, param1);
        int var7 = param4.b(param1);
        var8.field_i[param0] = -(var7 >> -1191415391) + param2;
        var8.field_i[param1.length()] = param2 - -(var7 >> 584264737);
        me.a(param1, 0, var8, param4, (byte) 79);
    }

    private final fj a(int param0, int param1, lh param2, String param3) {
        if (param1 > -103) {
            ((ah) this).field_k = null;
        }
        fj var6 = new fj(param0 - param2.field_C, param0 + param2.field_t, param3.length());
        fj var5 = var6;
        ((ah) this).field_a = new fj[]{var6};
        return var5;
    }

    final static boolean a(String param0, int param1) {
        int var2 = -123 / ((param1 - 2) / 50);
        return null != mn.a(-1, param0) ? true : false;
    }

    final void a(String param0, int param1, lh param2, int param3, int param4) {
        if (param4 != 8829) {
            ((ah) this).field_l = -109;
        }
        if (!(param0 != null)) {
            ((ah) this).field_a = null;
            return;
        }
        if (((ah) this).field_h == param2) {
            if (((ah) this).field_j) {
                if (((ah) this).field_l == 0) {
                    if (null != ((ah) this).field_k) {
                        if (!(!((ah) this).field_k.equals((Object) (Object) param0))) {
                            return;
                        }
                    }
                }
            }
        }
        ((ah) this).field_h = param2;
        ((ah) this).field_l = 0;
        ((ah) this).field_j = true;
        ((ah) this).field_k = param0;
        fj var7 = this.a(param3, -125, param2, param0);
        fj var8 = var7;
        var7.field_i[0] = param1;
        var8.field_i[param0.length()] = param2.b(param0) + param1;
        me.a(param0, 0, var8, param2, (byte) 79);
    }

    final void a(int param0, int param1, int param2, String param3, lh param4) {
        if (param3 == null) {
            ((ah) this).field_a = null;
            return;
        }
        if (((ah) this).field_h == param4) {
            if (((ah) this).field_j) {
                if ((((ah) this).field_l ^ -1) == -3) {
                    if (null != ((ah) this).field_k) {
                        if (!(!((ah) this).field_k.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        ((ah) this).field_j = true;
        ((ah) this).field_l = 2;
        ((ah) this).field_h = param4;
        ((ah) this).field_k = param3;
        fj var8 = this.a(param1, -109, param4, param3);
        fj var9 = var8;
        var9.field_i[param0] = param2 + -param4.b(param3);
        var9.field_i[param3.length()] = param2;
        me.a(param3, 0, var9, param4, (byte) 79);
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, String param5, int param6, lh param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        fj var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        fj stackIn_32_0 = null;
        fj stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        fj stackIn_33_0 = null;
        fj stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        fj stackIn_34_0 = null;
        fj stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        String stackIn_36_0 = null;
        String stackIn_37_0 = null;
        String stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        fj stackOut_31_0 = null;
        fj stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        fj stackOut_33_0 = null;
        fj stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        fj stackOut_32_0 = null;
        fj stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        String stackOut_35_0 = null;
        String stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        String stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        L0: {
          var15 = Chess.field_G;
          if (param3 != 0) {
            break L0;
          } else {
            param3 = param7.field_q;
            break L0;
          }
        }
        if (param5 != null) {
          L1: {
            if (((ah) this).field_h != param7) {
              break L1;
            } else {
              if (((ah) this).field_j) {
                break L1;
              } else {
                if (param0 != ((ah) this).field_l) {
                  break L1;
                } else {
                  if (param4 != ((ah) this).field_m) {
                    break L1;
                  } else {
                    if (param3 != ((ah) this).field_n) {
                      break L1;
                    } else {
                      if (param2 != ((ah) this).field_f) {
                        break L1;
                      } else {
                        if (param6 != ((ah) this).field_o) {
                          break L1;
                        } else {
                          if (((ah) this).field_k == null) {
                            break L1;
                          } else {
                            if (!((ah) this).field_k.equals((Object) (Object) param5)) {
                              break L1;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L2: {
            ((ah) this).field_j = false;
            ((ah) this).field_k = param5;
            ((ah) this).field_o = param6;
            ((ah) this).field_f = param2;
            ((ah) this).field_m = param4;
            ((ah) this).field_h = param7;
            ((ah) this).field_l = param0;
            ((ah) this).field_n = param3;
            var16 = new String[param7.b(param5, param6) - -1];
            var17 = var16;
            var10 = Math.max(1, param7.a(param5, new int[1], var17));
            if (((ah) this).field_m != 3) {
              break L2;
            } else {
              if (-2 != var10) {
                break L2;
              } else {
                ((ah) this).field_m = 1;
                break L2;
              }
            }
          }
          L3: {
            if (((ah) this).field_m == 0) {
              var11 = param7.field_C;
              break L3;
            } else {
              if (-2 != ((ah) this).field_m) {
                if (-3 != (((ah) this).field_m ^ -1)) {
                  L4: {
                    var12 = (((ah) this).field_f - var10 * ((ah) this).field_n) / (1 + var10);
                    if (-1 < (var12 ^ -1)) {
                      var12 = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((ah) this).field_n = ((ah) this).field_n + var12;
                  var11 = var12 + param7.field_C;
                  break L3;
                } else {
                  var11 = -(var10 * ((ah) this).field_n) + (-param7.field_t + ((ah) this).field_f);
                  break L3;
                }
              } else {
                var11 = param7.field_C - -(-(((ah) this).field_n * var10) + ((ah) this).field_f >> 1864878849);
                break L3;
              }
            }
          }
          ((ah) this).field_a = new fj[var10];
          if (param1 >= 107) {
            var12 = 0;
            L5: while (true) {
              if (var12 >= var10) {
                return;
              } else {
                L6: {
                  var13 = var16[var12];
                  stackOut_31_0 = null;
                  stackOut_31_1 = null;
                  stackOut_31_2 = -param7.field_C + var11;
                  stackOut_31_3 = param7.field_t + var11;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  stackIn_33_2 = stackOut_31_2;
                  stackIn_33_3 = stackOut_31_3;
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  stackIn_32_2 = stackOut_31_2;
                  stackIn_32_3 = stackOut_31_3;
                  if (var13 != null) {
                    stackOut_33_0 = null;
                    stackOut_33_1 = null;
                    stackOut_33_2 = stackIn_33_2;
                    stackOut_33_3 = stackIn_33_3;
                    stackOut_33_4 = var13.length();
                    stackIn_34_0 = stackOut_33_0;
                    stackIn_34_1 = stackOut_33_1;
                    stackIn_34_2 = stackOut_33_2;
                    stackIn_34_3 = stackOut_33_3;
                    stackIn_34_4 = stackOut_33_4;
                    break L6;
                  } else {
                    stackOut_32_0 = null;
                    stackOut_32_1 = null;
                    stackOut_32_2 = stackIn_32_2;
                    stackOut_32_3 = stackIn_32_3;
                    stackOut_32_4 = 0;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_34_1 = stackOut_32_1;
                    stackIn_34_2 = stackOut_32_2;
                    stackIn_34_3 = stackOut_32_3;
                    stackIn_34_4 = stackOut_32_4;
                    break L6;
                  }
                }
                L7: {
                  new fj(stackIn_34_2, stackIn_34_3, stackIn_34_4);
                  var14 = (fj) (Object) stackIn_34_0;
                  var14.field_i[0] = 0;
                  if (var13 == null) {
                    break L7;
                  } else {
                    L8: {
                      var14.field_i[var13.length()] = param7.b(var13);
                      stackOut_35_0 = (String) var13;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_36_0 = stackOut_35_0;
                      if (param0 == 3) {
                        stackOut_37_0 = (String) (Object) stackIn_37_0;
                        stackOut_37_1 = ((ah) this).a(param7.b(var13), true, var13, param6);
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        break L8;
                      } else {
                        stackOut_36_0 = (String) (Object) stackIn_36_0;
                        stackOut_36_1 = 0;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        break L8;
                      }
                    }
                    me.a((String) (Object) stackIn_38_0, stackIn_38_1, var14, param7, (byte) 79);
                    break L7;
                  }
                }
                ((ah) this).field_a[var12] = var14;
                var11 = var11 + param3;
                var12++;
                continue L5;
              }
            }
          } else {
            return;
          }
        } else {
          ((ah) this).field_a = null;
          return;
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Chess.field_G;
        var2 = 0;
        L0: while (true) {
          if (var2 >= param0.length()) {
            if (param1 == -29) {
              return false;
            } else {
              field_i = null;
              return false;
            }
          } else {
            var3 = param0.charAt(var2);
            if (!b.a((char) var3, (byte) 104)) {
              if (!di.a(param1 + -20, (char) var3)) {
                return true;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    public static void d(byte param0) {
        field_g = null;
        if (param0 <= 48) {
            field_i = null;
        }
        field_i = null;
    }

    final static boolean a(byte param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        if (lk.a((byte) 95)) {
            ih.a(param4, param2, param3, -1);
            if (pi.field_d != null) {
                if (!(!pi.field_d.a(param5, param2, param4, param1, -11))) {
                    fi.a(-393711775);
                    param2 = false;
                }
            }
            ai.a(param2, 3, param4);
            kj.a(param2, param6, 4239);
            param2 = false;
        }
        int var7 = -87 % ((49 - param0) / 52);
        return param2;
    }

    public ah() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new hg(2, 4, 4, 0);
    }
}
