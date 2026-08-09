/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa extends ql {
    private we[] field_h;
    private v field_k;
    private v field_e;
    static volatile int field_l;
    private v field_f;
    static boolean field_d;
    static bd[][] field_i;
    private v[] field_g;
    private v field_j;
    private oj[] field_m;

    final String a(boolean param0) {
        if (param0) {
            oj var3 = (oj) null;
            this.a((oj) null, (byte) 32);
        }
        if (-11 == (ha.field_t ^ -1)) {
            return ac.field_f;
        }
        return aa.field_c;
    }

    final static void a(p param0, int param1, int[] param2, boolean param3) {
        int fieldTemp$0 = 0;
        int dupTemp$1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_79_0 = 0;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        String stackIn_136_2 = null;
        StringBuilder stackIn_138_1 = null;
        StringBuilder stackIn_139_1 = null;
        String stackIn_139_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        double var4_double = 0.0;
        RuntimeException var4 = null;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        double var16 = 0.0;
        double var18 = 0.0;
        Object var20 = null;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        int var35 = 0;
        int var36_int = 0;
        p var36 = null;
        int var37 = 0;
        double var38 = 0.0;
        double var40 = 0.0;
        int var42 = 0;
        double var43 = 0.0;
        double var45 = 0.0;
        int var47 = 0;
        int var48 = 0;
        double var49 = 0.0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int[] var54 = null;
        oj var55 = null;
        oj var56 = null;
        p var57 = null;
        var53 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                var54 = (int[]) null;
                pa.a((p) null, -67, (int[]) null, true);
                break L1;
              }
            }
            L2: {
              var6 = param0.field_i;
              var7 = param0.field_c;
              if (0 != param0.field_e) {
                break L2;
              } else {
                L3: {
                  var9 = param0.field_l.field_f + (double)param0.field_j.field_e;
                  var11 = param0.field_l.field_a + (double)param0.field_j.field_g;
                  var13 = 0;
                  var14 = 0;
                  if (param0.field_i != 20) {
                    if (32 == param0.field_i) {
                      stackIn_10_0 = 1;
                      break L3;
                    } else {
                      stackIn_10_0 = 0;
                      break L3;
                    }
                  } else {
                    stackIn_10_0 = 1;
                    break L3;
                  }
                }
                var15 = stackIn_10_0;
                param2[param1] = 0;
                L4: while (true) {
                  L5: {
                    var14++;
                    param0.field_l.a(2, (byte) 94, param0.field_c);
                    param0.a(8573);
                    if (param2[param0.field_j.b(-4)] == 2) {
                      var13 = 1;
                      param0.field_e = 1;
                      if (param0.field_i == 32) {
                        param0.field_i = -1;
                        break L5;
                      } else {
                        param0.field_i = 33;
                        param0.field_c = (double)di.a(var11, 124, var9, param0.field_c);
                        break L5;
                      }
                    } else {
                      if (18 != param0.field_i) {
                        break L5;
                      } else {
                        if (var14 >= 70) {
                          param0.field_i = -1;
                          param0.field_e = 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L6: {
                    if (-1 != (param0.field_e ^ -1)) {
                      break L6;
                    } else {
                      if (var15 == 0) {
                        continue L4;
                      } else {
                        if (10 > var14) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  L7: {
                    param2[param1] = 3;
                    var16 = (double)param0.field_j.field_e + param0.field_l.field_f;
                    var18 = (double)param0.field_j.field_g + param0.field_l.field_a;
                    if (var13 == 0) {
                      break L7;
                    } else {
                      var18 = 0.5 + ((double)param0.field_j.field_g + param0.field_l.field_a);
                      var16 = (double)param0.field_j.field_e + param0.field_l.field_f + 0.5;
                      break L7;
                    }
                  }
                  var20 = null;
                  var21 = (-var18 + var11) * (-var18 + var11) + (var9 - var16) * (-var16 + var9);
                  var35 = 1;
                  L8: while (true) {
                    if (var35 >= rc.field_e) {
                      if (var20 == null) {
                        var55 = (oj) null;
                        nh.a((oj) null, -29966);
                        break L2;
                      } else {
                        L9: {
                          if ((((oj) (var20)).field_I ^ -1) >= -1) {
                            stackIn_79_0 = 0;
                            break L9;
                          } else {
                            stackIn_79_0 = 1;
                            break L9;
                          }
                        }
                        L10: {
                          var35 = stackIn_79_0;
                          if (((oj) (var20)).a(var6, -125)) {
                            L11: {
                              if (((oj) (var20)).field_i == 5) {
                                break L11;
                              } else {
                                if ((((oj) (var20)).field_i ^ -1) != -23) {
                                  L12: {
                                    var36_int = var6;
                                    if (18 == var36_int) {
                                      ((oj) (var20)).field_K = var7;
                                      ((oj) (var20)).field_I = ((oj) (var20)).field_I - 4;
                                      ((oj) (var20)).field_t = 5;
                                      break L12;
                                    } else {
                                      if ((var36_int ^ -1) != -24) {
                                        if (var36_int != 20) {
                                          ((oj) (var20)).field_I = ((oj) (var20)).field_I - 1;
                                          break L12;
                                        } else {
                                          ((oj) (var20)).field_I = ((oj) (var20)).field_I - 2;
                                          break L12;
                                        }
                                      } else {
                                        ((oj) (var20)).field_I = ((oj) (var20)).field_I - 8;
                                        u.a(17, param0.field_j, true, 16, param0.field_l, 4);
                                        break L12;
                                      }
                                    }
                                  }
                                  if (!((oj) (var20)).field_b) {
                                    break L11;
                                  } else {
                                    if ((((oj) (var20)).field_I ^ -1) < -1) {
                                      tk.a(8, jc.field_c, 1, true);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                } else {
                                  break L11;
                                }
                              }
                            }
                            if (((oj) (var20)).field_b) {
                              L13: {
                                L14: {
                                  fieldTemp$0 = ib.field_c;
                                  ib.field_c = ib.field_c + 1;
                                  var57 = jn.field_F[fieldTemp$0];
                                  var36 = var57;
                                  var36.field_i = 36;
                                  var57.field_j.a((byte) 46, ((oj) (var20)).field_j);
                                  var57.field_l.a(((oj) (var20)).field_l, -28860);
                                  var57.field_l.field_a = var57.field_l.field_a - 0.5;
                                  var57.field_l.field_f = var57.field_l.field_f - 0.5;
                                  var36.field_c = var7;
                                  if ((((oj) (var20)).field_i ^ -1) == -5) {
                                    break L14;
                                  } else {
                                    if (((oj) (var20)).field_i != 24) {
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                var57.field_l.field_a = var57.field_l.field_a + 1.0;
                                var57.field_l.field_f = var57.field_l.field_f + 1.0;
                                break L13;
                              }
                              var57.field_l.a(15, (byte) 94, var7);
                              var57.a(8573);
                              var36.field_e = 8;
                              break L10;
                            } else {
                              break L10;
                            }
                          } else {
                            break L10;
                          }
                        }
                        L15: {
                          ((oj) (var20)).field_F = 255;
                          param0.field_e = 1;
                          if (0 <= ((oj) (var20)).field_I) {
                            break L15;
                          } else {
                            ((oj) (var20)).field_I = 0;
                            break L15;
                          }
                        }
                        L16: {
                          if (null != ((oj) (var20)).field_u) {
                            param0.field_l.field_f = var9 - (double)(int)var9;
                            param0.field_l.field_a = var11 - (double)(int)var11;
                            param0.field_j.field_g = (int)var11;
                            param0.field_j.field_e = (int)var9;
                            param0.field_l.b(var21 * 2.0, param0.field_c, 105);
                            break L16;
                          } else {
                            param0.b((byte) 117);
                            param0.field_c = 255.0 * Math.random();
                            param0.field_j.field_g = ((oj) (var20)).field_j.field_g;
                            param0.field_j.field_e = ((oj) (var20)).field_j.field_e;
                            param0.field_l.field_f = -0.5 + (((oj) (var20)).field_l.field_f + Math.random());
                            param0.field_l.field_a = ((oj) (var20)).field_l.field_a + Math.random() - 0.5;
                            break L16;
                          }
                        }
                        L17: {
                          if (-1 <= (((oj) (var20)).field_I ^ -1)) {
                            L18: {
                              if (!((oj) (var20)).field_b) {
                                break L18;
                              } else {
                                if (var35 == 0) {
                                  break L18;
                                } else {
                                  if (((oj) (var20)).field_i == 27) {
                                    break L18;
                                  } else {
                                    if ((var6 ^ -1) == -19) {
                                      dupTemp$1 = al.field_U[0] + 1;
                                      al.field_U[0] = dupTemp$1;
                                      if (dupTemp$1 == 30) {
                                        ti.a(250, (byte) -123, 5);
                                        break L18;
                                      } else {
                                        break L18;
                                      }
                                    } else {
                                      al.field_U[5] = al.field_U[5] + 1;
                                      break L18;
                                    }
                                  }
                                }
                              }
                            }
                            param0.field_i = 3;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        L19: {
                          nh.a((oj) (var20), -29966);
                          if (-6 == (((oj) (var20)).field_i ^ -1)) {
                            break L19;
                          } else {
                            if (((oj) (var20)).b(6)) {
                              break L19;
                            } else {
                              if (((oj) (var20)).field_i == 22) {
                                break L19;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        if ((uj.field_l ^ -1) != -2) {
                          break L2;
                        } else {
                          eh.field_c.a(lm.field_A[11], 100, uh.field_i);
                          break L2;
                        }
                      }
                    } else {
                      var56 = re.field_n[var35];
                      var20 = var56;
                      var20 = var56;
                      var37 = var56.field_i;
                      if ((var56.field_I ^ -1) < -1) {
                        L20: {
                          if (-11 < (var37 ^ -1)) {
                            break L20;
                          } else {
                            if (-19 >= (var37 ^ -1)) {
                              break L20;
                            } else {
                              var35++;
                              continue L8;
                            }
                          }
                        }
                        L21: {
                          var38 = 1.0;
                          var40 = 1.0;
                          if (-21 == (var37 ^ -1)) {
                            var40 = 0.5;
                            var38 = 0.5;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        L22: {
                          L23: {
                            L24: {
                              if ((var37 ^ -1) == -11) {
                                break L24;
                              } else {
                                if ((var37 ^ -1) == -130) {
                                  break L24;
                                } else {
                                  if (131 == var37) {
                                    break L24;
                                  } else {
                                    if (-134 == (var37 ^ -1)) {
                                      break L24;
                                    } else {
                                      if (-12 == (var37 ^ -1)) {
                                        break L24;
                                      } else {
                                        if ((var37 ^ -1) == -130) {
                                          break L24;
                                        } else {
                                          if (var37 == 131) {
                                            break L24;
                                          } else {
                                            if (var37 != 133) {
                                              break L23;
                                            } else {
                                              break L24;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if (var56.field_h != 0) {
                              var40 = 0.5;
                              break L23;
                            } else {
                              break L22;
                            }
                          }
                          L25: {
                            L26: {
                              var31 = var56.field_l.field_f + (double)var56.field_j.field_e;
                              var33 = (double)var56.field_j.field_g + var56.field_l.field_a;
                              if ((var37 ^ -1) == -25) {
                                break L26;
                              } else {
                                if (var37 == 4) {
                                  break L26;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            var33 = var33 + 1.0;
                            var31 = var31 + 1.0;
                            break L25;
                          }
                          L27: {
                            var25 = -var40 + var33;
                            var29 = var33 + var40;
                            var23 = var31 - var38;
                            var27 = var31 + var38;
                            var42 = 0;
                            if (var56.field_u == null) {
                              L28: {
                                if (!fb.a(var25, (byte) 43, var29, var16, var23, var11, var27, var18, var9)) {
                                  if (fb.a(var29, (byte) 43, var25, var16, var23, var11, var27, var18, var9)) {
                                    stackIn_68_0 = 1;
                                    break L28;
                                  } else {
                                    stackIn_68_0 = 0;
                                    break L28;
                                  }
                                } else {
                                  stackIn_68_0 = 1;
                                  break L28;
                                }
                              }
                              var42 = stackIn_68_0;
                              break L27;
                            } else {
                              var43 = -var9 + var16;
                              var45 = var18 - var11;
                              var47 = -(var56.field_u.field_z >> -37191999) + (int)(var31 * 24.0);
                              var48 = -(var56.field_u.field_A >> -926290463) + (int)(var33 * 24.0);
                              var49 = 0.0;
                              L29: while (true) {
                                if (1.0 <= var49) {
                                  break L27;
                                } else {
                                  if (var42 != 0) {
                                    break L27;
                                  } else {
                                    L30: {
                                      var51 = (int)(24.0 * (var9 + var43 * var49));
                                      var52 = (int)((var49 * var45 + var11) * 24.0);
                                      if (!var56.field_u.d(var47, var48, var51, var52)) {
                                        stackIn_58_0 = 0;
                                        break L30;
                                      } else {
                                        stackIn_58_0 = 1;
                                        break L30;
                                      }
                                    }
                                    L31: {
                                      var42 = stackIn_58_0;
                                      if (var42 == 0) {
                                        break L31;
                                      } else {
                                        var9 = var9 + var43 * var49;
                                        var11 = var11 + var45 * var49;
                                        break L31;
                                      }
                                    }
                                    var49 = var49 + 0.05;
                                    continue L29;
                                  }
                                }
                              }
                            }
                          }
                          if (var42 != 0) {
                            var4_double = (-var31 + var9) * (-var31 + var9) + (-var33 + var11) * (var11 - var33);
                            if (var21 > var4_double) {
                              var20 = var56;
                              var21 = var4_double;
                              break L22;
                            } else {
                              var35++;
                              continue L8;
                            }
                          } else {
                            break L22;
                          }
                        }
                        var35++;
                        continue L8;
                      } else {
                        var35++;
                        continue L8;
                      }
                    }
                  }
                }
              }
            }
            L32: {
              if (param0.field_e <= 0) {
                break L32;
              } else {
                param0.field_e = param0.field_e + 1;
                break L32;
              }
            }
            L33: {
              if ((param0.field_e ^ -1) < -33) {
                param0.field_i = -1;
                break L33;
              } else {
                break L33;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var4 = decompiledCaughtException;
            stackIn_135_0 = (RuntimeException) (var4);

            stackIn_135_1 = new StringBuilder().append("pa.V(");

            if (param0 == null) {
              stackIn_136_0 = (RuntimeException) ((Object) stackIn_135_0);
              stackIn_136_1 = (StringBuilder) ((Object) stackIn_135_1);
              stackIn_136_2 = "null";
              break L34;
            } else {
              stackIn_136_0 = (RuntimeException) ((Object) stackIn_135_0);
              stackIn_136_1 = (StringBuilder) ((Object) stackIn_135_1);
              stackIn_136_2 = "{...}";
              break L34;
            }
          }
          L35: {


            stackIn_138_1 = ((StringBuilder) (Object) stackIn_136_1).append(stackIn_136_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_136_0 = (RuntimeException) ((Object) stackIn_136_0);
              stackIn_139_1 = (StringBuilder) ((Object) stackIn_138_1);
              stackIn_139_2 = "null";
              break L35;
            } else {
              stackIn_136_0 = (RuntimeException) ((Object) stackIn_136_0);
              stackIn_139_1 = (StringBuilder) ((Object) stackIn_138_1);
              stackIn_139_2 = "{...}";
              break L35;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_136_0), stackIn_139_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, p param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var3_int = -113 % ((param0 - 36) / 63);
            var4 = 0;
            L1: while (true) {
              if (var4 >= this.field_g.length) {
                break L0;
              } else {
                this.field_g[var4].field_a = 2;
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("pa.S(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    public static void g(int param0) {
        field_i = (bd[][]) null;
        if (param0 <= 118) {
            en var2 = (en) null;
            pa.a((byte) 6, (short[]) null, 99, (en) null);
        }
    }

    final static bd[] h(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = HostileSpawn.field_I ? 1 : 0;
        bd[] var1 = new bd[sc.field_c];
        for (var2 = 0; var2 < sc.field_c; var2++) {
            var3 = sf.field_X[var2] * hd.field_r[var2];
            var4 = ja.field_e[var2];
            var5 = new int[var3];
            for (var6 = 0; var6 < var3; var6++) {
                var5[var6] = bf.field_d[ua.a((int) var4[var6], 255)];
            }
            var1[var2] = new bd(ra.field_a, vc.field_e, th.field_Jb[var2], nh.field_O[var2], sf.field_X[var2], hd.field_r[var2], var5);
        }
        if (param0 != 14) {
            field_d = true;
        }
        uj.d(param0 + 101);
        return var1;
    }

    final void e(int param0) {
        oc[] var2;
        int var3;
        int var4;
        int var8;
        oc[] var9;
        oc[] var5;
        int var6;
        oc var7;
        int var10;
        var8 = HostileSpawn.field_I ? 1 : 0;
        var9 = new oc[5];
        var2 = var9;
        var9[0] = new oc(ln.field_a.field_v[2], ln.field_a.field_v[3]);
        var9[1] = new oc(ln.field_a.field_v[6], ln.field_a.field_v[7]);
        var9[2] = new oc(ln.field_a.field_v[8], ln.field_a.field_v[9]);
        var9[3] = new oc(ln.field_a.field_v[16], ln.field_a.field_v[17]);
        var9[4] = new oc(ln.field_a.field_v[18], ln.field_a.field_v[19]);
        this.field_m = new oj[5];
        var3 = 0;
        this.field_g = new v[this.field_m.length];
        var4 = 0;
        L0: while (true) {
          if (el.field_j <= var4) {
            ih.field_y = new oc[6];
            ih.field_y[0] = new oc(ln.field_a.field_v[0], ln.field_a.field_v[1]);
            ih.field_y[1] = new oc(ln.field_a.field_v[4], ln.field_a.field_v[5]);
            ih.field_y[2] = new oc(ln.field_a.field_v[10], ln.field_a.field_v[11]);
            ih.field_y[3] = new oc(ln.field_a.field_v[12], ln.field_a.field_v[13]);
            ih.field_y[4] = new oc(ln.field_a.field_v[14], ln.field_a.field_v[15]);
            ih.field_y[5] = new oc(ln.field_a.field_v[20], ln.field_a.field_v[21]);
            var10 = param0;
            var4 = var10;
            L1: while (true) {
              if (-6 >= (var10 ^ -1)) {
                kd.a(10, param0 ^ 1);
                nh.field_E.a(-1, 8360, -1);
                this.field_j = new v(re.field_B, 0, 0, 200, false);
                this.field_j.field_l = 0;
                this.field_k = new v(jj.field_h, 0, 0, 200, false);
                this.field_k.field_l = 0;
                this.field_f = new v(ta.field_lb, 0, 0, 200, false);
                this.field_f.field_l = ih.field_y[0].field_e * 24 - 100;
                this.field_f.field_d = ih.field_y[0].field_g * 24 - -60;
                this.field_e = new v(ab.field_d, 0, 0, 200, false);
                this.field_e.field_l = 0;
                return;
              } else {
                this.field_h[var10] = new we(ih.field_y[var10 + 1]);
                var10++;
                continue L1;
              }
            }
          } else {
            if (od.a(mm.field_m[var4].field_i, 1)) {
              var5 = var9;
              var6 = 0;
              L2: while (true) {
                if (var6 < var5.length) {
                  var7 = var5[var6];
                  if (-2 <= (nj.a(mm.field_m[var4].field_j, var7, -28835) ^ -1)) {
                    mm.field_m[var4].field_N = true;
                    this.field_m[var3] = mm.field_m[var4];
                    this.field_g[var3] = new v(ch.field_b, 0, 0);
                    var3++;
                    var4++;
                    continue L0;
                  } else {
                    var6++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final boolean b(int param0) {
        int var2;
        we[] var3;
        int var4;
        we var5;
        int var6;
        int stackIn_12_0 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var2 = -86 / ((param0 - 38) / 53);
        if (10 != ha.field_t) {
          L0: {
            if (of.field_d == dn.field_i) {
              stackIn_12_0 = 0;
              break L0;
            } else {
              stackIn_12_0 = 1;
              break L0;
            }
          }
          return stackIn_12_0 != 0;
        } else {
          if (100 < ng.field_u) {
            var3 = this.field_h;
            var4 = 0;
            L1: while (true) {
              if (var3.length <= var4) {
                return false;
              } else {
                var5 = var3[var4];
                if (-1 >= (var5.field_d.field_e ^ -1)) {
                  var5.a((byte) -46);
                  var4++;
                  continue L1;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final void d(int param0) {
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        double stackIn_23_0 = 0.0;
        double stackIn_24_0 = 0.0;
        int stackIn_24_1 = 0;
        oc var3;
        int var4;
        int var5;
        int var6;
        int var7_int;
        oj var7;
        double var8_double;
        int var8;
        double var10;
        int var12;
        oj var13;
        var12 = HostileSpawn.field_I ? 1 : 0;
        if (param0 == -1) {
          L0: {
            var13 = mm.field_m[0];
            var3 = var13.field_j;
            if ((ha.field_t ^ -1) == -11) {
              nh.field_E.a(-1, 8360, -1);
              var5 = 0;
              var6 = -1;
              var7_int = 1;
              L1: while (true) {
                if ((var7_int ^ -1) < -6) {
                  L2: {
                    if (var6 < 0) {
                      break L2;
                    } else {
                      L3: {
                        var7_int = 0;
                        var8_double = (double)(1 + ih.field_y[var6].field_e);
                        var10 = 0.5 + (double)ih.field_y[var6].field_g;
                        if ((var6 ^ -1) == -2) {
                          var10 = var10 + 0.5;
                          var7_int = 64;
                          var8_double = var8_double - 0.5;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        stackIn_23_0 = var8_double;

                        if (var5 == 0) {
                          stackIn_24_0 = stackIn_23_0;
                          stackIn_24_1 = 1;
                          break L4;
                        } else {
                          stackIn_24_0 = stackIn_23_0;
                          stackIn_24_1 = 0;
                          break L4;
                        }
                      }
                      ca.a(stackIn_24_0, stackIn_24_1, var10, true, var7_int);
                      ih.field_y[var6].field_e = -1;
                      break L2;
                    }
                  }
                  L5: {
                    if (uf.field_h) {
                      break L5;
                    } else {
                      var8 = 0;
                      L6: while (true) {
                        if (this.field_m.length <= var8) {
                          break L5;
                        } else {
                          var7 = this.field_m[var8];
                          if (var7.field_N) {
                            if (0 >= var7.field_I) {
                              var7.field_N = false;
                              var8++;
                              continue L6;
                            } else {
                              var4 = ih.a(var3, (byte) -115, var7.field_j);
                              if ((var4 ^ -1) > -5) {
                                L7: {
                                  if (rh.a(var7.field_i, true)) {
                                    L8: {
                                      if (var7.field_j.field_e < var3.field_e) {
                                        this.field_g[var8].field_l = -this.field_g[var8].field_m + -24 + var7.field_j.field_e * 24;
                                        break L8;
                                      } else {
                                        this.field_g[var8].field_l = 24 + 24 * var7.field_j.field_e;
                                        break L8;
                                      }
                                    }
                                    this.field_g[var8].field_d = -30 + var7.field_j.field_g * 24;
                                    break L7;
                                  } else {
                                    L9: {
                                      if (var7.field_j.field_g >= var3.field_g) {
                                        this.field_g[var8].field_d = 24 * var7.field_j.field_g - -this.field_g[var8].field_h;
                                        break L9;
                                      } else {
                                        this.field_g[var8].field_d = -this.field_g[var8].field_h + -24 + var7.field_j.field_g * 24;
                                        break L9;
                                      }
                                    }
                                    this.field_g[var8].field_l = var7.field_j.field_e * 24 - 100;
                                    break L7;
                                  }
                                }
                                this.field_g[var8].field_a = 1;
                                var8++;
                                continue L6;
                              } else {
                                var8++;
                                continue L6;
                              }
                            }
                          } else {
                            var8++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                  if (var5 == 0) {
                    if (of.field_d != dn.field_i) {
                      kd.a(0, 1);
                      nh.field_E.a((byte) 46, ih.field_y[0]);
                      this.field_k.field_d = -this.field_k.field_h + var3.field_g * 24 - 60;
                      this.field_k.field_l = 24 * var3.field_e + -100;
                      if (0 != this.field_j.field_l) {
                        break L0;
                      } else {
                        if (!uf.field_h) {
                          break L0;
                        } else {
                          this.field_j.field_d = var3.field_g * 24 + -100;
                          this.field_j.field_l = var3.field_e * 24;
                          break L0;
                        }
                      }
                    } else {
                      if (0 != this.field_j.field_l) {
                        break L0;
                      } else {
                        if (!uf.field_h) {
                          break L0;
                        } else {
                          this.field_j.field_d = var3.field_g * 24 + -100;
                          this.field_j.field_l = var3.field_e * 24;
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (0 != this.field_j.field_l) {
                      break L0;
                    } else {
                      if (!uf.field_h) {
                        break L0;
                      } else {
                        this.field_j.field_d = var3.field_g * 24 + -100;
                        this.field_j.field_l = var3.field_e * 24;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_12_0 = 0;

                  stackIn_12_1 = ih.field_y[var7_int].field_e;

                  if (stackIn_12_0 <= stackIn_12_1) {
                    var4 = ih.a(var3, (byte) -110, ih.field_y[var7_int]);
                    if ((var4 ^ -1) <= -3) {
                      var5 = 1;
                      var7_int++;
                      continue L1;
                    } else {
                      var6 = var7_int;
                      var7_int++;
                      continue L1;
                    }
                  } else {
                    var7_int++;
                    continue L1;
                  }
                }
              }
            } else {
              if (0 != this.field_j.field_l) {
                break L0;
              } else {
                if (!uf.field_h) {
                  break L0;
                } else {
                  this.field_j.field_d = var3.field_g * 24 + -100;
                  this.field_j.field_l = var3.field_e * 24;
                  break L0;
                }
              }
            }
          }
          L10: {
            if (this.field_e.field_l != 0) {
              break L10;
            } else {
              if (kh.field_Q[7]) {
                this.field_e.field_d = -180 + var3.field_g * 24;
                this.field_e.field_l = -60 + var3.field_e * 24;
                break L10;
              } else {
                break L10;
              }
            }
          }
          L11: {
            if (ha.field_t == 0) {
              super.d(-1);
              break L11;
            } else {
              break L11;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          if (!uf.field_h) {
            break L0;
          } else {
            var2 = id.field_A.a(bm.field_e[11]) + 10;
            si.a(100, 40, var2, 20, 0, 128);
            si.a(100, 40, var2, 20, 16776960);
            id.field_A.c(bm.field_e[11], 105, 55, 16776960, -1);
            break L0;
          }
        }
        L1: {
          if (-1 <= (this.field_j.field_l ^ -1)) {
            break L1;
          } else {
            if (!this.field_j.a((byte) -75)) {
              this.field_j.field_l = -1;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (0 < this.field_k.field_l) {
            if (!this.field_k.a((byte) -77)) {
              this.field_k.field_l = -1;
              break L2;
            } else {
              break L2;
            }
          } else {
            break L2;
          }
        }
        L3: {
          var2 = 84 / ((param0 - -48) / 38);
          if (ng.field_u <= 50) {
            break L3;
          } else {
            if (-1 > (this.field_f.field_l ^ -1)) {
              if (this.field_f.a((byte) -120)) {
                break L3;
              } else {
                this.field_f.field_l = -1;
                break L3;
              }
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (0 < this.field_e.field_l) {
            if (!this.field_e.a((byte) -118)) {
              this.field_e.field_l = -1;
              break L4;
            } else {
              break L4;
            }
          } else {
            var3 = 0;
            L5: while (true) {
              if (this.field_g.length <= var3) {
                break L4;
              } else {
                L6: {
                  if (-1 <= (this.field_m[var3].field_I ^ -1)) {
                    this.field_g[var3].field_a = 2;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if ((this.field_g[var3].field_a ^ -1) == -2) {
                  if (!this.field_g[var3].a((byte) -112)) {
                    this.field_g[var3].field_a = 0;
                    var3++;
                    continue L5;
                  } else {
                    var3++;
                    continue L5;
                  }
                } else {
                  var3++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    final static short[] a(byte param0, short[] param1, int param2, en param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4_int = param3.a(param2, true);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (var4_int != param1.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param1 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param3.a(4, true);
                var6 = (short)param3.a(16, true);
                if (-1 <= (var5 ^ -1)) {
                  var7 = 0;
                  L4: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param1[var7] = (short)var6;
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param1[var7] = (short)(var6 + param3.a(var5, true));
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              L6: {
                if (param0 == 87) {
                  break L6;
                } else {
                  pa.b((byte) 98, 124);
                  break L6;
                }
              }
              stackIn_18_0 = (short[]) (param1);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("pa.R(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        return stackIn_18_0;
    }

    final boolean a(oj param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -5) {
                break L1;
              } else {
                this.field_g = (v[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!param0.field_N) {
                  break L3;
                } else {
                  if (uf.field_h) {
                    break L3;
                  } else {
                    stackIn_6_0 = 1;
                    break L2;
                  }
                }
              }
              stackIn_6_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("pa.P(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final void c(int param0) {
        if (!(uf.field_h)) {
            ti.a(233, (byte) -120, 22);
        }
        if (param0 != 0) {
            this.e(-21);
        }
    }

    final static int b(byte param0, int param1) {
        param1 = ((-1431655766 & param1) >>> 1000466945) + (1431655765 & param1);
        param1 = (param1 >>> -1474261118 & -214748365) + (param1 & 858993459);
        param1 = 252645135 & param1 - -(param1 >>> -150439388);
        param1 = param1 + (param1 >>> -1226767512);
        param1 = param1 + (param1 >>> 1261232624);
        if (param0 != -19) {
            return -89;
        }
        return param1 & 255;
    }

    public pa() {
        this.field_h = new we[5];
    }

    static {
        field_d = false;
        field_l = 0;
    }
}
