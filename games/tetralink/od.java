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
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 61) {
              stackIn_4_0 = Integer.parseInt(this.field_V.field_A);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 115;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private od(kg param0, boolean param1) {
        super(0, 0, 0, 0, (kg) null);
        try {
            this.field_R = (nn) ((Object) new fo("", (dn) null, 2));
            this.field_W = (nn) ((Object) new fo("", (dn) null, 2));
            this.field_V = (nn) ((Object) new fo("", (dn) null, 4));
            this.field_U = param1 ? true : false;
            this.field_V.field_H = param0;
            this.field_W.field_H = param0;
            this.field_R.field_H = param0;
            if (!this.field_U) {
                this.c(this.field_R, 10);
                this.c(this.field_W, 10);
            } else {
                this.c(this.field_W, 10);
                this.c(this.field_R, 10);
            }
            this.c(this.field_V, 10);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "od.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    od(kg param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
            this.a(param5, param3, 11, param2, param4);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "od.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void a(na param0, byte param1, int param2, int param3, String param4) {
        try {
            dh.field_d.a(param4, param2 + (param0.field_t - -(param0.field_F >> 1675668065)), param3 - -param0.field_w - 5, 16777215, -1);
            if (param1 != 33) {
                field_X = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "od.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final String e(int param0) {
        String var2 = this.field_W.e(param0 + param0);
        if (!(var2 == null)) {
            return var2;
        }
        if (!(!this.field_r)) {
            return this.field_C == null ? this.field_A : this.field_C;
        }
        return null;
    }

    final static ig a(ah param0, String param1, ah param2, String param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ig stackIn_2_0 = null;
        ig stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param0.a(param4 ^ -96, param3);
            var6 = param0.a(var5_int, false, param1);
            if (param4 == 95) {
              stackIn_4_0 = un.a(-29082, param2, var5_int, var6, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ig) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("od.GA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, 23, param3, param4);
        int var7 = -20 / ((-61 - param2) / 51);
        int var6 = param4 + -130 >> 121166145;
        if (!this.field_U) {
            this.field_R.a(param0, 0, 77, var6, 25);
            this.field_W.a(param0, 0, -121, 45 + var6, 25);
        } else {
            this.field_W.a(param0, 0, -125, var6, 25);
            this.field_R.a(param0, 0, 43, var6 + 45, 25);
        }
        this.field_V.a(param0, 0, -121, var6 - -90, 40);
    }

    final int g(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == 12) {
            break L0;
          } else {
            this.g((byte) -78);
            break L0;
          }
        }
        try {
          L1: {
            stackIn_3_0 = Integer.parseInt(this.field_R.field_A);
            break L1;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final void a(int param0, qh param1) {
        try {
            super.a(param0, param1);
            this.field_R.field_s = (dn) ((Object) param1);
            this.field_W.field_s = (dn) ((Object) param1);
            this.field_V.field_s = (dn) ((Object) param1);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "od.W(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (!param0) {
          try {
            L0: {
              stackIn_3_0 = Integer.parseInt(this.field_W.field_A) - 1;
              break L0;
            }
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
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
        if (this.field_R.field_A == null) {
          return true;
        } else {
          if (0 != this.field_R.field_A.length()) {
            L0: {
              if (this.field_W.field_A == null) {
                break L0;
              } else {
                if (0 == this.field_W.field_A.length()) {
                  break L0;
                } else {
                  L1: {
                    if (this.field_V.field_A == null) {
                      break L1;
                    } else {
                      if (0 != this.field_V.field_A.length()) {
                        L2: {
                          if (param0 == -30886) {
                            break L2;
                          } else {
                            field_X = (int[]) null;
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
        param2 = param2 + this.field_w;
        param1 = param1 + this.field_t;
        this.a(this.field_R, (byte) 33, param1, param2, ja.field_k);
        this.a(this.field_W, (byte) 33, param1, param2, lg.field_Z);
        this.a(this.field_V, (byte) 33, param1, param2, me.field_h);
    }

    final static int a(byte param0, String param1, hb param2, int param3, int param4, boolean param5, hb param6) {
        int stackIn_6_0 = 0;
        bh stackIn_19_0 = null;
        bh stackIn_20_0 = null;
        String stackIn_20_1 = null;
        bh stackIn_22_0 = null;
        bh stackIn_23_0 = null;
        String stackIn_23_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_77_1 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        var16 = null;
        var13 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0 == 98) {
                break L1;
              } else {
                var14 = (String) null;
                od.a((ah) null, (String) null, (ah) null, (String) null, (byte) -75);
                break L1;
              }
            }
            L2: {
              var15 = param2.a((byte) -54);
              var8 = param6.a((byte) -66);
              if (wa.field_e != null) {
                break L2;
              } else {
                if (om.a(false, (byte) -85)) {
                  break L2;
                } else {
                  stackIn_6_0 = -1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              if (bc.field_z == qi.field_p) {
                L4: {
                  ui.field_b = null;
                  nd.field_Lb.field_t = 0;
                  if (param1 == null) {
                    L5: {
                      tb.field_j.field_t = 0;
                      tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
                      tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
                      stackIn_19_0 = tb.field_j;

                      if (!param2.a(0)) {
                        stackIn_20_0 = (bh) ((Object) stackIn_19_0);
                        stackIn_20_1 = "";
                        break L5;
                      } else {
                        stackIn_20_0 = (bh) ((Object) stackIn_19_0);
                        stackIn_20_1 = (String) (var15);
                        break L5;
                      }
                    }
                    L6: {
                      ((bh) (Object) stackIn_20_0).a(stackIn_20_1, (byte) 103);
                      stackIn_22_0 = tb.field_j;

                      if (!param6.a(0)) {
                        stackIn_23_0 = (bh) ((Object) stackIn_22_0);
                        stackIn_23_1 = "";
                        break L6;
                      } else {
                        stackIn_23_0 = (bh) ((Object) stackIn_22_0);
                        stackIn_23_1 = (String) (var8);
                        break L6;
                      }
                    }
                    ((bh) (Object) stackIn_23_0).a(stackIn_23_1, (byte) 103);
                    nd.field_Lb.a(16, false);
                    nd.field_Lb.field_t = nd.field_Lb.field_t + 1;
                    var9 = nd.field_Lb.field_t;
                    ae.a(ki.field_c, nd.field_Lb, tb.field_j, jg.field_c, 104);
                    nd.field_Lb.b(-var9 + nd.field_Lb.field_t, -2);
                    break L4;
                  } else {
                    L7: {
                      var9 = 0;
                      if (param5) {
                        var9 = var9 | 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      tb.field_j.field_t = 0;
                      tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
                      tb.field_j.d(ca.field_i.nextInt(), (byte) -124);
                      tb.field_j.a(var15, (byte) 103);
                      tb.field_j.a(var8, (byte) 103);
                      var17 = (CharSequence) ((Object) param1);
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
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    nd.field_Lb.a(var11_ref_String, 0);
                    ae.a(ki.field_c, nd.field_Lb, tb.field_j, jg.field_c, 123);
                    nd.field_Lb.a((byte) 59, -var10 + nd.field_Lb.field_t);
                    break L4;
                  }
                }
                ak.a((byte) -114, -1);
                qi.field_p = ha.field_a;
                break L3;
              } else {
                break L3;
              }
            }
            L9: {
              if (ha.field_a != qi.field_p) {
                break L9;
              } else {
                if (en.b(99, 1)) {
                  L10: {
                    var9 = kb.field_q.d((byte) -99);
                    kb.field_q.field_t = 0;
                    if (var9 < 100) {
                      break L10;
                    } else {
                      if ((var9 ^ -1) >= -106) {
                        og.field_h = new String[-100 + var9];
                        qi.field_p = oa.field_v;
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (248 != var9) {
                    if (99 != var9) {
                      qi.field_p = pb.field_d;
                      ua.field_c = var9;
                      rl.field_d = -1;
                      break L9;
                    } else {
                      en.b(96, bb.a(param0 + 31934));
                      ui.field_b = new Boolean(bg.a(kb.field_q, (byte) 55));
                      kb.field_q.field_t = 0;
                      break L9;
                    }
                  } else {
                    ei.a(lk.q(13), 60);
                    tg.field_d = k.field_d;
                    mk.a(false);
                    vb.field_j = false;
                    stackIn_33_0 = var9;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (qi.field_p == oa.field_v) {
                var9 = 2;
                if (en.b(param0 ^ 23, var9)) {
                  var10 = kb.field_q.e(127);
                  kb.field_q.field_t = 0;
                  if (en.b(108, var10)) {
                    var11 = og.field_h.length;
                    var12 = 0;
                    L12: while (true) {
                      if (var12 >= var11) {
                        mk.a(false);
                        vb.field_j = false;
                        stackIn_48_0 = 100 + var11;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        og.field_h[var12] = kb.field_q.a(true);
                        var12++;
                        continue L12;
                      }
                    }
                  } else {
                    break L11;
                  }
                } else {
                  break L11;
                }
              } else {
                break L11;
              }
            }
            L13: {
              if (pb.field_d != qi.field_p) {
                break L13;
              } else {
                if (!ua.b(72)) {
                  break L13;
                } else {
                  L14: {
                    if (255 == ua.field_c) {
                      var9_ref_String = kb.field_q.i(param0 + -208);
                      if (var9_ref_String != null) {
                        qi.a(var9_ref_String, -7011, lk.q(13));
                        break L14;
                      } else {
                        break L14;
                      }
                    } else {
                      tg.field_d = kb.field_q.g((byte) 81);
                      break L14;
                    }
                  }
                  mk.a(false);
                  vb.field_j = false;
                  stackIn_57_0 = ua.field_c;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
            L15: {
              if (wa.field_e == null) {
                if (!vb.field_j) {
                  var9 = ko.field_t;
                  ko.field_t = oi.field_m;
                  vb.field_j = true;
                  oi.field_m = var9;
                  break L15;
                } else {
                  L16: {
                    if ((ib.a((byte) 127) ^ -1L) >= -30001L) {
                      tg.field_d = ja.field_d;
                      break L16;
                    } else {
                      tg.field_d = wc.field_G;
                      break L16;
                    }
                  }
                  vb.field_j = false;
                  stackIn_65_0 = 249;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                break L15;
              }
            }
            stackIn_68_0 = -1;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackIn_71_0 = (RuntimeException) (var7);

            stackIn_71_1 = new StringBuilder().append("od.HA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L17;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');

            if (param2 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L18;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_77_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_75_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L19;
            } else {
              stackIn_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L19;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_72_0), stackIn_78_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_33_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_48_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_57_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_65_0;
                } else {
                  return stackIn_68_0;
                }
              }
            }
          }
        }
    }

    public static void e(boolean param0) {
        field_X = null;
        field_S = null;
        if (param0) {
            field_Z = (String[]) null;
        }
        field_Z = null;
        field_Y = null;
    }

    static {
        field_Y = new int[]{2, 14, 15, 6, 5, 16, 17, 12};
        field_Z = new String[]{"Showing by rating", "Showing by win percentage"};
        field_X = new int[8192];
    }
}
