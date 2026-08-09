/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends hi {
    static int[] field_s;
    private vi field_p;
    static int field_r;
    private vi field_n;
    static int field_o;
    static int field_q;

    final static void c(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var1_int = ul.field_f;
            var2 = ul.field_l;
            var3 = -1 + var2 * var1_int;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if ((var3 ^ -1) > -1) {
                      break L4;
                    } else {
                      var4 = ul.field_b[var3];
                      var5 = 0;
                      var8 = -8388609;
                      var7 = var4 & 8388608 ^ -1;
                      if (var6 != 0) {
                        if (var7 == var8) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (var7 != var8) {
                            break L5;
                          } else {
                            var5 = var5 | var4 & 8323072;
                            break L5;
                          }
                        }
                        L6: {
                          if ((var4 & 32768) != 32768) {
                            break L6;
                          } else {
                            var5 = var5 | var4 & 32512;
                            break L6;
                          }
                        }
                        L7: {
                          if ((var4 & 128) != 128) {
                            break L7;
                          } else {
                            var5 = var5 | 127 & var4;
                            break L7;
                          }
                        }
                        cg.field_d.field_v[var3] = var5 << -943490239;
                        var3--;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  li.field_a.d();
                  if (param0 == 67) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
              hm.a(cg.field_d.field_v, 3, param0 + -67, 3);
              cb.field_a.a(param0 ^ -101);
              li.field_a.e(0, 0, 640, 480, ef.field_k);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "em.V(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        if (!n.b(param0)) {
          if (!pc.field_cb) {
            L0: {
              if (null == oh.field_c) {
                oh.field_c = lg.a(4, false);
                break L0;
              } else {
                break L0;
              }
            }
            if (!oh.field_c.field_g) {
              return;
            } else {
              lb.field_g = lb.field_g | oh.field_c.field_i;
              dm.field_f = dm.field_f & (oh.field_c.field_i ^ -1);
              pc.field_cb = true;
              oh.field_c = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final qd a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        qd stackIn_2_0 = null;
        qd stackIn_6_0 = null;
        qd stackIn_10_0 = null;
        qd stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -99) {
              var3 = this.field_n.field_l.toLowerCase();
              var4 = param0.toLowerCase();
              if (var4.length() == 0) {
                stackIn_6_0 = vh.field_h;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!kk.a(var3, var4, -1)) {
                  stackIn_10_0 = vh.field_h;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (this.b(param0, (byte) -36)) {
                    stackIn_14_0 = vh.field_h;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return nc.field_bb;
                  }
                }
              }
            } else {
              stackIn_2_0 = (qd) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("em.C(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L1;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_14_0;
            }
          }
        }
    }

    public static void d(byte param0) {
        field_s = null;
        if (param0 != -15) {
            field_o = 125;
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        try {
            if ((hi.field_k ^ -1) == -12) {
                md.c(32);
            }
            ih.a(tl.field_e, 0, q.field_b, mf.field_d);
            kg.a(0, (byte) -83, param0, param1);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "em.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    em(vi param0, vi param1, vi param2) {
        super(param0);
        try {
            this.field_n = param1;
            this.field_p = param2;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "em.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean b(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = this.field_p.field_l.toLowerCase();
              var4 = param0.toLowerCase();
              var5 = -2 % ((param1 - 37) / 51);
              if (-1 <= (var9.length() ^ -1)) {
                break L1;
              } else {
                if (-1 > (var4.length() ^ -1)) {
                  var6 = var9.lastIndexOf("@");
                  if ((var6 ^ -1) > -1) {
                    break L1;
                  } else {
                    if (-1 + var9.length() <= var6) {
                      break L1;
                    } else {
                      var7 = var9.substring(0, var6);
                      var8 = var9.substring(var6 + 1);
                      if ((var4.indexOf(var7) ^ -1) <= -1) {
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        L2: {
                          if ((var4.indexOf(var8) ^ -1) <= -1) {
                            stackIn_12_0 = 1;
                            break L2;
                          } else {
                            stackIn_12_0 = 0;
                            break L2;
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            }
            stackIn_14_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("em.D(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = this.field_n.field_l.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() != 0) {
              L1: {
                if (param0 == -11300) {
                  break L1;
                } else {
                  this.field_p = (vi) null;
                  break L1;
                }
              }
              var5 = var4;
              if (mm.a(var5, (byte) 51)) {
                stackIn_8_0 = sg.field_F;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!md.a(-20767, var5)) {
                  if (me.a(var5, (byte) -27)) {
                    stackIn_15_0 = jc.field_n;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (this.b(param1, (byte) -99)) {
                      stackIn_19_0 = pl.field_f;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (0 >= var6.length()) {
                        stackIn_34_0 = vc.field_b;
                        decompiledRegionSelector0 = 9;
                        break L0;
                      } else {
                        if (!df.a(var5, (byte) 126, var6)) {
                          if (vh.a(false, var6, var5)) {
                            stackIn_27_0 = am.field_f;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            if (!l.a(122, var5, var6)) {
                              stackIn_32_0 = sg.field_F;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              stackIn_30_0 = mf.field_a;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            }
                          }
                        } else {
                          stackIn_23_0 = mf.field_a;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  stackIn_11_0 = ec.field_H;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var3);

            stackIn_37_1 = new StringBuilder().append("em.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L2;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_27_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_30_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_32_0;
                        } else {
                          return stackIn_34_0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
        int var0 = 0;
        field_r = 0;
        field_s = new int[256];
        for (var0 = 0; -257 < (var0 ^ -1); var0++) {
            field_s[var0] = 256 * (var0 / 3) + (1 * (var0 / 2) + var0 * 65536);
        }
    }
}
