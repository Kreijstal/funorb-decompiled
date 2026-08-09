/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends lk {
    static pb field_k;
    static String field_m;
    static String field_o;
    private ae field_n;
    private ae field_l;
    static String field_p;

    final cg a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        cg stackIn_3_0 = null;
        cg stackIn_6_0 = null;
        cg stackIn_10_0 = null;
        cg stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_l.field_m.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() == 0) {
              stackIn_3_0 = qj.field_c;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 > 10) {
                if (!rd.a(true, var4, var3)) {
                  stackIn_10_0 = qj.field_c;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (this.a(-1, param1)) {
                    stackIn_14_0 = qj.field_c;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return lg.field_c;
                  }
                }
              } else {
                stackIn_6_0 = (cg) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("lc.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
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

    final static boolean a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -53 / ((6 - param1) / 62);
            stackIn_1_0 = sk.a(false, 0, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("lc.G(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    private final boolean a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
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
              if (param0 == -1) {
                break L1;
              } else {
                this.field_n = (ae) null;
                break L1;
              }
            }
            L2: {
              var3 = this.field_n.field_m.toLowerCase();
              var4 = param1.toLowerCase();
              if (0 >= var3.length()) {
                break L2;
              } else {
                if (-1 > (var4.length() ^ -1)) {
                  var5 = var3.lastIndexOf("@");
                  if (0 > var5) {
                    break L2;
                  } else {
                    if (var5 >= -1 + var3.length()) {
                      break L2;
                    } else {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 + 1);
                      if (0 <= var4.indexOf(var6)) {
                        stackIn_10_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        L3: {
                          if (var4.indexOf(var7) >= 0) {
                            stackIn_14_0 = 1;
                            break L3;
                          } else {
                            stackIn_14_0 = 0;
                            break L3;
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
            stackIn_16_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("lc.C(").append(param0).append(',');

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
          throw ma.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_16_0 != 0;
          }
        }
    }

    lc(ae param0, ae param1, ae param2) {
        super(param0);
        try {
            this.field_n = param2;
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static li[] e(byte param0) {
        if (param0 != 33) {
          return (li[]) null;
        } else {
          return new li[]{ua.field_a, de.field_d, il.field_u, g.field_z, g.field_A, ok.field_c, bb.field_m, va.field_b, kf.field_a, ef.field_n, ui.field_C, s.field_f, be.field_c, tf.field_b};
        }
    }

    final static int a(int param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (!param1) {
          param0 = param0 & 8191;
          if (param0 < 4096) {
            L0: {
              if (2048 <= param0) {
                stackIn_19_0 = -fh.field_h[-2048 + param0];
                break L0;
              } else {
                stackIn_19_0 = fh.field_h[-param0 + 2048];
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (6144 > param0) {
                stackIn_15_0 = -fh.field_h[6144 - param0];
                break L1;
              } else {
                stackIn_15_0 = fh.field_h[param0 - 6144];
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          field_k = (pb) null;
          param0 = param0 & 8191;
          if (param0 < 4096) {
            L2: {
              if (2048 <= param0) {
                stackIn_9_0 = -fh.field_h[-2048 + param0];
                break L2;
              } else {
                stackIn_9_0 = fh.field_h[-param0 + 2048];
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (6144 > param0) {
                stackIn_5_0 = -fh.field_h[6144 - param0];
                break L3;
              } else {
                stackIn_5_0 = fh.field_h[param0 - 6144];
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final String b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 23 / ((param0 - 20) / 40);
            var4 = this.field_l.field_m.toLowerCase();
            var5 = param1.toLowerCase();
            if (var5.length() != 0) {
              var6 = var5;
              if (!rd.a(var6, -121)) {
                if (lg.a(-124, var6)) {
                  stackIn_9_0 = pk.field_f;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (fl.a(var6, (byte) 19)) {
                    stackIn_13_0 = pe.field_b;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    if (this.a(-1, param1)) {
                      stackIn_17_0 = el.field_H;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      if (0 < var4.length()) {
                        if (!rb.a(var6, -85, var4)) {
                          if (ji.a(var6, 95, var4)) {
                            stackIn_27_0 = ge.field_l;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            if (!mb.a(var6, (byte) 118, var4)) {
                              stackIn_32_0 = wi.field_b;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              stackIn_30_0 = vf.field_D;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            }
                          }
                        } else {
                          stackIn_23_0 = vf.field_D;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        }
                      } else {
                        stackIn_20_0 = k.field_e;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    }
                  }
                }
              } else {
                stackIn_5_0 = wi.field_b;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("lc.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L1;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
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
                        return stackIn_32_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void f(int param0) {
        field_k = null;
        field_p = null;
        if (param0 != 3988) {
          lc.f(16);
          field_m = null;
          field_o = null;
          return;
        } else {
          field_m = null;
          field_o = null;
          return;
        }
    }

    static {
        field_m = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_o = "This entry doesn't match";
    }
}
