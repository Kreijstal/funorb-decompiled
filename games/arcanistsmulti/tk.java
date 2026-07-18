/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends tf {
    private int[] field_t;
    static String field_o;
    static qb[] field_x;
    static String field_p;
    static boolean[] field_q;
    static String field_w;
    static String field_m;
    static String field_s;
    private int[][] field_v;
    private String[] field_n;
    int[] field_u;
    static String field_r;

    private final void a(int param0, wk param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        aj var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                ((tk) this).field_n = eh.a(false, '<', param1.l(-1));
                break L1;
              } else {
                if (param2 != 2) {
                  if (param2 != 3) {
                    if (param2 == 4) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param1.e((byte) 62);
                    ((tk) this).field_t = new int[var4_int];
                    ((tk) this).field_v = new int[var4_int][];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L3: {
                          var6 = param1.n(param0 + -94);
                          var7 = no.a(var6, 0);
                          if (var7 != null) {
                            ((tk) this).field_t[var5] = var6;
                            ((tk) this).field_v[var5] = new int[var7.field_e];
                            var8 = 0;
                            L4: while (true) {
                              if (~var8 <= ~var7.field_e) {
                                break L3;
                              } else {
                                ((tk) this).field_v[var5][var8] = param1.n(-98);
                                var8++;
                                continue L4;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  var4_int = param1.e((byte) 120);
                  ((tk) this).field_u = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (~var5 <= ~var4_int) {
                      break L1;
                    } else {
                      ((tk) this).field_u[var5] = param1.n(-98);
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
            }
            L6: {
              if (param0 == -4) {
                break L6;
              } else {
                var10 = null;
                this.a(5, (wk) null, -90);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("tk.D(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ')');
        }
    }

    final void a(wk param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == -22034) {
              L1: while (true) {
                var3_int = param0.e((byte) -92);
                if (var3_int != 0) {
                  this.a(-4, param0, var3_int);
                  continue L1;
                } else {
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("tk.F(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    final static boolean f(byte param0) {
        if (param0 > -94) {
            field_p = null;
        }
        return null != wd.field_a ? true : false;
    }

    final static int a(int param0, int param1) {
        if (param1 < 0) {
            if (param1 >= -65536) {
                return -sn.field_H[-param1 >> 5];
            }
            return sn.field_H[134217728 / -param1] + -2048;
        }
        if (65536 >= param1) {
            return sn.field_H[param1 >> 5];
        }
        return -sn.field_H[134217728 / param1] + 2048;
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (!(null == ((tk) this).field_u)) {
            for (var2 = 0; ((tk) this).field_u.length > var2; var2++) {
                ((tk) this).field_u[var2] = fj.b(((tk) this).field_u[var2], 32768);
            }
        }
        if (param0 > -122) {
            field_o = null;
        }
    }

    final String c(boolean param0) {
        int var3 = 0;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (!param0) {
            return null;
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == ((tk) this).field_n) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((tk) this).field_n[0]);
        for (var3 = 1; var3 < ((tk) this).field_n.length; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((tk) this).field_n[var3]);
        }
        return var2.toString();
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        String var4 = null;
        Object var5 = null;
        Object var6 = null;
        CharSequence var7 = null;
        L0: {
          if (tc.field_A == null) {
            break L0;
          } else {
            var3 = tc.field_A.b(false, param1);
            if (var3 == 0) {
              break L0;
            } else {
              L1: {
                if (var3 != 2) {
                  break L1;
                } else {
                  if (tc.field_A.field_rb == null) {
                    break L1;
                  } else {
                    if (!tc.field_A.field_rb.equals((Object) (Object) "")) {
                      L2: {
                        if (tc.field_A.field_rb.charAt(0) != 91) {
                          var7 = (CharSequence) (Object) tc.field_A.field_rb;
                          var4 = gk.a(var7, -13);
                          break L2;
                        } else {
                          var4 = tc.field_A.field_rb;
                          break L2;
                        }
                      }
                      L3: {
                        var5 = null;
                        if (vd.field_h == 0) {
                          var5 = (Object) (Object) bo.a(var4, (byte) -26, param2);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if (1 == vd.field_h) {
                          var5 = (Object) (Object) oe.a(var4, 29140, param2);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (vd.field_h == 2) {
                          var5 = (Object) (Object) eh.a((byte) -48, param2, var4);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (vd.field_h != 3) {
                          break L6;
                        } else {
                          int discarded$1 = 10068666;
                          var5 = (Object) (Object) hf.a(var4, var4, param2);
                          break L6;
                        }
                      }
                      L7: {
                        if (var5 == null) {
                          break L7;
                        } else {
                          var6 = null;
                          ao.a(0, (byte) 126, (String) var5, var4, 2, (String) null);
                          break L7;
                        }
                      }
                      tc.field_A = null;
                      vd.field_h = -1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              tc.field_A = null;
              vd.field_h = -1;
              break L0;
            }
          }
        }
    }

    final static int a(boolean param0, int param1, String param2, String param3, int param4, String param5) {
        hc var7 = null;
        RuntimeException var7_ref = null;
        hc var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var7 = new hc(param2);
            var8 = new hc(param5);
            stackOut_2_0 = cj.a(param0, (byte) -91, param1, var8, param4, var7, param3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7_ref;
            stackOut_4_1 = new StringBuilder().append("tk.C(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + -110 + ')');
        }
        return stackIn_3_0;
    }

    public static void c() {
        field_p = null;
        field_s = null;
        field_w = null;
        field_m = null;
        field_o = null;
        field_r = null;
        field_x = null;
        field_q = null;
    }

    tk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Unit cap has been reached";
        field_m = "When the armageddon counter reaches zero, powerful spells will erupt all over the landscape, making it a very dangerous place to be.";
        field_o = "You must be a member to earn wands.";
        field_s = " charges left";
        field_w = "Nature spells focus on trapping enemies and controlling the battlefield.";
        field_r = "Frost spells focus on high damage attacks and the summoning of powerful minions.";
    }
}
