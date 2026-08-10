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
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_8_0 = null;
            String stackIn_14_0 = null;
            String stackIn_16_0 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
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
                      if (var5.length <= var6) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          var7 = var5[var6].indexOf('=');
                          if (var7 < 0) {
                            break L4;
                          } else {
                            if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                              break L4;
                            } else {
                              stackIn_8_0 = var5[var6].substring(1 + var7).trim();
                              decompiledRegionSelector0 = 1;
                              break L1;
                            }
                          }
                        }
                        var6++;
                        continue L3;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (null == mb.field_a) {
                    stackIn_16_0 = param0.getParameter("settings");
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    stackIn_14_0 = mb.field_a;
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
              L6: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_19_0 = (RuntimeException) (var2_ref);

                stackIn_19_1 = new StringBuilder().append("pg.C(");

                if (param0 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L6;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L6;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_16_0;
              } else {
                return stackIn_8_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        pb var3_ref_pb = null;
        tg var4 = null;
        int var4_int = 0;
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
            var9 = ig.field_a;
            var2 = var9.d(true);
            if (0 != var2) {
              if (1 != var2) {
                uj.a("A1: " + qj.h(-100), (Throwable) null, 1);
                ck.b((byte) -46);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                var3 = var9.d((byte) 19);
                var4 = (tg) ((Object) bg.field_c.a(true));
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (var4.field_k == var3) {
                        break L3;
                      } else {
                        var4 = (tg) ((Object) bg.field_c.f(2));
                        continue L2;
                      }
                    }
                  }
                  if (var4 == null) {
                    ck.b((byte) -73);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var4.b((byte) -128);
                    return;
                  }
                }
              }
            } else {
              var3_ref_pb = (pb) ((Object) tl.field_h.a(true));
              if (var3_ref_pb == null) {
                ck.b((byte) -116);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L4: {
                  var4_int = var9.d(true);
                  if (-1 == (var4_int ^ -1)) {
                    var5 = null;
                    break L4;
                  } else {
                    var13 = new byte[var4_int];
                    var9.a(param0 + 89, var4_int, 0, var13);
                    break L4;
                  }
                }
                var9.field_h = var9.field_h + 4;
                if (!var9.c(4)) {
                  ck.b((byte) -112);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3_ref_pb.b((byte) -127);
                  return;
                }
              }
            }
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
        int var3;
        byte[] var4;
        byte[] var5;
        int var7;
        int var8;
        int var9;
        wf var11;
        byte[] var12;
        byte[] var14;
        byte[] var18;
        java.math.BigInteger var7_ref_java_math_BigInteger;
        java.math.BigInteger var13;
        byte[] var19;
        byte[] var20;
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
            var11 = new wf(this.field_g.d((byte) 76));
            var11.field_h = 5;
            var3 = var11.d(true);
            var11.field_h = var11.field_h + var3 * 72;
            var14 = new byte[var11.field_j.length - var11.field_h];
            var12 = var14;
            var4 = var12;
            var11.a(107, var14.length, 0, var14);
            if (null != this.field_h) {
              if (null != this.field_a) {
                var13 = new java.math.BigInteger(var14);
                var7_ref_java_math_BigInteger = var13.modPow(this.field_h, this.field_a);
                var5 = var7_ref_java_math_BigInteger.toByteArray();
                if (-66 == (var5.length ^ -1)) {
                  var20 = si.a(5, var11.field_j, -86, -5 + var11.field_h - var14.length);
                  var7 = 0;
                  L1: while (true) {
                    if (-65 < (var7 ^ -1)) {
                      if (var5[1 + var7] == var20[var7]) {
                        var7++;
                        continue L1;
                      } else {
                        throw new RuntimeException();
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
                var5 = var4;
                if (-66 == (var5.length ^ -1)) {
                  var19 = si.a(5, var11.field_j, -86, -5 + var11.field_h - var14.length);
                  var7 = 0;
                  L2: while (true) {
                    if (-65 < (var7 ^ -1)) {
                      if (var5[1 + var7] == var19[var7]) {
                        var7++;
                        continue L2;
                      } else {
                        throw new RuntimeException();
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
              }
            } else {
              var5 = var4;
              if (-66 == (var5.length ^ -1)) {
                var18 = si.a(5, var11.field_j, -86, -5 + var11.field_h - var14.length);
                var7 = 0;
                L3: while (true) {
                  if (-65 < (var7 ^ -1)) {
                    if (var5[1 + var7] == var18[var7]) {
                      var7++;
                      continue L3;
                    } else {
                      throw new RuntimeException();
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
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    private pg(wb param0, kl param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
            this.field_i = param0;
            this.field_h = param2;
            this.field_c = param1;
            this.field_a = param3;
            if (!this.field_i.e(20)) {
                this.field_g = this.field_i.a(5, 255, 255, (byte) 0, true);
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "pg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0) {
        ug stackIn_14_0 = null;
        int var2;
        int var3;
        var3 = Lexicominos.field_L ? 1 : 0;
        if (null != this.field_j) {
          var2 = 0;
          L0: while (true) {
            if (this.field_j.length <= var2) {
              if (param0 != 72) {
                this.d(-43);
                var2 = 0;
                L1: while (true) {
                  if (this.field_j.length <= var2) {
                    return;
                  } else {
                    if (null != this.field_j[var2]) {
                      this.field_j[var2].b(false);
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                }
              } else {
                var2 = 0;
                L2: while (true) {
                  if (this.field_j.length <= var2) {
                    return;
                  } else {
                    if (null != this.field_j[var2]) {
                      stackIn_14_0 = this.field_j[var2];
                      ((ug) (Object) stackIn_14_0).b(false);
                      var2++;
                      continue L2;
                    } else {
                      var2++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              if (this.field_j[var2] != null) {
                this.field_j[var2].b(param0 ^ -56);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
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
