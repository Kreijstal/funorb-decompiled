/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    static int field_h;
    private int[] field_c;
    static int field_a;
    static hl[] field_f;
    static int field_g;
    private int[] field_e;
    static char[] field_b;
    private byte[] field_i;
    static String field_d;

    final static ud a(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ud var3 = null;
        String var4 = null;
        int var5 = 0;
        Object stackIn_8_0 = null;
        ud stackIn_22_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0 == -32055) {
                break L1;
              } else {
                field_b = (char[]) null;
                break L1;
              }
            }
            if (sd.field_nb == null) {
              stackIn_8_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                var2 = cc.a((CharSequence) ((Object) param1), (byte) 118);
                if (var2 == null) {
                  var2 = param1;
                  break L2;
                } else {
                  break L2;
                }
              }
              var3 = (ud) ((Object) sd.field_nb.a((long)var2.hashCode(), 1));
              L3: while (true) {
                L4: {
                  L5: {
                    if (null == var3) {
                      break L5;
                    } else {
                      var4 = cc.a((CharSequence) ((Object) var3.field_Mb), (byte) 124);
                      stackIn_25_0 = null;

                      if (var5 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (stackIn_25_0 != var4) {
                            break L6;
                          } else {
                            var4 = var3.field_Mb;
                            break L6;
                          }
                        }
                        if (!var4.equals(var2)) {
                          var3 = (ud) ((Object) sd.field_nb.c(126));
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        } else {
                          stackIn_22_0 = (ud) (var3);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  stackIn_25_0 = null;
                  break L4;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2_ref = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var2_ref);

            stackIn_29_1 = new StringBuilder().append("fh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L7;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ud) ((Object) stackIn_8_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ud) ((Object) stackIn_25_0);
          } else {
            return stackIn_22_0;
          }
        }
    }

    final static int a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if ((param1 ^ -1) == -1) {
                var2_int = ik.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 79) {
              L2: {
                if (-2 == (param1 ^ -1)) {
                  var2_int = me.field_b;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if ((param1 ^ -1) == -3) {
                  var2_int = mc.field_f;
                  break L3;
                } else {
                  break L3;
                }
              }
              stackIn_16_0 = var2_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_6_0 = -50;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2), "fh.D(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_16_0;
        }
    }

    public static void a(byte param0) {
        try {
            field_b = null;
            field_d = null;
            field_f = null;
            if (param0 != -48) {
                fh.b((byte) -44);
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "fh.E(" + param0 + ')');
        }
    }

    final static void a(boolean param0) {
        try {
            vc.field_c = vc.field_c - 1;
            ra.a(sc.field_a[vc.field_c], gh.field_a[vc.field_c], hc.field_s[vc.field_c]);
            ra.field_j = qd.field_Y[vc.field_c];
            ra.field_l = ea.field_b[vc.field_c];
            ra.field_i = ca.field_f[vc.field_c];
            ra.field_g = ml.field_ib[vc.field_c];
            if (!param0) {
                field_f = (hl[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "fh.G(" + param0 + ')');
        }
    }

    final static String b(byte param0) {
        String stackIn_55_0 = null;
        Object stackIn_95_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        int var2 = 0;
        Object var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var2 = 55 % ((param0 - 21) / 59);
              var1 = null;
              var3 = null;
              if ((sf.field_d ^ -1) != -1) {
                break L1;
              } else {
                if (null == qe.field_a) {
                  break L1;
                } else {
                  var3 = dd.field_b;
                  break L1;
                }
              }
            }
            L2: {
              if (2 != sf.field_d) {
                break L2;
              } else {
                if (k.a(true)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (!oj.a(1, qj.field_a)) {
                        break L4;
                      } else {
                        var3 = sk.a(new String[]{ka.field_m}, sb.field_c, 119);
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var3 = sk.a(new String[]{ka.field_m}, tl.field_Z, 119);
                    break L3;
                  }
                  if (hi.field_a) {
                    fi.a(0, 0, (String) null, 2, (String) (var3), (String) null);
                    fk.e((byte) -8);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L5: {
              if (var3 != null) {
                break L5;
              } else {
                if (fi.field_Cb) {
                  break L5;
                } else {
                  if (null == gn.field_I) {
                    var3 = ad.field_Nb;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
            L6: {
              if (var3 != null) {
                nj.a((String) (var3), (byte) -48, (String) null, t.field_l, 0);
                break L6;
              } else {
                L7: {
                  var4 = ph.field_w;
                  var4 = rh.a(var4, -62);
                  var5 = "";
                  var6 = "|";
                  var7 = sf.field_d;
                  var8 = 0;
                  if ((var7 ^ -1) == -3) {
                    var5 = sk.a(new String[]{ka.field_m}, vd.field_b, 126);
                    var9 = sk.a(new String[]{var4}, mc.field_h, 119);
                    var8 = -485 + ba.field_L.field_Hb + (in.field_g.field_Hb - -we.field_k.b(var9)) + -we.field_k.b(var5);
                    if (0 <= var8) {
                      break L7;
                    } else {
                      var8 = 0;
                      break L7;
                    }
                  } else {
                    L8: {
                      if (var7 == 0) {
                        L9: {
                          if (qb.field_N != null) {
                            break L9;
                          } else {
                            if (!go.field_c) {
                              break L9;
                            } else {
                              var5 = "[" + nm.field_v + "] ";
                              break L9;
                            }
                          }
                        }
                        if (qb.field_N != null) {
                          L10: {
                            L11: {
                              if (!nh.field_Sb) {
                                break L11;
                              } else {
                                if (null == ec.field_h) {
                                  break L11;
                                } else {
                                  var5 = "[" + ec.field_h + "] ";
                                  if (var11 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            var5 = "[" + sk.a(new String[]{qb.field_N.field_ec}, qe.field_e, 126) + "] ";
                            break L10;
                          }
                          var7 = 1;
                          break L8;
                        } else {
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    L12: {
                      if (gg.b((byte) 87)) {
                        stackIn_55_0 = ": ";
                        break L12;
                      } else {
                        stackIn_55_0 = "<img=3>: ";
                        break L12;
                      }
                    }
                    L13: {
                      L14: {
                        var9 = stackIn_55_0;
                        var5 = var5 + var4 + var9;
                        if (!cd.field_a) {
                          break L14;
                        } else {
                          var5 = "<col=999999>" + var5 + dg.field_l + "</col>";
                          var6 = "";
                          if (var11 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      if (!fn.field_K) {
                        break L13;
                      } else {
                        var6 = "";
                        var5 = "<col=999999>" + var5 + bh.field_n + "</col>";
                        break L13;
                      }
                    }
                    L15: {
                      var10 = we.field_k.b(var5);
                      if (gg.b((byte) 87)) {
                        break L15;
                      } else {
                        L16: {
                          if (!in.field_g.field_Y) {
                            break L16;
                          } else {
                            if (aa.field_Nb - in.field_g.field_eb >= var10) {
                              break L16;
                            } else {
                              if (cd.field_a) {
                                var1 = "Broken!";
                                break L16;
                              } else {
                                var1 = bh.field_n;
                                break L16;
                              }
                            }
                          }
                        }
                        if ((in.field_g.field_F ^ -1) == -1) {
                          break L15;
                        } else {
                          if ((var10 ^ -1) < (in.field_g.field_Z ^ -1)) {
                            if (!cd.field_a) {
                              em.d(-20715);
                              break L15;
                            } else {
                              break L15;
                            }
                          } else {
                            break L15;
                          }
                        }
                      }
                    }
                    break L7;
                  }
                }
                L17: {
                  nj.a(var5 + jb.c(io.field_h.toString()), (byte) -48, var6, pg.field_f[var7], var8);
                  if (!cl.field_e) {
                    ba.field_L.field_Y = false;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (!ba.field_L.field_Y) {
                    break L18;
                  } else {
                    var1 = sk.a(new String[]{var4, ka.field_m}, eg.field_L, 126);
                    break L18;
                  }
                }
                break L6;
              }
            }
            stackIn_95_0 = var1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (var1), "fh.B(" + param0 + ')');
        }
        return (String) ((Object) stackIn_95_0);
    }

    final int a(byte[] param0, int param1, int param2, int param3, boolean param4, byte[] param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_95_0 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        StringBuilder stackIn_103_1 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_104_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TetraLink.field_J;
        try {
          L0: {
            if (param3 != 0) {
              if (!param4) {
                param3 = param3 + param1;
                var7_int = 0;
                var8 = param2;
                L1: while (true) {
                  L2: {
                    L3: {
                      var9 = param0[var8];
                      if (-1 < (var9 ^ -1)) {
                        break L3;
                      } else {
                        var7_int++;
                        if (var11 != 0) {
                          break L2;
                        } else {
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var7_int = this.field_c[var7_int];
                    break L2;
                  }
                  L4: {
                    L5: {
                      dupTemp$0 = this.field_c[var7_int];
                      var10 = dupTemp$0;
                      if (0 > dupTemp$0) {
                        L6: {
                          incrementValue$1 = param1;
                          param1++;
                          param5[incrementValue$1] = (byte)(var10 ^ -1);
                          if ((param3 ^ -1) < (param1 ^ -1)) {
                            break L6;
                          } else {
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var7_int = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L7: {
                      L8: {
                        if ((var9 & 64) == 0) {
                          break L8;
                        } else {
                          var7_int = this.field_c[var7_int];
                          if (var11 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var7_int++;
                      break L7;
                    }
                    L9: {
                      dupTemp$2 = this.field_c[var7_int];
                      var10 = dupTemp$2;
                      if (0 > dupTemp$2) {
                        L10: {
                          incrementValue$3 = param1;
                          param1++;
                          param5[incrementValue$3] = (byte)(var10 ^ -1);
                          if ((param1 ^ -1) > (param3 ^ -1)) {
                            break L10;
                          } else {
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var7_int = 0;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L11: {
                      L12: {
                        if ((32 & var9 ^ -1) == -1) {
                          break L12;
                        } else {
                          var7_int = this.field_c[var7_int];
                          if (var11 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var7_int++;
                      break L11;
                    }
                    L13: {
                      dupTemp$4 = this.field_c[var7_int];
                      var10 = dupTemp$4;
                      if (0 > dupTemp$4) {
                        incrementValue$5 = param1;
                        param1++;
                        param5[incrementValue$5] = (byte)(var10 ^ -1);
                        if ((param3 ^ -1) >= (param1 ^ -1)) {
                          break L4;
                        } else {
                          var7_int = 0;
                          break L13;
                        }
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      L15: {
                        if ((var9 & 16 ^ -1) == -1) {
                          break L15;
                        } else {
                          var7_int = this.field_c[var7_int];
                          if (var11 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      var7_int++;
                      break L14;
                    }
                    L16: {
                      dupTemp$6 = this.field_c[var7_int];
                      var10 = dupTemp$6;
                      if (dupTemp$6 < 0) {
                        incrementValue$7 = param1;
                        param1++;
                        param5[incrementValue$7] = (byte)(var10 ^ -1);
                        if (param3 <= param1) {
                          break L4;
                        } else {
                          var7_int = 0;
                          break L16;
                        }
                      } else {
                        break L16;
                      }
                    }
                    L17: {
                      L18: {
                        if (0 == (var9 & 8)) {
                          break L18;
                        } else {
                          var7_int = this.field_c[var7_int];
                          if (var11 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      var7_int++;
                      break L17;
                    }
                    L19: {
                      dupTemp$8 = this.field_c[var7_int];
                      var10 = dupTemp$8;
                      if ((dupTemp$8 ^ -1) > -1) {
                        L20: {
                          incrementValue$9 = param1;
                          param1++;
                          param5[incrementValue$9] = (byte)(var10 ^ -1);
                          if ((param3 ^ -1) < (param1 ^ -1)) {
                            break L20;
                          } else {
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L20;
                            }
                          }
                        }
                        var7_int = 0;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L21: {
                      L22: {
                        if ((var9 & 4 ^ -1) != -1) {
                          break L22;
                        } else {
                          var7_int++;
                          if (var11 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var7_int = this.field_c[var7_int];
                      break L21;
                    }
                    L23: {
                      dupTemp$10 = this.field_c[var7_int];
                      var10 = dupTemp$10;
                      if (dupTemp$10 >= 0) {
                        break L23;
                      } else {
                        incrementValue$11 = param1;
                        param1++;
                        param5[incrementValue$11] = (byte)(var10 ^ -1);
                        if (param3 <= param1) {
                          break L4;
                        } else {
                          var7_int = 0;
                          break L23;
                        }
                      }
                    }
                    L24: {
                      L25: {
                        if ((2 & var9 ^ -1) != -1) {
                          break L25;
                        } else {
                          var7_int++;
                          if (var11 == 0) {
                            break L24;
                          } else {
                            break L25;
                          }
                        }
                      }
                      var7_int = this.field_c[var7_int];
                      break L24;
                    }
                    L26: {
                      dupTemp$12 = this.field_c[var7_int];
                      var10 = dupTemp$12;
                      if (0 <= dupTemp$12) {
                        break L26;
                      } else {
                        incrementValue$13 = param1;
                        param1++;
                        param5[incrementValue$13] = (byte)(var10 ^ -1);
                        if (param3 <= param1) {
                          break L4;
                        } else {
                          var7_int = 0;
                          break L26;
                        }
                      }
                    }
                    L27: {
                      L28: {
                        if ((1 & var9 ^ -1) != -1) {
                          break L28;
                        } else {
                          var7_int++;
                          if (var11 == 0) {
                            break L27;
                          } else {
                            break L28;
                          }
                        }
                      }
                      var7_int = this.field_c[var7_int];
                      break L27;
                    }
                    L29: {
                      dupTemp$14 = this.field_c[var7_int];
                      var10 = dupTemp$14;
                      if ((dupTemp$14 ^ -1) > -1) {
                        L30: {
                          incrementValue$15 = param1;
                          param1++;
                          param5[incrementValue$15] = (byte)(var10 ^ -1);
                          if (param3 > param1) {
                            break L30;
                          } else {
                            if (var11 == 0) {
                              break L4;
                            } else {
                              break L30;
                            }
                          }
                        }
                        var7_int = 0;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    var8++;
                    if (var11 == 0) {
                      continue L1;
                    } else {
                      break L4;
                    }
                  }
                  stackIn_95_0 = -param2 + var8 + 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = -26;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var7 = decompiledCaughtException;
            stackIn_99_0 = (RuntimeException) (var7);

            stackIn_99_1 = new StringBuilder().append("fh.A(");

            if (param0 == null) {
              stackIn_100_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackIn_100_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackIn_100_2 = "null";
              break L31;
            } else {
              stackIn_100_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackIn_100_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackIn_100_2 = "{...}";
              break L31;
            }
          }
          L32: {


            stackIn_103_1 = ((StringBuilder) (Object) stackIn_100_1).append(stackIn_100_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackIn_104_2 = "null";
              break L32;
            } else {
              stackIn_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackIn_104_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackIn_104_2 = "{...}";
              break L32;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_100_0), stackIn_104_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_95_0;
          }
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3, byte[] param4, int param5) {
        int dupTemp$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = TetraLink.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = 0;
                        param3 = param3 + param0;
                        var8 = param1 << 1749695619;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0 >= param3) {
                            statePc = 24;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var9 = 255 & param2[param0];
                        var10 = this.field_e[var9];
                        var11 = this.field_i[var9];
                        stackIn_25_0 = -1;
                        stackIn_4_0 = stackIn_25_0;
                        stackIn_25_1 = var11 ^ -1;
                        stackIn_4_1 = stackIn_25_1;
                        if (var15 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 != stackIn_4_1) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw new RuntimeException("" + var9);
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var12 = var8 >> -91561213;
                        var13 = 7 & var8;
                        var7_int = var7_int & -var13 >> 42438143;
                        var14 = var12 + (var11 + var13 + -1 >> -1157900381);
                        var13 += 24;
                        dupTemp$0 = mc.a(var7_int, var10 >>> var13);
                        var7_int = dupTemp$0;
                        param4[var12] = (byte)dupTemp$0;
                        if (var12 >= var14) {
                            statePc = 23;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var12++;
                        var13 -= 8;
                        var7_int = var10 >>> var13;
                        param4[var12] = (byte)(var10 >>> var13);
                        if (var14 > var12) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var15 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 >>> var13;
                        param4[var12] = (byte)(var10 >>> var13);
                        if (var12 < var14) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var15 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 >>> var13;
                        param4[var12] = (byte)(var10 >>> var13);
                        if (var12 < var14) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var15 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var13 -= 8;
                        var12++;
                        var7_int = var10 << -var13;
                        param4[var12] = (byte)(var10 << -var13);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var8 = var8 + var11;
                        param0++;
                        if (var15 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = param5;
                        stackIn_25_1 = 28677;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 == stackIn_25_1) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        field_d = (String) null;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = (var8 + 7 >> 1032196995) + -param1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    return stackIn_29_0;
                }
                case 30: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_33_0 = (RuntimeException) (var7);
                    stackIn_31_0 = stackIn_33_0;
                    stackIn_33_1 = new StringBuilder().append("fh.F(").append(param0).append(',').append(param1).append(',');
                    stackIn_31_1 = stackIn_33_1;
                    if (param2 == null) {
                        statePc = 33;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackIn_34_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_34_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_34_2 = "{...}";
                    statePc = 34;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
                    stackIn_34_2 = "null";
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_35_0 = stackIn_37_0;
                    stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',').append(param3).append(',');
                    stackIn_35_1 = stackIn_37_1;
                    if (param4 == null) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_35_1);
                    stackIn_38_2 = "{...}";
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_38_2 = "null";
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    throw oi.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param5 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    fh(byte[] param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = TetraLink.field_J;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param0.length;
                        this.field_i = param0;
                        this.field_e = new int[var2_int];
                        this.field_c = new int[8];
                        var3 = new int[33];
                        var4 = 0;
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = var5 ^ -1;
                        stackIn_3_1 = var2_int ^ -1;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (stackIn_3_0 <= stackIn_3_1) {
                            statePc = 72;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = param0[var5];
                        if (var15 != 0) {
                            statePc = 72;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var6 ^ -1) == -1) {
                            statePc = 65;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var7 = 1 << 32 + -var6;
                        var8 = var3[var6];
                        this.field_e[var5] = var8;
                        if (0 != (var8 & var7)) {
                            statePc = 27;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = -1 + var6;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var10 < 1) {
                            statePc = 25;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var11 = var3[var10];
                        stackIn_26_0 = var11;
                        stackIn_12_0 = stackIn_26_0;
                        stackIn_26_1 = var8;
                        stackIn_12_1 = stackIn_26_1;
                        if (var15 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 != stackIn_12_1) {
                            statePc = 25;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var12 = 1 << -var10 + 32;
                        if (0 != (var12 & var11)) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var3[var10] = mc.a(var11, var12);
                        if (var15 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var3[var10] = var3[-1 + var10];
                        if (var15 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var10--;
                        if (var15 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = var7;
                        stackIn_26_1 = var8;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var9 = stackIn_26_0 | stackIn_26_1;
                        if (var15 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var9 = var3[-1 + var6];
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var3[var6] = var9;
                        var10 = var6 - -1;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (32 < var10) {
                            statePc = 35;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_3_0 = var8;
                        stackIn_31_0 = stackIn_3_0;
                        stackIn_3_1 = var3[var10];
                        stackIn_31_1 = stackIn_3_1;
                        if (var15 != 0) {
                            statePc = 3;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (stackIn_31_0 != stackIn_31_1) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var3[var10] = var9;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var10++;
                        if (var15 == 0) {
                            statePc = 29;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var10 = 0;
                        var11 = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var11 ^ -1) <= (var6 ^ -1)) {
                            statePc = 62;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var12 = -2147483648 >>> var11;
                        stackIn_63_0 = 0;
                        stackIn_38_0 = stackIn_63_0;
                        stackIn_63_1 = var12 & var8;
                        stackIn_38_1 = stackIn_63_1;
                        if (var15 != 0) {
                            statePc = 63;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 == stackIn_38_1) {
                            statePc = 48;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (0 == this.field_c[var10]) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        this.field_c[var10] = var4;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var10 = this.field_c[var10];
                        if (var15 == 0) {
                            statePc = 50;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var10++;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var12 = var12 >>> 1;
                        if (var10 >= this.field_c.length) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var13 = new int[2 * this.field_c.length];
                        var14 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (this.field_c.length <= var14) {
                            statePc = 59;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var13[var14] = this.field_c[var14];
                        var14++;
                        if (var15 != 0) {
                            statePc = 61;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (var15 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        this.field_c = var13;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var11++;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var15 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.field_c[var10] = var5 ^ -1;
                        stackIn_63_0 = var10;
                        stackIn_63_1 = var4;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (stackIn_63_0 < stackIn_63_1) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var4 = var10 + 1;
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var5++;
                        if (var15 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 67: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_70_0 = (RuntimeException) (var2);
                    stackIn_68_0 = stackIn_70_0;
                    stackIn_70_1 = new StringBuilder().append("fh.<init>(");
                    stackIn_68_1 = stackIn_70_1;
                    if (param0 == null) {
                        statePc = 70;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_68_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_68_1);
                    stackIn_71_2 = "{...}";
                    statePc = 71;
                    continue stateLoop;
                }
                case 70: {
                    stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
                    stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
                    stackIn_71_2 = "null";
                    statePc = 71;
                    continue stateLoop;
                }
                case 71: {
                    throw oi.a((Throwable) ((Object) stackIn_71_0), stackIn_71_2 + ')');
                }
                case 72: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_b = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_d = "Similar rating";
    }
}
