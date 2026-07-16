/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf extends af {
    static boolean field_i;
    private boolean field_g;
    private int field_p;
    static bh field_n;
    private int field_h;
    private vd field_j;
    private String field_q;
    private int field_l;
    private int field_o;
    private int field_k;
    static lg field_f;
    static String field_m;

    private final fg a(String param0, int param1, int param2, vd param3) {
        if (param1 < 11) {
            return null;
        }
        fg var6 = new fg(-param3.field_M + param2, param3.field_B + param2, param0.length());
        fg var5 = var6;
        ((cf) this).field_d = new fg[]{var6};
        return var5;
    }

    final void a(int param0, byte param1, vd param2, int param3, String param4) {
        if (param4 == null) {
            ((cf) this).field_d = null;
            return;
        }
        if (((cf) this).field_j == param2) {
            if (((cf) this).field_g) {
                if ((((cf) this).field_k ^ -1) == -3) {
                    if (((cf) this).field_q != null) {
                        if (((cf) this).field_q.equals((Object) (Object) param4)) {
                            return;
                        }
                    }
                }
            }
        }
        ((cf) this).field_g = true;
        ((cf) this).field_q = param4;
        if (param1 > -58) {
            field_n = null;
        }
        ((cf) this).field_k = 2;
        ((cf) this).field_j = param2;
        fg var8 = this.a(param4, 108, param3, param2);
        fg var9 = var8;
        var9.field_e[0] = param0 + -param2.b(param4);
        var9.field_e[param4.length()] = param0;
        lk.a(-58, param2, 0, var9, param4);
    }

    public static void c(int param0) {
        field_n = null;
        field_m = null;
        if (param0 != 10881) {
            Object var2 = null;
            o[] discarded$0 = cf.a(53, -122, (kl) null, -97);
        }
        field_f = null;
    }

    final static void a(byte param0) {
        if (param0 != 79) {
            field_n = null;
        }
        da.h(0);
    }

    final void a(vd param0, String param1, int param2, boolean param3, int param4) {
        if (!(param1 != null)) {
            ((cf) this).field_d = null;
            return;
        }
        if (((cf) this).field_j == param0) {
            if (((cf) this).field_g) {
                if (-2 == (((cf) this).field_k ^ -1)) {
                    if (((cf) this).field_q != null) {
                        if (!(!((cf) this).field_q.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        ((cf) this).field_g = param3 ? true : false;
        ((cf) this).field_k = 1;
        ((cf) this).field_j = param0;
        fg var8 = this.a(param1, 46, param4, param0);
        int var7 = param0.b(param1);
        var8.field_e[0] = -(var7 >> -1179862623) + param2;
        var8.field_e[param1.length()] = param2 - -(var7 >> -50344095);
        lk.a(90, param0, 0, var8, param1);
    }

    final static wc a(int param0, boolean param1) {
        mg var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        mg var8 = null;
        ac var9 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int[] stackOut_23_0 = null;
        Object stackOut_22_0 = null;
        L0: {
          var7 = wizardrun.field_H;
          if (param0 == -2) {
            break L0;
          } else {
            field_f = null;
            break L0;
          }
        }
        L1: {
          var8 = nk.field_N;
          var2 = var8;
          var3 = var8.f(255);
          dj.field_e = 127 & var3;
          if (-1 == (var3 & 128 ^ -1)) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          rb.field_a = stackIn_5_0 != 0;
          il.field_a = var8.f(255);
          ug.field_N = var8.e((byte) 0);
          if ((dj.field_e ^ -1) == -3) {
            wh.field_g = var8.j(-14477);
            ac.field_r = var8.d((byte) 80);
            break L2;
          } else {
            ac.field_r = 0;
            wh.field_g = 0;
            break L2;
          }
        }
        L3: {
          if (-2 != (var8.f(param0 + 257) ^ -1)) {
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        L4: {
          var4 = stackIn_11_0;
          th.field_e = var8.d(0);
          if (var4 == 0) {
            tg.field_b = th.field_e;
            break L4;
          } else {
            tg.field_b = var8.d(0);
            break L4;
          }
        }
        L5: {
          L6: {
            if (dj.field_e == 1) {
              break L6;
            } else {
              if ((dj.field_e ^ -1) != -5) {
                break L5;
              } else {
                break L6;
              }
            }
          }
          int discarded$2 = var8.j(-14477);
          String discarded$3 = var8.d(param0 + 2);
          break L5;
        }
        L7: {
          if (param1) {
            var5 = var8.j(-14477);
            try {
              L8: {
                L9: {
                  var9 = il.field_b.b((byte) 47, var5);
                  vl.field_f = var9.d(10592);
                  if (!tg.field_b.equals((Object) (Object) d.field_a)) {
                    stackOut_23_0 = var9.field_p;
                    stackIn_24_0 = stackOut_23_0;
                    break L9;
                  } else {
                    stackOut_22_0 = null;
                    stackIn_24_0 = (int[]) (Object) stackOut_22_0;
                    break L9;
                  }
                }
                rh.field_m = stackIn_24_0;
                break L8;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L10: {
                var6 = (Exception) (Object) decompiledCaughtException;
                rg.a((Throwable) (Object) var6, "CC1", -562);
                vl.field_f = null;
                rh.field_m = null;
                break L10;
              }
            }
            break L7;
          } else {
            vl.field_f = ol.a(80, (va) (Object) var8, (byte) 45);
            rh.field_m = null;
            break L7;
          }
        }
        return new wc(param1);
    }

    final void a(String param0, int param1, int param2, int param3, byte param4, vd param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        fg var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        fg stackIn_33_0 = null;
        fg stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        fg stackIn_34_0 = null;
        fg stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        fg stackIn_35_0 = null;
        fg stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        int stackIn_37_0 = 0;
        vd stackIn_37_1 = null;
        int stackIn_38_0 = 0;
        vd stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        vd stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        fg stackOut_32_0 = null;
        fg stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        fg stackOut_34_0 = null;
        fg stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        fg stackOut_33_0 = null;
        fg stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        int stackOut_36_0 = 0;
        vd stackOut_36_1 = null;
        int stackOut_38_0 = 0;
        vd stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_37_0 = 0;
        vd stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        L0: {
          var15 = wizardrun.field_H;
          if (0 == param1) {
            param1 = param5.field_E;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != null) {
          L1: {
            if (param5 != ((cf) this).field_j) {
              break L1;
            } else {
              if (((cf) this).field_g) {
                break L1;
              } else {
                if (((cf) this).field_k != param2) {
                  break L1;
                } else {
                  if ((((cf) this).field_p ^ -1) != (param6 ^ -1)) {
                    break L1;
                  } else {
                    if (((cf) this).field_l != param1) {
                      break L1;
                    } else {
                      if (((cf) this).field_o != param7) {
                        break L1;
                      } else {
                        if (((cf) this).field_h != param3) {
                          break L1;
                        } else {
                          if (null == ((cf) this).field_q) {
                            break L1;
                          } else {
                            if (!((cf) this).field_q.equals((Object) (Object) param0)) {
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
            ((cf) this).field_p = param6;
            ((cf) this).field_h = param3;
            ((cf) this).field_l = param1;
            ((cf) this).field_j = param5;
            ((cf) this).field_q = param0;
            ((cf) this).field_k = param2;
            ((cf) this).field_g = false;
            ((cf) this).field_o = param7;
            var16 = new String[param5.b(param0, param3) + 1];
            var17 = var16;
            var10 = Math.max(1, param5.a(param0, new int[1], var17));
            if (-4 != (((cf) this).field_p ^ -1)) {
              break L2;
            } else {
              if (-2 == (var10 ^ -1)) {
                ((cf) this).field_p = 1;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            ((cf) this).field_d = new fg[var10];
            if (-1 == (((cf) this).field_p ^ -1)) {
              var11 = param5.field_M;
              break L3;
            } else {
              if (1 != ((cf) this).field_p) {
                if (2 != ((cf) this).field_p) {
                  L4: {
                    var12 = (((cf) this).field_o - var10 * ((cf) this).field_l) / (var10 - -1);
                    if (0 <= var12) {
                      break L4;
                    } else {
                      var12 = 0;
                      break L4;
                    }
                  }
                  ((cf) this).field_l = ((cf) this).field_l + var12;
                  var11 = var12 + param5.field_M;
                  break L3;
                } else {
                  var11 = ((cf) this).field_o - (param5.field_B + var10 * ((cf) this).field_l);
                  break L3;
                }
              } else {
                var11 = param5.field_M + (((cf) this).field_o + -(var10 * ((cf) this).field_l) >> 1919071105);
                break L3;
              }
            }
          }
          L5: {
            if (param4 <= -120) {
              break L5;
            } else {
              ((cf) this).field_p = 34;
              break L5;
            }
          }
          var12 = 0;
          L6: while (true) {
            if ((var12 ^ -1) <= (var10 ^ -1)) {
              return;
            } else {
              L7: {
                var13 = var16[var12];
                stackOut_32_0 = null;
                stackOut_32_1 = null;
                stackOut_32_2 = var11 + -param5.field_M;
                stackOut_32_3 = var11 - -param5.field_B;
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                stackIn_34_2 = stackOut_32_2;
                stackIn_34_3 = stackOut_32_3;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                stackIn_33_2 = stackOut_32_2;
                stackIn_33_3 = stackOut_32_3;
                if (var13 != null) {
                  stackOut_34_0 = null;
                  stackOut_34_1 = null;
                  stackOut_34_2 = stackIn_34_2;
                  stackOut_34_3 = stackIn_34_3;
                  stackOut_34_4 = var13.length();
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  stackIn_35_2 = stackOut_34_2;
                  stackIn_35_3 = stackOut_34_3;
                  stackIn_35_4 = stackOut_34_4;
                  break L7;
                } else {
                  stackOut_33_0 = null;
                  stackOut_33_1 = null;
                  stackOut_33_2 = stackIn_33_2;
                  stackOut_33_3 = stackIn_33_3;
                  stackOut_33_4 = 0;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  stackIn_35_2 = stackOut_33_2;
                  stackIn_35_3 = stackOut_33_3;
                  stackIn_35_4 = stackOut_33_4;
                  break L7;
                }
              }
              L8: {
                var14 = new fg(stackIn_35_2, stackIn_35_3, stackIn_35_4);
                var14.field_e[0] = 0;
                if (var13 == null) {
                  break L8;
                } else {
                  L9: {
                    var14.field_e[var13.length()] = param5.b(var13);
                    stackOut_36_0 = -76;
                    stackOut_36_1 = (vd) param5;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_38_1 = stackOut_36_1;
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    if (-4 != (param2 ^ -1)) {
                      stackOut_38_0 = stackIn_38_0;
                      stackOut_38_1 = (vd) (Object) stackIn_38_1;
                      stackOut_38_2 = 0;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      stackIn_39_2 = stackOut_38_2;
                      break L9;
                    } else {
                      stackOut_37_0 = stackIn_37_0;
                      stackOut_37_1 = (vd) (Object) stackIn_37_1;
                      stackOut_37_2 = ((cf) this).a(param5.b(var13), var13, 6454, param3);
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      stackIn_39_2 = stackOut_37_2;
                      break L9;
                    }
                  }
                  lk.a(stackIn_39_0, stackIn_39_1, stackIn_39_2, var14, var13);
                  break L8;
                }
              }
              var11 = var11 + param1;
              ((cf) this).field_d[var12] = var14;
              var12++;
              continue L6;
            }
          }
        } else {
          ((cf) this).field_d = null;
          return;
        }
    }

    final void a(int param0, byte param1, int param2, String param3, vd param4) {
        if (param1 > -71) {
            ((cf) this).field_p = 2;
        }
        if (!(param3 != null)) {
            ((cf) this).field_d = null;
            return;
        }
        if (((cf) this).field_j == param4) {
            if (((cf) this).field_g) {
                if (((cf) this).field_k == 0) {
                    if (((cf) this).field_q != null) {
                        if (((cf) this).field_q.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        ((cf) this).field_k = 0;
        ((cf) this).field_j = param4;
        ((cf) this).field_g = true;
        ((cf) this).field_q = param3;
        fg var7 = this.a(param3, 70, param0, param4);
        fg var8 = var7;
        var7.field_e[0] = param2;
        var8.field_e[param3.length()] = param4.b(param3) + param2;
        lk.a(113, param4, 0, var8, param3);
    }

    public cf() {
    }

    final static o[] a(int param0, int param1, kl param2, int param3) {
        if (!h.a(param0, param3, param2, -126)) {
            return null;
        }
        if (param1 != 30736) {
            field_m = null;
        }
        return pi.b(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = false;
        field_n = new bh(2, 4, 4, 0);
        field_f = new lg();
        field_m = "Highscores";
    }
}
