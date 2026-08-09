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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        Object var3 = null;
        ht var3_ref = null;
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
        dl var15 = null;
        int[][] var19 = null;
        var3 = null;
        var12 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var15 = nm.field_c;
            var2 = var15.g(param0 + -90);
            var3_ref = (ht) ((Object) an.field_b.d(268435455));
            L1: while (true) {
              L2: {
                if (var3_ref == null) {
                  break L2;
                } else {
                  if ((var2 ^ -1) != (var3_ref.field_l ^ -1)) {
                    var3_ref = (ht) ((Object) an.field_b.b((byte) 103));
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
                  gu.a(-24, (gk) null, -121);
                  break L3;
                }
              }
              if (var3_ref != null) {
                L4: {
                  var4 = var15.g(param0 + 117);
                  if (-1 != (var4 ^ -1)) {
                    var5 = var3_ref.field_f;
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
                            var19 = new int[2][var5 * 4];
                            var8 = os.field_w;
                            var9 = 0;
                            var10 = 0;
                            L7: while (true) {
                              if (var9 >= var8) {
                                var9 = 0;
                                var14 = 0;
                                var10 = var14;
                                L8: while (true) {
                                  if (var8 <= var9) {
                                    break L4;
                                  } else {
                                    var11 = uf.field_d[var9 + var5];
                                    var6[1][var14] = mb.field_t[var11];
                                    var19[1][var14 * 4] = js.field_c[var11];
                                    var19[1][var14 * 4 + 1] = hg.field_C[var11];
                                    var19[1][2 + var14 * 4] = qd.field_p[var11];
                                    var19[1][3 + var14 * 4] = dd.field_c[var11];
                                    if (fd.a(mb.field_t[var11], (byte) -6)) {
                                      L9: {
                                        if (hg.field_C[var11] - -qd.field_p[var11] + dd.field_c[var11] == 0) {
                                          var6[1][var14] = null;
                                          var14--;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      }
                                      var9++;
                                      var14++;
                                      continue L8;
                                    } else {
                                      var9++;
                                      var14++;
                                      continue L8;
                                    }
                                  }
                                }
                              } else {
                                L10: {
                                  var11 = uf.field_d[var9];
                                  var6[0][var10] = mb.field_t[var11];
                                  var19[0][var10 * 4] = js.field_c[var11];
                                  var19[0][1 + var10 * 4] = hg.field_C[var11];
                                  var19[0][var10 * 4 + 2] = qd.field_p[var11];
                                  var19[0][3 + 4 * var10] = dd.field_c[var11];
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
                              ju.a(965924047, var15);
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
                        mb.field_t[var6_int] = var15.h(-17883);
                        var6_int++;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                var3_ref.c(param0 + -128);
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = this.field_b.equals(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("gu.D(").append(param0).append(',');

            if (param1 == null) {
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_6_0 = new ml(var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("gu.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
