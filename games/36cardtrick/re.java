/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int var2;
        int var3;
        L0: {
          var3 = Main.field_T;
          this.field_b = this.field_b + 1;
          if (param0 <= -101) {
            break L0;
          } else {
            this.field_i = -116;
            break L0;
          }
        }
        L1: {
          if (this.field_i != 2) {
            break L1;
          } else {
            if (-151 < (this.field_b ^ -1)) {
              break L1;
            } else {
              this.a(false, (byte) 122, true, 0);
              break L1;
            }
          }
        }
        L2: while (true) {
          if (!ge.b((byte) -114)) {
            L3: {
              this.field_f.a(this.a((byte) -22, ij.field_e, eg.field_b), (byte) 115, this.a((byte) -22, jc.field_N, ag.field_a));
              if ((this.field_f.field_k ^ -1) == 0) {
                break L3;
              } else {
                this.a(true, (byte) 122, this.field_f.c(-1), this.field_f.field_k);
                break L3;
              }
            }
            L4: {
              if (-1 != (dl.field_h ^ -1)) {
                this.field_a = ag.field_a;
                this.field_e = jc.field_N;
                break L4;
              } else {
                break L4;
              }
            }
            return;
          } else {
            if (-14 == (tb.field_d ^ -1)) {
              if ((this.field_i ^ -1) != -2) {
                var2 = 0;
                L5: while (true) {
                  if (var2 >= fh.field_G[this.field_i].length) {
                    continue L2;
                  } else {
                    if ((fh.field_G[this.field_i][var2] ^ -1) == -18) {
                      this.a(false, (byte) 119, true, var2);
                      continue L2;
                    } else {
                      var2++;
                      continue L5;
                    }
                  }
                }
              } else {
                this.a(false, (byte) 119, true, 0);
                continue L2;
              }
            } else {
              L6: {
                if (fh.field_G[this.field_i].length != 1) {
                  break L6;
                } else {
                  if (tb.field_d != 84) {
                    break L6;
                  } else {
                    this.a(false, (byte) 122, true, 0);
                    continue L2;
                  }
                }
              }
              this.a(true);
              if (0 == (this.field_f.field_k ^ -1)) {
                continue L2;
              } else {
                this.a(false, (byte) 121, this.field_f.c(-1), this.field_f.field_k);
                continue L2;
              }
            }
          }
        }
    }

    private final int b(int param0, byte param1) {
        if (!((this.field_i ^ -1) != -3)) {
            return 480;
        }
        if (param1 != 17) {
            re.a(3);
        }
        return ia.field_c[fh.field_G[this.field_i][param0]].field_o;
    }

    final static void a(int param0, int param1, int param2, byte param3, kc param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        kc var11 = null;
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
              if (param1 - -var7 <= vj.field_a) {
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
                var11 = (kc) null;
                re.a(-101, 85, 79, (byte) -16, (kc) null);
                break L5;
              }
            }
            L6: {
              var10 = vj.field_l + -var7;
              if ((var7 ^ -1) >= -1) {
                break L6;
              } else {
                if (-1 > (var6 ^ -1)) {
                  hf.a(var9, var6, param0, 0, param4.field_r, var5_int, var8, var10, var7, vj.field_j, 125);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L6;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5);

            stackIn_20_1 = new StringBuilder().append("re.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(int param0) {
        String var2;
        uh var3;
        int var4;
        String[][] var5;
        int[][] var6;
        int var7;
        int var8;
        int var9;
        int var10;
        Object var11;
        String var11_ref;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[][] var17;
        String var18;
        int[][] var19;
        L0: {
          var16 = Main.field_T;
          if (dl.d(0)) {
            var2 = j.field_F + "<br><br>" + ag.field_g;
            break L0;
          } else {
            L1: {
              if (null != this.field_d.field_cb) {
                break L1;
              } else {
                this.field_d.field_cb = il.a(8, 3, 25404, fb.field_c[this.field_d.field_C], 1);
                break L1;
              }
            }
            var3 = this.field_d.field_cb;
            if (!var3.field_o) {
              var2 = tj.field_H;
              break L0;
            } else {
              L2: {
                var4 = this.field_d.field_D;
                var5 = var3.field_m;
                var19 = var3.field_q;
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
                    var19 = var17;
                    if (-1 < (var4 ^ -1)) {
                      break L5;
                    } else {
                      if (var4 < var19.length) {
                        if (null == var19[var4]) {
                          var2 = t.field_f;
                          break L4;
                        } else {
                          var2 = j.field_F;
                          var7 = wh.a(var3, var4, -122, this.field_d.field_P);
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
                                    if (0 == (var7 ^ -1)) {
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
                                      if (var10 >= var19[var4].length) {
                                        var8 = var8 + (qa.field_b.field_s + qa.field_b.field_x);
                                        var10++;
                                        continue L6;
                                      } else {
                                        var11_ref = var5[var4][var10];
                                        if (var11_ref != null) {
                                          var14 = 255 & var19[var4][var10];
                                          var13 = var19[var4][var10] >> 2097973448;
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
                                    var18 = ee.a(qa.field_b, var11_ref, var15);
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
              eb.field_c.a(ij.field_d, 211, 106 - -(9 * (qa.field_b.field_s + qa.field_b.field_x)), 389, 8 * qa.field_b.field_s, 0, -1, 1, 0, qa.field_b.field_s - -qa.field_b.field_x);
              eb.field_c.field_J[0][2] = 1;
              break L0;
            }
          }
        }
        L12: {
          eb.field_c.field_J[0][2] = 16777215;
          eb.field_c.field_J[0][1] = 6697779;
          if (param0 >= 82) {
            break L12;
          } else {
            this.a(-8, -35, -46);
            break L12;
          }
        }
        eb.field_c.a(var2, 211, 166, 389, qa.field_b.field_s * 8, 0, -1, 1, 1, qa.field_b.field_s + qa.field_b.field_x);
        eb.field_c.field_J[0][2] = 1;
    }

    private final int a(byte param0, int param1, int param2) {
        int discarded$1 = 0;
        int var4;
        int var5;
        kc var6;
        int var7;
        L0: {
          var7 = Main.field_T;
          if (param0 == -22) {
            break L0;
          } else {
            discarded$1 = this.a((byte) 37, -63, 74);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (fh.field_G[this.field_i].length <= var4) {
            return -1;
          } else {
            var5 = this.b(var4, 9996);
            var6 = ia.field_c[fh.field_G[this.field_i][var4]];
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
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_19_0 = 0;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        var11 = Main.field_T;
        try {
          L0: {
            L1: {
              var3_int = param0.length();
              if (param2 == -50) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            var4 = var3_int;
            var5 = 0;
            L2: while (true) {
              var6_int = param0.indexOf("<%", var5);
              if (0 > var6_int) {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L3: while (true) {
                  var8 = param0.indexOf("<%", var5);
                  if (var8 >= 0) {
                    stackIn_19_0 = 2 + var8;
                    var5 = stackIn_19_0;
                    L4: while (true) {
                      L5: {
                        if (var3_int <= var5) {
                          break L5;
                        } else {
                          if (!Main.a(-49, param0.charAt(var5))) {
                            break L5;
                          } else {
                            var5++;
                            continue L4;
                          }
                        }
                      }
                      var9 = param0.substring(2 + var8, var5);
                      if (!pg.a(false, (CharSequence) ((Object) var9))) {
                        continue L3;
                      } else {
                        if (var3_int <= var5) {
                          continue L3;
                        } else {
                          if (62 != param0.charAt(var5)) {
                            continue L3;
                          } else {
                            var5++;
                            var10 = ie.a(false, (CharSequence) ((Object) var9));
                            discarded$0 = var6.append(param0.substring(var7, var8));
                            var7 = var5;
                            discarded$1 = var6.append(param1[var10]);
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    discarded$2 = var6.append(param0.substring(var7));
                    stackIn_28_0 = var6.toString();
                    break L0;
                  }
                }
              } else {
                var5 = 2 + var6_int;
                L6: while (true) {
                  L7: {
                    if (var3_int <= var5) {
                      break L7;
                    } else {
                      if (!Main.a(-49, param0.charAt(var5))) {
                        break L7;
                      } else {
                        var5++;
                        continue L6;
                      }
                    }
                  }
                  var7_ref_String = param0.substring(var6_int + 2, var5);
                  if (!pg.a(false, (CharSequence) ((Object) var7_ref_String))) {
                    continue L2;
                  } else {
                    if (var3_int <= var5) {
                      continue L2;
                    } else {
                      if (param0.charAt(var5) == 62) {
                        var5++;
                        var8 = ie.a(false, (CharSequence) ((Object) var7_ref_String));
                        var4 = var4 + (param1[var8].length() + var6_int + -var5);
                        continue L2;
                      } else {
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("re.R(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L9;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L9;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_32_0), stackIn_35_2 + ',' + param2 + ')');
        }
        return stackIn_28_0;
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = Main.field_T;
        if ((this.field_i ^ -1) != -3) {
          L0: {
            if (param1 == 9996) {
              break L0;
            } else {
              this.field_e = 42;
              break L0;
            }
          }
          L1: {
            if (-6 != (this.field_i ^ -1)) {
              if (this.field_i != 10) {
                var3 = kb.field_b[this.field_i] * param0 + cj.field_l[this.field_i];
                break L1;
              } else {
                var3 = cj.field_l[this.field_i];
                break L1;
              }
            } else {
              if (dl.d(0)) {
                var3 = cj.field_l[this.field_i];
                break L1;
              } else {
                if (param0 >= 3) {
                  var3 = cj.field_l[this.field_i] + kb.field_b[this.field_i];
                  break L1;
                } else {
                  var3 = cj.field_l[this.field_i];
                  break L1;
                }
              }
            }
          }
          L2: {
            if (h.field_E[this.field_i]) {
              var3 += 33;
              break L2;
            } else {
              break L2;
            }
          }
          return var3;
        } else {
          return 0;
        }
    }

    private final int a(int param0, int param1) {
        if (2 == this.field_i) {
            return 640;
        }
        if (param0 != -24133) {
            field_c = (int[]) null;
        }
        kc var3 = ia.field_c[fh.field_G[this.field_i][param1]];
        return this.a(param1, (byte) 119) + var3.field_q - -var3.field_p;
    }

    final static void c(int param0) {
        gh.field_g = false;
        tf.field_p = null;
        gl.field_G = null;
        if (param0 != 3) {
            return;
        }
        da.field_c = null;
        ia.field_d = null;
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != -4) {
            return;
        }
        field_c = null;
    }

    private final void a(boolean param0) {
        int var3;
        var3 = Main.field_T;
        if (param0) {
          L0: {
            L1: {
              if ((this.field_i ^ -1) != -6) {
                break L1;
              } else {
                if (!dl.d(0)) {
                  if (!this.field_f.a((byte) -63)) {
                    L2: {
                      if ((tb.field_d ^ -1) == -97) {
                        L3: {
                          if (this.field_f.field_k > 0) {
                            if (-4 != (this.field_f.field_k ^ -1)) {
                              this.field_f.a(31973, -1 + this.field_f.field_k);
                              break L3;
                            } else {
                              break L3;
                            }
                          } else {
                            this.field_f.a(31973, 2);
                            break L3;
                          }
                        }
                        if ((this.field_f.field_k ^ -1) > -1) {
                          break L2;
                        } else {
                          if (-3 <= (this.field_f.field_k ^ -1)) {
                            this.field_d.field_D = this.field_f.field_k;
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
                          if (-3 < (this.field_f.field_k ^ -1)) {
                            this.field_f.a(31973, 1 + this.field_f.field_k);
                            break L5;
                          } else {
                            if (2 == this.field_f.field_k) {
                              this.field_f.a(31973, 0);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if ((this.field_f.field_k ^ -1) > -1) {
                          break L4;
                        } else {
                          if (2 < this.field_f.field_k) {
                            break L4;
                          } else {
                            this.field_d.field_D = this.field_f.field_k;
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
                            if ((this.field_f.field_k ^ -1) > -1) {
                              break L8;
                            } else {
                              if (2 >= this.field_f.field_k) {
                                this.field_f.a(31973, 3);
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          this.field_f.a(31973, this.field_d.field_D);
                          break L7;
                        }
                        if (0 > this.field_f.field_k) {
                          break L6;
                        } else {
                          if ((this.field_f.field_k ^ -1) >= -3) {
                            this.field_d.field_D = this.field_f.field_k;
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
                          if ((this.field_f.field_k ^ -1) == -4) {
                            this.field_f.a(31973, this.field_d.field_D);
                            break L10;
                          } else {
                            this.field_f.a(31973, 3);
                            break L10;
                          }
                        }
                        if (this.field_f.field_k < 0) {
                          break L9;
                        } else {
                          if (this.field_f.field_k <= 2) {
                            this.field_d.field_D = this.field_f.field_k;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    this.field_f.g(107);
                    break L0;
                  } else {
                    this.field_f.g(107);
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            L11: {
              if (-6 == (this.field_i ^ -1)) {
                break L11;
              } else {
                if ((this.field_i ^ -1) != -11) {
                  this.field_f.b((byte) 76);
                  break L0;
                } else {
                  break L11;
                }
              }
            }
            this.field_f.c((byte) 111);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != -31102) {
            this.field_g = -20;
        }
        int var3 = 0;
        if (0 == this.field_i) {
            if (!(-1 == this.field_f.field_k)) {
                var3 = this.field_f.field_k;
            }
        }
        if ((this.field_i ^ -1) == -2 && -1 != this.field_f.field_k && dj.field_a != -1) {
            var3 = this.field_f.field_k;
        }
        this.field_f.a(param0 + 31007, this.a((byte) -22, ij.field_e, eg.field_b), var3, param1);
        this.field_b = 0;
        this.field_g = -1;
    }

    private final void a(boolean param0, byte param1, boolean param2, int param3) {
        Throwable decompiledCaughtException = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var8_ref_Object = null;
        int var9 = 0;
        int var12 = 0;
        L0: {
          var12 = Main.field_T;
          if (param1 >= 115) {
            break L0;
          } else {
            field_h = (String) null;
            break L0;
          }
        }
        L1: {
          var5 = fh.field_G[this.field_i][param3];
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
          if (-1 != (var8 ^ -1)) {
            if (7 != var8) {
              if (-11 != (var8 ^ -1)) {
                if ((var8 ^ -1) == -6) {
                  if (!param2) {
                    break L2;
                  } else {
                    this.field_d.a(11246, 3, 6, param0);
                    break L2;
                  }
                } else {
                  if ((var8 ^ -1) == -7) {
                    if (param2) {
                      this.field_d.a(11246, 5, 8, param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    if (21 == var8) {
                      if (!param2) {
                        break L2;
                      } else {
                        this.field_d.a(11246, 5, 7, param0);
                        break L2;
                      }
                    } else {
                      if ((var8 ^ -1) != -9) {
                        L3: {
                          if (-16 != (var8 ^ -1)) {
                            if (17 != var8) {
                              if (11 != var8) {
                                if (var8 != 12) {
                                  if (-10 == (var8 ^ -1)) {
                                    if (!param2) {
                                      break L2;
                                    } else {
                                      this.field_d.a(11246, 4, 6, param0);
                                      break L2;
                                    }
                                  } else {
                                    L4: {
                                      if (-14 == (var8 ^ -1)) {
                                        break L4;
                                      } else {
                                        if ((var8 ^ -1) == -17) {
                                          break L4;
                                        } else {
                                          if ((var8 ^ -1) == -2) {
                                            L5: {
                                              if (!this.field_f.e(14354)) {
                                                break L5;
                                              } else {
                                                this.field_d.field_cb = null;
                                                this.field_d.field_P = null;
                                                this.field_d.field_C = (1 + this.field_d.field_C) % 2;
                                                break L5;
                                              }
                                            }
                                            if (!this.field_f.b(2)) {
                                              break L2;
                                            } else {
                                              L6: {
                                                if (this.field_d.field_C == 0) {
                                                  this.field_d.field_C = 2;
                                                  break L6;
                                                } else {
                                                  break L6;
                                                }
                                              }
                                              this.field_d.field_cb = null;
                                              this.field_d.field_P = null;
                                              this.field_d.field_C = this.field_d.field_C - 1;
                                              break L2;
                                            }
                                          } else {
                                            if (3 == var8) {
                                              L7: {
                                                var6 = mf.field_i;
                                                if (!this.field_f.e(14354)) {
                                                  break L7;
                                                } else {
                                                  g.a(-114);
                                                  break L7;
                                                }
                                              }
                                              L8: {
                                                if (!this.field_f.b(2)) {
                                                  break L8;
                                                } else {
                                                  id.a((byte) 100);
                                                  break L8;
                                                }
                                              }
                                              L9: {
                                                if (!this.field_f.d((byte) 68)) {
                                                  break L9;
                                                } else {
                                                  wf.a(0, -124);
                                                  break L9;
                                                }
                                              }
                                              L10: {
                                                if (!this.field_f.d(-12819)) {
                                                  break L10;
                                                } else {
                                                  wf.a(80, -122);
                                                  break L10;
                                                }
                                              }
                                              L11: {
                                                if (this.field_f.a((byte) -127)) {
                                                  L12: {
                                                    var8 = eg.field_b + -this.a(param3, (byte) 97) - t.field_i;
                                                    if (var8 > 0) {
                                                      if (var8 >= 80) {
                                                        var9 = 80;
                                                        break L12;
                                                      } else {
                                                        var9 = var8;
                                                        break L12;
                                                      }
                                                    } else {
                                                      var9 = 0;
                                                      break L12;
                                                    }
                                                  }
                                                  wf.a(var9, -28);
                                                  break L11;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                              if (mf.field_i == var6) {
                                                var8_ref_Object = bg.field_tb;
                                                synchronized (var8_ref_Object) {
                                                  L13: {
                                                    lh.field_d.e(0);
                                                    break L13;
                                                  }
                                                }
                                                break L2;
                                              } else {
                                                var8_ref_Object = bg.field_tb;
                                                synchronized (var8_ref_Object) {
                                                  L14: {
                                                    L15: {
                                                      lh.field_d.e(-1);
                                                      if (!lh.field_d.b(66)) {
                                                        lh.field_d.h(0);
                                                        lh.field_d.g(96);
                                                        gh.a(lh.field_d, (byte) -67);
                                                        break L15;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                    break L14;
                                                  }
                                                }
                                                break L2;
                                              }
                                            } else {
                                              if ((var8 ^ -1) != -5) {
                                                if (-19 != (var8 ^ -1)) {
                                                  if (var8 == 19) {
                                                    if (!param2) {
                                                      break L2;
                                                    } else {
                                                      this.field_d.field_D = 1;
                                                      break L2;
                                                    }
                                                  } else {
                                                    if ((var8 ^ -1) != -21) {
                                                      if ((var8 ^ -1) == -15) {
                                                        if (!param2) {
                                                          break L2;
                                                        } else {
                                                          nb.field_e = 0;
                                                          db.field_m = 0;
                                                          ij.field_h.c(29026);
                                                          this.field_d.a(11246, 0, 5, param0);
                                                          break L2;
                                                        }
                                                      } else {
                                                        break L2;
                                                      }
                                                    } else {
                                                      if (param2) {
                                                        this.field_d.field_D = 2;
                                                        break L2;
                                                      } else {
                                                        break L2;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  if (!param2) {
                                                    break L2;
                                                  } else {
                                                    this.field_d.field_D = 0;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                L16: {
                                                  var7 = fe.field_a;
                                                  if (!this.field_f.e(14354)) {
                                                    break L16;
                                                  } else {
                                                    if (var7 >= 70) {
                                                      var7 = 80;
                                                      break L16;
                                                    } else {
                                                      var7 += 10;
                                                      break L16;
                                                    }
                                                  }
                                                }
                                                L17: {
                                                  if (!this.field_f.b(2)) {
                                                    break L17;
                                                  } else {
                                                    if (var7 > 10) {
                                                      var7 -= 10;
                                                      break L17;
                                                    } else {
                                                      var7 = 0;
                                                      break L17;
                                                    }
                                                  }
                                                }
                                                L18: {
                                                  if (this.field_f.d((byte) 68)) {
                                                    var7 = 0;
                                                    break L18;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                                L19: {
                                                  if (this.field_f.d(-12819)) {
                                                    var7 = 80;
                                                    break L19;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                                L20: {
                                                  if (!this.field_f.a((byte) -54)) {
                                                    break L20;
                                                  } else {
                                                    var8 = eg.field_b - (this.a(param3, (byte) 69) - -t.field_i);
                                                    if (var8 > 0) {
                                                      if (-81 < (var8 ^ -1)) {
                                                        var7 = var8;
                                                        break L20;
                                                      } else {
                                                        var7 = 80;
                                                        break L20;
                                                      }
                                                    } else {
                                                      var7 = 0;
                                                      break L20;
                                                    }
                                                  }
                                                }
                                                if (fe.field_a == var7) {
                                                  break L2;
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
                                        L21: {
                                          if (this.field_i == 4) {
                                            break L21;
                                          } else {
                                            if ((this.field_i ^ -1) != -6) {
                                              if ((this.field_i ^ -1) != -10) {
                                                break L2;
                                              } else {
                                                this.field_d.a(this.field_i, param0, 10, -112);
                                                break L2;
                                              }
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                        this.field_d.a(this.field_i, param0, this.field_i, -123);
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
                                    L22: {
                                      if (null != gj.field_a) {
                                        ga.a(true);
                                        break L22;
                                      } else {
                                        break L22;
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
                                  this.field_d.a(11246, 0, 6, param0);
                                  break L2;
                                } else {
                                  break L2;
                                }
                              }
                            } else {
                              break L3;
                            }
                          } else {
                            break L3;
                          }
                        }
                        if (!param2) {
                          break L2;
                        } else {
                          if (-7 == (this.field_i ^ -1)) {
                            if (dl.d(0)) {
                              L23: {
                                if (-1 > (nb.field_e ^ -1)) {
                                  break L23;
                                } else {
                                  if (ai.field_m <= 0) {
                                    this.field_d.a(11246, 0, 5, param0);
                                    break L2;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                              this.field_d.a(11246, 9, 7, param0);
                              break L2;
                            } else {
                              if ((nb.field_e ^ -1) >= -1) {
                                if (ai.field_m == 0) {
                                  this.field_d.a(11246, 0, 5, param0);
                                  break L2;
                                } else {
                                  this.field_d.a(11246, 5, 7, param0);
                                  break L2;
                                }
                              } else {
                                this.field_d.a(11246, 10, 7, param0);
                                break L2;
                              }
                            }
                          } else {
                            if (10 != this.field_i) {
                              if (-6 != (this.field_i ^ -1)) {
                                if (h.field_E[this.field_i]) {
                                  this.field_d.a(11246, this.field_i, 4, param0);
                                  break L2;
                                } else {
                                  this.field_d.a(11246, rk.field_X, 6, param0);
                                  break L2;
                                }
                              } else {
                                this.field_d.a(11246, 0, 5, param0);
                                break L2;
                              }
                            } else {
                              this.field_d.a(11246, 0, 5, param0);
                              break L2;
                            }
                          }
                        }
                      } else {
                        if (!param2) {
                          break L2;
                        } else {
                          if (gj.field_a == null) {
                            var8 = param0 ? 1 : 0;
                            mb.a(qa.field_b.field_s * 3 >> -460258303, 18, g.field_C, var8 != 0, 9414, 240, tc.field_a, 6, 320, 2, 18, qa.field_b);
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
              } else {
                if (param2) {
                  this.field_d.c(76, 0);
                  if (!dl.d(0)) {
                    if (0 >= nb.field_e) {
                      if (ai.field_m == 0) {
                        this.field_d.a(11246, 0, 6, param0);
                        break L2;
                      } else {
                        this.field_d.a(11246, 5, 8, param0);
                        break L2;
                      }
                    } else {
                      this.field_d.a(11246, 10, 8, param0);
                      break L2;
                    }
                  } else {
                    L24: {
                      if (-1 > (nb.field_e ^ -1)) {
                        break L24;
                      } else {
                        if (ai.field_m <= 0) {
                          this.field_d.a(11246, 0, 6, param0);
                          break L2;
                        } else {
                          break L24;
                        }
                      }
                    }
                    this.field_d.a(11246, 9, 8, param0);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            } else {
              if (param2) {
                this.field_d.c(126, 1);
                rk.a(false, lc.field_a[1], false);
                this.field_d.a(11246, 1, 1, param0);
                break L2;
              } else {
                break L2;
              }
            }
          } else {
            if (param2) {
              this.field_d.l(0);
              this.field_d.a(11246, 0, 1, param0);
              break L2;
            } else {
              break L2;
            }
          }
        }
    }

    private final void a(int param0, int param1, boolean param2, int param3, int param4) {
        int stackIn_3_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_1 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        kc var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        L0: {
          var19 = Main.field_T;
          var7 = 62 % ((param4 - -48) / 48);
          var6 = this.b(param1, 9996) + param3;
          var8 = this.a(param1, (byte) 125);
          param1 = fh.field_G[this.field_i][param1];
          if (param2) {
            stackIn_3_0 = 4086842;
            break L0;
          } else {
            stackIn_3_0 = 4405028;
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
                if (this.field_f.field_h) {
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
            if ((param1 ^ -1) < -21) {
              break L3;
            } else {
              if (this.field_d.field_D + 0 == -18 + param1) {
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
              if (-2 == (var10 ^ -1)) {
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
            if ((param1 ^ -1) == -5) {
              break L7;
            } else {
              if (-4 != (param1 ^ -1)) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (param1 == 4) {
              stackIn_27_0 = fe.field_a;
              break L8;
            } else {
              stackIn_27_0 = mf.field_i;
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
                if ((var14 ^ -1) < -4) {
                  var13++;
                  continue L9;
                } else {
                  L11: {
                    if (0 > var14) {
                      stackIn_34_0 = -var14;
                      break L11;
                    } else {
                      stackIn_34_0 = var14;
                      break L11;
                    }
                  }
                  L12: {


                    if (0 <= var13) {

                      stackIn_37_1 = var13;
                      break L12;
                    } else {

                      stackIn_37_1 = -var13;
                      break L12;
                    }
                  }
                  if (stackIn_34_0 + stackIn_37_1 <= 4) {
                    ae.a(var13 + var8 - -t.field_i, var14 + (16 + var6), 80, 16777215, 32, param0);
                    ae.a(t.field_i + var8 - -var13, 1 + var6 + (16 - -var14), 80, 16777215, 32, param0);
                    ae.a(-1 + var8 + t.field_i + (var12 - -var13), var14 + 16 + (var6 + -6), 3, 14, 16777215, 32, param0);
                    var14++;
                    continue L10;
                  } else {
                    var14++;
                    continue L10;
                  }
                }
              }
            }
          }
        }
        L13: {
          if (-1 != (this.field_i ^ -1)) {
            break L13;
          } else {
            ae.a(cg.field_i, 9 + var8, 11 + var6, 32, param0);
            ae.a(cg.field_i, var8 - -187, 10 + var6, 32, param0);
            break L13;
          }
        }
    }

    private final int a(byte param0, int param1) {
        int discarded$0 = 0;
        if (param0 > -119) {
            discarded$0 = this.a(-32, (byte) -114);
        }
        int var3 = param1;
        if (1 != var3) {
            return 0;
        }
        return this.field_d.field_C;
    }

    final void b(int param0) {
        int var3 = 0;
        int var2 = 0;
        if (!(9 != this.field_i)) {
            var2 = 200;
            var3 = qa.field_b.field_x + qa.field_b.field_q;
            var2 = var2 + (var3 * qa.field_b.b(d.field_e, 389) + 6);
            var2 = var2 + (qa.field_b.b(dh.a(0 != nb.field_e ? true : false, (byte) -94, false, -1 != (ai.field_m ^ -1) ? true : false), 389) * var3 + 6);
            cj.field_l[this.field_i] = var2 + -33;
            kb.field_b[this.field_i] = this.b(0, (byte) 17) + 12 + qa.field_b.b(mk.a(110, ai.field_m != 0 ? true : false, 0 != nb.field_e ? true : false, false), 389) * var3;
        }
        var2 = -26 / ((param0 - 2) / 51);
    }

    final void a(int param0, int param1, int param2) {
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_15_0;
        int stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        int stackIn_55_0 = 0;
        oh stackIn_60_0 = null;
        oh stackIn_61_0 = null;
        String stackIn_61_1 = null;
        int stackIn_70_0;
        int stackIn_70_1;
        int stackIn_70_2;
        oh stackIn_70_3;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        oh stackIn_71_3 = null;
        int stackIn_71_4 = 0;
        int stackIn_73_5;
        int stackIn_73_6;
        int stackIn_74_5 = 0;
        int stackIn_74_6 = 0;
        int stackIn_74_7 = 0;
        int stackIn_76_0;
        int stackIn_76_1;
        oh stackIn_76_2;
        int stackIn_76_3;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        oh stackIn_77_2 = null;
        int stackIn_77_3 = 0;
        int stackIn_77_4 = 0;
        int stackIn_80_5 = 0;
        oh stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        oh stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        int stackIn_83_3 = 0;
        int stackIn_86_4;
        int stackIn_90_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        int stackIn_164_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_167_1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var8_ref_int__;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int[] var19;
        int[] var22;
        int[][] var26;
        int[] var27;
        L0: {
          var17 = Main.field_T;
          if (h.field_E[this.field_i]) {
            L1: {
              L2: {
                if ((cd.field_h ^ -1) == 0) {
                  break L2;
                } else {
                  if (-2 == (cd.field_h ^ -1)) {
                    break L2;
                  } else {
                    f.field_a.b(0, 0);
                    break L1;
                  }
                }
              }
              this.field_d.b(this.field_b, 2);
              break L1;
            }
            td.field_c[-5 + this.field_i].b(198, 33);
            break L0;
          } else {
            ae.a(d.field_u[this.field_i], 0, param2, 32, param0);
            break L0;
          }
        }
        if (param1 == 0) {
          L3: {
            if (this.field_i == 2) {
              break L3;
            } else {
              var4 = 0;
              L4: while (true) {
                if (this.field_f.field_i <= var4) {
                  break L3;
                } else {
                  L5: {
                    stackIn_14_0 = this;

                    stackIn_14_1 = param0;

                    stackIn_14_2 = var4;

                    if (this.field_f.field_k != var4) {
                      stackIn_15_0 = this;
                      stackIn_15_1 = stackIn_14_1;
                      stackIn_15_2 = stackIn_14_2;
                      stackIn_15_3 = 0;
                      break L5;
                    } else {
                      stackIn_15_0 = this;
                      stackIn_15_1 = stackIn_14_1;
                      stackIn_15_2 = stackIn_14_2;
                      stackIn_15_3 = 1;
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
            if ((this.field_i ^ -1) != -6) {
              if (this.field_i != 3) {
                if (4 != this.field_i) {
                  L7: {
                    if (this.field_i == 8) {
                      break L7;
                    } else {
                      if (10 == this.field_i) {
                        break L7;
                      } else {
                        if (9 != this.field_i) {
                          break L6;
                        } else {
                          L8: {
                            var4 = 200;
                            var5 = qa.field_b.field_q + qa.field_b.field_x;
                            var4 = var4 + (6 + var5 * qa.field_b.a(d.field_e, 211, var4, 389, 1000, 0, -1, 1, 0, var5));
                            stackIn_70_0 = var4;

                            stackIn_70_1 = 6;

                            stackIn_70_2 = var5;

                            stackIn_70_3 = qa.field_b;

                            if (-1 == (nb.field_e ^ -1)) {
                              stackIn_71_0 = stackIn_70_0;
                              stackIn_71_1 = stackIn_70_1;
                              stackIn_71_2 = stackIn_70_2;
                              stackIn_71_3 = (oh) ((Object) stackIn_70_3);
                              stackIn_71_4 = 0;
                              break L8;
                            } else {
                              stackIn_71_0 = stackIn_70_0;
                              stackIn_71_1 = stackIn_70_1;
                              stackIn_71_2 = stackIn_70_2;
                              stackIn_71_3 = (oh) ((Object) stackIn_70_3);
                              stackIn_71_4 = 1;
                              break L8;
                            }
                          }
                          L9: {










                            stackIn_73_5 = -122;

                            stackIn_73_6 = 0;

                            if (ai.field_m == 0) {



                              stackIn_71_3 = (oh) ((Object) stackIn_71_3);

                              stackIn_74_5 = stackIn_73_5;
                              stackIn_74_6 = stackIn_73_6;
                              stackIn_74_7 = 0;
                              break L9;
                            } else {



                              stackIn_71_3 = (oh) ((Object) stackIn_71_3);

                              stackIn_74_5 = stackIn_73_5;
                              stackIn_74_6 = stackIn_73_6;
                              stackIn_74_7 = 1;
                              break L9;
                            }
                          }
                          L10: {
                            var4 = stackIn_71_0 + (stackIn_71_1 + stackIn_71_2 * ((oh) (Object) stackIn_71_3).a(dh.a(stackIn_71_4 != 0, (byte) stackIn_74_5, stackIn_74_6 != 0, stackIn_74_7 != 0), 211, var4, 389, 1000, 0, -1, 1, 0, var5));
                            var4 = var4 + (this.b(0, (byte) 17) + 6);
                            stackIn_76_0 = var4;

                            stackIn_76_1 = var5;

                            stackIn_76_2 = qa.field_b;

                            stackIn_76_3 = 116;

                            if (0 == ai.field_m) {
                              stackIn_77_0 = stackIn_76_0;
                              stackIn_77_1 = stackIn_76_1;
                              stackIn_77_2 = (oh) ((Object) stackIn_76_2);
                              stackIn_77_3 = stackIn_76_3;
                              stackIn_77_4 = 0;
                              break L10;
                            } else {
                              stackIn_77_0 = stackIn_76_0;
                              stackIn_77_1 = stackIn_76_1;
                              stackIn_77_2 = (oh) ((Object) stackIn_76_2);
                              stackIn_77_3 = stackIn_76_3;
                              stackIn_77_4 = 1;
                              break L10;
                            }
                          }
                          L11: {










                            if (0 == nb.field_e) {


                              stackIn_77_2 = (oh) ((Object) stackIn_77_2);


                              stackIn_80_5 = 0;
                              break L11;
                            } else {


                              stackIn_77_2 = (oh) ((Object) stackIn_77_2);


                              stackIn_80_5 = 1;
                              break L11;
                            }
                          }
                          L12: {
                            var4 = stackIn_77_0 + (stackIn_77_1 * ((oh) (Object) stackIn_77_2).a(mk.a(stackIn_77_3, stackIn_77_4 != 0, stackIn_80_5 != 0, false), 211, var4, 389, 1000, 0, -1, 1, 0, var5) + 6);
                            var4 = var4 + (6 + this.b(1, (byte) 17));
                            stackIn_82_0 = qa.field_b;

                            stackIn_82_1 = 43;

                            stackIn_82_2 = 0;

                            if (nb.field_e == 0) {
                              stackIn_83_0 = (oh) ((Object) stackIn_82_0);
                              stackIn_83_1 = stackIn_82_1;
                              stackIn_83_2 = stackIn_82_2;
                              stackIn_83_3 = 0;
                              break L12;
                            } else {
                              stackIn_83_0 = (oh) ((Object) stackIn_82_0);
                              stackIn_83_1 = stackIn_82_1;
                              stackIn_83_2 = stackIn_82_2;
                              stackIn_83_3 = 1;
                              break L12;
                            }
                          }
                          L13: {








                            if (-1 == (ai.field_m ^ -1)) {
                              stackIn_83_0 = (oh) ((Object) stackIn_83_0);



                              stackIn_86_4 = 0;
                              break L13;
                            } else {
                              stackIn_83_0 = (oh) ((Object) stackIn_83_0);



                              stackIn_86_4 = 1;
                              break L13;
                            }
                          }
                          ((oh) (Object) stackIn_83_0).a(af.a(stackIn_83_1, stackIn_83_2 != 0, stackIn_83_3 != 0, stackIn_86_4 != 0), 211, var4, 389, 1000, 0, -1, 1, 0, var5);
                          break L6;
                        }
                      }
                    }
                  }
                  L14: {
                    if ((this.field_i ^ -1) == -9) {
                      stackIn_90_0 = ue.field_d;
                      break L14;
                    } else {
                      stackIn_90_0 = nb.field_e;
                      break L14;
                    }
                  }
                  L15: {
                    var4 = stackIn_90_0;
                    if (-12 <= (rd.a(var4, 1266438832) ^ -1)) {
                      stackIn_93_0 = 0;
                      break L15;
                    } else {
                      stackIn_93_0 = 1;
                      break L15;
                    }
                  }
                  L16: {
                    var5 = stackIn_93_0;
                    var6 = 40;
                    var7 = rd.a(var4, param1 + 1266438832);
                    if (1 >= var7) {
                      break L16;
                    } else {
                      var8 = -1;
                      var9 = 0;
                      var10 = 0;
                      L17: while (true) {
                        if (var10 >= qk.field_a.length) {
                          if (var7 <= var9) {
                            break L16;
                          } else {
                            var10 = (40 - (var9 * 40 - 368)) / (var7 - var9);
                            if (var6 <= var10) {
                              break L16;
                            } else {
                              var6 = var10;
                              break L16;
                            }
                          }
                        } else {
                          if ((var4 & 1 << var10) != 0) {
                            if (var5 != 0) {
                              L18: {
                                if (-6 >= (var10 ^ -1)) {
                                  if ((var10 ^ -1) > -9) {
                                    stackIn_107_0 = 1;
                                    break L18;
                                  } else {
                                    if ((var10 ^ -1) > -13) {
                                      stackIn_107_0 = 2;
                                      break L18;
                                    } else {
                                      stackIn_107_0 = 3;
                                      break L18;
                                    }
                                  }
                                } else {
                                  stackIn_107_0 = 0;
                                  break L18;
                                }
                              }
                              L19: {
                                var11 = stackIn_107_0;
                                if (var8 != var11) {
                                  var9++;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              var8 = var11;
                              var10++;
                              continue L17;
                            } else {
                              var10++;
                              continue L17;
                            }
                          } else {
                            var10++;
                            continue L17;
                          }
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
                  L20: while (true) {
                    if (var13 >= qk.field_a.length) {
                      L21: {
                        if (var12 == -1) {
                          break L21;
                        } else {
                          if (var12 == this.field_g) {
                            this.field_g = -1;
                            break L21;
                          } else {
                            this.field_g = var12;
                            break L21;
                          }
                        }
                      }
                      this.field_a = -1;
                      var8 = 170;
                      var13 = 0;
                      L22: while (true) {
                        if (qk.field_a.length <= var13) {
                          L23: {
                            if (0 == (this.field_g ^ -1)) {
                              break L23;
                            } else {
                              var10 = this.field_g;
                              break L23;
                            }
                          }
                          if (var10 < 0) {
                            qa.field_b.a(id.field_d, 208, 237, td.field_c[this.field_i - 5].field_p - 20, 1024, 0, -1, 1, 0, qa.field_b.field_x + qa.field_b.field_s);
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
                            L24: while (true) {
                              if (var16 >= eb.field_i[var10]) {
                                break L6;
                              } else {
                                sk.field_c.d(var8, -qa.field_b.field_s + var14);
                                var8 = var8 + sk.field_c.field_l / 3;
                                var16++;
                                continue L24;
                              }
                            }
                          }
                        } else {
                          if ((1 << var13 & var4) != 0) {
                            L25: {
                              if (var5 != 0) {
                                L26: {
                                  if ((var13 ^ -1) <= -6) {
                                    if (-9 >= (var13 ^ -1)) {
                                      if ((var13 ^ -1) <= -13) {
                                        stackIn_164_0 = 3;
                                        break L26;
                                      } else {
                                        stackIn_164_0 = 2;
                                        break L26;
                                      }
                                    } else {
                                      stackIn_164_0 = 1;
                                      break L26;
                                    }
                                  } else {
                                    stackIn_164_0 = 0;
                                    break L26;
                                  }
                                }
                                L27: {
                                  var14 = stackIn_164_0;
                                  stackIn_166_0 = var8;

                                  if (var14 == var11) {
                                    stackIn_167_0 = stackIn_166_0;
                                    stackIn_167_1 = var6;
                                    break L27;
                                  } else {
                                    stackIn_167_0 = stackIn_166_0;
                                    stackIn_167_1 = 40;
                                    break L27;
                                  }
                                }
                                var8 = stackIn_167_0 + stackIn_167_1;
                                var11 = var14;
                                break L25;
                              } else {
                                var8 = var8 + var6;
                                break L25;
                              }
                            }
                            qk.field_a[var13].a(var8, var9);
                            if (this.field_g == var13) {
                              db.field_o.c(-5 + var8, -5 + var9, 16711680);
                              var13++;
                              continue L22;
                            } else {
                              if (var13 == var10) {
                                db.field_o.c(-5 + var8, -5 + var9, 0);
                                var13++;
                                continue L22;
                              } else {
                                var13++;
                                continue L22;
                              }
                            }
                          } else {
                            var13++;
                            continue L22;
                          }
                        }
                      }
                    } else {
                      if (0 != (var4 & 1 << var13)) {
                        L28: {
                          if (var5 != 0) {
                            L29: {
                              if (-6 >= (var13 ^ -1)) {
                                if (-9 < (var13 ^ -1)) {
                                  stackIn_127_0 = 1;
                                  break L29;
                                } else {
                                  if (-13 >= (var13 ^ -1)) {
                                    stackIn_127_0 = 3;
                                    break L29;
                                  } else {
                                    stackIn_127_0 = 2;
                                    break L29;
                                  }
                                }
                              } else {
                                stackIn_127_0 = 0;
                                break L29;
                              }
                            }
                            L30: {
                              var14 = stackIn_127_0;
                              stackIn_129_0 = var8;

                              if (var11 != var14) {
                                stackIn_130_0 = stackIn_129_0;
                                stackIn_130_1 = 40;
                                break L30;
                              } else {
                                stackIn_130_0 = stackIn_129_0;
                                stackIn_130_1 = 20;
                                break L30;
                              }
                            }
                            var8 = stackIn_130_0 + stackIn_130_1;
                            var11 = var14;
                            break L28;
                          } else {
                            var8 = var8 + var6;
                            break L28;
                          }
                        }
                        L31: {
                          if (this.field_a < var8) {
                            break L31;
                          } else {
                            if (this.field_a > var8 - -32) {
                              break L31;
                            } else {
                              if (var9 > this.field_e) {
                                break L31;
                              } else {
                                if (var9 - -32 >= this.field_e) {
                                  var12 = var13;
                                  break L31;
                                } else {
                                  break L31;
                                }
                              }
                            }
                          }
                        }
                        if (eg.field_b >= var8) {
                          if (eg.field_b <= 32 + var8) {
                            if (var9 <= ij.field_e) {
                              if (ij.field_e <= var9 + 32) {
                                var10 = var13;
                                var13++;
                                continue L20;
                              } else {
                                var13++;
                                continue L20;
                              }
                            } else {
                              var13++;
                              continue L20;
                            }
                          } else {
                            var13++;
                            continue L20;
                          }
                        } else {
                          var13++;
                          continue L20;
                        }
                      } else {
                        var13++;
                        continue L20;
                      }
                    }
                  }
                } else {
                  var4 = -1;
                  var5 = param2 + 121;
                  var26 = g.field_y;
                  var7 = 0;
                  L32: while (true) {
                    if (var7 >= var26.length) {
                      L33: {
                        if (this.field_g != -1) {
                          var4 = this.field_g;
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                      if (0 != (var4 ^ -1)) {
                        L34: {
                          var6 = qa.field_b.field_s - -qa.field_b.field_x;
                          var7 = 226 - -param2;
                          qa.field_b.b(ge.field_b[var4], 388, var7, 0, -1);
                          if ((1 << var4 & db.field_m) == 0) {
                            stackIn_55_0 = 0;
                            break L34;
                          } else {
                            stackIn_55_0 = 1;
                            break L34;
                          }
                        }
                        L35: {
                          var8 = stackIn_55_0;
                          if (var8 == 0) {
                            vb.field_k.d(248, var7 - qa.field_b.field_s);
                            break L35;
                          } else {
                            qk.field_a[var4].d(248, var7 + -qa.field_b.field_s);
                            break L35;
                          }
                        }
                        L36: {
                          var7 = var7 + var6;
                          stackIn_60_0 = qa.field_b;

                          if (var8 == 0) {
                            stackIn_61_0 = (oh) ((Object) stackIn_60_0);
                            stackIn_61_1 = vd.field_n;
                            break L36;
                          } else {
                            stackIn_61_0 = (oh) ((Object) stackIn_60_0);
                            stackIn_61_1 = pk.field_b;
                            break L36;
                          }
                        }
                        ((oh) (Object) stackIn_61_0).b(stackIn_61_1, 388, var7, 16711680, -1);
                        var7 = var7 + (5 + var6);
                        var7 = var7 + var6 * qa.field_b.a(lk.field_u[var4], 388, var7 - qa.field_b.field_s, 179, 480, 0, -1, 0, 0, var6);
                        qa.field_b.b(eg.field_a + 100 * eb.field_i[var4], 388, var7, 0, -1);
                        var7 = var7 + var6;
                        var9 = 388;
                        qa.field_b.b(nl.field_a, var9, var7, 0, -1);
                        var9 = var9 + qa.field_b.a(nl.field_a);
                        var10 = 0;
                        L37: while (true) {
                          if (eb.field_i[var4] <= var10) {
                            break L6;
                          } else {
                            sk.field_c.d(var9, -qa.field_b.field_s + var7);
                            var9 = var9 + sk.field_c.field_l / 3;
                            var10++;
                            continue L37;
                          }
                        }
                      } else {
                        qa.field_b.a(id.field_d, 407, param2 + 226, 0, -1);
                        if (!dl.d(0)) {
                          break L6;
                        } else {
                          qa.field_b.a(ag.field_g, 248, param2 + (2 * (qa.field_b.field_x + qa.field_b.field_s) + 226), 319, 1024, 0, -1, 1, 0, qa.field_b.field_x + qa.field_b.field_s);
                          break L6;
                        }
                      }
                    } else {
                      var22 = var26[var7];
                      var19 = var22;
                      var8_ref_int__ = var19;
                      var9 = 251 + (320 + -(40 * var22.length)) / 2;
                      var27 = var8_ref_int__;
                      var11 = 0;
                      L38: while (true) {
                        if (var27.length <= var11) {
                          var5 += 40;
                          var7++;
                          continue L32;
                        } else {
                          L39: {
                            var12 = var27[var11];
                            if (-1 == (db.field_m & 1 << var12 ^ -1)) {
                              vb.field_k.a(var9, var5);
                              break L39;
                            } else {
                              qk.field_a[var12].a(var9, var5);
                              break L39;
                            }
                          }
                          L40: {
                            if (eg.field_b < var9) {
                              break L40;
                            } else {
                              if (eg.field_b > 32 + var9) {
                                break L40;
                              } else {
                                if (var5 > ij.field_e) {
                                  break L40;
                                } else {
                                  if (var5 + 32 < ij.field_e) {
                                    break L40;
                                  } else {
                                    db.field_o.c(-5 + var9, var5 - 5, 0);
                                    var4 = var12;
                                    break L40;
                                  }
                                }
                              }
                            }
                          }
                          L41: {
                            if (this.field_a < var9) {
                              break L41;
                            } else {
                              if (var9 - -32 < this.field_a) {
                                break L41;
                              } else {
                                if (var5 > this.field_e) {
                                  break L41;
                                } else {
                                  if (32 + var5 < this.field_e) {
                                    break L41;
                                  } else {
                                    L42: {
                                      if (this.field_g != var12) {
                                        this.field_g = var12;
                                        break L42;
                                      } else {
                                        this.field_g = -1;
                                        break L42;
                                      }
                                    }
                                    this.field_a = -1;
                                    break L41;
                                  }
                                }
                              }
                            }
                          }
                          if (var12 == this.field_g) {
                            db.field_o.c(var9 - 5, var5 - 5, 16711680);
                            var9 += 40;
                            var11++;
                            continue L38;
                          } else {
                            var9 += 40;
                            var11++;
                            continue L38;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                qa.field_b.a(rc.field_n, 176, param2 + 140, 292, 222, 2753797, -1, 1, 3, 20);
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
        int var3;
        int var4;
        int var5;
        var5 = Main.field_T;
        if (-3 != (this.field_i ^ -1)) {
          L0: {
            var4 = -7 % ((param1 - 31) / 37);
            if (this.field_i != 5) {
              if (-11 == (this.field_i ^ -1)) {
                var3 = param0 * 172 + nk.field_a[this.field_i];
                break L0;
              } else {
                var3 = nk.field_a[this.field_i];
                break L0;
              }
            } else {
              if (!dl.d(0)) {
                if (3 > param0) {
                  var3 = nk.field_a[this.field_i] + (-1 + param0) * 136;
                  break L0;
                } else {
                  var3 = nk.field_a[this.field_i];
                  break L0;
                }
              } else {
                var3 = 136 * param0 + (-136 + (68 + nk.field_a[this.field_i]));
                break L0;
              }
            }
          }
          L1: {
            if (!h.field_E[this.field_i]) {
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
        this.field_g = -1;
        this.field_a = -1;
        try {
            this.field_d = param0;
            this.field_i = param1;
            this.field_f = new lh(fh.field_G[param1].length);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kc var9 = null;
        var8 = Main.field_T;
        try {
          L0: {
            if (param2 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param2.length();
                if ((var3_int ^ -1) > -2) {
                  break L1;
                } else {
                  if ((var3_int ^ -1) < -13) {
                    break L1;
                  } else {
                    var4 = ff.a((byte) 116, param2);
                    if (var4 == null) {
                      stackIn_14_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (-2 >= (var4.length() ^ -1)) {
                        L2: {
                          if (tg.a((byte) -63, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (!tg.a((byte) -63, var4.charAt(var4.length() - 1))) {
                              L3: {
                                var5 = 0;
                                var6 = 0;
                                if (param1 <= -91) {
                                  break L3;
                                } else {
                                  var9 = (kc) null;
                                  re.a(-38, -4, -9, (byte) -72, (kc) null);
                                  break L3;
                                }
                              }
                              L4: while (true) {
                                if (var6 >= param2.length()) {
                                  if (var5 <= 0) {
                                    stackIn_35_0 = 1;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    stackIn_33_0 = 0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  }
                                } else {
                                  L5: {
                                    var7 = param2.charAt(var6);
                                    if (tg.a((byte) -63, (char) var7)) {
                                      var5++;
                                      break L5;
                                    } else {
                                      var5 = 0;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (var5 < 2) {
                                      break L6;
                                    } else {
                                      if (param0) {
                                        break L6;
                                      } else {
                                        stackIn_29_0 = 0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L4;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_19_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackIn_9_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("re.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L7;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_29_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_33_0 != 0;
                  } else {
                    return stackIn_35_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_h = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
