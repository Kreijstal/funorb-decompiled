/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class re {
    private int field_i;
    static int[] field_c;
    private int field_b;
    private int field_e;
    static String field_h;
    private int field_g;
    private int field_a;
    private Main field_d;
    private lh field_f;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Main.field_T;
          ((re) this).field_b = ((re) this).field_b + 1;
          if (param0 <= -101) {
            break L0;
          } else {
            ((re) this).field_i = -116;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((re) this).field_i != 2) {
              break L2;
            } else {
              if (((re) this).field_b < 150) {
                break L2;
              } else {
                this.a(false, (byte) 122, true, 0);
                break L1;
              }
            }
          }
          break L1;
        }
        L3: while (true) {
          if (!ge.b((byte) -114)) {
            L4: {
              ((re) this).field_f.a(this.a((byte) -22, ij.field_e, eg.field_b), (byte) 115, this.a((byte) -22, jc.field_N, ag.field_a));
              if (((re) this).field_f.field_k == -1) {
                break L4;
              } else {
                this.a(true, (byte) 122, ((re) this).field_f.c(-1), ((re) this).field_f.field_k);
                break L4;
              }
            }
            L5: {
              if (dl.field_h != 0) {
                ((re) this).field_a = ag.field_a;
                ((re) this).field_e = jc.field_N;
                break L5;
              } else {
                break L5;
              }
            }
            return;
          } else {
            if (tb.field_d == 13) {
              if (((re) this).field_i != 1) {
                var2 = 0;
                L6: while (true) {
                  if (~var2 <= ~fh.field_G[((re) this).field_i].length) {
                    continue L3;
                  } else {
                    if (fh.field_G[((re) this).field_i][var2] == 17) {
                      this.a(false, (byte) 119, true, var2);
                      continue L3;
                    } else {
                      var2++;
                      continue L6;
                    }
                  }
                }
              } else {
                this.a(false, (byte) 119, true, 0);
                continue L3;
              }
            } else {
              L7: {
                if (fh.field_G[((re) this).field_i].length != 1) {
                  break L7;
                } else {
                  if (tb.field_d != 84) {
                    break L7;
                  } else {
                    this.a(false, (byte) 122, true, 0);
                    continue L3;
                  }
                }
              }
              this.a(true);
              if (((re) this).field_f.field_k == -1) {
                continue L3;
              } else {
                this.a(false, (byte) 121, ((re) this).field_f.c(-1), ((re) this).field_f.field_k);
                continue L3;
              }
            }
          }
        }
    }

    private final int b(int param0, byte param1) {
        if (!(((re) this).field_i != 2)) {
            return 480;
        }
        return ia.field_c[fh.field_G[((re) this).field_i][param0]].field_o;
    }

    final static void a(int param0, int param1, int param2, byte param3, kc param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              param1 = param1 + param4.field_q;
              param2 = param2 + param4.field_n;
              var5_int = 0;
              var6 = param4.field_o;
              var7 = param4.field_p;
              if (vj.field_h > param2) {
                var8 = -param2 + vj.field_h;
                param2 = vj.field_h;
                var6 = var6 - var8;
                var5_int = var5_int + var7 * var8;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 < vj.field_f) {
                var8 = vj.field_f - param1;
                param1 = vj.field_f;
                var5_int = var5_int + var8;
                var7 = var7 - var8;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (vj.field_b >= var6 + param2) {
                break L3;
              } else {
                var6 = vj.field_b + -param2;
                break L3;
              }
            }
            L4: {
              if (~(param1 - -var7) >= ~vj.field_a) {
                break L4;
              } else {
                var7 = vj.field_a - param1;
                break L4;
              }
            }
            L5: {
              var8 = param2 * vj.field_l + param1;
              var9 = param4.field_p - var7;
              if (param3 >= 46) {
                break L5;
              } else {
                var11 = null;
                re.a(-101, 85, 79, (byte) -16, (kc) null);
                break L5;
              }
            }
            L6: {
              var10 = vj.field_l + -var7;
              if (var7 <= 0) {
                break L6;
              } else {
                if (var6 > 0) {
                  hf.a(var9, var6, param0, 0, param4.field_r, var5_int, var8, var10, var7, vj.field_j, 125);
                  break L0;
                } else {
                  break L6;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("re.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    private final void d(int param0) {
        String var2 = null;
        uh var3 = null;
        int var4 = 0;
        String[][] var5 = null;
        int[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[][] var17 = null;
        String var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        L0: {
          var16 = Main.field_T;
          if (dl.d(0)) {
            var2 = j.field_F + "<br><br>" + ag.field_g;
            break L0;
          } else {
            L1: {
              if (null != ((re) this).field_d.field_cb) {
                break L1;
              } else {
                ((re) this).field_d.field_cb = il.a(8, 3, 25404, fb.field_c[((re) this).field_d.field_C], 1);
                break L1;
              }
            }
            var3 = ((re) this).field_d.field_cb;
            if (!var3.field_o) {
              var2 = tj.field_H;
              break L0;
            } else {
              L2: {
                var4 = ((re) this).field_d.field_D;
                var5 = var3.field_m;
                var21 = var3.field_q;
                var20 = var21;
                var19 = var20;
                var17 = var19;
                var6 = var17;
                if (var5 == null) {
                  var2 = t.field_f;
                  break L2;
                } else {
                  L3: {
                    if (0 > var4) {
                      break L3;
                    } else {
                      if (var4 < var5.length) {
                        if (null != var5[var4]) {
                          break L2;
                        } else {
                          var2 = t.field_f;
                          break L2;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2 = t.field_f;
                  break L2;
                }
              }
              L4: {
                if (var6 != null) {
                  L5: {
                    var21 = var20;
                    if (var4 < 0) {
                      break L5;
                    } else {
                      if (var4 < var21.length) {
                        if (null == var21[var4]) {
                          var2 = t.field_f;
                          break L4;
                        } else {
                          var2 = j.field_F;
                          var7 = wh.a(var3, var4, -122, ((re) this).field_d.field_P);
                          var8 = 115;
                          var9 = eb.field_c.field_J[0][2];
                          eb.field_c.field_J[0][2] = 16777215;
                          var10 = 0;
                          L6: while (true) {
                            L7: {
                              if (8 < var10) {
                                break L7;
                              } else {
                                L8: {
                                  var11 = null;
                                  if (var10 == 8) {
                                    if (var7 == -1) {
                                      var11_ref = ri.field_c;
                                      var13 = ai.field_m;
                                      var7 = var10;
                                      if (var13 == 0) {
                                        break L7;
                                      } else {
                                        var14 = dg.field_J;
                                        break L8;
                                      }
                                    } else {
                                      break L7;
                                    }
                                  } else {
                                    if (var5[var4].length <= var10) {
                                      var8 = var8 + (qa.field_b.field_x + qa.field_b.field_s);
                                      var10++;
                                      continue L6;
                                    } else {
                                      if (var10 >= var21[var4].length) {
                                        var8 = var8 + (qa.field_b.field_s + qa.field_b.field_x);
                                        var10++;
                                        continue L6;
                                      } else {
                                        var11_ref = var5[var4][var10];
                                        if (var11_ref != null) {
                                          var14 = 255 & var21[var4][var10];
                                          var13 = var21[var4][var10] >> 8;
                                          break L8;
                                        } else {
                                          var8 = var8 + (qa.field_b.field_s - -qa.field_b.field_x);
                                          var10++;
                                          continue L6;
                                        }
                                      }
                                    }
                                  }
                                }
                                L9: {
                                  if (var10 != var7) {
                                    var12 = 1884;
                                    break L9;
                                  } else {
                                    var12 = 1782271;
                                    break L9;
                                  }
                                }
                                L10: {
                                  eb.field_c.field_J[0][1] = var12;
                                  if (8 == var10) {
                                    break L10;
                                  } else {
                                    eb.field_c.c(var10 - -1 + ". ", 231, var8, 0, -1);
                                    break L10;
                                  }
                                }
                                L11: {
                                  if (var11_ref != null) {
                                    var15 = qa.field_b.a('W') * 12;
                                    var18 = ee.a((ee) (Object) qa.field_b, var11_ref, var15);
                                    eb.field_c.b(var18, 231, var8, 0, -1);
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                eb.field_c.c(Integer.toString(var13), 560, var8, 0, -1);
                                var2 = "";
                                eb.field_c.c(Integer.toString(var14), 479, var8, 0, -1);
                                var8 = var8 + (qa.field_b.field_s + qa.field_b.field_x);
                                var10++;
                                continue L6;
                              }
                            }
                            eb.field_c.field_J[0][2] = var9;
                            break L4;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = t.field_f;
                  break L4;
                } else {
                  var2 = t.field_f;
                  break L4;
                }
              }
              eb.field_c.field_J[0][1] = 6697779;
              eb.field_c.field_J[0][2] = 16777215;
              int discarded$2 = eb.field_c.a(ij.field_d, 211, 106 - -(9 * (qa.field_b.field_s + qa.field_b.field_x)), 389, 8 * qa.field_b.field_s, 0, -1, 1, 0, qa.field_b.field_s - -qa.field_b.field_x);
              eb.field_c.field_J[0][2] = 1;
              break L0;
            }
          }
        }
        eb.field_c.field_J[0][2] = 16777215;
        eb.field_c.field_J[0][1] = 6697779;
        int discarded$3 = eb.field_c.a(var2, 211, 166, 389, qa.field_b.field_s * 8, 0, -1, 1, 1, qa.field_b.field_s + qa.field_b.field_x);
        eb.field_c.field_J[0][2] = 1;
    }

    private final int a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        kc var6 = null;
        int var7 = 0;
        L0: {
          var7 = Main.field_T;
          if (param0 == -22) {
            break L0;
          } else {
            int discarded$2 = this.a((byte) 37, -63, 74);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (fh.field_G[((re) this).field_i].length <= var4) {
            return -1;
          } else {
            var5 = this.b(var4, 9996);
            var6 = ia.field_c[fh.field_G[((re) this).field_i][var4]];
            if (this.a(var4, (byte) -33) - -var6.field_q <= param2) {
              if (param2 < this.a(param0 + -24111, var4)) {
                if (param1 >= var5) {
                  if (this.b(var4, (byte) 17) + var5 > param1) {
                    return var4;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final static String a(String param0, String[] param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var11 = Main.field_T;
        try {
          L0: {
            var3_int = param0.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if (0 > var6_int) {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L2: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if (var8 >= 0) {
                    var5 = 2 + var8;
                    L3: while (true) {
                      L4: {
                        if (var3_int <= var5) {
                          break L4;
                        } else {
                          if (!Main.a(-49, param0.charAt(var5))) {
                            break L4;
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                      var9 = param0.substring(2 + var8, var5);
                      if (!pg.a(false, (CharSequence) (Object) var9)) {
                        continue L2;
                      } else {
                        if (var3_int <= var5) {
                          continue L2;
                        } else {
                          if (62 != param0.charAt(var5)) {
                            continue L2;
                          } else {
                            var5++;
                            var10 = ie.a(false, (CharSequence) (Object) var9);
                            StringBuilder discarded$3 = var6.append(param0.substring(var7, var8));
                            var7 = var5;
                            StringBuilder discarded$4 = var6.append(param1[var10]);
                            continue L2;
                          }
                        }
                      }
                    }
                  } else {
                    StringBuilder discarded$5 = var6.append(param0.substring(var7));
                    stackOut_23_0 = var6.toString();
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  }
                }
              } else {
                var5 = 2 + var6_int;
                L5: while (true) {
                  L6: {
                    if (var3_int <= var5) {
                      break L6;
                    } else {
                      if (!Main.a(-49, param0.charAt(var5))) {
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(var6_int + 2, var5);
                  if (!pg.a(false, (CharSequence) (Object) var7_ref_String)) {
                    continue L1;
                  } else {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (param0.charAt(var5) == 62) {
                        var5++;
                        var8 = ie.a(false, (CharSequence) (Object) var7_ref_String);
                        var4 = var4 + (param1[var8].length() + var6_int + -var5);
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("re.R(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          L8: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L8;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + -50 + ')');
        }
        return stackIn_24_0;
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Main.field_T;
        if (((re) this).field_i != 2) {
          L0: {
            if (((re) this).field_i != 5) {
              if (((re) this).field_i != 10) {
                var3 = kb.field_b[((re) this).field_i] * param0 + cj.field_l[((re) this).field_i];
                break L0;
              } else {
                var3 = cj.field_l[((re) this).field_i];
                break L0;
              }
            } else {
              if (dl.d(0)) {
                var3 = cj.field_l[((re) this).field_i];
                break L0;
              } else {
                if (param0 >= 3) {
                  var3 = cj.field_l[((re) this).field_i] + kb.field_b[((re) this).field_i];
                  break L0;
                } else {
                  var3 = cj.field_l[((re) this).field_i];
                  break L0;
                }
              }
            }
          }
          L1: {
            if (h.field_E[((re) this).field_i]) {
              var3 += 33;
              break L1;
            } else {
              break L1;
            }
          }
          return var3;
        } else {
          return 0;
        }
    }

    private final int a(int param0, int param1) {
        if (2 == ((re) this).field_i) {
            return 640;
        }
        if (param0 != -24133) {
            field_c = null;
        }
        kc var3 = ia.field_c[fh.field_G[((re) this).field_i][param1]];
        return this.a(param1, (byte) 119) + var3.field_q - -var3.field_p;
    }

    final static void c(int param0) {
        gh.field_g = false;
        tf.field_p = null;
        gl.field_G = null;
        da.field_c = null;
        ia.field_d = null;
    }

    public static void a(int param0) {
        field_h = null;
        field_c = null;
    }

    private final void a(boolean param0) {
        int var3 = 0;
        L0: {
          L1: {
            var3 = Main.field_T;
            if (((re) this).field_i != 5) {
              break L1;
            } else {
              if (!dl.d(0)) {
                if (!((re) this).field_f.a((byte) -63)) {
                  L2: {
                    if (tb.field_d == 96) {
                      L3: {
                        if (((re) this).field_f.field_k > 0) {
                          if (((re) this).field_f.field_k != 3) {
                            ((re) this).field_f.a(31973, -1 + ((re) this).field_f.field_k);
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          ((re) this).field_f.a(31973, 2);
                          break L3;
                        }
                      }
                      if (((re) this).field_f.field_k < 0) {
                        break L2;
                      } else {
                        if (((re) this).field_f.field_k <= 2) {
                          ((re) this).field_d.field_D = ((re) this).field_f.field_k;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  L4: {
                    if (tb.field_d == 97) {
                      L5: {
                        if (((re) this).field_f.field_k < 2) {
                          ((re) this).field_f.a(31973, 1 + ((re) this).field_f.field_k);
                          break L5;
                        } else {
                          if (2 == ((re) this).field_f.field_k) {
                            ((re) this).field_f.a(31973, 0);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (((re) this).field_f.field_k < 0) {
                        break L4;
                      } else {
                        if (2 < ((re) this).field_f.field_k) {
                          break L4;
                        } else {
                          ((re) this).field_d.field_D = ((re) this).field_f.field_k;
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  L6: {
                    if (tb.field_d == 99) {
                      L7: {
                        L8: {
                          if (((re) this).field_f.field_k < 0) {
                            break L8;
                          } else {
                            if (2 >= ((re) this).field_f.field_k) {
                              ((re) this).field_f.a(31973, 3);
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        ((re) this).field_f.a(31973, ((re) this).field_d.field_D);
                        break L7;
                      }
                      if (0 > ((re) this).field_f.field_k) {
                        break L6;
                      } else {
                        if (((re) this).field_f.field_k <= 2) {
                          ((re) this).field_d.field_D = ((re) this).field_f.field_k;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                  L9: {
                    if (tb.field_d != 98) {
                      break L9;
                    } else {
                      L10: {
                        if (((re) this).field_f.field_k == 3) {
                          ((re) this).field_f.a(31973, ((re) this).field_d.field_D);
                          break L10;
                        } else {
                          ((re) this).field_f.a(31973, 3);
                          break L10;
                        }
                      }
                      if (((re) this).field_f.field_k < 0) {
                        break L9;
                      } else {
                        if (((re) this).field_f.field_k <= 2) {
                          ((re) this).field_d.field_D = ((re) this).field_f.field_k;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  ((re) this).field_f.g(107);
                  break L0;
                } else {
                  ((re) this).field_f.g(107);
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          L11: {
            if (((re) this).field_i == 5) {
              break L11;
            } else {
              if (((re) this).field_i != 10) {
                ((re) this).field_f.b((byte) 76);
                break L0;
              } else {
                break L11;
              }
            }
          }
          ((re) this).field_f.c((byte) 111);
          break L0;
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != -31102) {
            ((re) this).field_g = -20;
        }
        int var3 = 0;
        if (0 == ((re) this).field_i) {
            if (!(-1 == ((re) this).field_f.field_k)) {
                var3 = ((re) this).field_f.field_k;
            }
        }
        if (((re) this).field_i == 1) {
            if (-1 != ((re) this).field_f.field_k) {
                if (dj.field_a != -1) {
                    var3 = ((re) this).field_f.field_k;
                }
            }
        }
        ((re) this).field_f.a(param0 + 31007, this.a((byte) -22, ij.field_e, eg.field_b), var3, param1);
        ((re) this).field_b = 0;
        ((re) this).field_g = -1;
    }

    private final void a(boolean param0, byte param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var8_ref_Object = null;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        int var12 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          var12 = Main.field_T;
          if (param1 >= 115) {
            break L0;
          } else {
            field_h = null;
            break L0;
          }
        }
        L1: {
          var5 = fh.field_G[((re) this).field_i][param3];
          if (!param2) {
            break L1;
          } else {
            if (var5 == 3) {
              break L1;
            } else {
              if (4 == var5) {
                break L1;
              } else {
                rc.a((byte) 111, 15);
                break L1;
              }
            }
          }
        }
        L2: {
          var8 = var5;
          if (var8 != 0) {
            if (7 != var8) {
              if (var8 != 10) {
                L3: {
                  if (var8 == 5) {
                    if (!param2) {
                      break L3;
                    } else {
                      ((re) this).field_d.a(11246, 3, 6, param0);
                      break L2;
                    }
                  } else {
                    if (var8 == 6) {
                      if (param2) {
                        ((re) this).field_d.a(11246, 5, 8, param0);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      if (21 == var8) {
                        if (!param2) {
                          break L3;
                        } else {
                          ((re) this).field_d.a(11246, 5, 7, param0);
                          break L2;
                        }
                      } else {
                        if (var8 != 8) {
                          L4: {
                            if (var8 != 15) {
                              if (17 != var8) {
                                if (11 != var8) {
                                  if (var8 != 12) {
                                    if (var8 == 9) {
                                      if (!param2) {
                                        break L3;
                                      } else {
                                        ((re) this).field_d.a(11246, 4, 6, param0);
                                        break L2;
                                      }
                                    } else {
                                      L5: {
                                        if (var8 == 13) {
                                          break L5;
                                        } else {
                                          if (var8 == 16) {
                                            break L5;
                                          } else {
                                            if (var8 == 1) {
                                              L6: {
                                                if (!((re) this).field_f.e(14354)) {
                                                  break L6;
                                                } else {
                                                  ((re) this).field_d.field_cb = null;
                                                  ((re) this).field_d.field_P = null;
                                                  ((re) this).field_d.field_C = (1 + ((re) this).field_d.field_C) % 2;
                                                  break L6;
                                                }
                                              }
                                              if (!((re) this).field_f.b(2)) {
                                                break L3;
                                              } else {
                                                L7: {
                                                  if (((re) this).field_d.field_C == 0) {
                                                    ((re) this).field_d.field_C = 2;
                                                    break L7;
                                                  } else {
                                                    break L7;
                                                  }
                                                }
                                                ((re) this).field_d.field_cb = null;
                                                ((re) this).field_d.field_P = null;
                                                ((re) this).field_d.field_C = ((re) this).field_d.field_C - 1;
                                                break L2;
                                              }
                                            } else {
                                              if (3 == var8) {
                                                L8: {
                                                  var6 = mf.field_i;
                                                  if (!((re) this).field_f.e(14354)) {
                                                    break L8;
                                                  } else {
                                                    g.a(-114);
                                                    break L8;
                                                  }
                                                }
                                                L9: {
                                                  if (!((re) this).field_f.b(2)) {
                                                    break L9;
                                                  } else {
                                                    id.a((byte) 100);
                                                    break L9;
                                                  }
                                                }
                                                L10: {
                                                  if (!((re) this).field_f.d((byte) 68)) {
                                                    break L10;
                                                  } else {
                                                    wf.a(0, -124);
                                                    break L10;
                                                  }
                                                }
                                                L11: {
                                                  if (!((re) this).field_f.d(-12819)) {
                                                    break L11;
                                                  } else {
                                                    wf.a(80, -122);
                                                    break L11;
                                                  }
                                                }
                                                L12: {
                                                  if (((re) this).field_f.a((byte) -127)) {
                                                    L13: {
                                                      var8 = eg.field_b + -this.a(param3, (byte) 97) - t.field_i;
                                                      if (var8 > 0) {
                                                        if (var8 >= 80) {
                                                          var9 = 80;
                                                          break L13;
                                                        } else {
                                                          var9 = var8;
                                                          break L13;
                                                        }
                                                      } else {
                                                        var9 = 0;
                                                        break L13;
                                                      }
                                                    }
                                                    wf.a(var9, -28);
                                                    break L12;
                                                  } else {
                                                    break L12;
                                                  }
                                                }
                                                if (~mf.field_i == ~var6) {
                                                  var8_ref_Object = (Object) (Object) bg.field_tb;
                                                  synchronized (var8_ref_Object) {
                                                    L14: {
                                                      lh.field_d.e(0);
                                                      break L14;
                                                    }
                                                  }
                                                  break L2;
                                                } else {
                                                  var8_ref_Object = (Object) (Object) bg.field_tb;
                                                  synchronized (var8_ref_Object) {
                                                    L15: {
                                                      L16: {
                                                        lh.field_d.e(-1);
                                                        if (!lh.field_d.b(66)) {
                                                          lh.field_d.h(0);
                                                          lh.field_d.g(96);
                                                          gh.a(lh.field_d, (byte) -67);
                                                          break L16;
                                                        } else {
                                                          break L16;
                                                        }
                                                      }
                                                      break L15;
                                                    }
                                                  }
                                                  break L2;
                                                }
                                              } else {
                                                if (var8 != 4) {
                                                  if (var8 != 18) {
                                                    if (var8 == 19) {
                                                      if (!param2) {
                                                        break L3;
                                                      } else {
                                                        ((re) this).field_d.field_D = 1;
                                                        break L2;
                                                      }
                                                    } else {
                                                      if (var8 != 20) {
                                                        if (var8 == 14) {
                                                          if (!param2) {
                                                            break L3;
                                                          } else {
                                                            nb.field_e = 0;
                                                            db.field_m = 0;
                                                            ij.field_h.c(29026);
                                                            ((re) this).field_d.a(11246, 0, 5, param0);
                                                            break L2;
                                                          }
                                                        } else {
                                                          break L2;
                                                        }
                                                      } else {
                                                        if (param2) {
                                                          ((re) this).field_d.field_D = 2;
                                                          break L2;
                                                        } else {
                                                          break L2;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    if (!param2) {
                                                      break L3;
                                                    } else {
                                                      ((re) this).field_d.field_D = 0;
                                                      break L2;
                                                    }
                                                  }
                                                } else {
                                                  L17: {
                                                    var7 = fe.field_a;
                                                    if (!((re) this).field_f.e(14354)) {
                                                      break L17;
                                                    } else {
                                                      if (var7 >= 70) {
                                                        var7 = 80;
                                                        break L17;
                                                      } else {
                                                        var7 += 10;
                                                        break L17;
                                                      }
                                                    }
                                                  }
                                                  L18: {
                                                    if (!((re) this).field_f.b(2)) {
                                                      break L18;
                                                    } else {
                                                      if (var7 > 10) {
                                                        var7 -= 10;
                                                        break L18;
                                                      } else {
                                                        var7 = 0;
                                                        break L18;
                                                      }
                                                    }
                                                  }
                                                  L19: {
                                                    if (((re) this).field_f.d((byte) 68)) {
                                                      var7 = 0;
                                                      break L19;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                  L20: {
                                                    if (((re) this).field_f.d(-12819)) {
                                                      var7 = 80;
                                                      break L20;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                  L21: {
                                                    if (!((re) this).field_f.a((byte) -54)) {
                                                      break L21;
                                                    } else {
                                                      var8 = eg.field_b - (this.a(param3, (byte) 69) - -t.field_i);
                                                      if (var8 > 0) {
                                                        if (var8 < 80) {
                                                          var7 = var8;
                                                          break L21;
                                                        } else {
                                                          var7 = 80;
                                                          break L21;
                                                        }
                                                      } else {
                                                        var7 = 0;
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                  if (~fe.field_a == ~var7) {
                                                    break L3;
                                                  } else {
                                                    ag.a(var7, 0);
                                                    break L2;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (param2) {
                                        if (dl.d(0)) {
                                          L22: {
                                            if (((re) this).field_i == 4) {
                                              break L22;
                                            } else {
                                              if (((re) this).field_i != 5) {
                                                if (((re) this).field_i != 9) {
                                                  break L3;
                                                } else {
                                                  ((re) this).field_d.a(((re) this).field_i, param0, 10, -112);
                                                  break L2;
                                                }
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          ((re) this).field_d.a(((re) this).field_i, param0, ((re) this).field_i, -123);
                                          break L2;
                                        } else {
                                          return;
                                        }
                                      } else {
                                        break L2;
                                      }
                                    }
                                  } else {
                                    if (param2) {
                                      L23: {
                                        if (null != gj.field_a) {
                                          ga.a(true);
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                      pb.a((byte) -124, mk.g(-119));
                                      break L2;
                                    } else {
                                      break L2;
                                    }
                                  }
                                } else {
                                  if (param2) {
                                    ((re) this).field_d.a(11246, 0, 6, param0);
                                    break L2;
                                  } else {
                                    break L2;
                                  }
                                }
                              } else {
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                          if (!param2) {
                            break L3;
                          } else {
                            if (((re) this).field_i == 6) {
                              if (dl.d(0)) {
                                L24: {
                                  if (nb.field_e > 0) {
                                    break L24;
                                  } else {
                                    if (ai.field_m <= 0) {
                                      ((re) this).field_d.a(11246, 0, 5, param0);
                                      break L2;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                ((re) this).field_d.a(11246, 9, 7, param0);
                                break L2;
                              } else {
                                if (nb.field_e <= 0) {
                                  if (ai.field_m == 0) {
                                    ((re) this).field_d.a(11246, 0, 5, param0);
                                    break L2;
                                  } else {
                                    ((re) this).field_d.a(11246, 5, 7, param0);
                                    break L2;
                                  }
                                } else {
                                  ((re) this).field_d.a(11246, 10, 7, param0);
                                  break L2;
                                }
                              }
                            } else {
                              if (10 != ((re) this).field_i) {
                                if (((re) this).field_i != 5) {
                                  if (h.field_E[((re) this).field_i]) {
                                    ((re) this).field_d.a(11246, ((re) this).field_i, 4, param0);
                                    break L2;
                                  } else {
                                    ((re) this).field_d.a(11246, rk.field_X, 6, param0);
                                    break L2;
                                  }
                                } else {
                                  ((re) this).field_d.a(11246, 0, 5, param0);
                                  break L2;
                                }
                              } else {
                                ((re) this).field_d.a(11246, 0, 5, param0);
                                break L2;
                              }
                            }
                          }
                        } else {
                          if (!param2) {
                            break L3;
                          } else {
                            if (gj.field_a == null) {
                              var8 = param0 ? 1 : 0;
                              mb.a(qa.field_b.field_s * 3 >> 1, 18, g.field_C, var8 != 0, 9414, 240, tc.field_a, 6, 320, 2, 18, (ee) (Object) qa.field_b);
                              break L2;
                            } else {
                              ga.a(true);
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L2;
              } else {
                if (param2) {
                  ((re) this).field_d.c(76, 0);
                  if (!dl.d(0)) {
                    if (0 >= nb.field_e) {
                      if (ai.field_m == 0) {
                        ((re) this).field_d.a(11246, 0, 6, param0);
                        break L2;
                      } else {
                        ((re) this).field_d.a(11246, 5, 8, param0);
                        break L2;
                      }
                    } else {
                      ((re) this).field_d.a(11246, 10, 8, param0);
                      break L2;
                    }
                  } else {
                    L25: {
                      if (nb.field_e > 0) {
                        break L25;
                      } else {
                        if (ai.field_m <= 0) {
                          ((re) this).field_d.a(11246, 0, 6, param0);
                          break L2;
                        } else {
                          break L25;
                        }
                      }
                    }
                    ((re) this).field_d.a(11246, 9, 8, param0);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            } else {
              if (param2) {
                ((re) this).field_d.c(126, 1);
                rk.a(false, lc.field_a[1], false);
                ((re) this).field_d.a(11246, 1, 1, param0);
                break L2;
              } else {
                break L2;
              }
            }
          } else {
            if (param2) {
              ((re) this).field_d.l(0);
              ((re) this).field_d.a(11246, 0, 1, param0);
              break L2;
            } else {
              break L2;
            }
          }
        }
    }

    private final void a(int param0, int param1, boolean param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        kc var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_3_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        L0: {
          var19 = Main.field_T;
          var7 = 62 % ((param4 - -48) / 48);
          var6 = this.b(param1, 9996) + param3;
          var8 = this.a(param1, (byte) 125);
          param1 = fh.field_G[((re) this).field_i][param1];
          if (param2) {
            stackOut_2_0 = 4086842;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 4405028;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var9 = stackIn_3_0;
          var10 = 0;
          if (!param2) {
            break L1;
          } else {
            L2: {
              if (k.field_c == 0) {
                break L2;
              } else {
                if (((re) this).field_f.field_h) {
                  var10 = 1;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            var10 = 2;
            break L1;
          }
        }
        L3: {
          if (18 > param1) {
            break L3;
          } else {
            if (param1 > 20) {
              break L3;
            } else {
              if (((re) this).field_d.field_D == -18 + param1) {
                var9 = 3684698;
                var10 = 1;
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        L4: {
          var11 = ia.field_c[this.a((byte) -121, param1) + param1];
          ae.a(var11, var8, var6, var9, 32, param0);
          if (var10 == 0) {
            break L4;
          } else {
            L5: {
              var12 = var11.field_p;
              var13 = var11.field_o;
              var14 = var11.field_q + var8;
              if (var10 == 1) {
                var18 = 7619584;
                var17 = 12217600;
                var15 = 3548426;
                sd.a(38, var11.field_o, var9, param0, var11.field_p, var8, (byte) -111, 0, 32, var6);
                var16 = 5059597;
                break L5;
              } else {
                var17 = 3548426;
                var16 = 7619584;
                sd.a(38, var11.field_o, var9, param0, var11.field_p, var8, (byte) -122, 16777215, 32, var6);
                var15 = 12217600;
                var18 = 5059597;
                break L5;
              }
            }
            if (var11.field_p == ia.field_c[0].field_p) {
              ae.a(var14, var6, var12, var15, 32, param0);
              ae.a(var14, var6 - -1, var12, var15, 32, param0);
              ae.b(var14, 2 + var6, var13 + -2, var15, 32, param0);
              ae.b(1 + var14, 2 + var6, -2 + var13, var15, 32, param0);
              ae.a(2 + var14, -2 + var6 - -var13, var12 + -2, var17, 32, param0);
              ae.a(2 + var14, var13 + var6 - 1, var12 + -2, var17, 32, param0);
              ae.b(-1 + var14 + var12, var6 + 2, -2 + var13, var17, 32, param0);
              ae.b(var14 + (var12 - 2), var6 - -2, -2 + var13, var17, 32, param0);
              ae.a(2 + var14, 2 + var6, var12 - 4, var16, 32, param0);
              ae.a(var14 + 2, 3 + var6, -4 + var12, var16, 32, param0);
              ae.b(2 + var14, var6 + 4, -6 + var13, var16, 32, param0);
              ae.b(3 + var14, var6 + 4, -6 + var13, var16, 32, param0);
              ae.a(4 + var14, var6 - (-var13 + 4), -6 + var12, var18, 32, param0);
              ae.a(4 + var14, -3 + var6 + var13, -6 + var12, var18, 32, param0);
              ae.b(-4 + (var14 + var12), 4 + var6, -8 + var13, var18, 32, param0);
              ae.b(-3 + var14 - -var12, var6 + 4, -8 + var13, var18, 32, param0);
              break L4;
            } else {
              ae.a(var14, var6, var12, var15, 32, param0);
              ae.b(var14, var6 - -1, -1 + var13, var15, 32, param0);
              ae.a(1 + var14, var6 - -var13 - 1, var12 - 1, var17, 32, param0);
              ae.b(var14 + var12 - 1, var6 + 1, var13 - 1, var17, 32, param0);
              ae.a(var14 - -1, 1 + var6, var12 - 2, var16, 32, param0);
              ae.b(1 + var14, 2 + var6, -3 + var13, var16, 32, param0);
              ae.a(var14 + 2, -2 + (var6 - -var13), -3 + var12, var18, 32, param0);
              ae.b(-2 + (var12 + var14), var6 - -2, -4 + var13, var18, 32, param0);
              break L4;
            }
          }
        }
        L6: {
          L7: {
            if (param1 == 4) {
              break L7;
            } else {
              if (param1 != 3) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (param1 == 4) {
              stackOut_26_0 = fe.field_a;
              stackIn_27_0 = stackOut_26_0;
              break L8;
            } else {
              stackOut_25_0 = mf.field_i;
              stackIn_27_0 = stackOut_25_0;
              break L8;
            }
          }
          var12 = stackIn_27_0;
          var13 = -3;
          L9: while (true) {
            if (3 < var13) {
              ae.a(t.field_i + var8, var6 - -16, 80, var9, 32, param0);
              ae.a(t.field_i + var8, var6 + 17, 80, var9, 32, param0);
              ae.a(var12 + (-1 + var8) - -t.field_i, -6 + (16 + var6), 3, 14, var9, 32, param0);
              break L6;
            } else {
              var14 = -3;
              L10: while (true) {
                if (var14 > 3) {
                  var13++;
                  continue L9;
                } else {
                  L11: {
                    if (0 > var14) {
                      stackOut_33_0 = -var14;
                      stackIn_34_0 = stackOut_33_0;
                      break L11;
                    } else {
                      stackOut_32_0 = var14;
                      stackIn_34_0 = stackOut_32_0;
                      break L11;
                    }
                  }
                  L12: {
                    stackOut_34_0 = stackIn_34_0;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_35_0 = stackOut_34_0;
                    if (0 <= var13) {
                      stackOut_36_0 = stackIn_36_0;
                      stackOut_36_1 = var13;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      break L12;
                    } else {
                      stackOut_35_0 = stackIn_35_0;
                      stackOut_35_1 = -var13;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      break L12;
                    }
                  }
                  L13: {
                    if (stackIn_37_0 + stackIn_37_1 > 4) {
                      break L13;
                    } else {
                      ae.a(var13 + var8 - -t.field_i, var14 + (16 + var6), 80, 16777215, 32, param0);
                      ae.a(t.field_i + var8 - -var13, 1 + var6 + (16 - -var14), 80, 16777215, 32, param0);
                      ae.a(-1 + var8 + t.field_i + (var12 - -var13), var14 + 16 + (var6 + -6), 3, 14, 16777215, 32, param0);
                      break L13;
                    }
                  }
                  var14++;
                  continue L10;
                }
              }
            }
          }
        }
        L14: {
          if (((re) this).field_i != 0) {
            break L14;
          } else {
            ae.a(cg.field_i, 9 + var8, 11 + var6, 32, param0);
            ae.a(cg.field_i, var8 - -187, 10 + var6, 32, param0);
            break L14;
          }
        }
    }

    private final int a(byte param0, int param1) {
        int var3 = param1;
        if (1 != var3) {
            return 0;
        }
        return ((re) this).field_d.field_C;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(9 != ((re) this).field_i)) {
            var2 = 200;
            var3 = qa.field_b.field_x + qa.field_b.field_q;
            var2 = var2 + (var3 * qa.field_b.b(d.field_e, 389) + 6);
            var2 = var2 + (qa.field_b.b(dh.a(0 != nb.field_e ? true : false, (byte) -94, false, ai.field_m != 0 ? true : false), 389) * var3 + 6);
            cj.field_l[((re) this).field_i] = var2 + -33;
            kb.field_b[((re) this).field_i] = this.b(0, (byte) 17) + 12 + qa.field_b.b(mk.a(110, ai.field_m != 0 ? true : false, 0 != nb.field_e ? true : false, false), 389) * var3;
        }
        var2 = -26 / ((param0 - 2) / 51);
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8_ref_int__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var19 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[][] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_54_0 = 0;
        oh stackIn_58_0 = null;
        oh stackIn_59_0 = null;
        oh stackIn_60_0 = null;
        String stackIn_60_1 = null;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        oh stackIn_68_3 = null;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        oh stackIn_69_3 = null;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        oh stackIn_70_3 = null;
        int stackIn_70_4 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        oh stackIn_71_3 = null;
        int stackIn_71_4 = 0;
        int stackIn_71_5 = 0;
        int stackIn_71_6 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        oh stackIn_72_3 = null;
        int stackIn_72_4 = 0;
        int stackIn_72_5 = 0;
        int stackIn_72_6 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        oh stackIn_73_3 = null;
        int stackIn_73_4 = 0;
        int stackIn_73_5 = 0;
        int stackIn_73_6 = 0;
        int stackIn_73_7 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        oh stackIn_74_2 = null;
        int stackIn_74_3 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        oh stackIn_75_2 = null;
        int stackIn_75_3 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        oh stackIn_76_2 = null;
        int stackIn_76_3 = 0;
        int stackIn_76_4 = 0;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        oh stackIn_77_2 = null;
        int stackIn_77_3 = 0;
        int stackIn_77_4 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        oh stackIn_78_2 = null;
        int stackIn_78_3 = 0;
        int stackIn_78_4 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        oh stackIn_79_2 = null;
        int stackIn_79_3 = 0;
        int stackIn_79_4 = 0;
        int stackIn_79_5 = 0;
        oh stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        oh stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        oh stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        int stackIn_82_3 = 0;
        oh stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        int stackIn_83_3 = 0;
        oh stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        int stackIn_84_3 = 0;
        oh stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int stackIn_85_3 = 0;
        int stackIn_85_4 = 0;
        int stackIn_89_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_159_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        oh stackOut_67_3 = null;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        oh stackOut_69_3 = null;
        int stackOut_69_4 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        oh stackOut_68_3 = null;
        int stackOut_68_4 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        oh stackOut_70_3 = null;
        int stackOut_70_4 = 0;
        int stackOut_70_5 = 0;
        int stackOut_70_6 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        oh stackOut_72_3 = null;
        int stackOut_72_4 = 0;
        int stackOut_72_5 = 0;
        int stackOut_72_6 = 0;
        int stackOut_72_7 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        oh stackOut_71_3 = null;
        int stackOut_71_4 = 0;
        int stackOut_71_5 = 0;
        int stackOut_71_6 = 0;
        int stackOut_71_7 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        oh stackOut_73_2 = null;
        int stackOut_73_3 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        oh stackOut_75_2 = null;
        int stackOut_75_3 = 0;
        int stackOut_75_4 = 0;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        oh stackOut_74_2 = null;
        int stackOut_74_3 = 0;
        int stackOut_74_4 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        oh stackOut_76_2 = null;
        int stackOut_76_3 = 0;
        int stackOut_76_4 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        oh stackOut_78_2 = null;
        int stackOut_78_3 = 0;
        int stackOut_78_4 = 0;
        int stackOut_78_5 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        oh stackOut_77_2 = null;
        int stackOut_77_3 = 0;
        int stackOut_77_4 = 0;
        int stackOut_77_5 = 0;
        oh stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
        oh stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        int stackOut_81_3 = 0;
        oh stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        int stackOut_80_3 = 0;
        oh stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        int stackOut_82_3 = 0;
        oh stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        int stackOut_84_4 = 0;
        oh stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        int stackOut_83_3 = 0;
        int stackOut_83_4 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_161_1 = 0;
        int stackOut_160_0 = 0;
        int stackOut_160_1 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        oh stackOut_57_0 = null;
        oh stackOut_59_0 = null;
        String stackOut_59_1 = null;
        oh stackOut_58_0 = null;
        String stackOut_58_1 = null;
        L0: {
          var17 = Main.field_T;
          if (h.field_E[((re) this).field_i]) {
            L1: {
              L2: {
                if (cd.field_h == -1) {
                  break L2;
                } else {
                  if (cd.field_h == 1) {
                    break L2;
                  } else {
                    f.field_a.b(0, 0);
                    break L1;
                  }
                }
              }
              ((re) this).field_d.b(((re) this).field_b, 2);
              break L1;
            }
            td.field_c[-5 + ((re) this).field_i].b(198, 33);
            break L0;
          } else {
            ae.a(d.field_u[((re) this).field_i], 0, param2, 32, param0);
            break L0;
          }
        }
        if (param1 == 0) {
          L3: {
            if (((re) this).field_i == 2) {
              break L3;
            } else {
              var4 = 0;
              L4: while (true) {
                if (~((re) this).field_f.field_i >= ~var4) {
                  break L3;
                } else {
                  L5: {
                    stackOut_12_0 = this;
                    stackOut_12_1 = param0;
                    stackOut_12_2 = var4;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    if (((re) this).field_f.field_k != var4) {
                      stackOut_14_0 = this;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = stackIn_14_2;
                      stackOut_14_3 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      stackIn_15_2 = stackOut_14_2;
                      stackIn_15_3 = stackOut_14_3;
                      break L5;
                    } else {
                      stackOut_13_0 = this;
                      stackOut_13_1 = stackIn_13_1;
                      stackOut_13_2 = stackIn_13_2;
                      stackOut_13_3 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_15_2 = stackOut_13_2;
                      stackIn_15_3 = stackOut_13_3;
                      break L5;
                    }
                  }
                  this.a(stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0, param2, param1 + -102);
                  var4++;
                  continue L4;
                }
              }
            }
          }
          L6: {
            if (((re) this).field_i != 5) {
              if (((re) this).field_i != 3) {
                if (4 != ((re) this).field_i) {
                  L7: {
                    L8: {
                      if (((re) this).field_i == 8) {
                        break L8;
                      } else {
                        if (10 == ((re) this).field_i) {
                          break L8;
                        } else {
                          if (9 != ((re) this).field_i) {
                            break L7;
                          } else {
                            L9: {
                              var4 = 200;
                              var5 = qa.field_b.field_q + qa.field_b.field_x;
                              var4 = var4 + (6 + var5 * qa.field_b.a(d.field_e, 211, var4, 389, 1000, 0, -1, 1, 0, var5));
                              stackOut_67_0 = var4;
                              stackOut_67_1 = 6;
                              stackOut_67_2 = var5;
                              stackOut_67_3 = qa.field_b;
                              stackIn_69_0 = stackOut_67_0;
                              stackIn_69_1 = stackOut_67_1;
                              stackIn_69_2 = stackOut_67_2;
                              stackIn_69_3 = stackOut_67_3;
                              stackIn_68_0 = stackOut_67_0;
                              stackIn_68_1 = stackOut_67_1;
                              stackIn_68_2 = stackOut_67_2;
                              stackIn_68_3 = stackOut_67_3;
                              if (nb.field_e == 0) {
                                stackOut_69_0 = stackIn_69_0;
                                stackOut_69_1 = stackIn_69_1;
                                stackOut_69_2 = stackIn_69_2;
                                stackOut_69_3 = (oh) (Object) stackIn_69_3;
                                stackOut_69_4 = 0;
                                stackIn_70_0 = stackOut_69_0;
                                stackIn_70_1 = stackOut_69_1;
                                stackIn_70_2 = stackOut_69_2;
                                stackIn_70_3 = stackOut_69_3;
                                stackIn_70_4 = stackOut_69_4;
                                break L9;
                              } else {
                                stackOut_68_0 = stackIn_68_0;
                                stackOut_68_1 = stackIn_68_1;
                                stackOut_68_2 = stackIn_68_2;
                                stackOut_68_3 = (oh) (Object) stackIn_68_3;
                                stackOut_68_4 = 1;
                                stackIn_70_0 = stackOut_68_0;
                                stackIn_70_1 = stackOut_68_1;
                                stackIn_70_2 = stackOut_68_2;
                                stackIn_70_3 = stackOut_68_3;
                                stackIn_70_4 = stackOut_68_4;
                                break L9;
                              }
                            }
                            L10: {
                              stackOut_70_0 = stackIn_70_0;
                              stackOut_70_1 = stackIn_70_1;
                              stackOut_70_2 = stackIn_70_2;
                              stackOut_70_3 = (oh) (Object) stackIn_70_3;
                              stackOut_70_4 = stackIn_70_4;
                              stackOut_70_5 = -122;
                              stackOut_70_6 = 0;
                              stackIn_72_0 = stackOut_70_0;
                              stackIn_72_1 = stackOut_70_1;
                              stackIn_72_2 = stackOut_70_2;
                              stackIn_72_3 = stackOut_70_3;
                              stackIn_72_4 = stackOut_70_4;
                              stackIn_72_5 = stackOut_70_5;
                              stackIn_72_6 = stackOut_70_6;
                              stackIn_71_0 = stackOut_70_0;
                              stackIn_71_1 = stackOut_70_1;
                              stackIn_71_2 = stackOut_70_2;
                              stackIn_71_3 = stackOut_70_3;
                              stackIn_71_4 = stackOut_70_4;
                              stackIn_71_5 = stackOut_70_5;
                              stackIn_71_6 = stackOut_70_6;
                              if (ai.field_m == 0) {
                                stackOut_72_0 = stackIn_72_0;
                                stackOut_72_1 = stackIn_72_1;
                                stackOut_72_2 = stackIn_72_2;
                                stackOut_72_3 = (oh) (Object) stackIn_72_3;
                                stackOut_72_4 = stackIn_72_4;
                                stackOut_72_5 = stackIn_72_5;
                                stackOut_72_6 = stackIn_72_6;
                                stackOut_72_7 = 0;
                                stackIn_73_0 = stackOut_72_0;
                                stackIn_73_1 = stackOut_72_1;
                                stackIn_73_2 = stackOut_72_2;
                                stackIn_73_3 = stackOut_72_3;
                                stackIn_73_4 = stackOut_72_4;
                                stackIn_73_5 = stackOut_72_5;
                                stackIn_73_6 = stackOut_72_6;
                                stackIn_73_7 = stackOut_72_7;
                                break L10;
                              } else {
                                stackOut_71_0 = stackIn_71_0;
                                stackOut_71_1 = stackIn_71_1;
                                stackOut_71_2 = stackIn_71_2;
                                stackOut_71_3 = (oh) (Object) stackIn_71_3;
                                stackOut_71_4 = stackIn_71_4;
                                stackOut_71_5 = stackIn_71_5;
                                stackOut_71_6 = stackIn_71_6;
                                stackOut_71_7 = 1;
                                stackIn_73_0 = stackOut_71_0;
                                stackIn_73_1 = stackOut_71_1;
                                stackIn_73_2 = stackOut_71_2;
                                stackIn_73_3 = stackOut_71_3;
                                stackIn_73_4 = stackOut_71_4;
                                stackIn_73_5 = stackOut_71_5;
                                stackIn_73_6 = stackOut_71_6;
                                stackIn_73_7 = stackOut_71_7;
                                break L10;
                              }
                            }
                            L11: {
                              var4 = stackIn_73_0 + (stackIn_73_1 + stackIn_73_2 * ((oh) (Object) stackIn_73_3).a(dh.a(stackIn_73_4 != 0, (byte) stackIn_73_5, stackIn_73_6 != 0, stackIn_73_7 != 0), 211, var4, 389, 1000, 0, -1, 1, 0, var5));
                              var4 = var4 + (this.b(0, (byte) 17) + 6);
                              stackOut_73_0 = var4;
                              stackOut_73_1 = var5;
                              stackOut_73_2 = qa.field_b;
                              stackOut_73_3 = 116;
                              stackIn_75_0 = stackOut_73_0;
                              stackIn_75_1 = stackOut_73_1;
                              stackIn_75_2 = stackOut_73_2;
                              stackIn_75_3 = stackOut_73_3;
                              stackIn_74_0 = stackOut_73_0;
                              stackIn_74_1 = stackOut_73_1;
                              stackIn_74_2 = stackOut_73_2;
                              stackIn_74_3 = stackOut_73_3;
                              if (0 == ai.field_m) {
                                stackOut_75_0 = stackIn_75_0;
                                stackOut_75_1 = stackIn_75_1;
                                stackOut_75_2 = (oh) (Object) stackIn_75_2;
                                stackOut_75_3 = stackIn_75_3;
                                stackOut_75_4 = 0;
                                stackIn_76_0 = stackOut_75_0;
                                stackIn_76_1 = stackOut_75_1;
                                stackIn_76_2 = stackOut_75_2;
                                stackIn_76_3 = stackOut_75_3;
                                stackIn_76_4 = stackOut_75_4;
                                break L11;
                              } else {
                                stackOut_74_0 = stackIn_74_0;
                                stackOut_74_1 = stackIn_74_1;
                                stackOut_74_2 = (oh) (Object) stackIn_74_2;
                                stackOut_74_3 = stackIn_74_3;
                                stackOut_74_4 = 1;
                                stackIn_76_0 = stackOut_74_0;
                                stackIn_76_1 = stackOut_74_1;
                                stackIn_76_2 = stackOut_74_2;
                                stackIn_76_3 = stackOut_74_3;
                                stackIn_76_4 = stackOut_74_4;
                                break L11;
                              }
                            }
                            L12: {
                              stackOut_76_0 = stackIn_76_0;
                              stackOut_76_1 = stackIn_76_1;
                              stackOut_76_2 = (oh) (Object) stackIn_76_2;
                              stackOut_76_3 = stackIn_76_3;
                              stackOut_76_4 = stackIn_76_4;
                              stackIn_78_0 = stackOut_76_0;
                              stackIn_78_1 = stackOut_76_1;
                              stackIn_78_2 = stackOut_76_2;
                              stackIn_78_3 = stackOut_76_3;
                              stackIn_78_4 = stackOut_76_4;
                              stackIn_77_0 = stackOut_76_0;
                              stackIn_77_1 = stackOut_76_1;
                              stackIn_77_2 = stackOut_76_2;
                              stackIn_77_3 = stackOut_76_3;
                              stackIn_77_4 = stackOut_76_4;
                              if (0 == nb.field_e) {
                                stackOut_78_0 = stackIn_78_0;
                                stackOut_78_1 = stackIn_78_1;
                                stackOut_78_2 = (oh) (Object) stackIn_78_2;
                                stackOut_78_3 = stackIn_78_3;
                                stackOut_78_4 = stackIn_78_4;
                                stackOut_78_5 = 0;
                                stackIn_79_0 = stackOut_78_0;
                                stackIn_79_1 = stackOut_78_1;
                                stackIn_79_2 = stackOut_78_2;
                                stackIn_79_3 = stackOut_78_3;
                                stackIn_79_4 = stackOut_78_4;
                                stackIn_79_5 = stackOut_78_5;
                                break L12;
                              } else {
                                stackOut_77_0 = stackIn_77_0;
                                stackOut_77_1 = stackIn_77_1;
                                stackOut_77_2 = (oh) (Object) stackIn_77_2;
                                stackOut_77_3 = stackIn_77_3;
                                stackOut_77_4 = stackIn_77_4;
                                stackOut_77_5 = 1;
                                stackIn_79_0 = stackOut_77_0;
                                stackIn_79_1 = stackOut_77_1;
                                stackIn_79_2 = stackOut_77_2;
                                stackIn_79_3 = stackOut_77_3;
                                stackIn_79_4 = stackOut_77_4;
                                stackIn_79_5 = stackOut_77_5;
                                break L12;
                              }
                            }
                            L13: {
                              var4 = stackIn_79_0 + (stackIn_79_1 * ((oh) (Object) stackIn_79_2).a(mk.a(stackIn_79_3, stackIn_79_4 != 0, stackIn_79_5 != 0, false), 211, var4, 389, 1000, 0, -1, 1, 0, var5) + 6);
                              var4 = var4 + (6 + this.b(1, (byte) 17));
                              stackOut_79_0 = qa.field_b;
                              stackOut_79_1 = 43;
                              stackOut_79_2 = 0;
                              stackIn_81_0 = stackOut_79_0;
                              stackIn_81_1 = stackOut_79_1;
                              stackIn_81_2 = stackOut_79_2;
                              stackIn_80_0 = stackOut_79_0;
                              stackIn_80_1 = stackOut_79_1;
                              stackIn_80_2 = stackOut_79_2;
                              if (nb.field_e == 0) {
                                stackOut_81_0 = (oh) (Object) stackIn_81_0;
                                stackOut_81_1 = stackIn_81_1;
                                stackOut_81_2 = stackIn_81_2;
                                stackOut_81_3 = 0;
                                stackIn_82_0 = stackOut_81_0;
                                stackIn_82_1 = stackOut_81_1;
                                stackIn_82_2 = stackOut_81_2;
                                stackIn_82_3 = stackOut_81_3;
                                break L13;
                              } else {
                                stackOut_80_0 = (oh) (Object) stackIn_80_0;
                                stackOut_80_1 = stackIn_80_1;
                                stackOut_80_2 = stackIn_80_2;
                                stackOut_80_3 = 1;
                                stackIn_82_0 = stackOut_80_0;
                                stackIn_82_1 = stackOut_80_1;
                                stackIn_82_2 = stackOut_80_2;
                                stackIn_82_3 = stackOut_80_3;
                                break L13;
                              }
                            }
                            L14: {
                              stackOut_82_0 = (oh) (Object) stackIn_82_0;
                              stackOut_82_1 = stackIn_82_1;
                              stackOut_82_2 = stackIn_82_2;
                              stackOut_82_3 = stackIn_82_3;
                              stackIn_84_0 = stackOut_82_0;
                              stackIn_84_1 = stackOut_82_1;
                              stackIn_84_2 = stackOut_82_2;
                              stackIn_84_3 = stackOut_82_3;
                              stackIn_83_0 = stackOut_82_0;
                              stackIn_83_1 = stackOut_82_1;
                              stackIn_83_2 = stackOut_82_2;
                              stackIn_83_3 = stackOut_82_3;
                              if (ai.field_m == 0) {
                                stackOut_84_0 = (oh) (Object) stackIn_84_0;
                                stackOut_84_1 = stackIn_84_1;
                                stackOut_84_2 = stackIn_84_2;
                                stackOut_84_3 = stackIn_84_3;
                                stackOut_84_4 = 0;
                                stackIn_85_0 = stackOut_84_0;
                                stackIn_85_1 = stackOut_84_1;
                                stackIn_85_2 = stackOut_84_2;
                                stackIn_85_3 = stackOut_84_3;
                                stackIn_85_4 = stackOut_84_4;
                                break L14;
                              } else {
                                stackOut_83_0 = (oh) (Object) stackIn_83_0;
                                stackOut_83_1 = stackIn_83_1;
                                stackOut_83_2 = stackIn_83_2;
                                stackOut_83_3 = stackIn_83_3;
                                stackOut_83_4 = 1;
                                stackIn_85_0 = stackOut_83_0;
                                stackIn_85_1 = stackOut_83_1;
                                stackIn_85_2 = stackOut_83_2;
                                stackIn_85_3 = stackOut_83_3;
                                stackIn_85_4 = stackOut_83_4;
                                break L14;
                              }
                            }
                            int discarded$4 = ((oh) (Object) stackIn_85_0).a(af.a(stackIn_85_1, stackIn_85_2 != 0, stackIn_85_3 != 0, stackIn_85_4 != 0), 211, var4, 389, 1000, 0, -1, 1, 0, var5);
                            break L6;
                          }
                        }
                      }
                    }
                    L15: {
                      if (((re) this).field_i == 8) {
                        stackOut_88_0 = ue.field_d;
                        stackIn_89_0 = stackOut_88_0;
                        break L15;
                      } else {
                        stackOut_87_0 = nb.field_e;
                        stackIn_89_0 = stackOut_87_0;
                        break L15;
                      }
                    }
                    L16: {
                      var4 = stackIn_89_0;
                      if (rd.a(var4, 1266438832) <= 11) {
                        stackOut_91_0 = 0;
                        stackIn_92_0 = stackOut_91_0;
                        break L16;
                      } else {
                        stackOut_90_0 = 1;
                        stackIn_92_0 = stackOut_90_0;
                        break L16;
                      }
                    }
                    L17: {
                      var5 = stackIn_92_0;
                      var6 = 40;
                      var7 = rd.a(var4, param1 + 1266438832);
                      if (1 >= var7) {
                        break L17;
                      } else {
                        var8 = -1;
                        var9 = 0;
                        var10 = 0;
                        L18: while (true) {
                          if (~var10 <= ~qk.field_a.length) {
                            if (var7 <= var9) {
                              break L17;
                            } else {
                              var10 = (40 - (var9 * 40 - 368)) / (var7 - var9);
                              if (~var6 >= ~var10) {
                                break L17;
                              } else {
                                var6 = var10;
                                break L17;
                              }
                            }
                          } else {
                            L19: {
                              if ((var4 & 1 << var10) != 0) {
                                if (var5 != 0) {
                                  L20: {
                                    if (var10 >= 5) {
                                      if (var10 < 8) {
                                        stackOut_105_0 = 1;
                                        stackIn_106_0 = stackOut_105_0;
                                        break L20;
                                      } else {
                                        if (var10 < 12) {
                                          stackOut_104_0 = 2;
                                          stackIn_106_0 = stackOut_104_0;
                                          break L20;
                                        } else {
                                          stackOut_103_0 = 3;
                                          stackIn_106_0 = stackOut_103_0;
                                          break L20;
                                        }
                                      }
                                    } else {
                                      stackOut_100_0 = 0;
                                      stackIn_106_0 = stackOut_100_0;
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    var11 = stackIn_106_0;
                                    if (var8 != var11) {
                                      var9++;
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                  var8 = var11;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              } else {
                                break L19;
                              }
                            }
                            var10++;
                            continue L18;
                          }
                        }
                      }
                    }
                    var8 = 170;
                    var9 = 168;
                    var10 = -1;
                    var11 = -1;
                    var12 = -1;
                    var13 = 0;
                    L22: while (true) {
                      if (~var13 <= ~qk.field_a.length) {
                        L23: {
                          if (var12 == -1) {
                            break L23;
                          } else {
                            if (var12 == ((re) this).field_g) {
                              ((re) this).field_g = -1;
                              break L23;
                            } else {
                              ((re) this).field_g = var12;
                              break L23;
                            }
                          }
                        }
                        ((re) this).field_a = -1;
                        var8 = 170;
                        var13 = 0;
                        L24: while (true) {
                          if (~qk.field_a.length >= ~var13) {
                            L25: {
                              if (((re) this).field_g == -1) {
                                break L25;
                              } else {
                                var10 = ((re) this).field_g;
                                break L25;
                              }
                            }
                            if (var10 < 0) {
                              int discarded$5 = qa.field_b.a(id.field_d, 208, 237, td.field_c[((re) this).field_i - 5].field_p - 20, 1024, 0, -1, 1, 0, qa.field_b.field_x + qa.field_b.field_s);
                              break L6;
                            } else {
                              var13 = qa.field_b.field_s + qa.field_b.field_x;
                              var14 = 239;
                              var15 = 363;
                              qa.field_b.b(ge.field_b[var10], var15, var14, 0, -1);
                              qk.field_a[var10].d(223, -qa.field_b.field_s + var14);
                              var14 = var14 + var13;
                              qa.field_b.b(pk.field_b, var15, var14, 16711680, -1);
                              var14 = var14 + (5 + var13);
                              var14 = var14 + qa.field_b.a(lk.field_u[var10], var15, -qa.field_b.field_s + var14, -var15 + 588, 480, 0, -1, 0, 0, var13) * var13;
                              qa.field_b.b(eg.field_a + 100 * eb.field_i[var10], var15, var14, 0, -1);
                              var8 = var15;
                              var14 = var14 + var13;
                              qa.field_b.b(nl.field_a, var8, var14, 0, -1);
                              var8 = var8 + qa.field_b.a(nl.field_a);
                              var16 = 0;
                              L26: while (true) {
                                if (var16 >= eb.field_i[var10]) {
                                  break L7;
                                } else {
                                  sk.field_c.d(var8, -qa.field_b.field_s + var14);
                                  var8 = var8 + sk.field_c.field_l / 3;
                                  var16++;
                                  continue L26;
                                }
                              }
                            }
                          } else {
                            L27: {
                              if ((1 << var13 & var4) != 0) {
                                L28: {
                                  if (var5 != 0) {
                                    L29: {
                                      if (var13 < 5) {
                                        stackOut_158_0 = 0;
                                        stackIn_159_0 = stackOut_158_0;
                                        break L29;
                                      } else {
                                        if (var13 < 8) {
                                          stackOut_157_0 = 1;
                                          stackIn_159_0 = stackOut_157_0;
                                          break L29;
                                        } else {
                                          if (var13 >= 12) {
                                            stackOut_156_0 = 3;
                                            stackIn_159_0 = stackOut_156_0;
                                            break L29;
                                          } else {
                                            stackOut_155_0 = 2;
                                            stackIn_159_0 = stackOut_155_0;
                                            break L29;
                                          }
                                        }
                                      }
                                    }
                                    L30: {
                                      var14 = stackIn_159_0;
                                      stackOut_159_0 = var8;
                                      stackIn_161_0 = stackOut_159_0;
                                      stackIn_160_0 = stackOut_159_0;
                                      if (~var14 == ~var11) {
                                        stackOut_161_0 = stackIn_161_0;
                                        stackOut_161_1 = var6;
                                        stackIn_162_0 = stackOut_161_0;
                                        stackIn_162_1 = stackOut_161_1;
                                        break L30;
                                      } else {
                                        stackOut_160_0 = stackIn_160_0;
                                        stackOut_160_1 = 40;
                                        stackIn_162_0 = stackOut_160_0;
                                        stackIn_162_1 = stackOut_160_1;
                                        break L30;
                                      }
                                    }
                                    var8 = stackIn_162_0 + stackIn_162_1;
                                    var11 = var14;
                                    break L28;
                                  } else {
                                    var8 = var8 + var6;
                                    break L28;
                                  }
                                }
                                qk.field_a[var13].a(var8, var9);
                                if (((re) this).field_g == var13) {
                                  db.field_o.c(-5 + var8, -5 + var9, 16711680);
                                  break L27;
                                } else {
                                  if (var13 == var10) {
                                    db.field_o.c(-5 + var8, -5 + var9, 0);
                                    break L27;
                                  } else {
                                    break L27;
                                  }
                                }
                              } else {
                                break L27;
                              }
                            }
                            var13++;
                            continue L24;
                          }
                        }
                      } else {
                        L31: {
                          if (0 == (var4 & 1 << var13)) {
                            break L31;
                          } else {
                            L32: {
                              if (var5 != 0) {
                                L33: {
                                  if (var13 >= 5) {
                                    if (var13 < 8) {
                                      stackOut_125_0 = 1;
                                      stackIn_126_0 = stackOut_125_0;
                                      break L33;
                                    } else {
                                      if (var13 >= 12) {
                                        stackOut_124_0 = 3;
                                        stackIn_126_0 = stackOut_124_0;
                                        break L33;
                                      } else {
                                        stackOut_123_0 = 2;
                                        stackIn_126_0 = stackOut_123_0;
                                        break L33;
                                      }
                                    }
                                  } else {
                                    stackOut_120_0 = 0;
                                    stackIn_126_0 = stackOut_120_0;
                                    break L33;
                                  }
                                }
                                L34: {
                                  var14 = stackIn_126_0;
                                  stackOut_126_0 = var8;
                                  stackIn_128_0 = stackOut_126_0;
                                  stackIn_127_0 = stackOut_126_0;
                                  if (var11 != var14) {
                                    stackOut_128_0 = stackIn_128_0;
                                    stackOut_128_1 = 40;
                                    stackIn_129_0 = stackOut_128_0;
                                    stackIn_129_1 = stackOut_128_1;
                                    break L34;
                                  } else {
                                    stackOut_127_0 = stackIn_127_0;
                                    stackOut_127_1 = 20;
                                    stackIn_129_0 = stackOut_127_0;
                                    stackIn_129_1 = stackOut_127_1;
                                    break L34;
                                  }
                                }
                                var8 = stackIn_129_0 + stackIn_129_1;
                                var11 = var14;
                                break L32;
                              } else {
                                var8 = var8 + var6;
                                break L32;
                              }
                            }
                            L35: {
                              if (~((re) this).field_a > ~var8) {
                                break L35;
                              } else {
                                if (((re) this).field_a > var8 - -32) {
                                  break L35;
                                } else {
                                  if (~var9 < ~((re) this).field_e) {
                                    break L35;
                                  } else {
                                    if (~(var9 - -32) <= ~((re) this).field_e) {
                                      var12 = var13;
                                      break L35;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                              }
                            }
                            if (eg.field_b < var8) {
                              break L31;
                            } else {
                              if (~eg.field_b < ~(32 + var8)) {
                                break L31;
                              } else {
                                if (~var9 < ~ij.field_e) {
                                  break L31;
                                } else {
                                  if (~ij.field_e < ~(var9 + 32)) {
                                    break L31;
                                  } else {
                                    var10 = var13;
                                    break L31;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var13++;
                        continue L22;
                      }
                    }
                  }
                  break L6;
                } else {
                  var4 = -1;
                  var5 = param2 + 121;
                  var27 = g.field_y;
                  var7 = 0;
                  L36: while (true) {
                    if (~var7 <= ~var27.length) {
                      L37: {
                        if (((re) this).field_g != -1) {
                          var4 = ((re) this).field_g;
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                      L38: {
                        if (var4 != -1) {
                          L39: {
                            var6 = qa.field_b.field_s - -qa.field_b.field_x;
                            var7 = 226 - -param2;
                            qa.field_b.b(ge.field_b[var4], 388, var7, 0, -1);
                            if ((1 << var4 & db.field_m) == 0) {
                              stackOut_53_0 = 0;
                              stackIn_54_0 = stackOut_53_0;
                              break L39;
                            } else {
                              stackOut_52_0 = 1;
                              stackIn_54_0 = stackOut_52_0;
                              break L39;
                            }
                          }
                          L40: {
                            var8 = stackIn_54_0;
                            if (var8 == 0) {
                              vb.field_k.d(248, var7 - qa.field_b.field_s);
                              break L40;
                            } else {
                              qk.field_a[var4].d(248, var7 + -qa.field_b.field_s);
                              break L40;
                            }
                          }
                          L41: {
                            var7 = var7 + var6;
                            stackOut_57_0 = qa.field_b;
                            stackIn_59_0 = stackOut_57_0;
                            stackIn_58_0 = stackOut_57_0;
                            if (var8 == 0) {
                              stackOut_59_0 = (oh) (Object) stackIn_59_0;
                              stackOut_59_1 = vd.field_n;
                              stackIn_60_0 = stackOut_59_0;
                              stackIn_60_1 = stackOut_59_1;
                              break L41;
                            } else {
                              stackOut_58_0 = (oh) (Object) stackIn_58_0;
                              stackOut_58_1 = pk.field_b;
                              stackIn_60_0 = stackOut_58_0;
                              stackIn_60_1 = stackOut_58_1;
                              break L41;
                            }
                          }
                          ((oh) (Object) stackIn_60_0).b(stackIn_60_1, 388, var7, 16711680, -1);
                          var7 = var7 + (5 + var6);
                          var7 = var7 + var6 * qa.field_b.a(lk.field_u[var4], 388, var7 - qa.field_b.field_s, 179, 480, 0, -1, 0, 0, var6);
                          qa.field_b.b(eg.field_a + 100 * eb.field_i[var4], 388, var7, 0, -1);
                          var7 = var7 + var6;
                          var9 = 388;
                          qa.field_b.b(nl.field_a, var9, var7, 0, -1);
                          var9 = var9 + qa.field_b.a(nl.field_a);
                          var10 = 0;
                          L42: while (true) {
                            if (eb.field_i[var4] <= var10) {
                              break L38;
                            } else {
                              sk.field_c.d(var9, -qa.field_b.field_s + var7);
                              var9 = var9 + sk.field_c.field_l / 3;
                              var10++;
                              continue L42;
                            }
                          }
                        } else {
                          qa.field_b.a(id.field_d, 407, param2 + 226, 0, -1);
                          if (!dl.d(0)) {
                            break L38;
                          } else {
                            int discarded$6 = qa.field_b.a(ag.field_g, 248, param2 + (2 * (qa.field_b.field_x + qa.field_b.field_s) + 226), 319, 1024, 0, -1, 1, 0, qa.field_b.field_x + qa.field_b.field_s);
                            break L6;
                          }
                        }
                      }
                      break L6;
                    } else {
                      var28 = var27[var7];
                      var25 = var28;
                      var22 = var25;
                      var19 = var22;
                      var8_ref_int__ = var19;
                      var9 = 251 + (320 + -(40 * var28.length)) / 2;
                      var29 = var8_ref_int__;
                      var11 = 0;
                      L43: while (true) {
                        if (~var29.length >= ~var11) {
                          var5 += 40;
                          var7++;
                          continue L36;
                        } else {
                          L44: {
                            var12 = var29[var11];
                            if ((db.field_m & 1 << var12) == 0) {
                              vb.field_k.a(var9, var5);
                              break L44;
                            } else {
                              qk.field_a[var12].a(var9, var5);
                              break L44;
                            }
                          }
                          L45: {
                            if (eg.field_b < var9) {
                              break L45;
                            } else {
                              if (eg.field_b > 32 + var9) {
                                break L45;
                              } else {
                                if (~var5 < ~ij.field_e) {
                                  break L45;
                                } else {
                                  if (~(var5 + 32) > ~ij.field_e) {
                                    break L45;
                                  } else {
                                    db.field_o.c(-5 + var9, var5 - 5, 0);
                                    var4 = var12;
                                    break L45;
                                  }
                                }
                              }
                            }
                          }
                          L46: {
                            if (((re) this).field_a < var9) {
                              break L46;
                            } else {
                              if (~(var9 - -32) > ~((re) this).field_a) {
                                break L46;
                              } else {
                                if (var5 > ((re) this).field_e) {
                                  break L46;
                                } else {
                                  if (~(32 + var5) > ~((re) this).field_e) {
                                    break L46;
                                  } else {
                                    L47: {
                                      if (~((re) this).field_g != ~var12) {
                                        ((re) this).field_g = var12;
                                        break L47;
                                      } else {
                                        ((re) this).field_g = -1;
                                        break L47;
                                      }
                                    }
                                    ((re) this).field_a = -1;
                                    break L46;
                                  }
                                }
                              }
                            }
                          }
                          L48: {
                            if (var12 != ((re) this).field_g) {
                              break L48;
                            } else {
                              db.field_o.c(var9 - 5, var5 - 5, 16711680);
                              break L48;
                            }
                          }
                          var9 += 40;
                          var11++;
                          continue L43;
                        }
                      }
                    }
                  }
                }
              } else {
                int discarded$7 = qa.field_b.a(rc.field_n, 176, param2 + 140, 292, 222, 2753797, -1, 1, 3, 20);
                break L6;
              }
            } else {
              this.d(104);
              break L6;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Main.field_T;
        if (((re) this).field_i != 2) {
          L0: {
            var4 = -7 % ((param1 - 31) / 37);
            if (((re) this).field_i != 5) {
              if (((re) this).field_i == 10) {
                var3 = param0 * 172 + nk.field_a[((re) this).field_i];
                break L0;
              } else {
                var3 = nk.field_a[((re) this).field_i];
                break L0;
              }
            } else {
              if (!dl.d(0)) {
                if (3 > param0) {
                  var3 = nk.field_a[((re) this).field_i] + (-1 + param0) * 136;
                  break L0;
                } else {
                  var3 = nk.field_a[((re) this).field_i];
                  break L0;
                }
              } else {
                var3 = 136 * param0 + (-136 + (68 + nk.field_a[((re) this).field_i]));
                break L0;
              }
            }
          }
          L1: {
            if (!h.field_E[((re) this).field_i]) {
              break L1;
            } else {
              var3 += 198;
              break L1;
            }
          }
          return var3;
        } else {
          return 0;
        }
    }

    re(Main param0, int param1) {
        ((re) this).field_g = -1;
        ((re) this).field_a = -1;
        try {
            ((re) this).field_d = param0;
            ((re) this).field_i = param1;
            ((re) this).field_f = new lh(fh.field_G[param1].length);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "re.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = Main.field_T;
        try {
          L0: {
            if (param2 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var3_int = param2.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    var4 = ff.a((byte) 116, param2);
                    if (var4 == null) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    } else {
                      if (var4.length() >= 1) {
                        L2: {
                          if (tg.a((byte) -63, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (!tg.a((byte) -63, var4.charAt(var4.length() - 1))) {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param2.length()) {
                                  if (var5 <= 0) {
                                    stackOut_32_0 = 1;
                                    stackIn_33_0 = stackOut_32_0;
                                    break L0;
                                  } else {
                                    stackOut_30_0 = 0;
                                    stackIn_31_0 = stackOut_30_0;
                                    return stackIn_31_0 != 0;
                                  }
                                } else {
                                  L4: {
                                    var7 = param2.charAt(var6);
                                    if (tg.a((byte) -63, (char) var7)) {
                                      var5++;
                                      break L4;
                                    } else {
                                      var5 = 0;
                                      break L4;
                                    }
                                  }
                                  if (var5 < 2) {
                                    var6++;
                                    continue L3;
                                  } else {
                                    stackOut_26_0 = 0;
                                    stackIn_27_0 = stackOut_26_0;
                                    return stackIn_27_0 != 0;
                                  }
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0 != 0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("re.J(").append(false).append(',').append(-102).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param2 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L5;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ')');
        }
        return stackIn_33_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
