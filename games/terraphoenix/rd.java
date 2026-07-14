/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends ld {
    private int field_q;
    static boolean field_o;
    private String field_j;
    private int field_i;
    static ae field_s;
    static jj field_k;
    private int field_l;
    static int field_t;
    private pk field_n;
    private int field_m;
    private boolean field_p;
    private int field_r;

    final void a(int param0, int param1, pk param2, int param3, String param4) {
        if (!(param4 != null)) {
            ((rd) this).field_f = null;
            return;
        }
        if (param2 == ((rd) this).field_n) {
            if (((rd) this).field_p) {
                if (((rd) this).field_l == 2) {
                    if (null != ((rd) this).field_j) {
                        if (((rd) this).field_j.equals((Object) (Object) param4)) {
                            return;
                        }
                    }
                }
            }
        }
        ((rd) this).field_j = param4;
        ((rd) this).field_n = param2;
        ((rd) this).field_p = true;
        ((rd) this).field_l = 2;
        em var8 = this.a(param2, 125, param4, param0);
        em var9 = var8;
        if (param1 < 33) {
            return;
        }
        var9.field_d[0] = -param2.b(param4) + param3;
        var9.field_d[param4.length()] = param3;
        hb.a(param2, 0, 114, param4, var9);
    }

    private final em a(pk param0, int param1, String param2, int param3) {
        if (param1 <= 121) {
            ((rd) this).field_n = null;
        }
        em var6 = new em(-param0.field_s + param3, param0.field_p + param3, param2.length());
        em var5 = var6;
        ((rd) this).field_f = new em[]{var6};
        return var5;
    }

    public static void d(int param0) {
        field_s = null;
        if (param0 < 121) {
            return;
        }
        field_k = null;
    }

    final void a(int param0, pk param1, String param2, int param3, int param4) {
        if (param2 == null) {
            ((rd) this).field_f = null;
            return;
        }
        if (((rd) this).field_n == param1) {
            if (((rd) this).field_p) {
                if ((((rd) this).field_l ^ -1) == -2) {
                    if (((rd) this).field_j != null) {
                        if (!(!((rd) this).field_j.equals((Object) (Object) param2))) {
                            return;
                        }
                    }
                }
            }
        }
        ((rd) this).field_l = 1;
        ((rd) this).field_n = param1;
        ((rd) this).field_p = true;
        em var8 = this.a(param1, 122, param2, param3);
        int var7 = param1.b(param2);
        var8.field_d[0] = param0 + -(var7 >> 960877057);
        var8.field_d[param2.length()] = param0 + (var7 >> 221225569);
        hb.a(param1, 0, 49, param2, var8);
        if (param4 != 960877057) {
            field_t = 59;
        }
    }

    final void a(int param0, int param1, int param2, pk param3, int param4, String param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        em var15 = null;
        int var16 = 0;
        String[] var17 = null;
        String[] var18 = null;
        em stackIn_31_0 = null;
        em stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        int stackIn_31_3 = 0;
        em stackIn_32_0 = null;
        em stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        em stackIn_33_0 = null;
        em stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        int stackIn_33_4 = 0;
        pk stackIn_35_0 = null;
        pk stackIn_36_0 = null;
        pk stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        em stackOut_30_0 = null;
        em stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        int stackOut_30_3 = 0;
        em stackOut_32_0 = null;
        em stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        em stackOut_31_0 = null;
        em stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        int stackOut_31_4 = 0;
        pk stackOut_34_0 = null;
        pk stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        pk stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        L0: {
          var16 = Terraphoenix.field_V;
          if (param7 == 0) {
            param7 = param3.field_w;
            break L0;
          } else {
            break L0;
          }
        }
        if (param5 != null) {
          L1: {
            if (((rd) this).field_n != param3) {
              break L1;
            } else {
              if (((rd) this).field_p) {
                break L1;
              } else {
                if (((rd) this).field_l != param0) {
                  break L1;
                } else {
                  if (param1 != ((rd) this).field_i) {
                    break L1;
                  } else {
                    if (param7 != ((rd) this).field_q) {
                      break L1;
                    } else {
                      if (param2 != ((rd) this).field_m) {
                        break L1;
                      } else {
                        if (((rd) this).field_r != param6) {
                          break L1;
                        } else {
                          if (null == ((rd) this).field_j) {
                            break L1;
                          } else {
                            if (!((rd) this).field_j.equals((Object) (Object) param5)) {
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
            ((rd) this).field_i = param1;
            ((rd) this).field_m = param2;
            ((rd) this).field_n = param3;
            ((rd) this).field_p = false;
            ((rd) this).field_l = param0;
            ((rd) this).field_r = param6;
            ((rd) this).field_j = param5;
            ((rd) this).field_q = param7;
            var17 = new String[param3.c(param5, param6) - -1];
            var18 = var17;
            var10 = Math.max(1, param3.a(param5, new int[1], var18));
            if (((rd) this).field_i != 3) {
              break L2;
            } else {
              if (1 == var10) {
                ((rd) this).field_i = 1;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (((rd) this).field_i == 0) {
              var11 = param3.field_s;
              break L3;
            } else {
              if (1 != ((rd) this).field_i) {
                if (-3 == (((rd) this).field_i ^ -1)) {
                  var11 = -(var10 * ((rd) this).field_q) + (-param3.field_p + ((rd) this).field_m);
                  break L3;
                } else {
                  L4: {
                    var12 = (((rd) this).field_m + -(((rd) this).field_q * var10)) / (var10 + 1);
                    if (var12 >= 0) {
                      break L4;
                    } else {
                      var12 = 0;
                      break L4;
                    }
                  }
                  ((rd) this).field_q = ((rd) this).field_q + var12;
                  var11 = param3.field_s - -var12;
                  break L3;
                }
              } else {
                var11 = param3.field_s + (((rd) this).field_m - ((rd) this).field_q * var10 >> 2063189505);
                break L3;
              }
            }
          }
          var12 = 105 % ((-47 - param4) / 60);
          ((rd) this).field_f = new em[var10];
          var13 = 0;
          L5: while (true) {
            if (var13 >= var10) {
              return;
            } else {
              L6: {
                var14 = var17[var13];
                stackOut_30_0 = null;
                stackOut_30_1 = null;
                stackOut_30_2 = -param3.field_s + var11;
                stackOut_30_3 = param3.field_p + var11;
                stackIn_32_0 = stackOut_30_0;
                stackIn_32_1 = stackOut_30_1;
                stackIn_32_2 = stackOut_30_2;
                stackIn_32_3 = stackOut_30_3;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                stackIn_31_2 = stackOut_30_2;
                stackIn_31_3 = stackOut_30_3;
                if (var14 == null) {
                  stackOut_32_0 = null;
                  stackOut_32_1 = null;
                  stackOut_32_2 = stackIn_32_2;
                  stackOut_32_3 = stackIn_32_3;
                  stackOut_32_4 = 0;
                  stackIn_33_0 = stackOut_32_0;
                  stackIn_33_1 = stackOut_32_1;
                  stackIn_33_2 = stackOut_32_2;
                  stackIn_33_3 = stackOut_32_3;
                  stackIn_33_4 = stackOut_32_4;
                  break L6;
                } else {
                  stackOut_31_0 = null;
                  stackOut_31_1 = null;
                  stackOut_31_2 = stackIn_31_2;
                  stackOut_31_3 = stackIn_31_3;
                  stackOut_31_4 = var14.length();
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  stackIn_33_2 = stackOut_31_2;
                  stackIn_33_3 = stackOut_31_3;
                  stackIn_33_4 = stackOut_31_4;
                  break L6;
                }
              }
              L7: {
                new em(stackIn_33_2, stackIn_33_3, stackIn_33_4);
                var15 = stackIn_33_0;
                var15.field_d[0] = 0;
                if (var14 == null) {
                  break L7;
                } else {
                  L8: {
                    var15.field_d[var14.length()] = param3.b(var14);
                    stackOut_34_0 = (pk) param3;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_35_0 = stackOut_34_0;
                    if (3 == param0) {
                      stackOut_36_0 = (pk) (Object) stackIn_36_0;
                      stackOut_36_1 = ((rd) this).a(var14, true, param6, param3.b(var14));
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      break L8;
                    } else {
                      stackOut_35_0 = (pk) (Object) stackIn_35_0;
                      stackOut_35_1 = 0;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      break L8;
                    }
                  }
                  hb.a(stackIn_37_0, stackIn_37_1, 43, var14, var15);
                  break L7;
                }
              }
              var11 = var11 + param7;
              ((rd) this).field_f[var13] = var15;
              var13++;
              continue L5;
            }
          }
        } else {
          ((rd) this).field_f = null;
          return;
        }
    }

    final void a(int param0, pk param1, int param2, String param3, byte param4) {
        if (param3 == null) {
            ((rd) this).field_f = null;
            return;
        }
        if (param1 == ((rd) this).field_n) {
            if (((rd) this).field_p) {
                if (0 == ((rd) this).field_l) {
                    if (null != ((rd) this).field_j) {
                        if (!(!((rd) this).field_j.equals((Object) (Object) param3))) {
                            return;
                        }
                    }
                }
            }
        }
        if (param4 != -112) {
            ((rd) this).field_q = 89;
        }
        ((rd) this).field_j = param3;
        ((rd) this).field_n = param1;
        ((rd) this).field_p = true;
        ((rd) this).field_l = 0;
        em var7 = this.a(param1, 123, param3, param2);
        em var8 = var7;
        var7.field_d[0] = param0;
        var8.field_d[param3.length()] = param1.b(param3) + param0;
        hb.a(param1, 0, 59, param3, var8);
    }

    final static Boolean b(byte param0) {
        Boolean var1 = ge.field_d;
        if (param0 < 14) {
            field_k = null;
        }
        ge.field_d = null;
        return var1;
    }

    public rd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = false;
        field_k = new jj();
    }
}
