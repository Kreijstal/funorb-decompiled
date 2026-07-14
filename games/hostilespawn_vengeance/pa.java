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
            Object var3 = null;
            boolean discarded$0 = ((pa) this).a((oj) null, (byte) 32);
        }
        if (-11 == (ha.field_t ^ -1)) {
            return ac.field_f;
        }
        return aa.field_c;
    }

    final static void a(p param0, int param1, int[] param2, boolean param3) {
        double var4 = 0.0;
        int var6 = 0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        double var16 = 0.0;
        double var18 = 0.0;
        oj var20 = null;
        double var21 = 0.0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        double var29 = 0.0;
        double var31 = 0.0;
        double var33 = 0.0;
        int var35 = 0;
        p var36 = null;
        int var36_int = 0;
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
        Object var54 = null;
        Object var55 = null;
        oj var56 = null;
        p var57 = null;
        int stackIn_9_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_76_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        L0: {
          var53 = HostileSpawn.field_I ? 1 : 0;
          if (!param3) {
            break L0;
          } else {
            var54 = null;
            pa.a((p) null, -67, (int[]) null, true);
            break L0;
          }
        }
        L1: {
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
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_9_0 = stackOut_6_0;
                    break L3;
                  }
                } else {
                  stackOut_4_0 = 1;
                  stackIn_9_0 = stackOut_4_0;
                  break L3;
                }
              }
              var15 = stackIn_9_0;
              param2[param1] = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    var14++;
                    param0.field_l.a(2, (byte) 94, param0.field_c);
                    param0.a(8573);
                    if (param2[param0.field_j.b(-4)] == 2) {
                      break L6;
                    } else {
                      if (18 != param0.field_i) {
                        break L5;
                      } else {
                        if (var14 >= 70) {
                          param0.field_i = -1;
                          param0.field_e = 1;
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  L7: {
                    var13 = 1;
                    param0.field_e = 1;
                    if (param0.field_i == 32) {
                      break L7;
                    } else {
                      param0.field_i = 33;
                      param0.field_c = (double)di.a(var11, 124, var9, param0.field_c);
                      if (0 == 0) {
                        break L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param0.field_i = -1;
                  break L5;
                }
                L8: {
                  if (-1 != (param0.field_e ^ -1)) {
                    break L8;
                  } else {
                    if (var15 == 0) {
                      continue L4;
                    } else {
                      if (10 > var14) {
                        continue L4;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                L9: {
                  param2[param1] = 3;
                  var16 = (double)param0.field_j.field_e + param0.field_l.field_f;
                  var18 = (double)param0.field_j.field_g + param0.field_l.field_a;
                  if (var13 == 0) {
                    break L9;
                  } else {
                    var18 = 0.5 + ((double)param0.field_j.field_g + param0.field_l.field_a);
                    var16 = (double)param0.field_j.field_e + param0.field_l.field_f + 0.5;
                    break L9;
                  }
                }
                var20 = null;
                var21 = (-var18 + var11) * (-var18 + var11) + (var9 - var16) * (-var16 + var9);
                var35 = 1;
                L10: while (true) {
                  L11: {
                    if (var35 >= rc.field_e) {
                      break L11;
                    } else {
                      L12: {
                        var56 = re.field_n[var35];
                        var20 = var56;
                        var20 = var56;
                        var37 = var56.field_i;
                        if ((var56.field_I ^ -1) >= -1) {
                          break L12;
                        } else {
                          L13: {
                            if (var37 < 10) {
                              break L13;
                            } else {
                              if (var37 < 18) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          L14: {
                            var38 = 1.0;
                            var40 = 1.0;
                            if (var37 == 20) {
                              var40 = 0.5;
                              var38 = 0.5;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          L15: {
                            L16: {
                              if (var37 == 10) {
                                break L16;
                              } else {
                                if (var37 == 129) {
                                  break L16;
                                } else {
                                  if (131 == var37) {
                                    break L16;
                                  } else {
                                    if (var37 == 133) {
                                      break L16;
                                    } else {
                                      if (var37 == 11) {
                                        break L16;
                                      } else {
                                        if (var37 == 129) {
                                          break L16;
                                        } else {
                                          if (var37 == 131) {
                                            break L16;
                                          } else {
                                            if (var37 != 133) {
                                              break L15;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L17: {
                              if (var56.field_h != 0) {
                                break L17;
                              } else {
                                if (0 == 0) {
                                  break L12;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            var40 = 0.5;
                            break L15;
                          }
                          L18: {
                            L19: {
                              var31 = var56.field_l.field_f + (double)var56.field_j.field_e;
                              var33 = (double)var56.field_j.field_g + var56.field_l.field_a;
                              if (var37 == 24) {
                                break L19;
                              } else {
                                if (var37 == 4) {
                                  break L19;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            var33 = var33 + 1.0;
                            var31 = var31 + 1.0;
                            break L18;
                          }
                          L20: {
                            L21: {
                              var25 = -var40 + var33;
                              var29 = var33 + var40;
                              var23 = var31 - var38;
                              var27 = var31 + var38;
                              var42 = 0;
                              if (var56.field_u == null) {
                                break L21;
                              } else {
                                var43 = -var9 + var16;
                                var45 = var18 - var11;
                                var47 = -(var56.field_u.field_z >> -37191999) + (int)(var31 * 24.0);
                                var48 = -(var56.field_u.field_A >> -926290463) + (int)(var33 * 24.0);
                                var49 = 0.0;
                                L22: while (true) {
                                  L23: {
                                    if (1.0 <= var49) {
                                      break L23;
                                    } else {
                                      if (var42 != 0) {
                                        break L23;
                                      } else {
                                        L24: {
                                          var51 = (int)(24.0 * (var9 + var43 * var49));
                                          var52 = (int)((var49 * var45 + var11) * 24.0);
                                          if (!var56.field_u.d(var47, var48, var51, var52)) {
                                            stackOut_55_0 = 0;
                                            stackIn_56_0 = stackOut_55_0;
                                            break L24;
                                          } else {
                                            stackOut_54_0 = 1;
                                            stackIn_56_0 = stackOut_54_0;
                                            break L24;
                                          }
                                        }
                                        L25: {
                                          var42 = stackIn_56_0;
                                          if (var42 == 0) {
                                            break L25;
                                          } else {
                                            var9 = var9 + var43 * var49;
                                            var11 = var11 + var45 * var49;
                                            break L25;
                                          }
                                        }
                                        var49 = var49 + 0.05;
                                        if (0 == 0) {
                                          continue L22;
                                        } else {
                                          break L23;
                                        }
                                      }
                                    }
                                  }
                                  if (0 == 0) {
                                    break L20;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                            L26: {
                              if (!fb.a(var25, (byte) 43, var29, var16, var23, var11, var27, var18, var9)) {
                                if (fb.a(var29, (byte) 43, var25, var16, var23, var11, var27, var18, var9)) {
                                  stackOut_64_0 = 1;
                                  stackIn_66_0 = stackOut_64_0;
                                  break L26;
                                } else {
                                  stackOut_63_0 = 0;
                                  stackIn_66_0 = stackOut_63_0;
                                  break L26;
                                }
                              } else {
                                stackOut_61_0 = 1;
                                stackIn_66_0 = stackOut_61_0;
                                break L26;
                              }
                            }
                            var42 = stackIn_66_0;
                            break L20;
                          }
                          if (var42 != 0) {
                            var4 = (-var31 + var9) * (-var31 + var9) + (-var33 + var11) * (var11 - var33);
                            if (var21 <= var4) {
                              break L12;
                            } else {
                              var20 = var56;
                              var21 = var4;
                              break L12;
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                      var35++;
                      if (0 == 0) {
                        continue L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L27: {
                    if (var20 == null) {
                      break L27;
                    } else {
                      L28: {
                        if ((var20.field_I ^ -1) >= -1) {
                          stackOut_75_0 = 0;
                          stackIn_76_0 = stackOut_75_0;
                          break L28;
                        } else {
                          stackOut_74_0 = 1;
                          stackIn_76_0 = stackOut_74_0;
                          break L28;
                        }
                      }
                      L29: {
                        var35 = stackIn_76_0;
                        if (var20.a(var6, -125)) {
                          L30: {
                            if (var20.field_i == 5) {
                              break L30;
                            } else {
                              if ((var20.field_i ^ -1) != -23) {
                                L31: {
                                  L32: {
                                    L33: {
                                      L34: {
                                        L35: {
                                          var36_int = var6;
                                          if (18 == var36_int) {
                                            break L35;
                                          } else {
                                            L36: {
                                              if (var36_int != 23) {
                                                break L36;
                                              } else {
                                                if (0 == 0) {
                                                  break L34;
                                                } else {
                                                  break L36;
                                                }
                                              }
                                            }
                                            if (var36_int != 20) {
                                              break L32;
                                            } else {
                                              if (0 == 0) {
                                                break L33;
                                              } else {
                                                break L35;
                                              }
                                            }
                                          }
                                        }
                                        var20.field_K = var7;
                                        var20.field_I = var20.field_I - 4;
                                        var20.field_t = 5;
                                        if (0 == 0) {
                                          break L31;
                                        } else {
                                          break L34;
                                        }
                                      }
                                      var20.field_I = var20.field_I - 8;
                                      u.a(17, param0.field_j, true, 16, param0.field_l, 4);
                                      if (0 == 0) {
                                        break L31;
                                      } else {
                                        break L33;
                                      }
                                    }
                                    var20.field_I = var20.field_I - 2;
                                    if (0 == 0) {
                                      break L31;
                                    } else {
                                      break L32;
                                    }
                                  }
                                  var20.field_I = var20.field_I - 1;
                                  break L31;
                                }
                                if (!var20.field_b) {
                                  break L30;
                                } else {
                                  if ((var20.field_I ^ -1) < -1) {
                                    tk.a(8, jc.field_c, 1, true);
                                    break L30;
                                  } else {
                                    break L30;
                                  }
                                }
                              } else {
                                break L30;
                              }
                            }
                          }
                          if (var20.field_b) {
                            ib.field_c = ib.field_c + 1;
                            var57 = jn.field_F[ib.field_c];
                            var36 = var57;
                            var36.field_i = 36;
                            var57.field_j.a((byte) 46, var20.field_j);
                            var57.field_l.a(var20.field_l, -28860);
                            var57.field_l.field_a = var57.field_l.field_a - 0.5;
                            var57.field_l.field_f = var57.field_l.field_f - 0.5;
                            var36.field_c = var7;
                            if ((var20.field_i ^ -1) == -5) {
                              var57.field_l.field_a = var57.field_l.field_a + 1.0;
                              var57.field_l.field_f = var57.field_l.field_f + 1.0;
                              var57.field_l.a(15, (byte) 94, var7);
                              var57.a(8573);
                              var36.field_e = 8;
                              var20.field_F = 255;
                              param0.field_e = 1;
                              if (0 <= var20.field_I) {
                                break L29;
                              } else {
                                var20.field_I = 0;
                                break L29;
                              }
                            } else {
                              if (var20.field_i != 24) {
                                var57.field_l.a(15, (byte) 94, var7);
                                var57.a(8573);
                                var36.field_e = 8;
                                var20.field_F = 255;
                                param0.field_e = 1;
                                if (0 <= var20.field_I) {
                                  break L29;
                                } else {
                                  var20.field_I = 0;
                                  break L29;
                                }
                              } else {
                                var57.field_l.field_a = var57.field_l.field_a + 1.0;
                                var57.field_l.field_f = var57.field_l.field_f + 1.0;
                                var57.field_l.a(15, (byte) 94, var7);
                                var57.a(8573);
                                var36.field_e = 8;
                                var20.field_F = 255;
                                param0.field_e = 1;
                                if (0 <= var20.field_I) {
                                  break L29;
                                } else {
                                  var20.field_I = 0;
                                  break L29;
                                }
                              }
                            }
                          } else {
                            var20.field_F = 255;
                            param0.field_e = 1;
                            if (0 <= var20.field_I) {
                              break L29;
                            } else {
                              var20.field_I = 0;
                              break L29;
                            }
                          }
                        } else {
                          var20.field_F = 255;
                          param0.field_e = 1;
                          if (0 <= var20.field_I) {
                            break L29;
                          } else {
                            var20.field_I = 0;
                            break L29;
                          }
                        }
                      }
                      L37: {
                        L38: {
                          if (null != var20.field_u) {
                            break L38;
                          } else {
                            param0.b((byte) 117);
                            param0.field_c = 255.0 * Math.random();
                            param0.field_j.field_g = var20.field_j.field_g;
                            param0.field_j.field_e = var20.field_j.field_e;
                            param0.field_l.field_f = -0.5 + (var20.field_l.field_f + Math.random());
                            param0.field_l.field_a = var20.field_l.field_a + Math.random() - 0.5;
                            if (0 == 0) {
                              break L37;
                            } else {
                              break L38;
                            }
                          }
                        }
                        param0.field_l.field_f = var9 - (double)(int)var9;
                        param0.field_l.field_a = var11 - (double)(int)var11;
                        param0.field_j.field_g = (int)var11;
                        param0.field_j.field_e = (int)var9;
                        param0.field_l.b(var21 * 2.0, param0.field_c, 105);
                        break L37;
                      }
                      L39: {
                        if (-1 <= (var20.field_I ^ -1)) {
                          L40: {
                            if (!var20.field_b) {
                              break L40;
                            } else {
                              if (var35 == 0) {
                                break L40;
                              } else {
                                if (var20.field_i == 27) {
                                  break L40;
                                } else {
                                  if (var6 == 18) {
                                    al.field_U[0] = al.field_U[0] + 1;
                                    if (al.field_U[0] + 1 == 30) {
                                      ti.a(250, (byte) -123, 5);
                                      break L40;
                                    } else {
                                      break L40;
                                    }
                                  } else {
                                    al.field_U[5] = al.field_U[5] + 1;
                                    if (0 == 0) {
                                      break L40;
                                    } else {
                                      if (param0.field_e <= 0) {
                                        break L1;
                                      } else {
                                        param0.field_e = param0.field_e + 1;
                                        break L1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L41: {
                            param0.field_i = 3;
                            nh.a(var20, -29966);
                            if (-6 == (var20.field_i ^ -1)) {
                              break L41;
                            } else {
                              if (var20.b(6)) {
                                break L41;
                              } else {
                                if (var20.field_i == 22) {
                                  break L41;
                                } else {
                                  if (0 == 0) {
                                    break L2;
                                  } else {
                                    var55 = null;
                                    nh.a((oj) null, -29966);
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                          if (uj.field_l != 1) {
                            break L39;
                          } else {
                            eh.field_c.a(lm.field_A[11], 100, uh.field_i);
                            if (0 == 0) {
                              break L2;
                            } else {
                              var55 = null;
                              nh.a((oj) null, -29966);
                              break L2;
                            }
                          }
                        } else {
                          if (uj.field_l != 1) {
                            break L39;
                          } else {
                            eh.field_c.a(lm.field_A[11], 100, uh.field_i);
                            if (0 == 0) {
                              break L2;
                            } else {
                              var55 = null;
                              nh.a((oj) null, -29966);
                              break L2;
                            }
                          }
                        }
                      }
                      if (0 == 0) {
                        break L2;
                      } else {
                        break L27;
                      }
                    }
                  }
                  var55 = null;
                  nh.a((oj) null, -29966);
                  break L2;
                }
              }
            }
          }
          if (param0.field_e <= 0) {
            break L1;
          } else {
            param0.field_e = param0.field_e + 1;
            break L1;
          }
        }
        L42: {
          if ((param0.field_e ^ -1) < -33) {
            param0.field_i = -1;
            break L42;
          } else {
            break L42;
          }
        }
    }

    final void a(int param0, p param1) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        int var3 = -113 % ((param0 - 36) / 63);
        for (var4 = 0; var4 < ((pa) this).field_g.length; var4++) {
            ((pa) this).field_g[var4].field_a = 2;
        }
    }

    public static void g(int param0) {
        field_i = null;
        if (param0 <= 118) {
            Object var2 = null;
            short[] discarded$0 = pa.a((byte) 6, (short[]) null, 99, (en) null);
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
        oc[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        oc[] var5 = null;
        int var6 = 0;
        oc var7 = null;
        int var8 = 0;
        oc[] var9 = null;
        int var10 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        var9 = new oc[5];
        var2 = var9;
        var9[0] = new oc(ln.field_a.field_v[2], ln.field_a.field_v[3]);
        var9[1] = new oc(ln.field_a.field_v[6], ln.field_a.field_v[7]);
        var9[2] = new oc(ln.field_a.field_v[8], ln.field_a.field_v[9]);
        var9[3] = new oc(ln.field_a.field_v[16], ln.field_a.field_v[17]);
        var9[4] = new oc(ln.field_a.field_v[18], ln.field_a.field_v[19]);
        ((pa) this).field_m = new oj[5];
        var3 = 0;
        ((pa) this).field_g = new v[((pa) this).field_m.length];
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
                ((pa) this).field_j = new v(re.field_B, 0, 0, 200, false);
                ((pa) this).field_j.field_l = 0;
                ((pa) this).field_k = new v(jj.field_h, 0, 0, 200, false);
                ((pa) this).field_k.field_l = 0;
                ((pa) this).field_f = new v(ta.field_lb, 0, 0, 200, false);
                ((pa) this).field_f.field_l = ih.field_y[0].field_e * 24 - 100;
                ((pa) this).field_f.field_d = ih.field_y[0].field_g * 24 - -60;
                ((pa) this).field_e = new v(ab.field_d, 0, 0, 200, false);
                ((pa) this).field_e.field_l = 0;
                return;
              } else {
                ((pa) this).field_h[var10] = new we(ih.field_y[var10 + 1]);
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
                    ((pa) this).field_m[var3] = mm.field_m[var4];
                    ((pa) this).field_g[var3] = new v(ch.field_b, 0, 0);
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
        int var2 = 0;
        we[] var3 = null;
        int var4 = 0;
        we var5 = null;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var2 = -86 / ((param0 - 38) / 53);
        if (10 != ha.field_t) {
          L0: {
            if (of.field_d == dn.field_i) {
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L0;
            }
          }
          return stackIn_12_0 != 0;
        } else {
          if (100 < ng.field_u) {
            var3 = ((pa) this).field_h;
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
        oc var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        oj var7 = null;
        double var8_double = 0.0;
        int var8 = 0;
        double var10 = 0.0;
        int var12 = 0;
        oj var13 = null;
        double stackIn_18_0 = 0.0;
        double stackIn_19_0 = 0.0;
        double stackIn_20_0 = 0.0;
        int stackIn_20_1 = 0;
        double stackOut_17_0 = 0.0;
        double stackOut_19_0 = 0.0;
        int stackOut_19_1 = 0;
        double stackOut_18_0 = 0.0;
        int stackOut_18_1 = 0;
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
                        stackOut_17_0 = var8_double;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var5 == 0) {
                          stackOut_19_0 = stackIn_19_0;
                          stackOut_19_1 = 1;
                          stackIn_20_0 = stackOut_19_0;
                          stackIn_20_1 = stackOut_19_1;
                          break L4;
                        } else {
                          stackOut_18_0 = stackIn_18_0;
                          stackOut_18_1 = 0;
                          stackIn_20_0 = stackOut_18_0;
                          stackIn_20_1 = stackOut_18_1;
                          break L4;
                        }
                      }
                      ca.a(stackIn_20_0, stackIn_20_1, var10, true, var7_int);
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
                        if (((pa) this).field_m.length <= var8) {
                          break L5;
                        } else {
                          var7 = ((pa) this).field_m[var8];
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
                                        ((pa) this).field_g[var8].field_l = -((pa) this).field_g[var8].field_m + -24 + var7.field_j.field_e * 24;
                                        break L8;
                                      } else {
                                        ((pa) this).field_g[var8].field_l = 24 + 24 * var7.field_j.field_e;
                                        break L8;
                                      }
                                    }
                                    ((pa) this).field_g[var8].field_d = -30 + var7.field_j.field_g * 24;
                                    break L7;
                                  } else {
                                    L9: {
                                      if (var7.field_j.field_g >= var3.field_g) {
                                        ((pa) this).field_g[var8].field_d = 24 * var7.field_j.field_g - -((pa) this).field_g[var8].field_h;
                                        break L9;
                                      } else {
                                        ((pa) this).field_g[var8].field_d = -((pa) this).field_g[var8].field_h + -24 + var7.field_j.field_g * 24;
                                        break L9;
                                      }
                                    }
                                    ((pa) this).field_g[var8].field_l = var7.field_j.field_e * 24 - 100;
                                    break L7;
                                  }
                                }
                                ((pa) this).field_g[var8].field_a = 1;
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
                      ((pa) this).field_k.field_d = -((pa) this).field_k.field_h + var3.field_g * 24 - 60;
                      ((pa) this).field_k.field_l = 24 * var3.field_e + -100;
                      if (0 != ((pa) this).field_j.field_l) {
                        break L0;
                      } else {
                        if (!uf.field_h) {
                          break L0;
                        } else {
                          ((pa) this).field_j.field_d = var3.field_g * 24 + -100;
                          ((pa) this).field_j.field_l = var3.field_e * 24;
                          break L0;
                        }
                      }
                    } else {
                      if (0 != ((pa) this).field_j.field_l) {
                        break L0;
                      } else {
                        if (!uf.field_h) {
                          break L0;
                        } else {
                          ((pa) this).field_j.field_d = var3.field_g * 24 + -100;
                          ((pa) this).field_j.field_l = var3.field_e * 24;
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (0 != ((pa) this).field_j.field_l) {
                      break L0;
                    } else {
                      if (!uf.field_h) {
                        break L0;
                      } else {
                        ((pa) this).field_j.field_d = var3.field_g * 24 + -100;
                        ((pa) this).field_j.field_l = var3.field_e * 24;
                        break L0;
                      }
                    }
                  }
                } else {
                  if (0 <= ih.field_y[var7_int].field_e) {
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
              if (0 != ((pa) this).field_j.field_l) {
                break L0;
              } else {
                if (!uf.field_h) {
                  break L0;
                } else {
                  ((pa) this).field_j.field_d = var3.field_g * 24 + -100;
                  ((pa) this).field_j.field_l = var3.field_e * 24;
                  break L0;
                }
              }
            }
          }
          L10: {
            if (((pa) this).field_e.field_l != 0) {
              break L10;
            } else {
              if (kh.field_Q[7]) {
                ((pa) this).field_e.field_d = -180 + var3.field_g * 24;
                ((pa) this).field_e.field_l = -60 + var3.field_e * 24;
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
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
          if (-1 <= (((pa) this).field_j.field_l ^ -1)) {
            break L1;
          } else {
            if (!((pa) this).field_j.a((byte) -75)) {
              ((pa) this).field_j.field_l = -1;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (0 < ((pa) this).field_k.field_l) {
            if (!((pa) this).field_k.a((byte) -77)) {
              ((pa) this).field_k.field_l = -1;
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
            if (-1 > (((pa) this).field_f.field_l ^ -1)) {
              if (((pa) this).field_f.a((byte) -120)) {
                break L3;
              } else {
                ((pa) this).field_f.field_l = -1;
                break L3;
              }
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (0 < ((pa) this).field_e.field_l) {
            if (!((pa) this).field_e.a((byte) -118)) {
              ((pa) this).field_e.field_l = -1;
              break L4;
            } else {
              break L4;
            }
          } else {
            var3 = 0;
            L5: while (true) {
              if (((pa) this).field_g.length <= var3) {
                break L4;
              } else {
                L6: {
                  if (-1 <= (((pa) this).field_m[var3].field_I ^ -1)) {
                    ((pa) this).field_g[var3].field_a = 2;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if ((((pa) this).field_g[var3].field_a ^ -1) == -2) {
                  if (!((pa) this).field_g[var3].a((byte) -112)) {
                    ((pa) this).field_g[var3].field_a = 0;
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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        var4 = param3.a(param2, true);
        if (var4 != 0) {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (var4 != param1.length) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            param1 = new short[var4];
            break L0;
          }
          L2: {
            var5 = param3.a(4, true);
            var6 = (short)param3.a(16, true);
            if (-1 <= (var5 ^ -1)) {
              var7 = 0;
              L3: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param1[var7] = (short)var6;
                  var7++;
                  continue L3;
                }
              }
            } else {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L2;
                } else {
                  param1[var7] = (short)(var6 + param3.a(var5, true));
                  var7++;
                  continue L4;
                }
              }
            }
          }
          L5: {
            if (param0 == 87) {
              break L5;
            } else {
              int discarded$1 = pa.b((byte) 98, 124);
              break L5;
            }
          }
          return param1;
        } else {
          return null;
        }
    }

    final boolean a(oj param0, byte param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 == -5) {
            break L0;
          } else {
            ((pa) this).field_g = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!param0.field_N) {
              break L2;
            } else {
              if (uf.field_h) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void c(int param0) {
        if (!(uf.field_h)) {
            ti.a(233, (byte) -120, 22);
        }
        if (param0 != 0) {
            ((pa) this).e(-21);
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
        ((pa) this).field_h = new we[5];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = false;
        field_l = 0;
    }
}
