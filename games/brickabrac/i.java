/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends nm {
    static mf field_s;
    int field_i;
    af field_t;
    private jp field_k;
    int field_u;
    int field_w;
    int field_p;
    static String field_l;
    int field_x;
    static mf field_m;
    int field_r;
    static String field_o;
    private boolean field_v;
    static int field_j;
    static mm field_q;
    int field_n;

    final static void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        bi stackIn_4_0 = null;
        bi stackIn_5_0 = null;
        bi stackIn_6_0 = null;
        String stackIn_6_1 = null;
        bi stackIn_8_0 = null;
        bi stackIn_9_0 = null;
        bi stackIn_10_0 = null;
        String stackIn_10_1 = null;
        bi stackOut_7_0;
        bi stackOut_9_0;
        String stackOut_9_1;
        bi stackOut_8_0;
        String stackOut_8_1;
        bi stackOut_3_0;
        bi stackOut_5_0;
        String stackOut_5_1;
        bi stackOut_4_0;
        String stackOut_4_1;
        L0: {
          var9 = param0 + (param3 + param7);
          if (var9 == 0) {
            break L0;
          } else {
            param7 = (var9 + 200 * param7) / (2 * var9);
            param0 = (var9 + 200 * param0) / (var9 * 2);
            param3 = (param3 * 200 + var9) / (var9 * 2);
            break L0;
          }
        }
        if (-1 != param8) {
          L1: {
            ob.field_D.a(1 + param8 + ". ", qo.field_N + 54, param1, param5, -1);
            ob.field_D.c(param2, 54 - -qo.field_N, param1, param5, -1);
            ob.field_D.a(Integer.toString(param4), mf.field_d[0], param1, param5, -1);
            stackOut_7_0 = ob.field_D;
            stackIn_9_0 = stackOut_7_0;
            stackIn_8_0 = stackOut_7_0;
            if (-51 >= (var9 ^ -1)) {
              stackOut_9_0 = (bi) (Object) stackIn_9_0;
              stackOut_9_1 = "50+";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              break L1;
            } else {
              stackOut_8_0 = (bi) (Object) stackIn_8_0;
              stackOut_8_1 = Integer.toString(var9);
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              break L1;
            }
          }
          ((bi) (Object) stackIn_10_0).a((String) (Object) stackIn_10_1, mf.field_d[1], param1, param5, -1);
          ob.field_D.a(param3 + "%", mf.field_d[2], param1, param5, param6);
          ob.field_D.a(param0 + "%", mf.field_d[3], param1, param5, -1);
          ob.field_D.a(param7 + "%", mf.field_d[4], param1, param5, -1);
          return;
        } else {
          L2: {
            ob.field_D.c(param2, 54 - -qo.field_N, param1, param5, -1);
            ob.field_D.a(Integer.toString(param4), mf.field_d[0], param1, param5, -1);
            stackOut_3_0 = ob.field_D;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (-51 >= (var9 ^ -1)) {
              stackOut_5_0 = (bi) (Object) stackIn_5_0;
              stackOut_5_1 = "50+";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L2;
            } else {
              stackOut_4_0 = (bi) (Object) stackIn_4_0;
              stackOut_4_1 = Integer.toString(var9);
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L2;
            }
          }
          ((bi) (Object) stackIn_6_0).a((String) (Object) stackIn_6_1, mf.field_d[1], param1, param5, -1);
          ob.field_D.a(param3 + "%", mf.field_d[2], param1, param5, param6);
          ob.field_D.a(param0 + "%", mf.field_d[3], param1, param5, -1);
          ob.field_D.a(param7 + "%", mf.field_d[4], param1, param5, -1);
          return;
        }
    }

    public static void d(int param0) {
        Object var2 = null;
        field_s = null;
        field_o = null;
        field_m = null;
        if (param0 != 0) {
          var2 = null;
          oh discarded$2 = i.a(110, 111, (String) null);
          field_l = null;
          field_q = null;
          return;
        } else {
          field_l = null;
          field_q = null;
          return;
        }
    }

    final static byte[] a(boolean param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        byte[] var5_ref_byte__ = null;
        int var5 = 0;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        wq var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_l = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var9 = new wq(param1);
                    var3 = var9.l(255);
                    var4 = var9.e(255);
                    if (0 > var4) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (-1 == (bq.field_d ^ -1)) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var4 <= bq.field_d) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    throw new RuntimeException();
                }
                case 7: {
                    if (var3 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var16 = new byte[var4];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var5_ref_byte__ = var10;
                    var9.a(0, var16, 126, var4);
                    return var5_ref_byte__;
                }
                case 9: {
                    var5 = var9.e(255);
                    if (-1 < (var5 ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (bq.field_d == 0) {
                        statePc = 14;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (var5 <= bq.field_d) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    throw new RuntimeException();
                }
                case 14: {
                    var17 = new byte[var5];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var6 = var11;
                    if (var3 == 1) {
                        statePc = 20;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var7 = (Object) (Object) ae.field_d;
                    // monitorenter ae.field_d
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        ae.field_d.a(var17, -20555, var9);
                        // monitorexit var7
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) var8;
                }
                case 20: {
                    int discarded$1 = tc.a(var17, var5, param1, var4, 9);
                    return var6;
                }
                case 21: {
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, pe param1, int param2) {
        pi var3 = k.field_h;
        var3.e(-13413, param0);
        int var4 = 29 / ((-57 - param2) / 59);
        var3.a(114, 2);
        var3.a(-126, 0);
        var3.a(73, param1.field_w);
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = BrickABrac.field_J ? 1 : 0;
          if (0 != ((i) this).field_p) {
            L1: {
              var2 = 0;
              if (-1 <= (((i) this).field_p ^ -1)) {
                var2 = ((i) this).field_p >> -1617990494;
                break L1;
              } else {
                var2 = -(-((i) this).field_p >> 2116311554);
                break L1;
              }
            }
            ((i) this).field_p = ((i) this).field_p - var2;
            ((i) this).field_i = ((i) this).field_i + var2;
            break L0;
          } else {
            rk.field_Qb = rk.field_Qb & ((i) this).field_x;
            if (!bg.a(((i) this).field_i, ((i) this).field_w, ((i) this).field_u, (byte) 47, po.field_a, pq.field_k, ((i) this).field_n)) {
              if (1 != ki.field_e) {
                break L0;
              } else {
                if (bg.a(((i) this).field_i, ((i) this).field_w, ((i) this).field_u, (byte) 33, qo.field_O, tb.field_fb, ((i) this).field_n)) {
                  if (nf.field_P != ((i) this).field_r) {
                    nf.field_P = ((i) this).field_r;
                    if ((nf.field_P ^ -1) == 0) {
                      if (param0 <= -125) {
                        return;
                      } else {
                        ((i) this).field_n = -78;
                        return;
                      }
                    } else {
                      wp.a(8, ta.field_e[0]);
                      if (param0 <= -125) {
                        return;
                      } else {
                        ((i) this).field_n = -78;
                        return;
                      }
                    }
                  } else {
                    nf.field_P = -1;
                    if ((nf.field_P ^ -1) == 0) {
                      if (param0 <= -125) {
                        return;
                      } else {
                        ((i) this).field_n = -78;
                        return;
                      }
                    } else {
                      wp.a(8, ta.field_e[0]);
                      if (param0 <= -125) {
                        return;
                      } else {
                        ((i) this).field_n = -78;
                        return;
                      }
                    }
                  }
                } else {
                  if (param0 <= -125) {
                    return;
                  } else {
                    ((i) this).field_n = -78;
                    return;
                  }
                }
              }
            } else {
              nf.field_Y = ((i) this).field_r;
              if (1 == ki.field_e) {
                if (bg.a(((i) this).field_i, ((i) this).field_w, ((i) this).field_u, (byte) 33, qo.field_O, tb.field_fb, ((i) this).field_n)) {
                  if (nf.field_P != ((i) this).field_r) {
                    nf.field_P = ((i) this).field_r;
                    if ((nf.field_P ^ -1) != 0) {
                      wp.a(8, ta.field_e[0]);
                      if (param0 <= -125) {
                        return;
                      } else {
                        ((i) this).field_n = -78;
                        return;
                      }
                    } else {
                      if (param0 <= -125) {
                        return;
                      } else {
                        ((i) this).field_n = -78;
                        return;
                      }
                    }
                  } else {
                    nf.field_P = -1;
                    if ((nf.field_P ^ -1) != 0) {
                      wp.a(8, ta.field_e[0]);
                      if (param0 <= -125) {
                        return;
                      } else {
                        ((i) this).field_n = -78;
                        return;
                      }
                    } else {
                      if (param0 > -125) {
                        ((i) this).field_n = -78;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (param0 > -125) {
                    ((i) this).field_n = -78;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param0 > -125) {
                  ((i) this).field_n = -78;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
        if (param0 <= -125) {
          return;
        } else {
          ((i) this).field_n = -78;
          return;
        }
    }

    final static void c(byte param0) {
        int var2 = 0;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (!pe.field_o.c(116)) {
          if ((1 << pe.field_o.field_k & pe.field_o.field_w.field_n) != 0) {
            ag.field_D[10] = fh.field_a;
            if (param0 != 32) {
              field_o = null;
              return;
            } else {
              return;
            }
          } else {
            if (pe.field_o.field_w.field_n == 0) {
              ag.field_D[10] = t.field_b;
              if (param0 == 32) {
                return;
              } else {
                field_o = null;
                return;
              }
            } else {
              ag.field_D[10] = er.field_a;
              if (param0 == 32) {
                return;
              } else {
                field_o = null;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final static oh a(int param0, int param1, String param2) {
        oh var3 = null;
        Object var4 = null;
        var3 = new oh(false);
        var3.field_d = param0;
        var3.field_g = param2;
        if (param1 > -27) {
          var4 = null;
          i.a(-57, (pe) null, 111);
          return var3;
        } else {
          return var3;
        }
    }

    final void c(int param0) {
        Object var3 = null;
        if (param0 != 1) {
          var3 = null;
          i.a(-1, (pe) null, 57);
          aa.field_a.a((nm) this, (byte) 3);
          ((i) this).field_v = false;
          ((i) this).field_k = null;
          ((i) this).field_t = null;
          return;
        } else {
          aa.field_a.a((nm) this, (byte) 3);
          ((i) this).field_v = false;
          ((i) this).field_k = null;
          ((i) this).field_t = null;
          return;
        }
    }

    final void a(byte param0) {
        int var3 = 0;
        jp var6 = null;
        jp var7 = null;
        jp var10 = null;
        tp var11 = null;
        tp var12 = null;
        tp var13 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (eo.a(((i) this).field_t.field_t, ((i) this).field_r, (byte) -75)) {
          if (((i) this).field_r == nf.field_P) {
            L0: {
              L1: {
                pa.field_h[((i) this).field_r].f(((i) this).field_i, ((i) this).field_n, 384);
                if (((i) this).field_k == null) {
                  break L1;
                } else {
                  if (((i) this).field_v) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              var12 = si.field_c[((i) this).field_r];
              ((i) this).field_k = new jp(var12.field_f / 4, var12.field_h / 4);
              fc.a(-119, ((i) this).field_k);
              var12.c(0, 0);
              sc.b(-89);
              ((i) this).field_v = false;
              break L0;
            }
            if (param0 >= 87) {
              ((i) this).field_k.c(((i) this).field_i, ((i) this).field_n);
              return;
            } else {
              return;
            }
          } else {
            if (((i) this).field_r != nf.field_Y) {
              L2: {
                if (((i) this).field_k == null) {
                  break L2;
                } else {
                  if (((i) this).field_v) {
                    break L2;
                  } else {
                    if (param0 >= 87) {
                      ((i) this).field_k.c(((i) this).field_i, ((i) this).field_n);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              var13 = si.field_c[((i) this).field_r];
              ((i) this).field_k = new jp(var13.field_f / 4, var13.field_h / 4);
              fc.a(-119, ((i) this).field_k);
              var13.c(0, 0);
              sc.b(-89);
              ((i) this).field_v = false;
              if (param0 >= 87) {
                ((i) this).field_k.c(((i) this).field_i, ((i) this).field_n);
                return;
              } else {
                return;
              }
            } else {
              L3: {
                L4: {
                  e.field_l[((i) this).field_r].f(((i) this).field_i, ((i) this).field_n, 256);
                  if (((i) this).field_k == null) {
                    break L4;
                  } else {
                    if (((i) this).field_v) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                var11 = si.field_c[((i) this).field_r];
                ((i) this).field_k = new jp(var11.field_f / 4, var11.field_h / 4);
                fc.a(-119, ((i) this).field_k);
                var11.c(0, 0);
                sc.b(-89);
                ((i) this).field_v = false;
                break L3;
              }
              if (param0 >= 87) {
                ((i) this).field_k.c(((i) this).field_i, ((i) this).field_n);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          L5: {
            if (nf.field_P != ((i) this).field_r) {
              if (nf.field_Y == ((i) this).field_r) {
                bf.field_L.f(((i) this).field_i, ((i) this).field_n, 256);
                break L5;
              } else {
                if (((i) this).field_k != null) {
                  if (((i) this).field_v) {
                    if (param0 < 87) {
                      return;
                    } else {
                      ((i) this).field_k.c(((i) this).field_i, ((i) this).field_n);
                      return;
                    }
                  } else {
                    var7 = vq.field_F;
                    ((i) this).field_k = new jp(var7.field_x / 4, var7.field_z / 4);
                    fc.a(-76, ((i) this).field_k);
                    var7.e(0, 0);
                    sc.b(-110);
                    ((i) this).field_v = true;
                    if (param0 < 87) {
                      return;
                    } else {
                      ((i) this).field_k.c(((i) this).field_i, ((i) this).field_n);
                      return;
                    }
                  }
                } else {
                  var6 = vq.field_F;
                  ((i) this).field_k = new jp(var6.field_x / 4, var6.field_z / 4);
                  fc.a(-76, ((i) this).field_k);
                  var6.e(0, 0);
                  sc.b(-110);
                  ((i) this).field_v = true;
                  if (param0 < 87) {
                    return;
                  } else {
                    ((i) this).field_k.c(((i) this).field_i, ((i) this).field_n);
                    return;
                  }
                }
              }
            } else {
              qh.field_c.f(((i) this).field_i, ((i) this).field_n, 384);
              break L5;
            }
          }
          if (((i) this).field_k != null) {
            if (((i) this).field_v) {
              if (param0 >= 87) {
                ((i) this).field_k.c(((i) this).field_i, ((i) this).field_n);
                return;
              } else {
                return;
              }
            } else {
              var10 = vq.field_F;
              ((i) this).field_k = new jp(var10.field_x / 4, var10.field_z / 4);
              fc.a(-76, ((i) this).field_k);
              var10.e(0, 0);
              sc.b(-110);
              ((i) this).field_v = true;
              if (param0 >= 87) {
                ((i) this).field_k.c(((i) this).field_i, ((i) this).field_n);
                return;
              } else {
                return;
              }
            }
          } else {
            var10 = vq.field_F;
            ((i) this).field_k = new jp(var10.field_x / 4, var10.field_z / 4);
            fc.a(-76, ((i) this).field_k);
            var10.e(0, 0);
            sc.b(-110);
            ((i) this).field_v = true;
            if (param0 < 87) {
              return;
            } else {
              ((i) this).field_k.c(((i) this).field_i, ((i) this).field_n);
              return;
            }
          }
        }
    }

    i() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Suggested names: ";
        field_o = "You have withdrawn your request to join.";
    }
}
