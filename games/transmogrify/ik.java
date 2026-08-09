/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ik extends a implements df {
    private boolean field_db;
    static tf field_cb;
    private kg field_hb;
    private boolean field_jb;
    private boolean field_gb;
    private qe field_fb;
    static long[] field_ib;
    private boolean field_eb;

    final static String q(int param0) {
        String stackIn_9_0 = null;
        String stackIn_19_0 = null;
        String stackIn_26_0 = null;
        String stackIn_36_0 = null;
        int statePc = 0;
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Transmogrify.field_A ? 1 : 0;
                    var6 = "(" + bd.field_t + " " + nf.field_k + " " + dg.field_a + ") " + ca.field_e;
                    var1 = var6;
                    if (param0 == 48) {
                        statePc = 20;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_cb = (tf) null;
                    if (-1 > (tg.field_a ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return var1;
                }
                case 4: {
                    var1 = var6 + ":";
                    var2 = 0;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var2 < tg.field_a) {
                        statePc = 8;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return var1;
                }
                case 8: {
                    stackIn_19_0 = var1 + ' ';
                    stackIn_9_0 = stackIn_19_0;
                    if (var5 != 0) {
                        statePc = 19;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var15 = stackIn_9_0;
                    var3 = 255 & nf.field_l.field_g[var2];
                    var4 = var3 >> 2035313988;
                    if (10 > var4) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var4 += 55;
                    if (var5 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var4 += 48;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var3 = var3 & 15;
                    if ((var3 ^ -1) > -11) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var3 += 55;
                    if (var5 == 0) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    var3 += 48;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    var16 = var15 + (char)var4;
                    var1 = var16 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (String) (var1);
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    return stackIn_19_0;
                }
                case 20: {
                    if (-1 > (tg.field_a ^ -1)) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    return var1;
                }
                case 22: {
                    var1 = var6 + ":";
                    var2 = 0;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (var2 < tg.field_a) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    return var1;
                }
                case 25: {
                    stackIn_36_0 = var1 + ' ';
                    stackIn_26_0 = stackIn_36_0;
                    if (var5 != 0) {
                        statePc = 36;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var17 = stackIn_26_0;
                    var3 = 255 & nf.field_l.field_g[var2];
                    var4 = var3 >> 2035313988;
                    if (10 > var4) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    var4 += 55;
                    if (var5 == 0) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var4 += 48;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    var3 = var3 & 15;
                    if ((var3 ^ -1) > -11) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    var3 += 55;
                    if (var5 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var3 += 48;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var18 = var17 + (char)var4;
                    var1 = var18 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                        statePc = 23;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_36_0 = (String) (var1);
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    return stackIn_36_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = -121 % ((param2 - 65) / 55);
            if (param0 == 13) {
              this.r(77);
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_5_0 = super.a(param0, param1, (byte) 123, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ik.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_5_0;
        }
    }

    final void t(int param0) {
        this.field_fb.a(true, 4210752, param0);
        ee var2 = new ee((ik) (this), this.field_hb, cc.field_b);
        var2.a(lc.field_L, 15, 1);
        this.b(-21, var2);
    }

    final void a(String param0, int param1, int param2) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ee stackIn_13_0 = null;
        ee stackIn_14_0 = null;
        String stackIn_14_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        ee var6 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (this.field_db) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                stackIn_6_0 = this;

                if (-257 != (param1 ^ -1)) {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 0;
                  break L1;
                } else {
                  stackIn_7_0 = this;
                  stackIn_7_1 = 1;
                  break L1;
                }
              }
              L2: {
                L3: {
                  ((ik) (this)).field_gb = stackIn_7_1 != 0;
                  this.field_db = true;
                  this.field_fb.a(true, 4210752, 8405024);
                  var6 = new ee((ik) (this), this.field_hb, param0);
                  if (5 != param1) {
                    break L3;
                  } else {
                    var6.a(qb.field_a, 11, param2 + 5);
                    var6.a(ta.field_b, 17, param2 + 5);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (param1 == 256) {
                    break L4;
                  } else {
                    L5: {
                      stackIn_13_0 = (ee) (var6);

                      if (!this.field_eb) {
                        stackIn_14_0 = (ee) ((Object) stackIn_13_0);
                        stackIn_14_1 = te.field_f;
                        break L5;
                      } else {
                        stackIn_14_0 = (ee) ((Object) stackIn_13_0);
                        stackIn_14_1 = rc.field_b;
                        break L5;
                      }
                    }
                    ((ee) (Object) stackIn_14_0).a(stackIn_14_1, -1, 1);
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                var6.a((ma) (this), 8283, rc.field_b);
                break L2;
              }
              L6: {
                L7: {
                  if ((param1 ^ -1) == param2) {
                    break L7;
                  } else {
                    L8: {
                      if (-5 != (param1 ^ -1)) {
                        break L8;
                      } else {
                        var6.a(ch.field_a, 8, 1);
                        if (var5 == 0) {
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (6 != param1) {
                        break L9;
                      } else {
                        var6.a(ee.field_C, 9, param2 ^ -3);
                        if (var5 == 0) {
                          break L6;
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (param1 != 9) {
                      break L6;
                    } else {
                      var6.a((ma) (this), param2 + 8287, of.field_b);
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                var6.a(ad.field_f, 7, param2 + 5);
                break L6;
              }
              this.b(-96, var6);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var4);

            stackIn_31_1 = new StringBuilder().append("ik.C(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ik(da param0, kg param1, String param2, boolean param3, boolean param4) {
        super(param0, new ee((ik) null, param1, param2), 77, 10, 10);
        try {
            this.field_eb = param3 ? true : false;
            this.field_gb = false;
            this.field_jb = param4 ? true : false;
            this.field_db = false;
            this.field_hb = param1;
            this.field_fb = new qe(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_fb.field_w = true;
            this.a((qg) (this.field_fb), (byte) -88);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void s(int param0) {
        field_ib = null;
        field_cb = null;
        int var1 = -30 % ((param0 - 50) / 47);
    }

    final void r(int param0) {
        if (!this.field_A) {
          return;
        } else {
          this.field_A = false;
          if (param0 == 77) {
            if (!this.field_eb) {
              if (!this.field_jb) {
                return;
              } else {
                ff.a((byte) -124);
                return;
              }
            } else {
              ai.b(param0 + -202);
              if (Transmogrify.field_A) {
                L0: {
                  if (this.field_jb) {
                    ff.a((byte) -124);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              } else {
                return;
              }
            }
          } else {
            this.r(-69);
            if (this.field_eb) {
              ai.b(param0 + -202);
              if (!Transmogrify.field_A) {
                return;
              } else {
                L1: {
                  if (this.field_jb) {
                    ff.a((byte) -124);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return;
              }
            } else {
              L2: {
                if (this.field_jb) {
                  ff.a((byte) -124);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          }
        }
    }

    final static ti[] a(String param0, ci param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ti[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 <= -15) {
                break L1;
              } else {
                field_cb = (tf) null;
                break L1;
              }
            }
            var4_int = param1.b(81, param0);
            var5 = param1.a(-1, param3, var4_int);
            stackIn_3_0 = cc.a(var5, param1, -42, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ik.EA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public void a(lj param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 17) {
                break L1;
              } else {
                this.field_jb = false;
                break L1;
              }
            }
            L2: {
              if (!this.field_gb) {
                break L2;
              } else {
                ba.a(123, 3);
                this.r(77);
                if (!Transmogrify.field_A) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            ia.a(ha.b(105), 6, "tochangedisplayname.ws");
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("ik.MA(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_cb = new tf(14, 0, 4, 1);
        field_ib = new long[32];
    }
}
