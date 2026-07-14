/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sq extends gn {
    static int field_R;
    private String[] field_M;
    private th field_T;
    static boolean field_N;
    static int field_S;
    private wi field_V;
    static int field_Q;
    static int field_O;
    static int[] field_U;
    static String field_P;

    final static void a(int param0, int param1, int param2, int param3, ja param4, int param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ja var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        L0: {
          var19 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param6 >= oo.field_f) {
            break L0;
          } else {
            param1 = param1 - (oo.field_f - param6);
            param6 = oo.field_f;
            break L0;
          }
        }
        L1: {
          if (param7 < oo.field_e) {
            param3 = param3 - (oo.field_e - param7);
            param7 = oo.field_e;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (oo.field_g < param6 - -param1) {
            param1 = oo.field_g - param6;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (oo.field_d < param7 + param3) {
            param3 = -param7 + oo.field_d;
            break L3;
          } else {
            break L3;
          }
        }
        if (-1 <= (param1 ^ -1)) {
          return;
        } else {
          if (param3 > 0) {
            L4: {
              var21 = param4.c();
              var32 = oo.field_i;
              if (param0 == 5) {
                break L4;
              } else {
                sq.g(-57);
                break L4;
              }
            }
            var10 = oo.field_b;
            var11 = oo.field_l;
            var30 = new int[4];
            oo.a(var30);
            param4.a();
            oo.e(var30[0], var30[1], var30[2], var30[3]);
            var13 = param6 + param7 * param4.field_x;
            var14 = param4.field_x + -param1;
            var31 = var21.field_B;
            var28 = var31;
            var25 = var28;
            var22 = var25;
            var15 = var22;
            var16 = param7;
            L5: while (true) {
              if (param3 + param7 <= var16) {
                var21.g(-param4.field_r, -param4.field_y);
                oo.a(var32, var10, var11);
                oo.b(var30);
                return;
              } else {
                var17 = param6;
                L6: while (true) {
                  if (var17 >= param6 - -param1) {
                    var13 = var13 + var14;
                    var16++;
                    continue L5;
                  } else {
                    var18 = var31[var13];
                    if (var18 != 0) {
                      L7: {
                        L8: {
                          if (0 >= var17) {
                            break L8;
                          } else {
                            if (-1 == var15[-1 + var13]) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (-1 >= var16) {
                            break L9;
                          } else {
                            if (0 == var15[var13 - param4.field_x]) {
                              break L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (param4.field_x + -1 <= var17) {
                            break L10;
                          } else {
                            if (var15[var13 - -1] == 0) {
                              break L7;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if (-1 + param4.field_w > var16) {
                          if (var15[var13 - -param4.field_x] == 0) {
                            break L7;
                          } else {
                            var13++;
                            var17++;
                            continue L6;
                          }
                        } else {
                          var13++;
                          var17++;
                          continue L6;
                        }
                      }
                      oo.d(var17, var16, param2, param5);
                      var13++;
                      var17++;
                      continue L6;
                    } else {
                      var13++;
                      var17++;
                      continue L6;
                    }
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = -((sq) this).field_y + param2;
        int var6 = -((sq) this).field_i + param3;
        wi var7 = this.a((byte) 23, var5, var6);
        if (var7 != null) {
            if (null != ((sq) this).field_A) {
                ((co) (Object) ((sq) this).field_A).a(param1, (sq) this, -38, var7.field_l);
            }
        }
    }

    private final wi a(byte param0, int param1, int param2) {
        wi var4 = null;
        wi var5 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = (wi) (Object) ((sq) this).field_T.c(105);
        if (param0 == 23) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (wi) (Object) ((sq) this).field_T.b(6);
                  continue L0;
                } else {
                  L2: {
                    if (var5.field_k > param1) {
                      break L2;
                    } else {
                      if (param2 < var5.field_f) {
                        break L2;
                      } else {
                        if (param1 >= var5.field_j + var5.field_k) {
                          break L2;
                        } else {
                          if (param2 > var5.field_n + var5.field_f) {
                            break L2;
                          } else {
                            return var4;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_i;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    void a(int param0, cf param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0 ^ 0, param1, param2, param3);
        if (param0 != -5407) {
            Object var7 = null;
            ((sq) this).a(93, (cf) null, 109, -90);
        }
        ((sq) this).field_V = null;
        if (!(!((sq) this).field_l)) {
            var5 = bd.field_g - (param2 + ((sq) this).field_y);
            var6 = bo.field_d + (-param3 - ((sq) this).field_i);
            ((sq) this).field_V = this.a((byte) 23, var5, var6);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (param2 != -4) {
            field_S = 74;
        }
        ((sq) this).b(param3, param1, param2 ^ -28976, param0, ((rk) (Object) ((sq) this).field_h).a((byte) 39, (cf) this));
    }

    final void a(byte param0) {
        int var2 = 0;
        rk var3 = null;
        mp var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        wi var10 = null;
        int var11 = 0;
        td var12 = null;
        int var13 = 0;
        int var14 = 0;
        wi var15 = null;
        int var16 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var16 = ZombieDawnMulti.field_E ? 1 : 0;
          ((sq) this).field_T = new th();
          var2 = 0;
          if (param0 == 94) {
            break L0;
          } else {
            ((sq) this).a((byte) -110);
            break L0;
          }
        }
        var3 = (rk) (Object) ((sq) this).field_h;
        var4 = var3.a((cf) this, -102);
        L1: while (true) {
          var5 = ((sq) this).field_j.indexOf("<hotspot=", var2);
          if ((var5 ^ -1) != 0) {
            var7 = ((sq) this).field_j.indexOf(">", var5);
            var6 = ((sq) this).field_j.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((sq) this).field_j.indexOf("</hotspot>", var5);
            var8 = var4.a((byte) -126, var5);
            var9 = var4.a((byte) -126, var2);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var9 < var11) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_e[var11];
                  if (var8 == var11) {
                    stackOut_9_0 = var4.a(52224, var5);
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = var12.field_e[0];
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_10_0;
                  if (var9 == var11) {
                    stackOut_14_0 = var4.a(52224, var2);
                    stackIn_15_0 = stackOut_14_0;
                    break L4;
                  } else {
                    if (var12 == null) {
                      stackOut_13_0 = 0;
                      stackIn_15_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = var12.field_e[-1 + var12.field_e.length];
                      stackIn_15_0 = stackOut_12_0;
                      break L4;
                    }
                  }
                }
                L5: {
                  var14 = stackIn_15_0;
                  var15 = new wi(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a(0), var12.field_h - var12.field_d));
                  if (var10 != null) {
                    var10.field_i = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = var15;
                ((sq) this).field_T.a((br) (Object) var15, false);
                var11++;
                continue L2;
              }
            }
          } else {
            return;
          }
        }
    }

    public static void f(int param0) {
        field_P = null;
        if (param0 != 2) {
            field_R = -124;
        }
        field_U = null;
    }

    String d(byte param0) {
        if (null == ((sq) this).field_V) {
            return null;
        }
        if (((sq) this).field_M == null) {
            return null;
        }
        if (((sq) this).field_M.length <= ((sq) this).field_V.field_l) {
            return null;
        }
        int var2 = 95 / ((53 - param0) / 57);
        return ((sq) this).field_M[((sq) this).field_V.field_l];
    }

    boolean a(cf param0, int param1) {
        if (param1 != 0) {
            ((sq) this).a((byte) 97);
        }
        return false;
    }

    sq(String param0, nl param1) {
        super(param0, (bj) null);
        ((sq) this).field_V = null;
        ((sq) this).field_h = param1;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (0 != param2) {
            return;
        }
        rk var5 = (rk) (Object) ((sq) this).field_h;
        wi var6 = ((sq) this).field_V;
        if (var6 != null) {
            var7 = var5.a(false, param3, (cf) this);
            var8 = var5.a((cf) this, 0, param1);
            do {
                hl.a(-2 + var6.field_f + var8, var7 - (-var6.field_k + 2), (byte) 126, var6.field_j + 2, 2 + var6.field_n);
                var6 = var6.field_i;
            } while (var6 != null);
        }
    }

    final void a(int param0, byte param1, String param2) {
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != ((sq) this).field_M) {
            // if_icmplt L87
        }
        String[] var7 = new String[1 + param0];
        String[] var4 = var7;
        if (!(((sq) this).field_M == null)) {
            for (var5 = 0; var5 < ((sq) this).field_M.length; var5++) {
                var7[var5] = ((sq) this).field_M[var5];
            }
        }
        ((sq) this).field_M = var4;
        if (param1 > -101) {
            return;
        }
        ((sq) this).field_M[param0] = param2;
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        ((sq) this).a((byte) 94);
    }

    final static void g(int param0) {
        int var1 = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        pd var9 = null;
        int var10 = 0;
        int stackIn_17_0 = 0;
        String stackIn_22_0 = null;
        int stackIn_26_0 = 0;
        String stackIn_32_0 = null;
        int stackIn_37_0 = 0;
        String stackIn_37_1 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        pd stackIn_43_0 = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        String stackOut_21_0 = null;
        String stackOut_20_0 = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        int stackOut_36_0 = 0;
        String stackOut_36_1 = null;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        pd stackOut_42_0 = null;
        pd stackOut_41_0 = null;
        L0: {
          var10 = ZombieDawnMulti.field_E ? 1 : 0;
          var1 = ce.field_k;
          var2 = 0;
          if (ho.field_q == 2) {
            var3_long = bl.a((byte) 49) + -so.field_s;
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (var2 > -1) {
              var2 = 0;
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (hq.field_m.length <= var3) {
            var3 = -59 % ((param0 - 38) / 57);
            return;
          } else {
            L2: {
              var4 = wd.field_Q[var3];
              if (-1 <= var4) {
                if (var4 != aq.field_B.field_d) {
                  var5 = hp.field_k;
                  break L2;
                } else {
                  var5 = fq.field_n;
                  break L2;
                }
              } else {
                var5 = qh.field_e;
                break L2;
              }
            }
            L3: {
              var6 = hq.field_m[var3];
              if (-3 != (ho.field_q ^ -1)) {
                break L3;
              } else {
                if (var2 != 1) {
                  break L3;
                } else {
                  L4: {
                    if (aa.field_n.length < q.field_a.length) {
                      stackOut_16_0 = q.field_a.length;
                      stackIn_17_0 = stackOut_16_0;
                      break L4;
                    } else {
                      stackOut_15_0 = aa.field_n.length;
                      stackIn_17_0 = stackOut_15_0;
                      break L4;
                    }
                  }
                  L5: {
                    var7 = stackIn_17_0;
                    if ((var3 ^ -1) > -7) {
                      break L5;
                    } else {
                      if (var3 >= 6 - -var7) {
                        break L5;
                      } else {
                        L6: {
                          if (0 > -6 + var3 - (-aa.field_n.length + var7)) {
                            stackOut_21_0 = "";
                            stackIn_22_0 = stackOut_21_0;
                            break L6;
                          } else {
                            stackOut_20_0 = aa.field_n[var3 - (6 + (-aa.field_n.length + var7))];
                            stackIn_22_0 = stackOut_20_0;
                            break L6;
                          }
                        }
                        var6_ref = stackIn_22_0;
                        break L5;
                      }
                    }
                  }
                  L7: {
                    if (ud.field_N.length <= ik.field_a.length) {
                      stackOut_25_0 = ik.field_a.length;
                      stackIn_26_0 = stackOut_25_0;
                      break L7;
                    } else {
                      stackOut_24_0 = ud.field_N.length;
                      stackIn_26_0 = stackOut_24_0;
                      break L7;
                    }
                  }
                  var8 = stackIn_26_0;
                  if (7 + var7 > var3) {
                    break L3;
                  } else {
                    if (var7 + 7 - -var8 > var3) {
                      L8: {
                        if (ik.field_a.length > -var7 + -7 + var3) {
                          stackOut_31_0 = ik.field_a[-7 + var3 + -var7];
                          stackIn_32_0 = stackOut_31_0;
                          break L8;
                        } else {
                          stackOut_30_0 = "";
                          stackIn_32_0 = stackOut_30_0;
                          break L8;
                        }
                      }
                      var6_ref = stackIn_32_0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            L9: {
              if (1 == (var4 ^ -1)) {
                var6_ref = Integer.toString(var2);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              stackOut_36_0 = 0;
              stackOut_36_1 = (String) var6_ref;
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              if (var4 < 0) {
                stackOut_38_0 = stackIn_38_0;
                stackOut_38_1 = (String) (Object) stackIn_38_1;
                stackOut_38_2 = 0;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                stackIn_39_2 = stackOut_38_2;
                break L10;
              } else {
                stackOut_37_0 = stackIn_37_0;
                stackOut_37_1 = (String) (Object) stackIn_37_1;
                stackOut_37_2 = 1;
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_39_2 = stackOut_37_2;
                break L10;
              }
            }
            L11: {
              var7 = hn.a(stackIn_39_0, stackIn_39_1, stackIn_39_2 != 0);
              var8 = am.field_c + -(var7 >> -909100255);
              if ((var4 ^ -1) > -1) {
                break L11;
              } else {
                L12: {
                  var1 = var1 + al.field_bb;
                  if (var4 != aq.field_B.field_d) {
                    stackOut_42_0 = mc.field_a;
                    stackIn_43_0 = stackOut_42_0;
                    break L12;
                  } else {
                    stackOut_41_0 = en.field_d;
                    stackIn_43_0 = stackOut_41_0;
                    break L12;
                  }
                }
                L13: {
                  var9 = stackIn_43_0;
                  if (var9 != null) {
                    var9.a(var1, -no.field_Gb + var8, var7 - -(no.field_Gb << 472381537), me.field_h + (wk.field_G << -36687903), 12018);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                var1 = var1 + wk.field_G;
                break L11;
              }
            }
            if (-1 >= (var4 ^ -1)) {
              m.field_C.c(var6_ref, var8, var1 + nc.field_h, var5, -1);
              var1 = var1 + (al.field_bb + (wk.field_G - -me.field_h));
              var3++;
              continue L1;
            } else {
              uq.field_f.c(var6_ref, var8, var1 + bf.field_g, var5, -1);
              var1 = var1 + se.field_C;
              var3++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, ja[] param1, boolean param2) {
        int var4 = 0;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          fa.field_Qb[param0] = param1;
          if (!param2) {
            break L0;
          } else {
            sq.f(-7);
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 == param0) {
              break L2;
            } else {
              L3: {
                if ((param0 ^ -1) == -5) {
                  break L3;
                } else {
                  L4: {
                    if (1 == param0) {
                      break L4;
                    } else {
                      L5: {
                        if ((param0 ^ -1) != -3) {
                          break L5;
                        } else {
                          qc.a(0, (byte) -126, param1, 63, 3);
                          qc.a(0, (byte) -126, param1, 62, 4);
                          qc.a(0, (byte) -126, param1, 61, 1);
                          qc.a(0, (byte) -126, param1, 60, 2);
                          qc.a(0, (byte) -126, param1, 59, 5);
                          qc.a(0, (byte) -126, param1, 58, 6);
                          qc.a(0, (byte) -126, param1, 57, 7);
                          qc.a(0, (byte) -126, param1, 56, 8);
                          qc.a(3, (byte) -126, param1, 55, 3);
                          qc.a(3, (byte) -126, param1, 54, 4);
                          qc.a(3, (byte) -126, param1, 53, 1);
                          qc.a(3, (byte) -126, param1, 52, 2);
                          qc.a(3, (byte) -126, param1, 51, 5);
                          qc.a(3, (byte) -126, param1, 50, 6);
                          qc.a(3, (byte) -126, param1, 49, 7);
                          qc.a(3, (byte) -126, param1, 48, 8);
                          qc.a(0, (byte) -126, param1, 47, 0);
                          qc.a(3, (byte) -126, param1, 46, 0);
                          qc.a(15, (byte) -126, param1, 45, 2);
                          qc.a(15, (byte) -126, param1, 44, 1);
                          if (0 == 0) {
                            break L1;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (param0 == 3) {
                        qc.a(4, (byte) -126, param1, 63, 3);
                        qc.a(4, (byte) -126, param1, 62, 4);
                        qc.a(4, (byte) -126, param1, 61, 1);
                        qc.a(4, (byte) -126, param1, 60, 2);
                        qc.a(4, (byte) -126, param1, 59, 5);
                        qc.a(4, (byte) -126, param1, 58, 6);
                        qc.a(4, (byte) -126, param1, 57, 7);
                        qc.a(4, (byte) -126, param1, 56, 8);
                        qc.a(4, (byte) -126, param1, 55, 0);
                        qc.a(5, (byte) -126, param1, 52, 0);
                        qc.a(12, (byte) -126, param1, 51, 2);
                        qc.a(12, (byte) -126, param1, 50, 1);
                        qc.a(26, (byte) -126, param1, 49, 2);
                        qc.a(26, (byte) -126, param1, 48, 1);
                        qc.a(26, (byte) -126, param1, 47, 8);
                        qc.a(26, (byte) -126, param1, 46, 5);
                        qc.a(26, (byte) -126, param1, 45, 6);
                        qc.a(26, (byte) -126, param1, 44, 7);
                        qc.a(6, (byte) -126, param1, 43, 2);
                        qc.a(6, (byte) -126, param1, 42, 1);
                        qc.a(12, (byte) -126, param1, 41, 5);
                        qc.a(12, (byte) -126, param1, 40, 8);
                        qc.a(12, (byte) -126, param1, 39, 4);
                        qc.a(12, (byte) -126, param1, 38, 3);
                        qc.a(29, (byte) -126, param1, 37, 2);
                        qc.a(29, (byte) -126, param1, 36, 0);
                        qc.a(26, (byte) -126, param1, 23, 4);
                        qc.a(12, (byte) -126, param1, 22, 6);
                        qc.a(12, (byte) -126, param1, 21, 7);
                        if (0 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  qc.a(2, (byte) -126, param1, 63, 2);
                  qc.a(2, (byte) -126, param1, 62, 1);
                  qc.a(2, (byte) -126, param1, 61, 5);
                  qc.a(2, (byte) -126, param1, 60, 6);
                  qc.a(2, (byte) -126, param1, 59, 8);
                  qc.a(2, (byte) -126, param1, 58, 7);
                  qc.a(2, (byte) -126, param1, 57, 4);
                  qc.a(3, (byte) -126, param1, 56, 2);
                  qc.a(3, (byte) -126, param1, 55, 1);
                  qc.a(3, (byte) -126, param1, 54, 5);
                  qc.a(3, (byte) -126, param1, 53, 6);
                  qc.a(3, (byte) -126, param1, 52, 8);
                  qc.a(3, (byte) -126, param1, 51, 7);
                  qc.a(3, (byte) -126, param1, 50, 0);
                  qc.a(2, (byte) -126, param1, 49, 3);
                  qc.a(0, (byte) -126, param1, 48, 1);
                  qc.a(0, (byte) -126, param1, 47, 2);
                  qc.a(9, (byte) -126, param1, 46, 3);
                  if (0 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              qc.a(0, (byte) -126, param1, 79, 3);
              qc.a(0, (byte) -126, param1, 78, 4);
              qc.a(0, (byte) -126, param1, 77, 1);
              qc.a(0, (byte) -126, param1, 76, 2);
              qc.a(0, (byte) -126, param1, 75, 5);
              qc.a(0, (byte) -126, param1, 74, 6);
              qc.a(0, (byte) -126, param1, 73, 7);
              qc.a(0, (byte) -126, param1, 72, 8);
              qc.a(0, (byte) -126, param1, 71, 0);
              if (0 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          param1[6].a();
          oo.e(0, 0, 24, 24, 0);
          qc.a(2, (byte) -126, param1, 79, 3);
          qc.a(2, (byte) -126, param1, 78, 4);
          qc.a(2, (byte) -126, param1, 77, 1);
          qc.a(2, (byte) -126, param1, 76, 2);
          qc.a(2, (byte) -126, param1, 75, 5);
          qc.a(2, (byte) -126, param1, 74, 6);
          qc.a(2, (byte) -126, param1, 73, 7);
          qc.a(2, (byte) -126, param1, 72, 8);
          qc.a(0, (byte) -126, param1, 71, 3);
          qc.a(0, (byte) -126, param1, 70, 4);
          qc.a(0, (byte) -126, param1, 69, 1);
          qc.a(0, (byte) -126, param1, 68, 2);
          qc.a(0, (byte) -126, param1, 67, 5);
          qc.a(0, (byte) -126, param1, 66, 6);
          qc.a(0, (byte) -126, param1, 65, 7);
          qc.a(0, (byte) -126, param1, 64, 8);
          qc.a(7, (byte) -126, param1, 61, 2);
          qc.a(7, (byte) -126, param1, 60, 1);
          qc.a(7, (byte) -126, param1, 59, 5);
          qc.a(7, (byte) -126, param1, 58, 6);
          qc.a(7, (byte) -126, param1, 57, 7);
          qc.a(7, (byte) -126, param1, 56, 8);
          qc.a(24, (byte) -126, param1, 55, 2);
          qc.a(24, (byte) -126, param1, 54, 1);
          qc.a(24, (byte) -126, param1, 53, 5);
          qc.a(2, (byte) -126, param1, 63, 0);
          qc.a(0, (byte) -126, param1, 62, 0);
          break L1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = true;
        field_S = 0;
        field_P = "Quick Chat lobby";
        field_U = new int[256];
    }
}
