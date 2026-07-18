/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bv extends vh {
    static String[] field_u;
    private int field_v;
    static byte[] field_A;
    private int field_y;
    static ka field_t;
    static dn field_x;
    private ga field_z;
    static ha field_w;

    final void d(byte param0, int param1) {
        ((bv) this).field_v = param1;
        if (param0 < -16) {
            return;
        }
        Object var4 = null;
        ((bv) this).a((int[]) null, -64);
    }

    static boolean a(boolean param0, boolean param1) {
        return param0 ^ param1;
    }

    final int a(boolean param0) {
        if (param0) {
            return 59;
        }
        return ((bv) this).field_v;
    }

    bv(byte[] param0) {
        super(param0);
    }

    final void h(int param0, int param1) {
        if (param0 != 32161) {
          return;
        } else {
          int fieldTemp$2 = ((bv) this).field_q;
          ((bv) this).field_q = ((bv) this).field_q + 1;
          ((bv) this).field_o[fieldTemp$2] = (byte)(param1 + ((bv) this).field_z.a(256));
          return;
        }
    }

    final int g(int param0, int param1) {
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var5 = -82 / ((-41 - param0) / 57);
        int var3 = ((bv) this).field_v >> 3;
        int var4 = 8 + -(7 & ((bv) this).field_v);
        ((bv) this).field_v = ((bv) this).field_v + param1;
        int var6 = 0;
        while (var4 < param1) {
            int incrementValue$0 = var3;
            var3++;
            var6 = var6 + ((((bv) this).field_o[incrementValue$0] & oj.field_n[var4]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (param1 == var4) {
            var6 = var6 + (oj.field_n[var4] & ((bv) this).field_o[var3]);
        } else {
            var6 = var6 + (((bv) this).field_o[var3] >> var4 + -param1 & oj.field_n[param1]);
        }
        return var6;
    }

    final void o(int param0) {
        ((bv) this).field_v = 8 * ((bv) this).field_q;
        if (param0 > 10) {
            return;
        }
        ((bv) this).o(52);
    }

    final void c(int param0, byte param1) {
        if (param1 != 0) {
            return;
        }
        ((bv) this).field_y = 8 - (param0 & 7);
        ((bv) this).field_q = param0 >> 3;
    }

    bv(int param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        param2 = param2 & oj.field_n[param1];
        if (param0 != -16807) {
          ((bv) this).d((byte) -128, -74);
          L0: while (true) {
            if (((bv) this).field_y >= param1) {
              if (param1 != ((bv) this).field_y) {
                var4 = -param1 + ((bv) this).field_y;
                var5 = ~(oj.field_n[param1] << var4);
                ((bv) this).field_o[((bv) this).field_q] = (byte)oe.c(rn.a(var5, (int) ((bv) this).field_o[((bv) this).field_q]), param2 << var4);
                ((bv) this).field_y = ((bv) this).field_y - param1;
                return;
              } else {
                ((bv) this).field_o[((bv) this).field_q] = (byte)oe.c(param2, rn.a((int) ((bv) this).field_o[((bv) this).field_q], 255 << ((bv) this).field_y));
                ((bv) this).field_q = ((bv) this).field_q + 1;
                ((bv) this).field_y = 8;
                return;
              }
            } else {
              param1 = param1 - ((bv) this).field_y;
              ((bv) this).field_o[((bv) this).field_q] = (byte)oe.c(param2 >>> param1, rn.a((int) ((bv) this).field_o[((bv) this).field_q], 255 << ((bv) this).field_y));
              ((bv) this).field_y = 8;
              ((bv) this).field_q = ((bv) this).field_q + 1;
              continue L0;
            }
          }
        } else {
          L1: while (true) {
            if (((bv) this).field_y >= param1) {
              if (param1 != ((bv) this).field_y) {
                var4 = -param1 + ((bv) this).field_y;
                var5 = ~(oj.field_n[param1] << var4);
                ((bv) this).field_o[((bv) this).field_q] = (byte)oe.c(rn.a(var5, (int) ((bv) this).field_o[((bv) this).field_q]), param2 << var4);
                ((bv) this).field_y = ((bv) this).field_y - param1;
                return;
              } else {
                ((bv) this).field_o[((bv) this).field_q] = (byte)oe.c(param2, rn.a((int) ((bv) this).field_o[((bv) this).field_q], 255 << ((bv) this).field_y));
                ((bv) this).field_q = ((bv) this).field_q + 1;
                ((bv) this).field_y = 8;
                return;
              }
            } else {
              param1 = param1 - ((bv) this).field_y;
              ((bv) this).field_o[((bv) this).field_q] = (byte)oe.c(param2 >>> param1, rn.a((int) ((bv) this).field_o[((bv) this).field_q], 255 << ((bv) this).field_y));
              ((bv) this).field_y = 8;
              ((bv) this).field_q = ((bv) this).field_q + 1;
              continue L1;
            }
          }
        }
    }

    final int m(int param0) {
        if (param0 != 255) {
          ((bv) this).field_v = -69;
          int fieldTemp$4 = ((bv) this).field_q;
          ((bv) this).field_q = ((bv) this).field_q + 1;
          return ((bv) this).field_o[fieldTemp$4] - ((bv) this).field_z.a(256) & 255;
        } else {
          int fieldTemp$5 = ((bv) this).field_q;
          ((bv) this).field_q = ((bv) this).field_q + 1;
          return ((bv) this).field_o[fieldTemp$5] - ((bv) this).field_z.a(256) & 255;
        }
    }

    final void a(int[] param0, int param1) {
        try {
            if (param1 >= -76) {
                field_w = null;
            }
            ((bv) this).field_z = new ga(param0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "bv.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void k(byte param0) {
        field_x = null;
        field_t = null;
        field_A = null;
        field_w = null;
        field_u = null;
        if (param0 == -97) {
          return;
        } else {
          bv.a(true, -32, -99, 30);
          return;
        }
    }

    final void a(int param0, byte[] param1, boolean param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (param0 <= var5_int) {
                L2: {
                  if (!param2) {
                    break L2;
                  } else {
                    ((bv) this).o(-70);
                    break L2;
                  }
                }
                break L0;
              } else {
                int fieldTemp$2 = ((bv) this).field_q;
                ((bv) this).field_q = ((bv) this).field_q + 1;
                param1[param3 + var5_int] = (byte)(((bv) this).field_o[fieldTemp$2] + -((bv) this).field_z.a(256));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("bv.L(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        if (~param1 != ~jt.field_a) {
          hi.field_i = null;
          ho.a(73);
          ui.field_c = param3;
          if (0 == param1) {
            ui.field_c = 0;
            hh.a(-16147, 50, mp.field_Ob, true);
            if (param1 == 23) {
              ui.field_c = 0;
              if (param1 == -10) {
                qc.field_j = 0;
                if (!nm.a(jt.field_a, true)) {
                  if (nm.a(param1, true)) {
                    L0: {
                      var4 = -2;
                      if (param1 == 15) {
                        var4 = -1;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                    L1: {
                      if (param1 != 0) {
                        break L1;
                      } else {
                        var4 = 2;
                        break L1;
                      }
                    }
                    L2: {
                      if (param1 == 7) {
                        var4 = 1;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (param1 != 20) {
                        break L3;
                      } else {
                        var4 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (param1 != 12) {
                        break L4;
                      } else {
                        var4 = 1;
                        break L4;
                      }
                    }
                    L5: {
                      if (param1 == 18) {
                        var4 = 2;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (var4 == -2) {
                      L6: {
                        rq.field_p[param1].a(71, param0, 0);
                        if (param1 == 15) {
                          kj.a(param0, param2 + -1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (jt.field_a == 16) {
                          fg.a((byte) 111);
                          ts.a((byte) -41);
                          vr.a(iw.field_l, 18);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      jt.field_a = param1;
                      if (param2 != 1) {
                        bv.k((byte) -51);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L8: {
                        rq.field_p[param1].a(85, param0, var4);
                        if (param1 == 15) {
                          kj.a(param0, param2 + -1);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (jt.field_a == 16) {
                          fg.a((byte) 111);
                          ts.a((byte) -41);
                          vr.a(iw.field_l, 18);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      jt.field_a = param1;
                      if (param2 != 1) {
                        bv.k((byte) -51);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    L10: {
                      if (jt.field_a == 16) {
                        fg.a((byte) 111);
                        ts.a((byte) -41);
                        vr.a(iw.field_l, 18);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    jt.field_a = param1;
                    if (param2 != 1) {
                      bv.k((byte) -51);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  rq.field_p[jt.field_a].d(true);
                  if (nm.a(param1, true)) {
                    L11: {
                      var4 = -2;
                      if (param1 == 15) {
                        var4 = -1;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (param1 != 0) {
                        break L12;
                      } else {
                        var4 = 2;
                        break L12;
                      }
                    }
                    L13: {
                      if (param1 == 7) {
                        var4 = 1;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (param1 != 20) {
                        break L14;
                      } else {
                        var4 = 0;
                        break L14;
                      }
                    }
                    L15: {
                      if (param1 != 12) {
                        break L15;
                      } else {
                        var4 = 1;
                        break L15;
                      }
                    }
                    L16: {
                      if (param1 == 18) {
                        var4 = 2;
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (var4 == -2) {
                      L17: {
                        rq.field_p[param1].a(71, param0, 0);
                        if (param1 == 15) {
                          kj.a(param0, param2 + -1);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      L18: {
                        if (jt.field_a == 16) {
                          fg.a((byte) 111);
                          ts.a((byte) -41);
                          vr.a(iw.field_l, 18);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      jt.field_a = param1;
                      if (param2 != 1) {
                        bv.k((byte) -51);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L19: {
                        rq.field_p[param1].a(85, param0, var4);
                        if (param1 == 15) {
                          kj.a(param0, param2 + -1);
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      L20: {
                        if (jt.field_a == 16) {
                          fg.a((byte) 111);
                          ts.a((byte) -41);
                          vr.a(iw.field_l, 18);
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      jt.field_a = param1;
                      if (param2 != 1) {
                        bv.k((byte) -51);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    L21: {
                      if (jt.field_a == 16) {
                        fg.a((byte) 111);
                        ts.a((byte) -41);
                        vr.a(iw.field_l, 18);
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    jt.field_a = param1;
                    if (param2 != 1) {
                      bv.k((byte) -51);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L22: {
                  mu.field_a = new cg();
                  qc.field_j = 0;
                  if (!nm.a(jt.field_a, true)) {
                    break L22;
                  } else {
                    rq.field_p[jt.field_a].d(true);
                    break L22;
                  }
                }
                L23: {
                  if (nm.a(param1, true)) {
                    L24: {
                      var4 = -2;
                      if (param1 == 15) {
                        var4 = -1;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      if (param1 != 0) {
                        break L25;
                      } else {
                        var4 = 2;
                        break L25;
                      }
                    }
                    L26: {
                      if (param1 == 7) {
                        var4 = 1;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      if (param1 != 20) {
                        break L27;
                      } else {
                        var4 = 0;
                        break L27;
                      }
                    }
                    L28: {
                      if (param1 != 12) {
                        break L28;
                      } else {
                        var4 = 1;
                        break L28;
                      }
                    }
                    L29: {
                      if (param1 == 18) {
                        var4 = 2;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    if (var4 == -2) {
                      L30: {
                        rq.field_p[param1].a(71, param0, 0);
                        if (param1 == 15) {
                          kj.a(param0, param2 + -1);
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                      L31: {
                        if (jt.field_a == 16) {
                          fg.a((byte) 111);
                          ts.a((byte) -41);
                          vr.a(iw.field_l, 18);
                          break L31;
                        } else {
                          break L31;
                        }
                      }
                      jt.field_a = param1;
                      if (param2 != 1) {
                        bv.k((byte) -51);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      rq.field_p[param1].a(85, param0, var4);
                      if (param1 == 15) {
                        kj.a(param0, param2 + -1);
                        break L23;
                      } else {
                        L32: {
                          if (jt.field_a == 16) {
                            fg.a((byte) 111);
                            ts.a((byte) -41);
                            vr.a(iw.field_l, 18);
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                        jt.field_a = param1;
                        if (param2 != 1) {
                          bv.k((byte) -51);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    break L23;
                  }
                }
                L33: {
                  if (jt.field_a == 16) {
                    fg.a((byte) 111);
                    ts.a((byte) -41);
                    vr.a(iw.field_l, 18);
                    break L33;
                  } else {
                    break L33;
                  }
                }
                jt.field_a = param1;
                if (param2 != 1) {
                  bv.k((byte) -51);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 == -10) {
                qc.field_j = 0;
                if (!nm.a(jt.field_a, true)) {
                  if (nm.a(param1, true)) {
                    L34: {
                      var4 = -2;
                      if (param1 == 15) {
                        var4 = -1;
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    L35: {
                      if (param1 != 0) {
                        break L35;
                      } else {
                        var4 = 2;
                        break L35;
                      }
                    }
                    L36: {
                      if (param1 == 7) {
                        var4 = 1;
                        break L36;
                      } else {
                        break L36;
                      }
                    }
                    L37: {
                      if (param1 != 20) {
                        break L37;
                      } else {
                        var4 = 0;
                        break L37;
                      }
                    }
                    L38: {
                      if (param1 != 12) {
                        break L38;
                      } else {
                        var4 = 1;
                        break L38;
                      }
                    }
                    L39: {
                      if (param1 == 18) {
                        var4 = 2;
                        break L39;
                      } else {
                        break L39;
                      }
                    }
                    if (var4 == -2) {
                      L40: {
                        rq.field_p[param1].a(71, param0, 0);
                        if (param1 == 15) {
                          kj.a(param0, param2 + -1);
                          break L40;
                        } else {
                          break L40;
                        }
                      }
                      L41: {
                        if (jt.field_a == 16) {
                          fg.a((byte) 111);
                          ts.a((byte) -41);
                          vr.a(iw.field_l, 18);
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                      jt.field_a = param1;
                      if (param2 != 1) {
                        bv.k((byte) -51);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L42: {
                        rq.field_p[param1].a(85, param0, var4);
                        if (param1 == 15) {
                          kj.a(param0, param2 + -1);
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                      L43: {
                        if (jt.field_a == 16) {
                          fg.a((byte) 111);
                          ts.a((byte) -41);
                          vr.a(iw.field_l, 18);
                          break L43;
                        } else {
                          break L43;
                        }
                      }
                      jt.field_a = param1;
                      if (param2 != 1) {
                        bv.k((byte) -51);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    L44: {
                      if (jt.field_a == 16) {
                        fg.a((byte) 111);
                        ts.a((byte) -41);
                        vr.a(iw.field_l, 18);
                        break L44;
                      } else {
                        break L44;
                      }
                    }
                    jt.field_a = param1;
                    if (param2 != 1) {
                      bv.k((byte) -51);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L45: {
                    rq.field_p[jt.field_a].d(true);
                    if (nm.a(param1, true)) {
                      L46: {
                        var4 = -2;
                        if (param1 == 15) {
                          var4 = -1;
                          break L46;
                        } else {
                          break L46;
                        }
                      }
                      L47: {
                        if (param1 != 0) {
                          break L47;
                        } else {
                          var4 = 2;
                          break L47;
                        }
                      }
                      L48: {
                        if (param1 == 7) {
                          var4 = 1;
                          break L48;
                        } else {
                          break L48;
                        }
                      }
                      L49: {
                        if (param1 != 20) {
                          break L49;
                        } else {
                          var4 = 0;
                          break L49;
                        }
                      }
                      L50: {
                        if (param1 != 12) {
                          break L50;
                        } else {
                          var4 = 1;
                          break L50;
                        }
                      }
                      L51: {
                        if (param1 == 18) {
                          var4 = 2;
                          break L51;
                        } else {
                          break L51;
                        }
                      }
                      L52: {
                        if (var4 == -2) {
                          rq.field_p[param1].a(71, param0, 0);
                          break L52;
                        } else {
                          rq.field_p[param1].a(85, param0, var4);
                          break L52;
                        }
                      }
                      if (param1 == 15) {
                        kj.a(param0, param2 + -1);
                        break L45;
                      } else {
                        break L45;
                      }
                    } else {
                      break L45;
                    }
                  }
                  L53: {
                    if (jt.field_a == 16) {
                      fg.a((byte) 111);
                      ts.a((byte) -41);
                      vr.a(iw.field_l, 18);
                      break L53;
                    } else {
                      break L53;
                    }
                  }
                  jt.field_a = param1;
                  if (param2 != 1) {
                    bv.k((byte) -51);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L54: {
                  mu.field_a = new cg();
                  qc.field_j = 0;
                  if (!nm.a(jt.field_a, true)) {
                    break L54;
                  } else {
                    rq.field_p[jt.field_a].d(true);
                    break L54;
                  }
                }
                L55: {
                  if (nm.a(param1, true)) {
                    L56: {
                      var4 = -2;
                      if (param1 == 15) {
                        var4 = -1;
                        break L56;
                      } else {
                        break L56;
                      }
                    }
                    L57: {
                      if (param1 != 0) {
                        break L57;
                      } else {
                        var4 = 2;
                        break L57;
                      }
                    }
                    L58: {
                      if (param1 == 7) {
                        var4 = 1;
                        break L58;
                      } else {
                        break L58;
                      }
                    }
                    L59: {
                      if (param1 != 20) {
                        break L59;
                      } else {
                        var4 = 0;
                        break L59;
                      }
                    }
                    L60: {
                      if (param1 != 12) {
                        break L60;
                      } else {
                        var4 = 1;
                        break L60;
                      }
                    }
                    L61: {
                      if (param1 == 18) {
                        var4 = 2;
                        break L61;
                      } else {
                        break L61;
                      }
                    }
                    L62: {
                      if (var4 == -2) {
                        rq.field_p[param1].a(71, param0, 0);
                        break L62;
                      } else {
                        rq.field_p[param1].a(85, param0, var4);
                        break L62;
                      }
                    }
                    if (param1 == 15) {
                      kj.a(param0, param2 + -1);
                      break L55;
                    } else {
                      break L55;
                    }
                  } else {
                    break L55;
                  }
                }
                L63: {
                  if (jt.field_a == 16) {
                    fg.a((byte) 111);
                    ts.a((byte) -41);
                    vr.a(iw.field_l, 18);
                    break L63;
                  } else {
                    break L63;
                  }
                }
                jt.field_a = param1;
                if (param2 != 1) {
                  bv.k((byte) -51);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            L64: {
              if (param1 != 23) {
                break L64;
              } else {
                ui.field_c = 0;
                break L64;
              }
            }
            if (param1 == -10) {
              qc.field_j = 0;
              if (!nm.a(jt.field_a, true)) {
                if (nm.a(param1, true)) {
                  L65: {
                    var4 = -2;
                    if (param1 == 15) {
                      var4 = -1;
                      break L65;
                    } else {
                      break L65;
                    }
                  }
                  L66: {
                    if (param1 != 0) {
                      break L66;
                    } else {
                      var4 = 2;
                      break L66;
                    }
                  }
                  L67: {
                    if (param1 == 7) {
                      var4 = 1;
                      break L67;
                    } else {
                      break L67;
                    }
                  }
                  L68: {
                    if (param1 != 20) {
                      break L68;
                    } else {
                      var4 = 0;
                      break L68;
                    }
                  }
                  L69: {
                    if (param1 != 12) {
                      break L69;
                    } else {
                      var4 = 1;
                      break L69;
                    }
                  }
                  L70: {
                    if (param1 == 18) {
                      var4 = 2;
                      break L70;
                    } else {
                      break L70;
                    }
                  }
                  if (var4 == -2) {
                    L71: {
                      rq.field_p[param1].a(71, param0, 0);
                      if (param1 == 15) {
                        kj.a(param0, param2 + -1);
                        break L71;
                      } else {
                        break L71;
                      }
                    }
                    L72: {
                      if (jt.field_a == 16) {
                        fg.a((byte) 111);
                        ts.a((byte) -41);
                        vr.a(iw.field_l, 18);
                        break L72;
                      } else {
                        break L72;
                      }
                    }
                    jt.field_a = param1;
                    if (param2 != 1) {
                      bv.k((byte) -51);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L73: {
                      rq.field_p[param1].a(85, param0, var4);
                      if (param1 == 15) {
                        kj.a(param0, param2 + -1);
                        break L73;
                      } else {
                        break L73;
                      }
                    }
                    L74: {
                      if (jt.field_a == 16) {
                        fg.a((byte) 111);
                        ts.a((byte) -41);
                        vr.a(iw.field_l, 18);
                        break L74;
                      } else {
                        break L74;
                      }
                    }
                    jt.field_a = param1;
                    if (param2 != 1) {
                      bv.k((byte) -51);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L75: {
                    if (jt.field_a == 16) {
                      fg.a((byte) 111);
                      ts.a((byte) -41);
                      vr.a(iw.field_l, 18);
                      break L75;
                    } else {
                      break L75;
                    }
                  }
                  jt.field_a = param1;
                  if (param2 != 1) {
                    bv.k((byte) -51);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L76: {
                  rq.field_p[jt.field_a].d(true);
                  if (nm.a(param1, true)) {
                    L77: {
                      var4 = -2;
                      if (param1 == 15) {
                        var4 = -1;
                        break L77;
                      } else {
                        break L77;
                      }
                    }
                    L78: {
                      if (param1 != 0) {
                        break L78;
                      } else {
                        var4 = 2;
                        break L78;
                      }
                    }
                    L79: {
                      if (param1 == 7) {
                        var4 = 1;
                        break L79;
                      } else {
                        break L79;
                      }
                    }
                    L80: {
                      if (param1 != 20) {
                        break L80;
                      } else {
                        var4 = 0;
                        break L80;
                      }
                    }
                    L81: {
                      if (param1 != 12) {
                        break L81;
                      } else {
                        var4 = 1;
                        break L81;
                      }
                    }
                    L82: {
                      if (param1 == 18) {
                        var4 = 2;
                        break L82;
                      } else {
                        break L82;
                      }
                    }
                    L83: {
                      if (var4 == -2) {
                        rq.field_p[param1].a(71, param0, 0);
                        break L83;
                      } else {
                        rq.field_p[param1].a(85, param0, var4);
                        break L83;
                      }
                    }
                    if (param1 == 15) {
                      kj.a(param0, param2 + -1);
                      break L76;
                    } else {
                      break L76;
                    }
                  } else {
                    break L76;
                  }
                }
                L84: {
                  if (jt.field_a == 16) {
                    fg.a((byte) 111);
                    ts.a((byte) -41);
                    vr.a(iw.field_l, 18);
                    break L84;
                  } else {
                    break L84;
                  }
                }
                jt.field_a = param1;
                if (param2 != 1) {
                  bv.k((byte) -51);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L85: {
                mu.field_a = new cg();
                qc.field_j = 0;
                if (!nm.a(jt.field_a, true)) {
                  break L85;
                } else {
                  rq.field_p[jt.field_a].d(true);
                  break L85;
                }
              }
              L86: {
                if (nm.a(param1, true)) {
                  L87: {
                    var4 = -2;
                    if (param1 == 15) {
                      var4 = -1;
                      break L87;
                    } else {
                      break L87;
                    }
                  }
                  L88: {
                    if (param1 != 0) {
                      break L88;
                    } else {
                      var4 = 2;
                      break L88;
                    }
                  }
                  L89: {
                    if (param1 == 7) {
                      var4 = 1;
                      break L89;
                    } else {
                      break L89;
                    }
                  }
                  L90: {
                    if (param1 != 20) {
                      break L90;
                    } else {
                      var4 = 0;
                      break L90;
                    }
                  }
                  L91: {
                    if (param1 != 12) {
                      break L91;
                    } else {
                      var4 = 1;
                      break L91;
                    }
                  }
                  L92: {
                    if (param1 == 18) {
                      var4 = 2;
                      break L92;
                    } else {
                      break L92;
                    }
                  }
                  L93: {
                    if (var4 == -2) {
                      rq.field_p[param1].a(71, param0, 0);
                      break L93;
                    } else {
                      rq.field_p[param1].a(85, param0, var4);
                      break L93;
                    }
                  }
                  if (param1 == 15) {
                    kj.a(param0, param2 + -1);
                    break L86;
                  } else {
                    break L86;
                  }
                } else {
                  break L86;
                }
              }
              L94: {
                if (jt.field_a == 16) {
                  fg.a((byte) 111);
                  ts.a((byte) -41);
                  vr.a(iw.field_l, 18);
                  break L94;
                } else {
                  break L94;
                }
              }
              jt.field_a = param1;
              if (param2 != 1) {
                bv.k((byte) -51);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final void n(int param0) {
        ((bv) this).field_q = (7 + ((bv) this).field_v) / 8;
        if (param0 == -2) {
            return;
        }
        ((bv) this).c(-66, (byte) 60);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new String[]{"aviansie_axe_spin", null, null, null, null, "spin", null};
        field_A = new byte[]{(byte) 7, (byte) 4, (byte) 4, (byte) 4, (byte) 2, (byte) 5};
    }
}
