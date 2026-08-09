/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static int[] field_c;
    private ha field_f;
    static uj field_a;
    private lj field_d;
    private lj field_e;
    private ha field_g;
    static int[][][] field_b;

    final static void a(int param0, int param1) {
        fe var2;
        int var3;
        if (0 <= param1) {
          if (param1 < 13) {
            if (param0 != 12604) {
              field_c = (int[]) null;
              var2 = cj.field_h[param1];
              var3 = ab.field_g[param1];
              ol.a(param0 + -12732, var2, var3);
              return;
            } else {
              var2 = cj.field_h[param1];
              var3 = ab.field_g[param1];
              ol.a(param0 + -12732, var2, var3);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_b = (int[][][]) null;
        field_a = null;
        if (param0 != -26193) {
            u.a((byte) 11, 88);
            field_c = null;
            return;
        }
        field_c = null;
    }

    private final fe a(int param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        fe var8 = null;
        q var9 = null;
        int[] var10 = null;
        fe var11 = null;
        fe stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        fe stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                var10 = (int[]) null;
                this.a(74, -112, (int[]) null);
                break L1;
              }
            }
            var5_int = (param3 << 522666948 & 65533 | param3 >>> 507203052) ^ param2;
            var5_int = var5_int | param3 << -1275001936;
            var6 = (long)var5_int;
            var8 = (fe) ((Object) this.field_g.a((byte) 97, var6));
            if (var8 != null) {
              stackIn_5_0 = (fe) (var8);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param1 == null) {
                  break L2;
                } else {
                  if (0 < param1[0]) {
                    break L2;
                  } else {
                    stackIn_9_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var9 = q.a(this.field_d, param3, param2);
              if (var9 != null) {
                L3: {
                  var11 = var9.b();
                  var8 = var11;
                  this.field_g.a(106, var8, var6);
                  if (param1 == null) {
                    break L3;
                  } else {
                    param1[0] = param1[0] - var11.field_k.length;
                    break L3;
                  }
                }
                stackIn_16_0 = (fe) (var8);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var5);

            stackIn_19_1 = new StringBuilder().append("u.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (fe) ((Object) stackIn_9_0);
          } else {
            return stackIn_16_0;
          }
        }
    }

    final fe a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        int[] var5 = null;
        fe stackIn_4_0 = null;
        fe stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 85) {
                break L1;
              } else {
                var5 = (int[]) null;
                this.a(108, (int[]) null, -71);
                break L1;
              }
            }
            if (this.field_e.c((byte) 52) != 1) {
              if (-2 != (this.field_e.a(param1, -89) ^ -1)) {
                throw new RuntimeException();
              } else {
                stackIn_7_0 = this.a((byte) 119, param2, 0, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = this.a((byte) 113, param2, param1, 0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("u.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_7_0;
        }
    }

    final fe a(int param0, int[] param1, int param2) {
        RuntimeException var4 = null;
        fe stackIn_3_0 = null;
        fe stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((this.field_d.c((byte) 52) ^ -1) == -2) {
              stackIn_3_0 = this.a(0, param1, param2, 0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  u.a(-35, -112);
                  break L1;
                }
              }
              if ((this.field_d.a(param2, -77) ^ -1) != -2) {
                throw new RuntimeException();
              } else {
                stackIn_8_0 = this.a(0, param1, 0, param2);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("u.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static void a(boolean param0, lj param1) {
        ka var2 = new ka(param1.a(-2, "", "final_frame.jpg"), (java.awt.Component) ((Object) bg.field_P));
        int var3 = var2.field_u;
        int var4 = var2.field_x;
        wb.b((byte) 66);
        hf.field_a = new ka(var3, 3 * var4 / 4);
        hf.field_a.d();
        var2.a(0, 0);
        td.field_o = new ka(var3, var4 - hf.field_a.field_x);
        td.field_o.d();
        var2.a(0, -hf.field_a.field_x);
        if (!param0) {
            return;
        }
        try {
            td.field_o.field_p = hf.field_a.field_x;
            ie.b((byte) -9);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "u.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.applet.Applet param0, boolean param1, int param2, String param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (!uj.field_a.startsWith("win")) {
                    break L1;
                  } else {
                    if (!ol.a(param3, true)) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (param2 < -56) {
                    break L2;
                  } else {
                    field_b = (int[][][]) null;
                    break L2;
                  }
                }
                try {
                  L3: {
                    param0.getAppletContext().showDocument(new java.net.URL(param3), "_blank");
                    break L3;
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                  td.a("MGR1: " + param3, (Throwable) null, (byte) -90);
                  return;
                }
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var4_ref);

                stackIn_11_1 = new StringBuilder().append("u.B(");

                if (param0 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L5;
                }
              }
              throw oj.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    u(lj param0, lj param1) {
        this.field_f = new ha(256);
        this.field_g = new ha(256);
        try {
            this.field_d = param0;
            this.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "u.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final fe a(byte param0, int[] param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        fe var8 = null;
        wg var9 = null;
        fe stackIn_2_0 = null;
        fe stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_18_0 = null;
        fe stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param2 ^ (param3 >>> -229964500 | (param3 & -268431361) << -800298748);
            if (param0 > 109) {
              var5_int = var5_int | param3 << 260325232;
              var6 = 4294967296L ^ (long)var5_int;
              var8 = (fe) ((Object) this.field_g.a((byte) 89, var6));
              if (var8 == null) {
                L1: {
                  if (param1 == null) {
                    break L1;
                  } else {
                    if (0 < param1[0]) {
                      break L1;
                    } else {
                      stackIn_9_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                L2: {
                  var9 = (wg) ((Object) this.field_f.a((byte) 100, var6));
                  if (var9 == null) {
                    var9 = wg.a(this.field_e, param3, param2);
                    if (var9 != null) {
                      this.field_f.a(-101, var9, var6);
                      break L2;
                    } else {
                      stackIn_14_0 = null;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    break L2;
                  }
                }
                var8 = var9.a(param1);
                if (var8 != null) {
                  var9.a(true);
                  this.field_g.a(-98, var8, var6);
                  stackIn_20_0 = (fe) (var8);
                  decompiledRegionSelector0 = 5;
                  break L0;
                } else {
                  stackIn_18_0 = null;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                stackIn_5_0 = (fe) (var8);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (fe) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("u.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (fe) ((Object) stackIn_9_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (fe) ((Object) stackIn_14_0);
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (fe) ((Object) stackIn_18_0);
                } else {
                  return stackIn_20_0;
                }
              }
            }
          }
        }
    }

    final static void a(byte param0, int param1) {
        if (!(50 == param1)) {
            throw new IllegalArgumentException();
        }
        int var2 = -73 / ((10 - param0) / 41);
    }

    static {
        field_c = new int[]{0, 200, 450};
        field_b = new int[][][]{new int[][]{new int[]{-1, -1, -1, 6, -1, -1}, new int[]{-1}, new int[]{-1}, new int[]{-1, -1, -1, 6, -1, -1}, new int[]{-1}, new int[]{-1}, new int[]{-1}}, new int[][]{new int[]{-1, -1, -1, 6, -1, -1}, new int[]{-1, -1, 6, -1, -1}, new int[]{-1, 6, -1, -1}, new int[]{-1}, new int[]{-1}, new int[]{-1, -1, -1, -1, -1, 6, -1}, new int[]{-1}}, new int[][]{new int[]{-1, -1, -1, -1, 6, -1}, new int[]{-1}, new int[]{-1}, new int[]{-1}, new int[]{-1, -1, -1, -1, -1, -1, 6}, new int[]{-1}, new int[]{-1, -1, -1, -1, -1, 6}}};
    }
}
