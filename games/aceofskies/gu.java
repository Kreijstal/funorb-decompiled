/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gu {
    private String field_b;
    static vd[] field_a;
    static ll[] field_c;

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            gu.a(false);
        }
        field_c = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    gu(String param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "gu.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        ml discarded$1 = null;
        RuntimeException var1 = null;
        int var2 = 0;
        ht var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        gk var13 = null;
        int var14 = 0;
        int var15 = 0;
        dl var16 = null;
        int[][] var20 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var16 = nm.field_c;
            var2 = var16.g(param0 + -90);
            var3 = (ht) ((Object) an.field_b.d(268435455));
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 != var3.field_l) {
                    var3 = (ht) ((Object) an.field_b.b((byte) 103));
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 == 4) {
                  break L3;
                } else {
                  var13 = (gk) null;
                  discarded$1 = gu.a(-24, (gk) null, -121);
                  break L3;
                }
              }
              if (var3 != null) {
                L4: {
                  var4 = var16.g(param0 + 117);
                  if (-1 != (var4 ^ -1)) {
                    var5 = var3.field_f;
                    mb.field_t[0] = fj.field_a;
                    var6_int = 1;
                    L5: while (true) {
                      if (var6_int >= var4) {
                        ud.a(var4, var5, 2);
                        var6_int = 0;
                        L6: while (true) {
                          if (var4 <= var6_int) {
                            eu.a(var5, true);
                            var6 = new String[2][var5];
                            var20 = new int[2][var5 * 4];
                            var8 = os.field_w;
                            var9 = 0;
                            var10 = 0;
                            L7: while (true) {
                              if (var9 >= var8) {
                                var14 = 0;
                                var9 = var14;
                                var15 = 0;
                                var10 = var15;
                                L8: while (true) {
                                  if (var8 <= var14) {
                                    break L4;
                                  } else {
                                    var11 = uf.field_d[var14 + var5];
                                    var6[1][var15] = mb.field_t[var11];
                                    var20[1][var15 * 4] = js.field_c[var11];
                                    var20[1][var15 * 4 + 1] = hg.field_C[var11];
                                    var20[1][2 + var15 * 4] = qd.field_p[var11];
                                    var20[1][3 + var15 * 4] = dd.field_c[var11];
                                    if (fd.a(mb.field_t[var11], (byte) -6)) {
                                      L9: {
                                        if (hg.field_C[var11] - -qd.field_p[var11] + dd.field_c[var11] == 0) {
                                          var6[1][var15] = null;
                                          var15--;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      }
                                      var14++;
                                      var15++;
                                      continue L8;
                                    } else {
                                      var14++;
                                      var15++;
                                      continue L8;
                                    }
                                  }
                                }
                              } else {
                                L10: {
                                  var11 = uf.field_d[var9];
                                  var6[0][var10] = mb.field_t[var11];
                                  var20[0][var10 * 4] = js.field_c[var11];
                                  var20[0][1 + var10 * 4] = hg.field_C[var11];
                                  var20[0][var10 * 4 + 2] = qd.field_p[var11];
                                  var20[0][3 + 4 * var10] = dd.field_c[var11];
                                  if (!fd.a(mb.field_t[var11], (byte) -6)) {
                                    break L10;
                                  } else {
                                    if (-1 != (qd.field_p[var11] + (hg.field_C[var11] + dd.field_c[var11]) ^ -1)) {
                                      break L10;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L10;
                                    }
                                  }
                                }
                                var10++;
                                var9++;
                                continue L7;
                              }
                            }
                          } else {
                            L11: {
                              ju.a(965924047, var16);
                              if (-1 != (var6_int ^ -1)) {
                                o.a(fs.field_c, var6_int, 54, tj.field_o, ld.field_a, gl.field_b);
                                break L11;
                              } else {
                                o.a(fs.field_c, var6_int, 56, tj.field_o, ld.field_a, gl.field_b);
                                break L11;
                              }
                            }
                            var6_int++;
                            continue L6;
                          }
                        }
                      } else {
                        mb.field_t[var6_int] = var16.h(-17883);
                        var6_int++;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                var3.c(param0 + -128);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                te.b(true);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "gu.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, String param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 4) {
                break L1;
              } else {
                field_c = (ll[]) null;
                break L1;
              }
            }
            stackOut_2_0 = this.field_b.equals(param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("gu.D(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static ml a(int param0, gk param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        ml stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ml stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var4 = param1.d(param0, -2);
            var3 = var4;
            if (var4 != null) {
              L1: {
                if (param2 == 16652) {
                  break L1;
                } else {
                  field_a = (vd[]) null;
                  break L1;
                }
              }
              stackOut_5_0 = new ml(var4);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3_ref);
            stackOut_7_1 = new StringBuilder().append("gu.E(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ml) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final void a(java.applet.Applet param0, byte param1) {
        try {
            jt.a("jagex-last-login-method", this.field_b, 31536000L, param0, 0);
            int var3_int = 79 / ((param1 - 77) / 44);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "gu.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
