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
        int[] array$0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        aj var7 = null;
        int var8 = 0;
        int var9 = 0;
        wk var10 = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param2 ^ -1) == -2) {
                this.field_n = eh.a(false, '<', param1.l(-1));
                break L1;
              } else {
                if (-3 != (param2 ^ -1)) {
                  if (-4 != (param2 ^ -1)) {
                    if (-5 == (param2 ^ -1)) {
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_int = param1.e((byte) 62);
                    this.field_t = new int[var4_int];
                    this.field_v = new int[var4_int][];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        L3: {
                          var6 = param1.n(param0 + -94);
                          var7 = no.a(var6, 0);
                          if (var7 != null) {
                            this.field_t[var5] = var6;
                            array$0 = new int[var7.field_e];
                            this.field_v[var5] = array$0;
                            var8 = 0;
                            L4: while (true) {
                              if (var8 >= var7.field_e) {
                                break L3;
                              } else {
                                this.field_v[var5][var8] = param1.n(-98);
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
                  this.field_u = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= var4_int) {
                      break L1;
                    } else {
                      this.field_u[var5] = param1.n(-98);
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
                var10 = (wk) null;
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
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("tk.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
        }
    }

    final void a(wk param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == -22034) {
              L1: while (true) {
                var3_int = param0.e((byte) -92);
                if (-1 != (var3_int ^ -1)) {
                  this.a(-4, param0, var3_int);
                  continue L1;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
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
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("tk.F(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean f(byte param0) {
        if (param0 > -94) {
            field_p = (String) null;
        }
        return null != wd.field_a ? true : false;
    }

    final static int a(int param0, int param1) {
        if (param0 != -4) {
            String var3 = (String) null;
            tk.a(true, 5, (String) null, (String) null, 9, (String) null, (byte) 92);
        }
        if (param1 < 0) {
            if (param1 >= -65536) {
                return -sn.field_H[-param1 >> -993026875];
            }
            return sn.field_H[134217728 / -param1] + -2048;
        }
        if (65536 >= param1) {
            return sn.field_H[param1 >> -1016755547];
        }
        return -sn.field_H[134217728 / param1] + 2048;
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (!(null == this.field_u)) {
            for (var2 = 0; this.field_u.length > var2; var2++) {
                this.field_u[var2] = fj.b(this.field_u[var2], 32768);
            }
        }
        if (param0 > -122) {
            field_o = (String) null;
        }
    }

    final String c(boolean param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (!param0) {
            return (String) null;
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == this.field_n) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_n[0]);
        for (var3 = 1; var3 < this.field_n.length; var3++) {
            discarded$1 = var2.append("...");
            discarded$2 = var5.append(this.field_n[var3]);
        }
        return var2.toString();
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3;
        String var4;
        Object var5;
        String var6;
        CharSequence var7;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            tk.c(-48);
            break L0;
          }
        }
        L1: {
          if (tc.field_A == null) {
            break L1;
          } else {
            var3 = tc.field_A.b(false, param1);
            if (var3 == 0) {
              break L1;
            } else {
              L2: {
                if (var3 != 2) {
                  break L2;
                } else {
                  if (tc.field_A.field_rb == null) {
                    break L2;
                  } else {
                    if (!tc.field_A.field_rb.equals("")) {
                      L3: {
                        if (tc.field_A.field_rb.charAt(0) != 91) {
                          var7 = (CharSequence) ((Object) tc.field_A.field_rb);
                          var4 = gk.a(var7, param0 ^ -13);
                          break L3;
                        } else {
                          var4 = tc.field_A.field_rb;
                          break L3;
                        }
                      }
                      L4: {
                        var5 = null;
                        if (vd.field_h == 0) {
                          var5 = bo.a(var4, (byte) -26, param2);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (1 == vd.field_h) {
                          var5 = oe.a(var4, 29140, param2);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (-3 == (vd.field_h ^ -1)) {
                          var5 = eh.a((byte) -48, param2, var4);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if ((vd.field_h ^ -1) != -4) {
                          break L7;
                        } else {
                          var5 = hf.a(var4, var4, param2, param0 ^ 10068666);
                          break L7;
                        }
                      }
                      L8: {
                        if (var5 == null) {
                          break L8;
                        } else {
                          var6 = (String) null;
                          ao.a(0, (byte) 126, (String) (var5), var4, 2, (String) null);
                          break L8;
                        }
                      }
                      tc.field_A = null;
                      vd.field_h = -1;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              tc.field_A = null;
              vd.field_h = -1;
              break L1;
            }
          }
        }
    }

    final static int a(boolean param0, int param1, String param2, String param3, int param4, String param5, byte param6) {
        hc var7 = null;
        RuntimeException var7_ref = null;
        hc var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param6 == -110) {
              var7 = new hc(param2);
              var8 = new hc(param5);
              stackIn_4_0 = cj.a(param0, (byte) -91, param1, var8, param4, var7, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -107;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7_ref);

            stackIn_7_1 = new StringBuilder().append("tk.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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

            if (param3 == null) {
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


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param4).append(',');

            if (param5 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void c(int param0) {
        field_p = null;
        field_s = null;
        if (param0 != -1016755547) {
            field_q = (boolean[]) null;
        }
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
        field_p = "Unit cap has been reached";
        field_m = "When the armageddon counter reaches zero, powerful spells will erupt all over the landscape, making it a very dangerous place to be.";
        field_o = "You must be a member to earn wands.";
        field_s = " charges left";
        field_w = "Nature spells focus on trapping enemies and controlling the battlefield.";
        field_r = "Frost spells focus on high damage attacks and the summoning of powerful minions.";
    }
}
