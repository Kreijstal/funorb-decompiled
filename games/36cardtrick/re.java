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
          if (((re) this).field_i != 2) {
            break L1;
          } else {
            if (-151 < ((re) this).field_b) {
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
              ((re) this).field_f.a(this.a((byte) -22, ij.field_e, eg.field_b), (byte) 115, this.a((byte) -22, jc.field_N, ag.field_a));
              if (((re) this).field_f.field_k == 0) {
                break L3;
              } else {
                this.a(true, (byte) 122, ((re) this).field_f.c(-1), ((re) this).field_f.field_k);
                break L3;
              }
            }
            L4: {
              if (-1 != dl.field_h) {
                ((re) this).field_a = ag.field_a;
                ((re) this).field_e = jc.field_N;
                break L4;
              } else {
                break L4;
              }
            }
            return;
          } else {
            if (-14 == tb.field_d) {
              if ((((re) this).field_i ^ -1) != -2) {
                var2 = 0;
                L5: while (true) {
                  if (var2 >= fh.field_G[((re) this).field_i].length) {
                    continue L2;
                  } else {
                    if ((fh.field_G[((re) this).field_i][var2] ^ -1) == -18) {
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
                if (fh.field_G[((re) this).field_i].length != 1) {
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
              if (0 == (((re) this).field_f.field_k ^ -1)) {
                continue L2;
              } else {
                this.a(false, (byte) 121, ((re) this).field_f.c(-1), ((re) this).field_f.field_k);
                continue L2;
              }
            }
          }
        }
    }

    private final int b(int param0, byte param1) {
        if (!((((re) this).field_i ^ -1) != -3)) {
            return 480;
        }
        if (param1 != 17) {
            re.a(3);
        }
        return ia.field_c[fh.field_G[((re) this).field_i][param0]].field_o;
    }

    final static void a(int param0, int param1, int param2, byte param3, kc param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        kc var11 = null;
        L0: {
          param1 = param1 + ((kc) param4).field_q;
          param2 = param2 + ((kc) param4).field_n;
          var5 = 0;
          var6 = ((kc) param4).field_o;
          var7 = ((kc) param4).field_p;
          if (vj.field_h > param2) {
            var8 = -param2 + vj.field_h;
            param2 = vj.field_h;
            var6 = var6 - var8;
            var5 = var5 + var7 * var8;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param1 < vj.field_f) {
            var8 = vj.field_f - param1;
            param1 = vj.field_f;
            var5 = var5 + var8;
            var7 = var7 - var8;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (vj.field_b >= var6 + param2) {
            break L2;
          } else {
            var6 = vj.field_b + -param2;
            break L2;
          }
        }
        L3: {
          if (param1 - -var7 <= vj.field_a) {
            break L3;
          } else {
            var7 = vj.field_a - param1;
            break L3;
          }
        }
        L4: {
          var8 = param2 * vj.field_l + param1;
          var9 = ((kc) param4).field_p - var7;
          if (param3 >= 46) {
            break L4;
          } else {
            var11 = (kc) null;
            re.a(-101, 85, 79, (byte) -16, (kc) null);
            break L4;
          }
        }
        var10 = vj.field_l + -var7;
        if (var7 >= -1) {
          return;
        } else {
          if (-1 < var6) {
            hf.a(var9, var6, param0, 0, ((kc) param4).field_r, var5, var8, var10, var7, vj.field_j, 125);
            return;
          } else {
            return;
          }
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
        String var11 = null;
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
            if (!((uh) var3).field_o) {
              var2 = tj.field_H;
              break L0;
            } else {
              L2: {
                var4 = ((re) this).field_d.field_D;
                var5 = ((uh) var3).field_m;
                var21 = ((uh) var3).field_q;
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
                    if (-1 < (var4 ^ -1)) {
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
                                    if (0 == (var7 ^ -1)) {
                                      var11 = ri.field_c;
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
                                        var11 = var5[var4][var10];
                                        if (var11 != null) {
                                          var14 = 255 & var21[var4][var10];
                                          var13 = var21[var4][var10] >> 2097973448;
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
                                  if (var11 != null) {
                                    var15 = qa.field_b.a('W') * 12;
                                    var18 = ee.a((ee) (Object) qa.field_b, var11, var15);
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
        L12: {
          eb.field_c.field_J[0][2] = 16777215;
          eb.field_c.field_J[0][1] = 6697779;
          if (param0 >= 82) {
            break L12;
          } else {
            ((re) this).a(-8, -35, -46);
            break L12;
          }
        }
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
            if (this.a(var4, (byte) -33) - -((kc) var6).field_q <= param2) {
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
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Main.field_T;
          var3 = param0.length();
          if (param2 == -50) {
            break L0;
          } else {
            field_h = (String) null;
            break L0;
          }
        }
        var4 = var3;
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
                    if (var3 <= var5) {
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
                    if (var3 <= var5) {
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
                return var6.toString();
              }
            }
          } else {
            var5 = 2 + var6_int;
            L5: while (true) {
              L6: {
                if (var3 <= var5) {
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
              var7_ref = param0.substring(var6_int + 2, var5);
              if (!pg.a(false, (CharSequence) (Object) var7_ref)) {
                continue L1;
              } else {
                if (var3 <= var5) {
                  continue L1;
                } else {
                  if (param0.charAt(var5) == 62) {
                    var5++;
                    var8 = ie.a(false, (CharSequence) (Object) var7_ref);
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

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Main.field_T;
        if (((re) this).field_i != -3) {
          L0: {
            if (param1 == 9996) {
              break L0;
            } else {
              ((re) this).field_e = 42;
              break L0;
            }
          }
          L1: {
            if (-6 != ((re) this).field_i) {
              if (((re) this).field_i != 10) {
                var3 = kb.field_b[((re) this).field_i] * param0 + cj.field_l[((re) this).field_i];
                break L1;
              } else {
                var3 = cj.field_l[((re) this).field_i];
                break L1;
              }
            } else {
              if (dl.d(0)) {
                var3 = cj.field_l[((re) this).field_i];
                break L1;
              } else {
                if (param0 >= 3) {
                  var3 = cj.field_l[((re) this).field_i] + kb.field_b[((re) this).field_i];
                  break L1;
                } else {
                  var3 = cj.field_l[((re) this).field_i];
                  break L1;
                }
              }
            }
          }
          L2: {
            if (h.field_E[((re) this).field_i]) {
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
        if (2 == ((re) this).field_i) {
            return 640;
        }
        if (param0 != -24133) {
            field_c = (int[]) null;
        }
        kc var3 = ia.field_c[fh.field_G[((re) this).field_i][param1]];
        return this.a(param1, (byte) 119) + ((kc) var3).field_q - -((kc) var3).field_p;
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
        int var3 = 0;
        var3 = Main.field_T;
        if (param0) {
          L0: {
            L1: {
              if (((re) this).field_i != -6) {
                break L1;
              } else {
                if (!dl.d(0)) {
                  if (!((re) this).field_f.a((byte) -63)) {
                    L2: {
                      if (tb.field_d == -97) {
                        L3: {
                          if (((re) this).field_f.field_k > 0) {
                            if (-4 != ((re) this).field_f.field_k) {
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
                        if (((re) this).field_f.field_k > -1) {
                          break L2;
                        } else {
                          if (-3 >= ((re) this).field_f.field_k) {
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
                          if (-3 < (((re) this).field_f.field_k ^ -1)) {
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
                        if ((((re) this).field_f.field_k ^ -1) > -1) {
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
                            if ((((re) this).field_f.field_k ^ -1) > -1) {
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
                          if ((((re) this).field_f.field_k ^ -1) >= -3) {
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
                          if ((((re) this).field_f.field_k ^ -1) == -4) {
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
              if (-6 == ((re) this).field_i) {
                break L11;
              } else {
                if ((((re) this).field_i ^ -1) != -11) {
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
          return;
        } else {
          return;
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
        if ((((re) this).field_i ^ -1) == -2) {
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
        Object var8_ref = null;
        int var8 = 0;
        Object var8_ref_Object = null;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        int var12 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = Main.field_T;
                    if (param1 >= 115) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_h = (String) null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = fh.field_G[((re) this).field_i][param3];
                    if (!param2) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (var5 == 3) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (4 == var5) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    rc.a((byte) 111, 15);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var8 = var5;
                    if (-1 != var8) {
                        statePc = 8;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 8: {
                    if (7 != var8) {
                        statePc = 10;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (-11 != var8) {
                        statePc = 12;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 12: {
                    if ((var8 ^ -1) == -6) {
                        statePc = 58;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if ((var8 ^ -1) == -7) {
                        statePc = 60;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (21 == var8) {
                        statePc = 63;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (var8 != -9) {
                        statePc = 17;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (-16 != var8) {
                        statePc = 19;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (17 != var8) {
                        statePc = 21;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (11 != var8) {
                        statePc = 23;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (var8 != 12) {
                        statePc = 25;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 25: {
                    if (-10 == var8) {
                        statePc = 98;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (-14 == var8) {
                        statePc = 100;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if ((var8 ^ -1) == -17) {
                        statePc = 100;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if ((var8 ^ -1) == -2) {
                        statePc = 110;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    if (3 == var8) {
                        statePc = 117;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (var8 != -5) {
                        statePc = 32;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 32: {
                    if (-19 != var8) {
                        statePc = 34;
                    } else {
                        statePc = 169;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (var8 == 19) {
                        statePc = 171;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    if ((var8 ^ -1) != -21) {
                        statePc = 37;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 37: {
                    if ((var8 ^ -1) == -15) {
                        statePc = 176;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (param2) {
                        statePc = 41;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 41: {
                    ((re) this).field_d.l(0);
                    ((re) this).field_d.a(11246, 0, 1, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 42: {
                    if (param2) {
                        statePc = 44;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 44: {
                    ((re) this).field_d.c(126, 1);
                    rk.a(false, lc.field_a[1], false);
                    ((re) this).field_d.a(11246, 1, 1, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 45: {
                    if (param2) {
                        statePc = 47;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 47: {
                    ((re) this).field_d.c(76, 0);
                    if (!dl.d(0)) {
                        statePc = 53;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (-1 > (nb.field_e ^ -1)) {
                        statePc = 51;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (ai.field_m <= 0) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    ((re) this).field_d.a(11246, 9, 8, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 52: {
                    ((re) this).field_d.a(11246, 0, 6, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 53: {
                    if (0 >= nb.field_e) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    ((re) this).field_d.a(11246, 10, 8, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 55: {
                    if (ai.field_m == 0) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    ((re) this).field_d.a(11246, 5, 8, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 57: {
                    ((re) this).field_d.a(11246, 0, 6, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 58: {
                    if (!param2) {
                        statePc = 179;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    ((re) this).field_d.a(11246, 3, 6, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 60: {
                    if (param2) {
                        statePc = 62;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 62: {
                    ((re) this).field_d.a(11246, 5, 8, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 63: {
                    if (!param2) {
                        statePc = 179;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    ((re) this).field_d.a(11246, 5, 7, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 65: {
                    if (!param2) {
                        statePc = 179;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (gj.field_a == null) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    ga.a(true);
                    statePc = 179;
                    continue stateLoop;
                }
                case 68: {
                    var8 = param0 ? 1 : 0;
                    mb.a(qa.field_b.field_s * 3 >> -460258303, 18, g.field_C, var8 != 0, 9414, 240, tc.field_a, 6, 320, 2, 18, (ee) (Object) qa.field_b);
                    statePc = 179;
                    continue stateLoop;
                }
                case 69: {
                    if (!param2) {
                        statePc = 179;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (-7 == ((re) this).field_i) {
                        statePc = 78;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    if (10 != ((re) this).field_i) {
                        statePc = 73;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    ((re) this).field_d.a(11246, 0, 5, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 73: {
                    if (-6 != ((re) this).field_i) {
                        statePc = 75;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    ((re) this).field_d.a(11246, 0, 5, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 75: {
                    if (h.field_E[((re) this).field_i]) {
                        statePc = 77;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    ((re) this).field_d.a(11246, rk.field_X, 6, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 77: {
                    ((re) this).field_d.a(11246, ((re) this).field_i, 4, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 78: {
                    if (dl.d(0)) {
                        statePc = 84;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    if ((nb.field_e ^ -1) >= -1) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    ((re) this).field_d.a(11246, 10, 7, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 81: {
                    if (ai.field_m == 0) {
                        statePc = 83;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    ((re) this).field_d.a(11246, 5, 7, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 83: {
                    ((re) this).field_d.a(11246, 0, 5, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 84: {
                    if (-1 > (nb.field_e ^ -1)) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (ai.field_m <= 0) {
                        statePc = 88;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    ((re) this).field_d.a(11246, 9, 7, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 88: {
                    ((re) this).field_d.a(11246, 0, 5, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 89: {
                    if (param2) {
                        statePc = 91;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 91: {
                    ((re) this).field_d.a(11246, 0, 6, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 92: {
                    if (param2) {
                        statePc = 94;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (null != gj.field_a) {
                        statePc = 96;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 96: {
                    ga.a(true);
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    pb.a((byte) -124, mk.g(-119));
                    statePc = 179;
                    continue stateLoop;
                }
                case 98: {
                    if (!param2) {
                        statePc = 179;
                    } else {
                        statePc = 99;
                    }
                    continue stateLoop;
                }
                case 99: {
                    ((re) this).field_d.a(11246, 4, 6, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 100: {
                    if (param2) {
                        statePc = 102;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 102: {
                    if (dl.d(0)) {
                        statePc = 104;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    return;
                }
                case 104: {
                    if (((re) this).field_i == 4) {
                        statePc = 107;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    if ((((re) this).field_i ^ -1) != -6) {
                        statePc = 108;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    ((re) this).field_d.a(((re) this).field_i, param0, ((re) this).field_i, -123);
                    statePc = 179;
                    continue stateLoop;
                }
                case 108: {
                    if ((((re) this).field_i ^ -1) != -10) {
                        statePc = 179;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    ((re) this).field_d.a(((re) this).field_i, param0, 10, -112);
                    statePc = 179;
                    continue stateLoop;
                }
                case 110: {
                    if (!((re) this).field_f.e(14354)) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    ((re) this).field_d.field_cb = null;
                    ((re) this).field_d.field_P = null;
                    ((re) this).field_d.field_C = (1 + ((re) this).field_d.field_C) % 2;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (!((re) this).field_f.b(2)) {
                        statePc = 179;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (((re) this).field_d.field_C == 0) {
                        statePc = 115;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 115: {
                    ((re) this).field_d.field_C = 2;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    ((re) this).field_d.field_cb = null;
                    ((re) this).field_d.field_P = null;
                    ((re) this).field_d.field_C = ((re) this).field_d.field_C - 1;
                    statePc = 179;
                    continue stateLoop;
                }
                case 117: {
                    var6 = mf.field_i;
                    if (!((re) this).field_f.e(14354)) {
                        statePc = 119;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    g.a(-114);
                    statePc = 119;
                    continue stateLoop;
                }
                case 119: {
                    if (!((re) this).field_f.b(2)) {
                        statePc = 121;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    id.a((byte) 100);
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    if (!((re) this).field_f.d((byte) 68)) {
                        statePc = 123;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    wf.a(0, -124);
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    if (!((re) this).field_f.d(-12819)) {
                        statePc = 125;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    wf.a(80, -122);
                    statePc = 125;
                    continue stateLoop;
                }
                case 125: {
                    if (((re) this).field_f.a((byte) -127)) {
                        statePc = 127;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 127: {
                    var8 = eg.field_b + -this.a(param3, (byte) 97) - t.field_i;
                    if (var8 > 0) {
                        statePc = 129;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var9 = 0;
                    statePc = 132;
                    continue stateLoop;
                }
                case 129: {
                    if (var8 >= 80) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var9 = var8;
                    statePc = 132;
                    continue stateLoop;
                }
                case 131: {
                    var9 = 80;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    wf.a(var9, -28);
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (mf.field_i == var6) {
                        statePc = 142;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var8_ref_Object = (Object) (Object) bg.field_tb;
                    // monitorenter bg.field_tb
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    try {
                        lh.field_d.e(-1);
                        if (!lh.field_d.b(66)) {
                            statePc = 137;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        lh.field_d.h(0);
                        lh.field_d.g(96);
                        gh.a(lh.field_d, (byte) -67);
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        // monitorexit var8_ref_Object
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var10 = caughtException;
                        // monitorexit var8_ref_Object
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 141: {
                    throw (RuntimeException) (Object) var10;
                }
                case 142: {
                    var8_ref_Object = (Object) (Object) bg.field_tb;
                    // monitorenter bg.field_tb
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    try {
                        lh.field_d.e(0);
                        // monitorexit var8_ref_Object
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        var11 = caughtException;
                        // monitorexit var8_ref_Object
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 146: {
                    throw (RuntimeException) (Object) var11;
                }
                case 147: {
                    var7 = fe.field_a;
                    if (!((re) this).field_f.e(14354)) {
                        statePc = 151;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    if (var7 >= 70) {
                        statePc = 150;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    var7 += 10;
                    statePc = 151;
                    continue stateLoop;
                }
                case 150: {
                    var7 = 80;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if (!((re) this).field_f.b(2)) {
                        statePc = 155;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    if (var7 > 10) {
                        statePc = 154;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    var7 = 0;
                    statePc = 155;
                    continue stateLoop;
                }
                case 154: {
                    var7 -= 10;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    if (((re) this).field_f.d((byte) 68)) {
                        statePc = 157;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var7 = 0;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    if (((re) this).field_f.d(-12819)) {
                        statePc = 160;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var7 = 80;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if (!((re) this).field_f.a((byte) -54)) {
                        statePc = 167;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var8 = eg.field_b - (this.a(param3, (byte) 69) - -t.field_i);
                    if (var8 > 0) {
                        statePc = 164;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    var7 = 0;
                    statePc = 167;
                    continue stateLoop;
                }
                case 164: {
                    if (-81 < (var8 ^ -1)) {
                        statePc = 166;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    var7 = 80;
                    statePc = 167;
                    continue stateLoop;
                }
                case 166: {
                    var7 = var8;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if (fe.field_a == var7) {
                        statePc = 179;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    ag.a(var7, 0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 169: {
                    if (!param2) {
                        statePc = 179;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    ((re) this).field_d.field_D = 0;
                    statePc = 179;
                    continue stateLoop;
                }
                case 171: {
                    if (!param2) {
                        statePc = 179;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    ((re) this).field_d.field_D = 1;
                    statePc = 179;
                    continue stateLoop;
                }
                case 173: {
                    if (param2) {
                        statePc = 175;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 175: {
                    ((re) this).field_d.field_D = 2;
                    statePc = 179;
                    continue stateLoop;
                }
                case 176: {
                    if (!param2) {
                        statePc = 179;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    nb.field_e = 0;
                    db.field_m = 0;
                    ij.field_h.c(29026);
                    ((re) this).field_d.a(11246, 0, 5, param0);
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
            if ((param1 ^ -1) < -21) {
              break L3;
            } else {
              if (((re) this).field_d.field_D + 0 == -18 + param1) {
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
              var12 = ((kc) var11).field_p;
              var13 = ((kc) var11).field_o;
              var14 = ((kc) var11).field_q + var8;
              if (-2 == (var10 ^ -1)) {
                var18 = 7619584;
                var17 = 12217600;
                var15 = 3548426;
                sd.a(38, ((kc) var11).field_o, var9, param0, ((kc) var11).field_p, var8, (byte) -111, 0, 32, var6);
                var16 = 5059597;
                break L5;
              } else {
                var17 = 3548426;
                var16 = 7619584;
                sd.a(38, ((kc) var11).field_o, var9, param0, ((kc) var11).field_p, var8, (byte) -122, 16777215, 32, var6);
                var15 = 12217600;
                var18 = 5059597;
                break L5;
              }
            }
            if (((kc) var11).field_p == ia.field_c[0].field_p) {
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
            if (param1 == -5) {
              break L7;
            } else {
              if (-4 != param1) {
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
                if ((var14 ^ -1) < -4) {
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
                  if (stackIn_37_0 + stackIn_37_1 <= 4) {
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
          if (-1 != (((re) this).field_i ^ -1)) {
            break L13;
          } else {
            ae.a(cg.field_i, 9 + var8, 11 + var6, 32, param0);
            ae.a(cg.field_i, var8 - -187, 10 + var6, 32, param0);
            break L13;
          }
        }
    }

    private final int a(byte param0, int param1) {
        if (param0 > -119) {
            int discarded$0 = this.a(-32, (byte) -114);
        }
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
            var2 = var2 + (qa.field_b.b(dh.a(0 != nb.field_e ? true : false, (byte) -94, false, -1 != (ai.field_m ^ -1) ? true : false), 389) * var3 + 6);
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
        int stackIn_55_0 = 0;
        oh stackIn_59_0 = null;
        oh stackIn_60_0 = null;
        oh stackIn_61_0 = null;
        String stackIn_61_1 = null;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        oh stackIn_69_3 = null;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        oh stackIn_70_3 = null;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        oh stackIn_71_3 = null;
        int stackIn_71_4 = 0;
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
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        oh stackIn_74_3 = null;
        int stackIn_74_4 = 0;
        int stackIn_74_5 = 0;
        int stackIn_74_6 = 0;
        int stackIn_74_7 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        oh stackIn_75_2 = null;
        int stackIn_75_3 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        oh stackIn_76_2 = null;
        int stackIn_76_3 = 0;
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
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        oh stackIn_80_2 = null;
        int stackIn_80_3 = 0;
        int stackIn_80_4 = 0;
        int stackIn_80_5 = 0;
        oh stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        oh stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
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
        oh stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        int stackIn_86_4 = 0;
        int stackIn_90_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        int stackIn_164_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_167_1 = 0;
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
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        oh stackOut_68_3 = null;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        oh stackOut_70_3 = null;
        int stackOut_70_4 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        oh stackOut_69_3 = null;
        int stackOut_69_4 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        oh stackOut_71_3 = null;
        int stackOut_71_4 = 0;
        int stackOut_71_5 = 0;
        int stackOut_71_6 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        oh stackOut_73_3 = null;
        int stackOut_73_4 = 0;
        int stackOut_73_5 = 0;
        int stackOut_73_6 = 0;
        int stackOut_73_7 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        oh stackOut_72_3 = null;
        int stackOut_72_4 = 0;
        int stackOut_72_5 = 0;
        int stackOut_72_6 = 0;
        int stackOut_72_7 = 0;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        oh stackOut_74_2 = null;
        int stackOut_74_3 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        oh stackOut_76_2 = null;
        int stackOut_76_3 = 0;
        int stackOut_76_4 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        oh stackOut_75_2 = null;
        int stackOut_75_3 = 0;
        int stackOut_75_4 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        oh stackOut_77_2 = null;
        int stackOut_77_3 = 0;
        int stackOut_77_4 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        oh stackOut_79_2 = null;
        int stackOut_79_3 = 0;
        int stackOut_79_4 = 0;
        int stackOut_79_5 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        oh stackOut_78_2 = null;
        int stackOut_78_3 = 0;
        int stackOut_78_4 = 0;
        int stackOut_78_5 = 0;
        oh stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        oh stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        int stackOut_82_3 = 0;
        oh stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        int stackOut_81_3 = 0;
        oh stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        int stackOut_83_3 = 0;
        oh stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        int stackOut_85_4 = 0;
        oh stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        int stackOut_84_4 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_157_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_166_1 = 0;
        int stackOut_165_0 = 0;
        int stackOut_165_1 = 0;
        int stackOut_126_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        oh stackOut_58_0 = null;
        oh stackOut_60_0 = null;
        String stackOut_60_1 = null;
        oh stackOut_59_0 = null;
        String stackOut_59_1 = null;
        L0: {
          var17 = Main.field_T;
          if (h.field_E[((re) this).field_i]) {
            L1: {
              L2: {
                if (cd.field_h == 0) {
                  break L2;
                } else {
                  if (-2 == cd.field_h) {
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
                if (((re) this).field_f.field_i <= var4) {
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
            if ((((re) this).field_i ^ -1) != -6) {
              if (((re) this).field_i != 3) {
                if (4 != ((re) this).field_i) {
                  L7: {
                    if (((re) this).field_i == 8) {
                      break L7;
                    } else {
                      if (10 == ((re) this).field_i) {
                        break L7;
                      } else {
                        if (9 != ((re) this).field_i) {
                          break L6;
                        } else {
                          L8: {
                            var4 = 200;
                            var5 = qa.field_b.field_q + qa.field_b.field_x;
                            var4 = var4 + (6 + var5 * qa.field_b.a(d.field_e, 211, var4, 389, 1000, 0, -1, 1, 0, var5));
                            stackOut_68_0 = var4;
                            stackOut_68_1 = 6;
                            stackOut_68_2 = var5;
                            stackOut_68_3 = qa.field_b;
                            stackIn_70_0 = stackOut_68_0;
                            stackIn_70_1 = stackOut_68_1;
                            stackIn_70_2 = stackOut_68_2;
                            stackIn_70_3 = stackOut_68_3;
                            stackIn_69_0 = stackOut_68_0;
                            stackIn_69_1 = stackOut_68_1;
                            stackIn_69_2 = stackOut_68_2;
                            stackIn_69_3 = stackOut_68_3;
                            if (-1 == (nb.field_e ^ -1)) {
                              stackOut_70_0 = stackIn_70_0;
                              stackOut_70_1 = stackIn_70_1;
                              stackOut_70_2 = stackIn_70_2;
                              stackOut_70_3 = (oh) (Object) stackIn_70_3;
                              stackOut_70_4 = 0;
                              stackIn_71_0 = stackOut_70_0;
                              stackIn_71_1 = stackOut_70_1;
                              stackIn_71_2 = stackOut_70_2;
                              stackIn_71_3 = stackOut_70_3;
                              stackIn_71_4 = stackOut_70_4;
                              break L8;
                            } else {
                              stackOut_69_0 = stackIn_69_0;
                              stackOut_69_1 = stackIn_69_1;
                              stackOut_69_2 = stackIn_69_2;
                              stackOut_69_3 = (oh) (Object) stackIn_69_3;
                              stackOut_69_4 = 1;
                              stackIn_71_0 = stackOut_69_0;
                              stackIn_71_1 = stackOut_69_1;
                              stackIn_71_2 = stackOut_69_2;
                              stackIn_71_3 = stackOut_69_3;
                              stackIn_71_4 = stackOut_69_4;
                              break L8;
                            }
                          }
                          L9: {
                            stackOut_71_0 = stackIn_71_0;
                            stackOut_71_1 = stackIn_71_1;
                            stackOut_71_2 = stackIn_71_2;
                            stackOut_71_3 = (oh) (Object) stackIn_71_3;
                            stackOut_71_4 = stackIn_71_4;
                            stackOut_71_5 = -122;
                            stackOut_71_6 = 0;
                            stackIn_73_0 = stackOut_71_0;
                            stackIn_73_1 = stackOut_71_1;
                            stackIn_73_2 = stackOut_71_2;
                            stackIn_73_3 = stackOut_71_3;
                            stackIn_73_4 = stackOut_71_4;
                            stackIn_73_5 = stackOut_71_5;
                            stackIn_73_6 = stackOut_71_6;
                            stackIn_72_0 = stackOut_71_0;
                            stackIn_72_1 = stackOut_71_1;
                            stackIn_72_2 = stackOut_71_2;
                            stackIn_72_3 = stackOut_71_3;
                            stackIn_72_4 = stackOut_71_4;
                            stackIn_72_5 = stackOut_71_5;
                            stackIn_72_6 = stackOut_71_6;
                            if (ai.field_m == 0) {
                              stackOut_73_0 = stackIn_73_0;
                              stackOut_73_1 = stackIn_73_1;
                              stackOut_73_2 = stackIn_73_2;
                              stackOut_73_3 = (oh) (Object) stackIn_73_3;
                              stackOut_73_4 = stackIn_73_4;
                              stackOut_73_5 = stackIn_73_5;
                              stackOut_73_6 = stackIn_73_6;
                              stackOut_73_7 = 0;
                              stackIn_74_0 = stackOut_73_0;
                              stackIn_74_1 = stackOut_73_1;
                              stackIn_74_2 = stackOut_73_2;
                              stackIn_74_3 = stackOut_73_3;
                              stackIn_74_4 = stackOut_73_4;
                              stackIn_74_5 = stackOut_73_5;
                              stackIn_74_6 = stackOut_73_6;
                              stackIn_74_7 = stackOut_73_7;
                              break L9;
                            } else {
                              stackOut_72_0 = stackIn_72_0;
                              stackOut_72_1 = stackIn_72_1;
                              stackOut_72_2 = stackIn_72_2;
                              stackOut_72_3 = (oh) (Object) stackIn_72_3;
                              stackOut_72_4 = stackIn_72_4;
                              stackOut_72_5 = stackIn_72_5;
                              stackOut_72_6 = stackIn_72_6;
                              stackOut_72_7 = 1;
                              stackIn_74_0 = stackOut_72_0;
                              stackIn_74_1 = stackOut_72_1;
                              stackIn_74_2 = stackOut_72_2;
                              stackIn_74_3 = stackOut_72_3;
                              stackIn_74_4 = stackOut_72_4;
                              stackIn_74_5 = stackOut_72_5;
                              stackIn_74_6 = stackOut_72_6;
                              stackIn_74_7 = stackOut_72_7;
                              break L9;
                            }
                          }
                          L10: {
                            var4 = stackIn_74_0 + (stackIn_74_1 + stackIn_74_2 * ((oh) (Object) stackIn_74_3).a(dh.a(stackIn_74_4 != 0, (byte) stackIn_74_5, stackIn_74_6 != 0, stackIn_74_7 != 0), 211, var4, 389, 1000, 0, -1, 1, 0, var5));
                            var4 = var4 + (this.b(0, (byte) 17) + 6);
                            stackOut_74_0 = var4;
                            stackOut_74_1 = var5;
                            stackOut_74_2 = qa.field_b;
                            stackOut_74_3 = 116;
                            stackIn_76_0 = stackOut_74_0;
                            stackIn_76_1 = stackOut_74_1;
                            stackIn_76_2 = stackOut_74_2;
                            stackIn_76_3 = stackOut_74_3;
                            stackIn_75_0 = stackOut_74_0;
                            stackIn_75_1 = stackOut_74_1;
                            stackIn_75_2 = stackOut_74_2;
                            stackIn_75_3 = stackOut_74_3;
                            if (0 == ai.field_m) {
                              stackOut_76_0 = stackIn_76_0;
                              stackOut_76_1 = stackIn_76_1;
                              stackOut_76_2 = (oh) (Object) stackIn_76_2;
                              stackOut_76_3 = stackIn_76_3;
                              stackOut_76_4 = 0;
                              stackIn_77_0 = stackOut_76_0;
                              stackIn_77_1 = stackOut_76_1;
                              stackIn_77_2 = stackOut_76_2;
                              stackIn_77_3 = stackOut_76_3;
                              stackIn_77_4 = stackOut_76_4;
                              break L10;
                            } else {
                              stackOut_75_0 = stackIn_75_0;
                              stackOut_75_1 = stackIn_75_1;
                              stackOut_75_2 = (oh) (Object) stackIn_75_2;
                              stackOut_75_3 = stackIn_75_3;
                              stackOut_75_4 = 1;
                              stackIn_77_0 = stackOut_75_0;
                              stackIn_77_1 = stackOut_75_1;
                              stackIn_77_2 = stackOut_75_2;
                              stackIn_77_3 = stackOut_75_3;
                              stackIn_77_4 = stackOut_75_4;
                              break L10;
                            }
                          }
                          L11: {
                            stackOut_77_0 = stackIn_77_0;
                            stackOut_77_1 = stackIn_77_1;
                            stackOut_77_2 = (oh) (Object) stackIn_77_2;
                            stackOut_77_3 = stackIn_77_3;
                            stackOut_77_4 = stackIn_77_4;
                            stackIn_79_0 = stackOut_77_0;
                            stackIn_79_1 = stackOut_77_1;
                            stackIn_79_2 = stackOut_77_2;
                            stackIn_79_3 = stackOut_77_3;
                            stackIn_79_4 = stackOut_77_4;
                            stackIn_78_0 = stackOut_77_0;
                            stackIn_78_1 = stackOut_77_1;
                            stackIn_78_2 = stackOut_77_2;
                            stackIn_78_3 = stackOut_77_3;
                            stackIn_78_4 = stackOut_77_4;
                            if (0 == nb.field_e) {
                              stackOut_79_0 = stackIn_79_0;
                              stackOut_79_1 = stackIn_79_1;
                              stackOut_79_2 = (oh) (Object) stackIn_79_2;
                              stackOut_79_3 = stackIn_79_3;
                              stackOut_79_4 = stackIn_79_4;
                              stackOut_79_5 = 0;
                              stackIn_80_0 = stackOut_79_0;
                              stackIn_80_1 = stackOut_79_1;
                              stackIn_80_2 = stackOut_79_2;
                              stackIn_80_3 = stackOut_79_3;
                              stackIn_80_4 = stackOut_79_4;
                              stackIn_80_5 = stackOut_79_5;
                              break L11;
                            } else {
                              stackOut_78_0 = stackIn_78_0;
                              stackOut_78_1 = stackIn_78_1;
                              stackOut_78_2 = (oh) (Object) stackIn_78_2;
                              stackOut_78_3 = stackIn_78_3;
                              stackOut_78_4 = stackIn_78_4;
                              stackOut_78_5 = 1;
                              stackIn_80_0 = stackOut_78_0;
                              stackIn_80_1 = stackOut_78_1;
                              stackIn_80_2 = stackOut_78_2;
                              stackIn_80_3 = stackOut_78_3;
                              stackIn_80_4 = stackOut_78_4;
                              stackIn_80_5 = stackOut_78_5;
                              break L11;
                            }
                          }
                          L12: {
                            var4 = stackIn_80_0 + (stackIn_80_1 * ((oh) (Object) stackIn_80_2).a(mk.a(stackIn_80_3, stackIn_80_4 != 0, stackIn_80_5 != 0, false), 211, var4, 389, 1000, 0, -1, 1, 0, var5) + 6);
                            var4 = var4 + (6 + this.b(1, (byte) 17));
                            stackOut_80_0 = qa.field_b;
                            stackOut_80_1 = 43;
                            stackOut_80_2 = 0;
                            stackIn_82_0 = stackOut_80_0;
                            stackIn_82_1 = stackOut_80_1;
                            stackIn_82_2 = stackOut_80_2;
                            stackIn_81_0 = stackOut_80_0;
                            stackIn_81_1 = stackOut_80_1;
                            stackIn_81_2 = stackOut_80_2;
                            if (nb.field_e == 0) {
                              stackOut_82_0 = (oh) (Object) stackIn_82_0;
                              stackOut_82_1 = stackIn_82_1;
                              stackOut_82_2 = stackIn_82_2;
                              stackOut_82_3 = 0;
                              stackIn_83_0 = stackOut_82_0;
                              stackIn_83_1 = stackOut_82_1;
                              stackIn_83_2 = stackOut_82_2;
                              stackIn_83_3 = stackOut_82_3;
                              break L12;
                            } else {
                              stackOut_81_0 = (oh) (Object) stackIn_81_0;
                              stackOut_81_1 = stackIn_81_1;
                              stackOut_81_2 = stackIn_81_2;
                              stackOut_81_3 = 1;
                              stackIn_83_0 = stackOut_81_0;
                              stackIn_83_1 = stackOut_81_1;
                              stackIn_83_2 = stackOut_81_2;
                              stackIn_83_3 = stackOut_81_3;
                              break L12;
                            }
                          }
                          L13: {
                            stackOut_83_0 = (oh) (Object) stackIn_83_0;
                            stackOut_83_1 = stackIn_83_1;
                            stackOut_83_2 = stackIn_83_2;
                            stackOut_83_3 = stackIn_83_3;
                            stackIn_85_0 = stackOut_83_0;
                            stackIn_85_1 = stackOut_83_1;
                            stackIn_85_2 = stackOut_83_2;
                            stackIn_85_3 = stackOut_83_3;
                            stackIn_84_0 = stackOut_83_0;
                            stackIn_84_1 = stackOut_83_1;
                            stackIn_84_2 = stackOut_83_2;
                            stackIn_84_3 = stackOut_83_3;
                            if (-1 == (ai.field_m ^ -1)) {
                              stackOut_85_0 = (oh) (Object) stackIn_85_0;
                              stackOut_85_1 = stackIn_85_1;
                              stackOut_85_2 = stackIn_85_2;
                              stackOut_85_3 = stackIn_85_3;
                              stackOut_85_4 = 0;
                              stackIn_86_0 = stackOut_85_0;
                              stackIn_86_1 = stackOut_85_1;
                              stackIn_86_2 = stackOut_85_2;
                              stackIn_86_3 = stackOut_85_3;
                              stackIn_86_4 = stackOut_85_4;
                              break L13;
                            } else {
                              stackOut_84_0 = (oh) (Object) stackIn_84_0;
                              stackOut_84_1 = stackIn_84_1;
                              stackOut_84_2 = stackIn_84_2;
                              stackOut_84_3 = stackIn_84_3;
                              stackOut_84_4 = 1;
                              stackIn_86_0 = stackOut_84_0;
                              stackIn_86_1 = stackOut_84_1;
                              stackIn_86_2 = stackOut_84_2;
                              stackIn_86_3 = stackOut_84_3;
                              stackIn_86_4 = stackOut_84_4;
                              break L13;
                            }
                          }
                          int discarded$4 = ((oh) (Object) stackIn_86_0).a(af.a(stackIn_86_1, stackIn_86_2 != 0, stackIn_86_3 != 0, stackIn_86_4 != 0), 211, var4, 389, 1000, 0, -1, 1, 0, var5);
                          break L6;
                        }
                      }
                    }
                  }
                  L14: {
                    if (((re) this).field_i == -9) {
                      stackOut_89_0 = ue.field_d;
                      stackIn_90_0 = stackOut_89_0;
                      break L14;
                    } else {
                      stackOut_88_0 = nb.field_e;
                      stackIn_90_0 = stackOut_88_0;
                      break L14;
                    }
                  }
                  L15: {
                    var4 = stackIn_90_0;
                    if (-12 >= rd.a(var4, 1266438832)) {
                      stackOut_92_0 = 0;
                      stackIn_93_0 = stackOut_92_0;
                      break L15;
                    } else {
                      stackOut_91_0 = 1;
                      stackIn_93_0 = stackOut_91_0;
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
                                    stackOut_106_0 = 1;
                                    stackIn_107_0 = stackOut_106_0;
                                    break L18;
                                  } else {
                                    if ((var10 ^ -1) > -13) {
                                      stackOut_105_0 = 2;
                                      stackIn_107_0 = stackOut_105_0;
                                      break L18;
                                    } else {
                                      stackOut_104_0 = 3;
                                      stackIn_107_0 = stackOut_104_0;
                                      break L18;
                                    }
                                  }
                                } else {
                                  stackOut_101_0 = 0;
                                  stackIn_107_0 = stackOut_101_0;
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
                          if (var12 == ((re) this).field_g) {
                            ((re) this).field_g = -1;
                            break L21;
                          } else {
                            ((re) this).field_g = var12;
                            break L21;
                          }
                        }
                      }
                      ((re) this).field_a = -1;
                      var8 = 170;
                      var13 = 0;
                      L22: while (true) {
                        if (qk.field_a.length <= var13) {
                          L23: {
                            if (0 == (((re) this).field_g ^ -1)) {
                              break L23;
                            } else {
                              var10 = ((re) this).field_g;
                              break L23;
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
                                  if (var13 <= -6) {
                                    if (-9 <= var13) {
                                      if ((var13 ^ -1) <= -13) {
                                        stackOut_162_0 = 3;
                                        stackIn_164_0 = stackOut_162_0;
                                        break L26;
                                      } else {
                                        stackOut_161_0 = 2;
                                        stackIn_164_0 = stackOut_161_0;
                                        break L26;
                                      }
                                    } else {
                                      stackOut_159_0 = 1;
                                      stackIn_164_0 = stackOut_159_0;
                                      break L26;
                                    }
                                  } else {
                                    stackOut_157_0 = 0;
                                    stackIn_164_0 = stackOut_157_0;
                                    break L26;
                                  }
                                }
                                L27: {
                                  var14 = stackIn_164_0;
                                  stackOut_164_0 = var8;
                                  stackIn_166_0 = stackOut_164_0;
                                  stackIn_165_0 = stackOut_164_0;
                                  if (var14 == var11) {
                                    stackOut_166_0 = stackIn_166_0;
                                    stackOut_166_1 = var6;
                                    stackIn_167_0 = stackOut_166_0;
                                    stackIn_167_1 = stackOut_166_1;
                                    break L27;
                                  } else {
                                    stackOut_165_0 = stackIn_165_0;
                                    stackOut_165_1 = 40;
                                    stackIn_167_0 = stackOut_165_0;
                                    stackIn_167_1 = stackOut_165_1;
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
                            if (((re) this).field_g == var13) {
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
                              if (-6 >= var13) {
                                if (-9 > var13) {
                                  stackOut_126_0 = 1;
                                  stackIn_127_0 = stackOut_126_0;
                                  break L29;
                                } else {
                                  if (-13 >= (var13 ^ -1)) {
                                    stackOut_125_0 = 3;
                                    stackIn_127_0 = stackOut_125_0;
                                    break L29;
                                  } else {
                                    stackOut_124_0 = 2;
                                    stackIn_127_0 = stackOut_124_0;
                                    break L29;
                                  }
                                }
                              } else {
                                stackOut_121_0 = 0;
                                stackIn_127_0 = stackOut_121_0;
                                break L29;
                              }
                            }
                            L30: {
                              var14 = stackIn_127_0;
                              stackOut_127_0 = var8;
                              stackIn_129_0 = stackOut_127_0;
                              stackIn_128_0 = stackOut_127_0;
                              if (var11 != var14) {
                                stackOut_129_0 = stackIn_129_0;
                                stackOut_129_1 = 40;
                                stackIn_130_0 = stackOut_129_0;
                                stackIn_130_1 = stackOut_129_1;
                                break L30;
                              } else {
                                stackOut_128_0 = stackIn_128_0;
                                stackOut_128_1 = 20;
                                stackIn_130_0 = stackOut_128_0;
                                stackIn_130_1 = stackOut_128_1;
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
                          if (((re) this).field_a < var8) {
                            break L31;
                          } else {
                            if (((re) this).field_a > var8 - -32) {
                              break L31;
                            } else {
                              if (var9 > ((re) this).field_e) {
                                break L31;
                              } else {
                                if (var9 - -32 >= ((re) this).field_e) {
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
                  var27 = g.field_y;
                  var7 = 0;
                  L32: while (true) {
                    if (var7 >= var27.length) {
                      L33: {
                        if (((re) this).field_g != -1) {
                          var4 = ((re) this).field_g;
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
                            stackOut_54_0 = 0;
                            stackIn_55_0 = stackOut_54_0;
                            break L34;
                          } else {
                            stackOut_53_0 = 1;
                            stackIn_55_0 = stackOut_53_0;
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
                          stackOut_58_0 = qa.field_b;
                          stackIn_60_0 = stackOut_58_0;
                          stackIn_59_0 = stackOut_58_0;
                          if (var8 == 0) {
                            stackOut_60_0 = (oh) (Object) stackIn_60_0;
                            stackOut_60_1 = vd.field_n;
                            stackIn_61_0 = stackOut_60_0;
                            stackIn_61_1 = stackOut_60_1;
                            break L36;
                          } else {
                            stackOut_59_0 = (oh) (Object) stackIn_59_0;
                            stackOut_59_1 = pk.field_b;
                            stackIn_61_0 = stackOut_59_0;
                            stackIn_61_1 = stackOut_59_1;
                            break L36;
                          }
                        }
                        ((oh) (Object) stackIn_61_0).b((String) (Object) stackIn_61_1, 388, var7, 16711680, -1);
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
                          int discarded$6 = qa.field_b.a(ag.field_g, 248, param2 + (2 * (qa.field_b.field_x + qa.field_b.field_s) + 226), 319, 1024, 0, -1, 1, 0, qa.field_b.field_x + qa.field_b.field_s);
                          break L6;
                        }
                      }
                    } else {
                      var28 = var27[var7];
                      var25 = var28;
                      var22 = var25;
                      var19 = var22;
                      var8_ref_int__ = var19;
                      var9 = 251 + (320 + -(40 * var28.length)) / 2;
                      var29 = var8_ref_int__;
                      var11 = 0;
                      L38: while (true) {
                        if (var29.length <= var11) {
                          var5 += 40;
                          var7++;
                          continue L32;
                        } else {
                          L39: {
                            var12 = var29[var11];
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
                            if (((re) this).field_a < var9) {
                              break L41;
                            } else {
                              if (var9 - -32 < ((re) this).field_a) {
                                break L41;
                              } else {
                                if (var5 > ((re) this).field_e) {
                                  break L41;
                                } else {
                                  if (32 + var5 < ((re) this).field_e) {
                                    break L41;
                                  } else {
                                    L42: {
                                      if (((re) this).field_g != var12) {
                                        ((re) this).field_g = var12;
                                        break L42;
                                      } else {
                                        ((re) this).field_g = -1;
                                        break L42;
                                      }
                                    }
                                    ((re) this).field_a = -1;
                                    break L41;
                                  }
                                }
                              }
                            }
                          }
                          if (var12 == ((re) this).field_g) {
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
        if (-3 != (((re) this).field_i ^ -1)) {
          L0: {
            var4 = -7 % ((param1 - 31) / 37);
            if (((re) this).field_i != 5) {
              if (-11 == (((re) this).field_i ^ -1)) {
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
              // wide iinc 3 198
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
        ((re) this).field_d = param0;
        ((re) this).field_i = param1;
        ((re) this).field_f = new lh(fh.field_G[param1].length);
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        kc var9 = null;
        var8 = Main.field_T;
        if (param2 == null) {
          return false;
        } else {
          L0: {
            var3 = ((CharSequence) param2).length();
            if ((var3 ^ -1) > -2) {
              break L0;
            } else {
              if (var3 < -13) {
                break L0;
              } else {
                var4 = ff.a((byte) 116, param2);
                if (var4 == null) {
                  return false;
                } else {
                  if (-2 <= var4.length()) {
                    L1: {
                      if (tg.a((byte) -63, var4.charAt(0))) {
                        break L1;
                      } else {
                        if (!tg.a((byte) -63, var4.charAt(var4.length() - 1))) {
                          L2: {
                            var5 = 0;
                            var6 = 0;
                            if (param1 <= -91) {
                              break L2;
                            } else {
                              var9 = (kc) null;
                              re.a(-38, -4, -9, (byte) -72, (kc) null);
                              break L2;
                            }
                          }
                          L3: while (true) {
                            if (var6 >= ((CharSequence) param2).length()) {
                              if (var5 <= 0) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L4: {
                                var7 = ((CharSequence) param2).charAt(var6);
                                if (tg.a((byte) -63, (char) var7)) {
                                  var5++;
                                  break L4;
                                } else {
                                  var5 = 0;
                                  break L4;
                                }
                              }
                              if (var5 >= 2) {
                                if (!param0) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L3;
                                }
                              } else {
                                var6++;
                                continue L3;
                              }
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                    return false;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
