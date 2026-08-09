/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk implements kh {
    static String field_a;
    static String field_g;
    static String field_f;
    private gh field_c;
    static int field_b;
    static int[][] field_d;
    static String field_e;

    public static void a(boolean param0) {
        field_g = null;
        field_e = null;
        field_a = null;
        field_d = (int[][]) null;
        if (!param0) {
            field_f = (String) null;
        }
        field_f = null;
    }

    final static wk[] a(String param0, byte param1, kl param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        wk[] stackIn_3_0 = null;
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
              if (param1 <= -123) {
                break L1;
              } else {
                var6 = (String) null;
                fk.a(false, (String) null);
                break L1;
              }
            }
            var4_int = param2.a(param3, 110);
            var5 = param2.a((byte) -72, var4_int, param0);
            stackIn_3_0 = cb.a(false, param2, var4_int, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("fk.E(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

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
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static og a(es param0, int param1) throws ef {
        og stackIn_2_0 = null;
        og stackIn_9_0 = null;
        og stackIn_23_0 = null;
        og stackIn_29_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        og var4 = null;
        og var5 = null;
        og var6 = null;
        try {
          L0: {
            if (param1 < -7) {
              L1: {
                var4 = param0.a((byte) 13);
                if (iu.field_x == var4.field_q) {
                  break L1;
                } else {
                  if (hf.field_h == var4.field_q) {
                    break L1;
                  } else {
                    if (var4.field_q == gg.field_G) {
                      break L1;
                    } else {
                      if (var4.field_q != gb.field_z) {
                        if (rn.field_c != var4.field_q) {
                          throw new ef(var4.field_s);
                        } else {
                          if (param0.a(126)) {
                            throw new ef(var4.field_s);
                          } else {
                            var5 = param0.a((byte) 13);
                            if (mo.field_j != var5.field_q) {
                              throw new ef(var5.field_s);
                            } else {
                              var4.field_k = new at();
                              L2: while (true) {
                                if (param0.a(127)) {
                                  throw new ef(var4.field_s);
                                } else {
                                  if (param0.a((byte) 13).field_q != gm.field_d) {
                                    param0.field_a = param0.field_a - 1;
                                    var4.field_k.a((byte) -119, (tc) (fk.a(param0, -32)));
                                    if (param0.a(127)) {
                                      throw new ef(var4.field_s);
                                    } else {
                                      var6 = param0.a((byte) 13);
                                      if (gm.field_d != var6.field_q) {
                                        if (var6.field_q != sb.field_d) {
                                          throw new ef(var6.field_s);
                                        } else {
                                          continue L2;
                                        }
                                      } else {
                                        stackIn_29_0 = (og) (var4);
                                        decompiledRegionSelector0 = 3;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    stackIn_23_0 = (og) (var4);
                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              stackIn_9_0 = (og) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (og) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var2);

            stackIn_36_1 = new StringBuilder().append("fk.F(");

            if (param0 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L3;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_23_0;
            } else {
              return stackIn_29_0;
            }
          }
        }
    }

    fk(gh param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "fk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Object var8 = null;
        String var9 = null;
        int var10 = 0;
        String var11 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -79) {
                break L1;
              } else {
                var11 = (String) null;
                fk.a((byte) -28, (java.applet.Applet) null, (String) null);
                break L1;
              }
            }
            L2: {
              var6_int = param1 - -param0.field_B;
              var7 = param4 - -param0.field_p;
              qq.a(param0.field_l, var6_int, param0.field_w, -127, var7);
              if (!param0.a(false)) {
                break L2;
              } else {
                na.c(-4 + param0.field_l, 2 + var6_int, -67, param0.field_w + -4, 2 + var7);
                break L2;
              }
            }
            L3: {
              qn.f(var6_int, var7, var6_int - -param0.field_l - 2, param0.field_w + var7);
              var8 = this.field_c.field_O.j(-6508);
              if (var8 == null) {
                break L3;
              } else {
                var9 = var8.toString();
                this.field_c.field_K.b(var9, 2 + var6_int, -1 + var7 + (param0.field_w + this.field_c.field_K.field_H >> -408892703), 10000536, -1);
                if (!this.field_c.a(false)) {
                  break L3;
                } else {
                  if (var9.startsWith(this.field_c.field_I)) {
                    var10 = this.field_c.field_K.a(this.field_c.field_I);
                    qn.b(var6_int - -2, 2 + var7, var10, -4 + param0.field_w, 2188450, 100);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            qn.a();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("fk.C(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static byte[] a(boolean param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_4_0 = sb.field_e.a(param1, 74, "");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("fk.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static bq[] a(int param0, bv param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        bq[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        bq var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        bq[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var2_int = param1.g(114, 8);
            if (var2_int <= 0) {
              var3 = param1.g(55, param0);
              var4 = new bq[var3];
              var5 = 0;
              L1: while (true) {
                if (var5 >= var3) {
                  stackIn_11_0 = (bq[]) (var4);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    if (vq.a(param1, -2)) {
                      var6 = new bq();
                      param1.g(60, 24);
                      param1.g(-107, 24);
                      var6.field_e = param1.g(-115, 24);
                      param1.g(param0 + -127, 9);
                      param1.g(-105, 12);
                      param1.g(44, 12);
                      param1.g(125, 12);
                      var4[var5] = var6;
                      break L2;
                    } else {
                      var6_int = param1.g(82, cu.a(3, var5 - 1));
                      var4[var5] = var4[var6_int];
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("fk.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bq[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_11_0;
        }
    }

    final static String a(byte param0, java.applet.Applet param1, String param2) {
        try {
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_3_0 = null;
            String stackIn_9_0 = null;
            Object stackIn_14_0 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            StringBuilder stackIn_20_1 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            var7 = ArmiesOfGielinor.field_M ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var3 = (String) (lj.a("getcookies", (byte) -105, param1));
                    if (param0 >= 76) {
                      var4 = dj.a(97, ';', var3);
                      var5 = 0;
                      L2: while (true) {
                        if (var4.length <= var5) {
                          decompiledRegionSelector0 = 1;
                          break L1;
                        } else {
                          L3: {
                            var6 = var4[var5].indexOf('=');
                            if ((var6 ^ -1) > -1) {
                              break L3;
                            } else {
                              if (!var4[var5].substring(0, var6).trim().equals(param2)) {
                                break L3;
                              } else {
                                stackIn_9_0 = var4[var5].substring(var6 - -1).trim();
                                decompiledRegionSelector0 = 2;
                                break L1;
                              }
                            }
                          }
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      stackIn_3_0 = (String) null;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    stackIn_14_0 = null;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_17_0 = (RuntimeException) (var3_ref2);

                stackIn_17_1 = new StringBuilder().append("fk.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L5;
                } else {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

                if (param2 == null) {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "null";
                  break L6;
                } else {
                  stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackIn_21_2 = "{...}";
                  break L6;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_14_0);
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_3_0;
              } else {
                return stackIn_9_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = "This game has been updated! Please reload this page.";
        field_g = "Players";
        field_a = "No";
        field_d = new int[][]{new int[]{50, 25, 50, 50, 25, 50, 90, 50}, new int[]{90, 50, 90, 50, 25, 50, 90, 50}, new int[]{50, 25, 50, 90, 90, 50, 90, 50}, new int[]{90, 90, 25, 25, 90, 50, 90, 50}, new int[]{90, 90, 50, 90, 50, 50, 90, 50}, new int[]{50, 50, 50, 50, 50, 50, 50, 50}, new int[]{50, 50, 50, 50, 50, 50, 90, 50}, new int[]{90, 90, 90, 90, 90, 90, 90, 90}};
        field_e = "Find opponent";
    }
}
