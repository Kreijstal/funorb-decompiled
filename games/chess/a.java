/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a extends java.awt.Canvas implements java.awt.event.FocusListener {
    static long field_f;
    static String field_j;
    static String field_k;
    static String field_e;
    static int[] field_c;
    static String field_i;
    static boolean field_d;
    volatile boolean field_b;
    java.awt.Frame field_g;
    static tg field_a;
    static float field_h;

    final void a(jk param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              wf.a(this.field_g, param0, param1 ^ -103);
              if (param1 == -3) {
                break L1;
              } else {
                a.a((byte) 81, 'O', -12);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("a.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static String a(int param0, String param1, byte param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        nk var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        Object stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param1);
            if (!ed.a(var6, 21257)) {
              stackIn_3_0 = qj.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!qd.a((byte) 13, param1)) {
                if ((ld.field_g ^ -1) == -3) {
                  if (va.a(param1, -19554)) {
                    stackIn_13_0 = oc.a(dh.field_g, new String[]{param1}, (byte) -94);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (wc.field_v < 100) {
                      if (!ah.a(param1, -52)) {
                        if (param2 == 64) {
                          var5 = qn.field_U;
                          var5.f(param0, param2 + -165);
                          var5.field_l = var5.field_l + 1;
                          var4 = var5.field_l;
                          var5.c(2, (byte) 68);
                          var5.a(-121, param1);
                          var5.a(-var4 + var5.field_l, -1);
                          stackIn_24_0 = null;
                          decompiledRegionSelector0 = 7;
                          break L0;
                        } else {
                          stackIn_22_0 = (String) null;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_19_0 = oc.a(mf.field_B, new String[]{param1}, (byte) -85);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_16_0 = nb.field_Hb;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_9_0 = td.field_j;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = ed.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("a.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L1;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_19_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_22_0;
                    } else {
                      return (String) ((Object) stackIn_24_0);
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static aj a(String[] args, int param1) {
        aj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        aj stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = new aj(false);
            var3 = -37 / ((-21 - param1) / 51);
            var2.field_a = args;
            stackIn_1_0 = (aj) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2_ref);

            stackIn_4_1 = new StringBuilder().append("a.C(");

            if (args == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        String var2;
        field_e = null;
        field_i = null;
        field_k = null;
        field_j = null;
        field_c = null;
        if (param0 != -9) {
          var2 = (String) null;
          a.a(19, (String) null, (byte) 40);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static java.awt.Container a(byte param0) {
        if (param0 != -110) {
            return (java.awt.Container) null;
        }
        if (lk.field_a != null) {
            return (java.awt.Container) ((Object) lk.field_a);
        }
        return (java.awt.Container) ((Object) bh.i(81));
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        String[] var4 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        Object stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (-4 != (param0 ^ -1)) {
              if ((param0 ^ -1) != -7) {
                if ((param0 ^ -1) == -8) {
                  stackIn_9_0 = jf.field_g;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (-9 == (param0 ^ -1)) {
                    stackIn_13_0 = lf.field_P;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((param0 ^ -1) == -10) {
                      stackIn_17_0 = ma.field_F;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (param0 == 10) {
                        stackIn_21_0 = dj.field_q;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (param0 == 11) {
                          stackIn_25_0 = hk.field_N;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (-15 != (param0 ^ -1)) {
                            if (param2 != -3) {
                              var4 = (String[]) null;
                              a.a((String[]) null, -18);
                              stackIn_32_0 = null;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              return null;
                            }
                          } else {
                            stackIn_28_0 = oc.a(hn.field_b, new String[]{param1}, (byte) -119);
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                stackIn_5_0 = hk.field_L;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = uj.field_o;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("a.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L1;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_28_0;
                      } else {
                        return (String) ((Object) stackIn_32_0);
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        try {
            param1.setFocusTraversalKeysEnabled(false);
            int var2_int = 15 / ((param0 - 36) / 59);
            param1.addKeyListener(lg.field_d);
            param1.addFocusListener(lg.field_d);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "a.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        try {
            this.field_b = true;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "a.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    a() {
    }

    final static String a(byte param0, char param1, int param2) {
        char[] var3;
        int var4;
        int var5;
        char[] var6;
        var5 = Chess.field_G;
        var6 = new char[param2];
        var3 = var6;
        var4 = 0;
        L0: while (true) {
          if (param2 <= var4) {
            if (param0 < 55) {
              field_k = (String) null;
              return new String(var3);
            } else {
              return new String(var3);
            }
          } else {
            var6[var4] = param1;
            var4++;
            continue L0;
          }
        }
    }

    static {
        field_e = "Chat is currently disabled.";
        field_i = "Enter name of friend to delete from list";
        field_k = "Private";
        field_j = "You are invited to <%0>'s game.";
    }
}
