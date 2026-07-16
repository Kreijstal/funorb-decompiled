/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends hn {
    private nn field_R;
    private nn field_W;
    static int[] field_Y;
    private nn field_V;
    static jb field_S;
    static long field_T;
    static String[] field_Z;
    static int[] field_X;
    private boolean field_U;

    final int f(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 61) {
              stackOut_3_0 = Integer.parseInt(((od) this).field_V.field_A);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 115;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_4_0;
    }

    private od(kg param0, boolean param1) {
        super(0, 0, 0, 0, (kg) null);
        ((od) this).field_R = (nn) (Object) new fo("", (dn) null, 2);
        ((od) this).field_W = (nn) (Object) new fo("", (dn) null, 2);
        ((od) this).field_V = (nn) (Object) new fo("", (dn) null, 4);
        ((od) this).field_U = param1 ? true : false;
        ((od) this).field_V.field_H = param0;
        ((od) this).field_W.field_H = param0;
        ((od) this).field_R.field_H = param0;
        if (!((od) this).field_U) {
            ((od) this).c((na) (Object) ((od) this).field_R, 10);
            ((od) this).c((na) (Object) ((od) this).field_W, 10);
        } else {
            ((od) this).c((na) (Object) ((od) this).field_W, 10);
            ((od) this).c((na) (Object) ((od) this).field_R, 10);
        }
        ((od) this).c((na) (Object) ((od) this).field_V, 10);
    }

    od(kg param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        ((od) this).a(param5, param3, 11, param2, param4);
    }

    private final void a(na param0, byte param1, int param2, int param3, String param4) {
        dh.field_d.a(param4, param2 + (param0.field_t - -(param0.field_F >> 1675668065)), param3 - -param0.field_w - 5, 16777215, -1);
        if (param1 != 33) {
            field_X = null;
        }
    }

    final String e(int param0) {
        String var2 = ((od) this).field_W.e(param0 + param0);
        if (!(var2 == null)) {
            return var2;
        }
        if (!(!((od) this).field_r)) {
            return ((od) this).field_C == null ? ((od) this).field_A : ((od) this).field_C;
        }
        return null;
    }

    final static ig a(ah param0, String param1, ah param2, String param3, byte param4) {
        int var5 = param0.a(param4 ^ -96, param3);
        int var6 = param0.a(var5, false, param1);
        if (param4 != 95) {
            return null;
        }
        return un.a(-29082, param2, var5, var6, param0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, 23, param3, param4);
        int var7 = -20 / ((-61 - param2) / 51);
        int var6 = param4 + -130 >> 121166145;
        if (!((od) this).field_U) {
            ((od) this).field_R.a(param0, 0, 77, var6, 25);
            ((od) this).field_W.a(param0, 0, -121, 45 + var6, 25);
        } else {
            ((od) this).field_W.a(param0, 0, -125, var6, 25);
            ((od) this).field_R.a(param0, 0, 43, var6 + 45, 25);
        }
        ((od) this).field_V.a(param0, 0, -121, var6 - -90, 40);
    }

    final int g(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param0 == 12) {
            break L0;
          } else {
            int discarded$2 = ((od) this).g((byte) -78);
            break L0;
          }
        }
        try {
          L1: {
            stackOut_2_0 = Integer.parseInt(((od) this).field_R.field_A);
            stackIn_3_0 = stackOut_2_0;
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final void a(int param0, qh param1) {
        super.a(param0, param1);
        ((od) this).field_R.field_s = (dn) (Object) param1;
        ((od) this).field_W.field_s = (dn) (Object) param1;
        ((od) this).field_V.field_s = (dn) (Object) param1;
    }

    final int a(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (!param0) {
          try {
            L0: {
              stackOut_2_0 = Integer.parseInt(((od) this).field_W.field_A) - 1;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            return -1;
          }
          return stackIn_3_0;
        } else {
          return -14;
        }
    }

    final boolean h(int param0) {
        if (((od) this).field_R.field_A == null) {
          return true;
        } else {
          if (0 != ((od) this).field_R.field_A.length()) {
            L0: {
              if (((od) this).field_W.field_A == null) {
                break L0;
              } else {
                if (0 == ((od) this).field_W.field_A.length()) {
                  break L0;
                } else {
                  L1: {
                    if (((od) this).field_V.field_A == null) {
                      break L1;
                    } else {
                      if (0 != ((od) this).field_V.field_A.length()) {
                        L2: {
                          if (param0 == -30886) {
                            break L2;
                          } else {
                            field_X = null;
                            break L2;
                          }
                        }
                        return false;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return true;
                }
              }
            }
            return true;
          } else {
            return true;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0 ^ param0, param1, param2, param3);
        if (!(param3 == 0)) {
            return;
        }
        param2 = param2 + ((od) this).field_w;
        param1 = param1 + ((od) this).field_t;
        this.a((na) (Object) ((od) this).field_R, (byte) 33, param1, param2, ja.field_k);
        this.a((na) (Object) ((od) this).field_W, (byte) 33, param1, param2, lg.field_Z);
        this.a((na) (Object) ((od) this).field_V, (byte) 33, param1, param2, me.field_h);
    }

    final static int a(byte param0, String param1, hb param2, int param3, int param4, boolean param5, hb param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        bh stackIn_16_0 = null;
        bh stackIn_17_0 = null;
        bh stackIn_18_0 = null;
        String stackIn_18_1 = null;
        bh stackIn_19_0 = null;
        bh stackIn_20_0 = null;
        bh stackIn_21_0 = null;
        String stackIn_21_1 = null;
        bh stackOut_15_0 = null;
        bh stackOut_17_0 = null;
        String stackOut_17_1 = null;
        bh stackOut_16_0 = null;
        String stackOut_16_1 = null;
        bh stackOut_18_0 = null;
        bh stackOut_20_0 = null;
        String stackOut_20_1 = null;
        bh stackOut_19_0 = null;
        String stackOut_19_1 = null;
        L0: {
          var16 = null;
          var13 = TetraLink.field_J;
          if (param0 == 98) {
            break L0;
          } else {
            var14 = null;
            ig discarded$2 = od.a((ah) null, (String) null, (ah) null, (String) null, (byte) -75);
            break L0;
          }
        }
        L1: {
          var15 = param2.a((byte) -54);
          var8 = param6.a((byte) -66);
          if (wa.field_e != null) {
            break L1;
          } else {
            if (om.a(false, (byte) -85)) {
              break L1;
            } else {
              return -1;
            }
          }
        }
        L2: {
          if (bc.field_z == qi.field_p) {
            L3: {
              ui.field_b = null;
              nd.field_Lb.field_t = 0;
              if (param1 == null) {
                L4: {
                  tb.field_j.field_t = 0;
                  tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
                  tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
                  stackOut_15_0 = tb.field_j;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_16_0 = stackOut_15_0;
                  if (!param2.a(0)) {
                    stackOut_17_0 = (bh) (Object) stackIn_17_0;
                    stackOut_17_1 = "";
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    break L4;
                  } else {
                    stackOut_16_0 = (bh) (Object) stackIn_16_0;
                    stackOut_16_1 = (String) var15;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    break L4;
                  }
                }
                L5: {
                  ((bh) (Object) stackIn_18_0).a(stackIn_18_1, (byte) 103);
                  stackOut_18_0 = tb.field_j;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (!param6.a(0)) {
                    stackOut_20_0 = (bh) (Object) stackIn_20_0;
                    stackOut_20_1 = "";
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L5;
                  } else {
                    stackOut_19_0 = (bh) (Object) stackIn_19_0;
                    stackOut_19_1 = (String) var8;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L5;
                  }
                }
                ((bh) (Object) stackIn_21_0).a(stackIn_21_1, (byte) 103);
                nd.field_Lb.a(16, false);
                nd.field_Lb.field_t = nd.field_Lb.field_t + 1;
                var9 = nd.field_Lb.field_t;
                ae.a(ki.field_c, (bh) (Object) nd.field_Lb, tb.field_j, jg.field_c, 104);
                nd.field_Lb.b(-var9 + nd.field_Lb.field_t, -2);
                break L3;
              } else {
                L6: {
                  var9 = 0;
                  if (param5) {
                    var9 = var9 | 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  tb.field_j.field_t = 0;
                  tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
                  tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
                  tb.field_j.a(var15, (byte) 103);
                  tb.field_j.a(var8, (byte) 103);
                  var17 = (CharSequence) (Object) param1;
                  tb.field_j.a(h.a(var17, (byte) 56), (byte) 103);
                  tb.field_j.b(param3, false);
                  tb.field_j.a(param4, false);
                  tb.field_j.a(var9, false);
                  nd.field_Lb.a(18, false);
                  nd.field_Lb.field_t = nd.field_Lb.field_t + 2;
                  var10 = nd.field_Lb.field_t;
                  var11_ref_String = dd.a(lk.q(13), (byte) 99);
                  if (var11_ref_String == null) {
                    var11_ref_String = "";
                    break L7;
                  } else {
                    break L7;
                  }
                }
                nd.field_Lb.a(var11_ref_String, 0);
                ae.a(ki.field_c, (bh) (Object) nd.field_Lb, tb.field_j, jg.field_c, 123);
                nd.field_Lb.a((byte) 59, -var10 + nd.field_Lb.field_t);
                break L3;
              }
            }
            ak.a((byte) -114, -1);
            qi.field_p = ha.field_a;
            break L2;
          } else {
            break L2;
          }
        }
        L8: {
          if (ha.field_a != qi.field_p) {
            break L8;
          } else {
            if (en.b(99, 1)) {
              L9: {
                var9 = kb.field_q.d((byte) -99);
                kb.field_q.field_t = 0;
                if (var9 < 100) {
                  break L9;
                } else {
                  if ((var9 ^ -1) >= -106) {
                    og.field_h = new String[-100 + var9];
                    qi.field_p = oa.field_v;
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              if (248 != var9) {
                if (99 != var9) {
                  qi.field_p = pb.field_d;
                  ua.field_c = var9;
                  rl.field_d = -1;
                  break L8;
                } else {
                  boolean discarded$3 = en.b(96, bb.a(param0 + 31934));
                  ui.field_b = new Boolean(bg.a((bh) (Object) kb.field_q, (byte) 55));
                  kb.field_q.field_t = 0;
                  break L8;
                }
              } else {
                ei.a(lk.q(13), 60);
                tg.field_d = k.field_d;
                mk.a(false);
                vb.field_j = false;
                return var9;
              }
            } else {
              break L8;
            }
          }
        }
        L10: {
          if (qi.field_p == oa.field_v) {
            var9 = 2;
            if (en.b(param0 ^ 23, var9)) {
              var10 = kb.field_q.e(127);
              kb.field_q.field_t = 0;
              if (en.b(108, var10)) {
                var11 = og.field_h.length;
                var12 = 0;
                L11: while (true) {
                  if (var12 >= var11) {
                    mk.a(false);
                    vb.field_j = false;
                    return 100 + var11;
                  } else {
                    og.field_h[var12] = kb.field_q.a(true);
                    var12++;
                    continue L11;
                  }
                }
              } else {
                break L10;
              }
            } else {
              break L10;
            }
          } else {
            break L10;
          }
        }
        L12: {
          if (pb.field_d != qi.field_p) {
            break L12;
          } else {
            if (!ua.b(72)) {
              break L12;
            } else {
              L13: {
                if (255 == ua.field_c) {
                  var9_ref_String = kb.field_q.i(param0 + -208);
                  if (var9_ref_String != null) {
                    qi.a(var9_ref_String, -7011, lk.q(13));
                    break L13;
                  } else {
                    break L13;
                  }
                } else {
                  tg.field_d = kb.field_q.g((byte) 81);
                  break L13;
                }
              }
              mk.a(false);
              vb.field_j = false;
              return ua.field_c;
            }
          }
        }
        L14: {
          if (wa.field_e == null) {
            if (!vb.field_j) {
              var9 = ko.field_t;
              ko.field_t = oi.field_m;
              vb.field_j = true;
              oi.field_m = var9;
              break L14;
            } else {
              L15: {
                if ((ib.a((byte) 127) ^ -1L) >= -30001L) {
                  tg.field_d = ja.field_d;
                  break L15;
                } else {
                  tg.field_d = wc.field_G;
                  break L15;
                }
              }
              vb.field_j = false;
              return 249;
            }
          } else {
            break L14;
          }
        }
        return -1;
    }

    public static void e(boolean param0) {
        field_X = null;
        field_S = null;
        if (param0) {
            field_Z = null;
        }
        field_Z = null;
        field_Y = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = new int[]{2, 14, 15, 6, 5, 16, 17, 12};
        field_Z = new String[]{"Showing by rating", "Showing by win percentage"};
        field_X = new int[8192];
    }
}
