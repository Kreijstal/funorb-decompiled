/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static java.applet.Applet field_b;
    private ug[] field_j;
    private dc field_g;
    private java.math.BigInteger field_a;
    private kl field_c;
    static int field_f;
    private wb field_i;
    private java.math.BigInteger field_h;
    static int field_d;
    private wf field_e;

    final static String a(java.applet.Applet param0, byte param1) {
        try {
            RuntimeException var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_9_0 = null;
            String stackIn_15_0 = null;
            String stackIn_17_0 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            var8 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var9 = param0.getParameter("cookieprefix");
                      var3 = var9 + "settings";
                      if (param1 == -28) {
                        break L2;
                      } else {
                        pg.c(2);
                        break L2;
                      }
                    }
                    var4 = (String) (oa.a(true, param0, "getcookies"));
                    var5 = dc.a(var4, ';', (byte) -125);
                    var6 = 0;
                    L3: while (true) {
                      L4: {
                        if (var5.length <= var6) {
                          break L4;
                        } else {
                          var7 = var5[var6].indexOf('=');
                          if (var8 != 0) {
                            break L4;
                          } else {
                            L5: {
                              if (var7 < 0) {
                                break L5;
                              } else {
                                if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                                  break L5;
                                } else {
                                  stackIn_9_0 = var5[var6].substring(1 + var7).trim();
                                  decompiledRegionSelector0 = 1;
                                  break L1;
                                }
                              }
                            }
                            var6++;
                            if (var8 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var2_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L6;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (null == mb.field_a) {
                    stackIn_17_0 = param0.getParameter("settings");
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    stackIn_15_0 = mb.field_a;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector1 = 2;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_20_0 = (RuntimeException) (var2);

                stackIn_20_1 = new StringBuilder().append("pg.C(");

                if (param0 == null) {
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
              throw ld.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_17_0;
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

    final static void a(int param0) {
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        pb var3_ref_pb = null;
        int var3 = 0;
        int var4_int = 0;
        tg var4 = null;
        Object var5 = null;
        int var6 = 0;
        th var9 = null;
        byte[] var13 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                field_d = 66;
                break L1;
              }
            }
            L2: {
              L3: {
                var9 = ig.field_a;
                var2 = var9.d(true);
                if (0 != var2) {
                  break L3;
                } else {
                  var3_ref_pb = (pb) ((Object) tl.field_h.a(true));
                  if (var3_ref_pb == null) {
                    ck.b((byte) -116);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    L4: {
                      L5: {
                        var4_int = var9.d(true);
                        if (-1 == (var4_int ^ -1)) {
                          break L5;
                        } else {
                          var13 = new byte[var4_int];
                          var9.a(param0 + 89, var4_int, 0, var13);
                          if (var6 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var5 = null;
                      break L4;
                    }
                    var9.field_h = var9.field_h + 4;
                    if (!var9.c(4)) {
                      ck.b((byte) -112);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var3_ref_pb.b((byte) -127);
                      if (var6 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L6: {
                if (1 != var2) {
                  break L6;
                } else {
                  var3 = var9.d((byte) 19);
                  var4 = (tg) ((Object) bg.field_c.a(true));
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (var4 == null) {
                          break L9;
                        } else {
                          stackIn_25_0 = var4.field_k;

                          if (var6 != 0) {
                            break L8;
                          } else {
                            if (stackIn_25_0 == var3) {
                              break L9;
                            } else {
                              var4 = (tg) ((Object) bg.field_c.f(2));
                              if (var6 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                      if (var4 == null) {
                        stackIn_25_0 = -73;
                        break L8;
                      } else {
                        var4.b((byte) -128);
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                    }
                    ck.b((byte) stackIn_25_0);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
              uj.a("A1: " + qj.h(-100), (Throwable) null, 1);
              ck.b((byte) -46);
              break L2;
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "pg.D(" + param0 + ')');
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

    public static void c(int param0) {
        if (param0 != -8413) {
            field_d = 56;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(byte param0) {
        al.field_C = new ng();
        if (param0 < 75) {
            pg.c(-8);
        }
    }

    pg(wb param0, kl param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean b(int param0) {
        byte stackIn_19_0 = 0;
        byte stackIn_19_1 = 0;
        int var3;
        byte[] var4;
        byte[] var5;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        int var7;
        int var8;
        int var9;
        wf var11;
        byte[] var12;
        java.math.BigInteger var13;
        byte[] var14;
        byte[] var16;
        var9 = Lexicominos.field_L ? 1 : 0;
        if (null == this.field_e) {
          L0: {
            if (null != this.field_g) {
              break L0;
            } else {
              if (!this.field_i.e(20)) {
                this.field_g = this.field_i.a(5, 255, 255, (byte) 0, true);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (!this.field_g.field_v) {
            L1: {
              L2: {
                var11 = new wf(this.field_g.d((byte) 76));
                var11.field_h = 5;
                var3 = var11.d(true);
                var11.field_h = var11.field_h + var3 * 72;
                var14 = new byte[var11.field_j.length - var11.field_h];
                var12 = var14;
                var4 = var12;
                var11.a(107, var14.length, 0, var14);
                if (null == this.field_h) {
                  break L2;
                } else {
                  if (null == this.field_a) {
                    break L2;
                  } else {
                    var13 = new java.math.BigInteger(var14);
                    var7_ref_java_math_BigInteger = var13.modPow(this.field_h, this.field_a);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    if (var9 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (-66 == (var5.length ^ -1)) {
              var16 = si.a(5, var11.field_j, -86, -5 + var11.field_h - var14.length);
              var7 = 0;
              L3: while (true) {
                if (-65 < (var7 ^ -1)) {
                  stackIn_19_0 = var5[1 + var7];

                  stackIn_19_1 = var16[var7];

                  if (var9 == 0) {
                    if (stackIn_19_0 == stackIn_19_1) {
                      var7++;
                      if (var9 == 0) {
                        continue L3;
                      } else {
                        var8 = 102 % ((16 - param0) / 37);
                        this.field_j = new ug[var3];
                        this.field_e = var11;
                        return true;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    var8 = stackIn_19_0 % stackIn_19_1;
                    this.field_j = new ug[var3];
                    this.field_e = var11;
                    return true;
                  }
                } else {
                  var8 = 102 % ((16 - param0) / 37);
                  this.field_j = new ug[var3];
                  this.field_e = var11;
                  return true;
                }
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    private pg(wb param0, kl param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        RuntimeException runtimeException = null;
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
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_i = param0;
              this.field_h = param2;
              this.field_c = param1;
              this.field_a = param3;
              if (this.field_i.e(20)) {
                break L1;
              } else {
                this.field_g = this.field_i.a(5, 255, 255, (byte) 0, true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("pg.<init>(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
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

            if (param2 == null) {
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
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ')');
        }
    }

    final void d(int param0) {
        int var2;
        int var3;
        ug stackIn_25_0 = null;
        ug stackIn_28_0 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (null != this.field_j) {
          var2 = 0;
          L0: while (true) {
            L1: {
              L2: {
                L3: {
                  L4: {
                    if (this.field_j.length <= var2) {
                      break L4;
                    } else {
                      stackIn_28_0 = this.field_j[var2];

                      if (var3 != 0) {
                        L5: while (true) {
                          ((ug) (Object) stackIn_28_0).b(false);
                          L6: while (true) {
                            var2++;
                            if (var3 == 0) {
                              if (this.field_j.length > var2) {
                                if (var3 == 0) {
                                  if (null == this.field_j[var2]) {
                                    continue L6;
                                  } else {
                                    stackIn_28_0 = this.field_j[var2];
                                    continue L5;
                                  }
                                } else {
                                  break L2;
                                }
                              } else {
                                break L3;
                              }
                            } else {
                              break L1;
                            }
                          }
                        }
                      } else {
                        L7: {
                          if (stackIn_28_0 == null) {
                            break L7;
                          } else {
                            this.field_j[var2].b(param0 ^ -56);
                            break L7;
                          }
                        }
                        var2++;
                        if (var3 == 0) {
                          continue L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param0 == 72) {
                    var2 = 0;
                    L8: while (true) {
                      if (this.field_j.length > var2) {
                        if (var3 == 0) {
                          L9: {
                            if (null == this.field_j[var2]) {
                              break L9;
                            } else {
                              stackIn_25_0 = this.field_j[var2];
                              ((ug) (Object) stackIn_25_0).b(false);
                              break L9;
                            }
                          }
                          var2++;
                          if (var3 == 0) {
                            continue L8;
                          } else {
                            break L1;
                          }
                        } else {
                          break L2;
                        }
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    this.d(-43);
                    var2 = 0;
                    L10: while (true) {
                      if (this.field_j.length > var2) {
                        if (var3 == 0) {
                          L11: {
                            if (null == this.field_j[var2]) {
                              break L11;
                            } else {
                              this.field_j[var2].b(false);
                              break L11;
                            }
                          }
                          var2++;
                          if (var3 == 0) {
                            continue L10;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                return;
              }
              return;
            }
            return;
          }
        } else {
          return;
        }
    }

    final ug a(int param0, int param1, dl param2, dl param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ug var9 = null;
        byte[] var13 = null;
        ug stackIn_9_0 = null;
        ug stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_e == null) {
              throw new RuntimeException();
            } else {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (param0 >= this.field_j.length) {
                    break L1;
                  } else {
                    if (this.field_j[param0] == null) {
                      L2: {
                        this.field_e.field_h = 6 + param0 * 72;
                        var6_int = this.field_e.d((byte) 19);
                        var7 = this.field_e.d((byte) 19);
                        if (param1 == 3510) {
                          break L2;
                        } else {
                          pg.a(55);
                          break L2;
                        }
                      }
                      var13 = new byte[64];
                      this.field_e.a(106, 64, 0, var13);
                      var9 = new ug(param0, param2, param3, this.field_i, this.field_c, var6_int, var13, var7, param4);
                      this.field_j[param0] = var9;
                      stackIn_13_0 = (ug) (var9);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      stackIn_9_0 = this.field_j[param0];
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var6);

            stackIn_16_1 = new StringBuilder().append("pg.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_13_0;
        }
    }

    static {
        field_f = 0;
        field_d = -1;
    }
}
