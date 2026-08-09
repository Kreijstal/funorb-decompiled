/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ee {
    private di field_e;
    static String field_a;
    private di field_c;
    static int[] field_b;
    private fg field_d;

    final static void a(int param0, int param1) {
        if (param1 > -37) {
            field_a = (String) null;
        }
        oh.field_e = 1000000000L / (long)param0;
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -66) {
            field_b = (int[]) null;
        }
        field_b = null;
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        oa var13;
        StringWriter var14;
        String var15;
        String var16;
        String var17;
        String var18;
        L0: {
          if (!(param1 instanceof oa)) {
            var2 = "";
            var11 = var2;
            break L0;
          } else {
            var13 = (oa) ((Object) param1);
            var2 = var13.field_i + " | ";
            param1 = var13.field_c;
            break L0;
          }
        }
        L1: {
          var14 = new StringWriter();
          var4 = new PrintWriter((Writer) ((Object) var14));
          param1.printStackTrace(var4);
          var4.close();
          var5 = var14.toString();
          var2 = var5;
          var11 = var5;
          if (param0 == 5) {
            break L1;
          } else {
            field_b = (int[]) null;
            break L1;
          }
        }
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        var2 = var7;
        var11 = var7;
        L2: while (true) {
          var8 = var6.readLine();
          var2 = var8;
          var11 = var8;
          var2 = var11;
          if (var8 != null) {
            L3: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (var9 == -1) {
                var11 = var8;
                var2 = var11;
                var2 = var11;
                break L3;
              } else {
                var11 = var8.substring(0, var9);
                break L3;
              }
            }
            L4: {
              var15 = var11.trim();
              var2 = var15;
              var2 = var15;
              var16 = var15.substring(var15.lastIndexOf(' ') - -1);
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(var16.lastIndexOf('\t') - -1);
              var2 = var17;
              var2 = var17;
              var18 = var2 + var17;
              var2 = var18;
              var2 = var18;
              var2 = var18;
              if ((var9 ^ -1) == 0) {
                break L4;
              } else {
                if (-1 == var10) {
                  break L4;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 < 0) {
                    break L4;
                  } else {
                    var2 = var18 + var8.substring(var12 + 5, var10);
                    break L4;
                  }
                }
              }
            }
            var2 = var2 + ' ';
            continue L2;
          } else {
            var2 = var11;
            var11 = var2;
            var2 = var11;
            var2 = var2 + "| " + var7;
            return var2;
          }
        }
    }

    final static int b(byte param0) {
        if (param0 >= -51) {
            field_b = (int[]) null;
        }
        return -fk.field_Z + ah.field_i;
    }

    final static void a(pn param0, int param1) {
        int var2_int = 0;
        pn var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            if (param1 > 64) {
              if (param0.field_f != null) {
                L1: {
                  L2: {
                    if (param0.field_m != 0) {
                      break L2;
                    } else {
                      if (-1 != (param0.field_e ^ -1)) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var2_int = 0;
                  L3: while (true) {
                    if (var2_int >= aa.field_e) {
                      break L1;
                    } else {
                      L4: {
                        var3 = wb.field_e[var2_int];
                        if ((var3.field_p ^ -1) != -3) {
                          break L4;
                        } else {
                          if (param0.field_m != var3.field_m) {
                            break L4;
                          } else {
                            if (param0.field_e == var3.field_e) {
                              decompiledRegionSelector0 = 2;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var2_int++;
                      continue L3;
                    }
                  }
                }
                L5: {
                  if (param0.field_d == null) {
                    break L5;
                  } else {
                    hp.field_a = param0.field_b;
                    ro.field_s = param0.field_q;
                    rn.field_g = param0.field_d;
                    hg.field_a = param0.field_p;
                    break L5;
                  }
                }
                oa.a(-114, param0);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("ee.F(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static pn a(byte param0, boolean param1) {
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_25_0 = null;
        Throwable decompiledCaughtException = null;
        oq var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        oq var8 = null;
        ap var9 = null;
        L0: {
          var7 = Pool.field_O;
          var8 = kn.field_e;
          var2 = var8;
          var3 = var8.g(-111);
          if (-1 == (var3 & 128 ^ -1)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          qg.field_d = stackIn_3_0 != 0;
          um.field_d = var3 & 127;
          df.field_e = var8.g(-105);
          qg.field_c = var8.h(-412303328);
          if (2 != um.field_d) {
            m.field_e = 0;
            wq.field_a = 0;
            break L1;
          } else {
            wq.field_a = var8.d(-1034);
            m.field_e = var8.f(98);
            break L1;
          }
        }
        L2: {
          if ((var8.g(param0 ^ 94) ^ -1) != -2) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = 1;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          n.field_S = var8.j(-105);
          if (param0 == -31) {
            break L3;
          } else {
            ee.b((byte) -81);
            break L3;
          }
        }
        L4: {
          if (var4 == 0) {
            lh.field_f = n.field_S;
            break L4;
          } else {
            lh.field_f = var8.j(param0 ^ 82);
            break L4;
          }
        }
        L5: {
          if ((um.field_d ^ -1) == -2) {
            pp.field_b = var8.d(-1034);
            tp.field_g = var8.j(-49);
            break L5;
          } else {
            if (4 == um.field_d) {
              pp.field_b = var8.d(-1034);
              tp.field_g = var8.j(-49);
              break L5;
            } else {
              pp.field_b = 0;
              tp.field_g = null;
              break L5;
            }
          }
        }
        L6: {
          if (param1) {
            var5 = var8.d(-1034);
            try {
              L7: {
                L8: {
                  var9 = o.field_x.a(127, var5);
                  np.field_a = var9.e(param0 ^ -31);
                  if (lh.field_f.equals(di.field_j)) {
                    stackIn_25_0 = null;
                    break L8;
                  } else {
                    stackIn_25_0 = var9.field_C;
                    break L8;
                  }
                }
                ci.field_p = stackIn_25_0;
                break L7;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                tc.a((Throwable) ((Object) var6), "CC1", param0 ^ 8564);
                np.field_a = null;
                ci.field_p = null;
                break L9;
              }
            }
            break L6;
          } else {
            np.field_a = s.a(var8, 80, true);
            ci.field_p = null;
            break L6;
          }
        }
        return new pn(param1);
    }

    final sf a(byte param0, int param1) {
        byte[] var4 = null;
        sf var3 = (sf) (this.field_d.a((long)param1, true));
        if (param0 != -55) {
            return (sf) null;
        }
        if (var3 != null) {
            return var3;
        }
        if (32768 > param1) {
            var4 = this.field_c.a(82, param1, 0);
        } else {
            var4 = this.field_e.a(112, param1 & 32767, 0);
        }
        var3 = new sf();
        if (var4 != null) {
            var3.a((byte) -123, new ge(var4));
        }
        if (32768 <= param1) {
            var3.f(0);
        }
        this.field_d.a(121, var3, (long)param1);
        return var3;
    }

    ee(int param0, di param1, di param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_d = new fg(64);
        try {
          L0: {
            L1: {
              this.field_e = param2;
              this.field_c = param1;
              if (this.field_c == null) {
                break L1;
              } else {
                this.field_c.a(false, 0);
                break L1;
              }
            }
            L2: {
              if (null == this.field_e) {
                break L2;
              } else {
                this.field_e.a(false, 0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("ee.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_a = "<%0> are all offering a rematch.";
        field_b = new int[128];
    }
}
