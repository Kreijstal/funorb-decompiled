/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pn extends vb {
    static String field_fb;
    private rk field_gb;
    static String[] field_bb;
    static int field_ab;
    private rk field_hb;
    private boolean field_cb;
    static boolean field_db;
    static int[] field_eb;
    private rk field_ib;

    final static void a(int param0, long param1, String param2) {
        CharSequence var5 = null;
        try {
            ed.field_c = param2;
            pk.field_r = 2;
            var5 = (CharSequence) ((Object) param2);
            cf.field_c = kf.a(var5, (byte) 2);
            int var4_int = -54 / ((-27 - param0) / 54);
            fm.field_d = param1;
            v.b(0);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "pn.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 > -103) {
            return;
        }
        super.a(param0, -120, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        param0 = param0 + this.field_u;
        param3 = param3 + this.field_D;
        this.a(param0, n.field_d, param3, this.field_gb, 0);
        this.a(param0, ql.field_a, param3, this.field_hb, 0);
        this.a(param0, pf.field_c, param3, this.field_ib, 0);
    }

    final static void a(int param0, int param1, boolean param2, int param3, String param4, int param5, int param6, int param7) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              if (param5 >= 126) {
                break L1;
              } else {
                pn.a(false, true, false);
                break L1;
              }
            }
            L2: {
              if (0 != sk.field_c.field_ob) {
                if (wc.field_n) {
                  break L2;
                } else {
                  if (wl.field_p) {
                    aj.a(-1045);
                    break L2;
                  } else {
                    jg.field_i = true;
                    if (!client.field_A) {
                      break L2;
                    } else {
                      aj.a(-1045);
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (!jg.field_i) {
                break L3;
              } else {
                jb.a(20, param3, 113, param1, param7, param6, param6, param4, param0);
                tf.field_gb.a(false, param2);
                if (param2) {
                  L4: {
                    if (ve.field_vc.field_ob == 0) {
                      break L4;
                    } else {
                      jg.field_i = false;
                      break L4;
                    }
                  }
                  if (bf.field_v.field_ob == 0) {
                    break L3;
                  } else {
                    qk.a((byte) 94);
                    jg.field_i = false;
                    return;
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var8);

            stackIn_20_1 = new StringBuilder().append("pn.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private pn(gl param0, boolean param1) {
        super(0, 0, 0, 0, (gl) null);
        RuntimeException runtimeException = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_gb = (rk) ((Object) new og("", (kg) null, 2));
              this.field_hb = (rk) ((Object) new og("", (kg) null, 2));
              this.field_ib = (rk) ((Object) new og("", (kg) null, 4));
              this.field_ib.field_p = param0;
              this.field_hb.field_p = param0;
              this.field_gb.field_p = param0;
              stackIn_3_0 = this;

              if (!param1) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              L3: {
                ((pn) (this)).field_cb = stackIn_4_1 != 0;
                if (this.field_cb) {
                  break L3;
                } else {
                  this.b(this.field_gb, (byte) -55);
                  this.b(this.field_hb, (byte) -55);
                  if (!client.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.b(this.field_hb, (byte) -55);
              this.b(this.field_gb, (byte) -55);
              break L2;
            }
            this.b(this.field_ib, (byte) -55);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (runtimeException);

            stackIn_11_1 = new StringBuilder().append("pn.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final int b(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_4_0 = -1 + Integer.parseInt(this.field_hb.field_E);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 6;
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

    final static void a(int param0, wl param1) {
        int var2_int = 0;
        try {
            dj.field_Y = param1.e(3) << -610206843;
            var2_int = param1.d((byte) -39);
            tj.field_Pb = var2_int << 1424118994 & 1835008;
            dj.field_Y = dj.field_Y + (var2_int >> 1911408259);
            tj.field_Pb = tj.field_Pb + (param1.e(3) << 697928706);
            var2_int = param1.d((byte) -59);
            oc.field_c = (var2_int & param0) << -2074046513;
            tj.field_Pb = tj.field_Pb + (var2_int >> 1459247494);
            oc.field_c = oc.field_c + (param1.d((byte) -105) << 2087446055);
            var2_int = param1.d((byte) -81);
            vm.field_s = (1 & var2_int) << -1105099568;
            oc.field_c = oc.field_c + (var2_int >> -344219967);
            vm.field_s = vm.field_s + param1.e(param0 + -60);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "pn.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    pn(gl param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
            this.b(param5, param4, param2, param3, -16555);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "pn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final String c(byte param0) {
        String var2;
        String stackIn_7_0 = null;
        var2 = this.field_hb.c(param0);
        if (var2 != null) {
          return var2;
        } else {
          if (!this.field_q) {
            return null;
          } else {
            L0: {
              if (null != this.field_B) {
                stackIn_7_0 = this.field_B;
                break L0;
              } else {
                stackIn_7_0 = this.field_E;
                break L0;
              }
            }
            return stackIn_7_0;
          }
        }
    }

    final int i(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == -22079) {
            break L0;
          } else {
            this.field_ib = (rk) null;
            break L0;
          }
        }
        try {
          L1: {
            stackIn_3_0 = Integer.parseInt(this.field_gb.field_E);
            break L1;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final void a(byte param0, qf param1) {
        try {
            super.a((byte) 88, param1);
            if (param0 < 74) {
                wb var4 = (wb) null;
                pn.a((wb) null, (wb) null, true);
            }
            this.field_gb.field_v = (kg) ((Object) param1);
            this.field_hb.field_v = (kg) ((Object) param1);
            this.field_ib.field_v = (kg) ((Object) param1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "pn.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(wb param0, wb param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        wb var5 = null;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                var5 = (wb) null;
                pn.a((wb) null, (wb) null, true);
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = -param0.field_Xb + param1.field_Xb;
                if (f.field_w != param1.field_Vb) {
                  break L3;
                } else {
                  var3_int -= 200;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (param1.field_Vb != null) {
                break L2;
              } else {
                var3_int += 200;
                break L2;
              }
            }
            L4: {
              L5: {
                if (f.field_w == param0.field_Vb) {
                  break L5;
                } else {
                  if (param0.field_Vb != null) {
                    break L4;
                  } else {
                    var3_int -= 200;
                    if (var4 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              var3_int += 200;
              break L4;
            }
            L6: {
              if (-1 <= (var3_int ^ -1)) {
                stackIn_16_0 = 0;
                break L6;
              } else {
                stackIn_16_0 = 1;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("pn.U(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L7;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ',' + param2 + ')');
        }
        return stackIn_16_0 != 0;
    }

    public static void l(int param0) {
        field_bb = null;
        field_eb = null;
        field_fb = null;
        if (param0 != 33) {
            field_ab = 39;
        }
    }

    private final void a(int param0, String param1, int param2, ce param3, int param4) {
        try {
            if (param4 != 0) {
                this.field_ib = (rk) null;
            }
            bj.field_f.b(param1, (param3.field_t >> 1492292289) + param3.field_u + param0, param2 + (param3.field_D - 5), 16777215, -1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "pn.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        super.b(param0, param1, param2, param3, -16555);
        var6 = param1 - 130 >> 401361505;
        if (this.field_cb) {
          this.field_hb.b(param0, 25, var6, 0, -16555);
          this.field_gb.b(param0, 25, 45 + var6, 0, -16555);
          if (client.field_A) {
            this.field_gb.b(param0, 25, var6, 0, -16555);
            this.field_hb.b(param0, 25, 45 + var6, 0, param4 + 0);
            this.field_ib.b(param0, 40, var6 - -90, 0, param4);
            return;
          } else {
            this.field_ib.b(param0, 40, var6 - -90, 0, param4);
            return;
          }
        } else {
          this.field_gb.b(param0, 25, var6, 0, -16555);
          this.field_hb.b(param0, 25, 45 + var6, 0, param4 + 0);
          this.field_ib.b(param0, 40, var6 - -90, 0, param4);
          return;
        }
    }

    final int f(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == 48) {
            break L0;
          } else {
            field_db = false;
            break L0;
          }
        }
        try {
          L1: {
            stackIn_3_0 = Integer.parseInt(this.field_ib.field_E);
            break L1;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final boolean k(int param0) {
        if (this.field_gb.field_E != null) {
          if (0 != this.field_gb.field_E.length()) {
            if (param0 > 64) {
              if (null != this.field_hb.field_E) {
                if (0 != this.field_hb.field_E.length()) {
                  if (this.field_ib.field_E != null) {
                    if (this.field_ib.field_E.length() == 0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static we a(String param0, int param1, int param2) {
        sc var3 = null;
        RuntimeException var3_ref = null;
        sc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new sc();
              ((we) ((Object) var3)).field_d = param0;
              if (param2 == 23155) {
                break L1;
              } else {
                pn.l(-1);
                break L1;
              }
            }
            ((we) ((Object) var3)).field_f = param1;
            stackIn_3_0 = (sc) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("pn.Q(");

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
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (we) ((Object) stackIn_3_0);
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        RuntimeException runtimeException = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        cd.a(true);
                        gh.field_e = null;
                        kf.field_I = new qc(false, 0, false, 0, 0, 3, 0, (String[]) null, 0, false, param1, param0);
                        if (param1) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        kf.field_I.field_p.a(new in(sk.field_i, 10, false), 2777);
                        if (var5 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        kf.field_I.field_p.a(new in(ka.field_M, 10, false), 2777);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        am.field_c = param2;
                        gk.field_Ib = false;
                        var8 = j.field_d;
                        var7 = var8;
                        var6 = var7;
                        var3 = var6;
                        var4 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((var4 ^ -1) <= -9) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var8[var4] = 0;
                        var4++;
                        if (var5 != 0) {
                            statePc = 13;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var5 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        nn.a(kf.field_I.b(param2), sb.field_u[0][0], true);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw dh.a((Throwable) ((Object) runtimeException), "pn.V(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_ab = 0;
        field_eb = new int[]{40, 33, 27, 22, 18, 15, 12, 10, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    }
}
