/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends pa {
    static dd[] field_t;
    static String field_x;
    private int[] field_u;
    private int[][] field_s;
    private String[] field_y;
    static long field_w;
    static dd field_v;
    static int field_q;
    int[] field_z;
    static String field_r;

    private final void a(ni param0, int param1, int param2) {
        int[] array$0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        fh var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 == 4) {
              L1: {
                if ((param1 ^ -1) != -2) {
                  L2: {
                    if (param1 == 2) {
                      var4_int = param0.e(false);
                      this.field_z = new int[var4_int];
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= var4_int) {
                          break L2;
                        } else {
                          this.field_z[var5] = param0.d((byte) -122);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      if (param1 == 3) {
                        var4_int = param0.e(false);
                        this.field_s = new int[var4_int][];
                        this.field_u = new int[var4_int];
                        var5 = 0;
                        L4: while (true) {
                          if (var4_int <= var5) {
                            break L2;
                          } else {
                            L5: {
                              var6 = param0.d((byte) -75);
                              var7 = ql.a(param2 ^ -22467, var6);
                              if (var7 != null) {
                                this.field_u[var5] = var6;
                                array$0 = new int[var7.field_c];
                                this.field_s[var5] = array$0;
                                var8 = 0;
                                L6: while (true) {
                                  if (var7.field_c <= var8) {
                                    break L5;
                                  } else {
                                    this.field_s[var5][var8] = param0.d((byte) -73);
                                    var8++;
                                    continue L6;
                                  }
                                }
                              } else {
                                break L5;
                              }
                            }
                            var5++;
                            continue L4;
                          }
                        }
                      } else {
                        if (param1 == 4) {
                          break L2;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  break L1;
                } else {
                  this.field_y = m.a('<', 123, param0.h(0));
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("aj.E(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        if (param0 != 0) {
            return;
        }
        try {
            ea.a(120, (java.awt.Component) ((Object) param1));
            il.a(false, (java.awt.Component) ((Object) param1));
            if (null != ui.field_pb) {
                ui.field_pb.a(0, (java.awt.Component) ((Object) param1));
            }
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "aj.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String c(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = fleas.field_A ? 1 : 0;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        if (!(this.field_y != null)) {
            return "";
        }
        if (param0 < 74) {
            String var5 = (String) null;
            aj.a((String) null, 106);
        }
        StringBuilder discarded$0 = var6.append(this.field_y[0]);
        for (var3 = 1; this.field_y.length > var3; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var6.append(this.field_y[var3]);
        }
        return var2.toString();
    }

    final static void a(byte param0, Object param1, ce param2) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param2.field_a == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -60) {
                  break L1;
                } else {
                  field_x = (String) null;
                  break L1;
                }
              }
              var3_int = 0;
              L2: while (true) {
                L3: {
                  if (-51 >= (var3_int ^ -1)) {
                    break L3;
                  } else {
                    if (null == param2.field_a.peekEvent()) {
                      break L3;
                    } else {
                      vh.a(1L, 49);
                      var3_int++;
                      continue L2;
                    }
                  }
                }
                try {
                  L4: {
                    L5: {
                      if (param1 != null) {
                        param2.field_a.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param1, 1001, "dummy")));
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    break L4;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L6;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("aj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void g(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = sg.field_i;
        synchronized (var1) {
          L0: {
            kc.field_f = lk.field_J;
            m.field_a = m.field_a + 1;
            ag.field_f = gd.field_a;
            kc.field_b = vf.field_p;
            pl.field_c = ag.field_a;
            ag.field_a = false;
            jk.field_r = vk.field_O;
            pb.field_d = fb.field_b;
            ob.field_e = th.field_s;
            vk.field_O = 0;
            break L0;
          }
        }
        L1: {
          if (param0 == 28003) {
            break L1;
          } else {
            field_x = (String) null;
            break L1;
          }
        }
    }

    final void a(ni param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 == 4) {
              L1: while (true) {
                var3_int = param0.e(false);
                if (-1 == (var3_int ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  this.a(param0, var3_int, 4);
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("aj.C(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(CharSequence[] param0, int param1, byte param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (-1 != (param3 ^ -1)) {
              if (1 == param3) {
                var10 = param0[param1];
                var4 = var10;
                if (var4 != null) {
                  stackIn_10_0 = var10.toString();
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_8_0 = "null";
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L1: {
                  var4_int = param1 + param3;
                  if (param2 < -75) {
                    break L1;
                  } else {
                    field_w = -65L;
                    break L1;
                  }
                }
                var5 = 0;
                var6_int = param1;
                L2: while (true) {
                  if (var6_int >= var4_int) {
                    var6 = new StringBuilder(var5);
                    var7 = param1;
                    L3: while (true) {
                      if (var7 >= var4_int) {
                        stackIn_26_0 = var6.toString();
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L4: {
                          var8 = param0[var7];
                          if (var8 != null) {
                            discarded$3 = var6.append(var8);
                            break L4;
                          } else {
                            discarded$4 = var6.append("null");
                            break L4;
                          }
                        }
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      var7_ref_CharSequence = param0[var6_int];
                      if (var7_ref_CharSequence != null) {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L5;
                      } else {
                        var5 += 4;
                        break L5;
                      }
                    }
                    var6_int++;
                    continue L2;
                  }
                }
              }
            } else {
              stackIn_3_0 = "";
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var4_ref);

            stackIn_29_1 = new StringBuilder().append("aj.F(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L6;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L6;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_26_0;
            }
          }
        }
    }

    public static void f(int param0) {
        field_t = null;
        field_r = null;
        field_x = null;
        int var1 = 34 % ((-22 - param0) / 33);
        field_v = null;
    }

    final static ve a(String param0, int param1) {
        RuntimeException var2 = null;
        ce var3 = null;
        ve stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!uc.field_c.a(-48)) {
                break L1;
              } else {
                if (!param0.equals(uc.field_c.c(param1 + -16954))) {
                  uc.field_c = pk.a((byte) 68, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 == -1) {
                break L2;
              } else {
                var3 = (ce) null;
                aj.a((byte) -26, (Object) null, (ce) null);
                break L2;
              }
            }
            stackIn_7_0 = uc.field_c;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("aj.G(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    aj() {
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = fleas.field_A ? 1 : 0;
        if (null != this.field_z) {
            for (var2 = 0; this.field_z.length > var2; var2++) {
                this.field_z[var2] = ne.a(this.field_z[var2], 32768);
            }
        }
        if (param0 != 0) {
            aj.g(-113);
        }
    }

    static {
        field_x = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_r = "Email address is unavailable";
    }
}
