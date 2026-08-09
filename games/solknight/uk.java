/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends a {
    private vg field_j;
    private vg field_l;
    static o field_k;

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = this.field_j.field_i.toLowerCase();
            var4 = param0.toLowerCase();
            if (0 != var4.length()) {
              var5 = var4;
              if (b.a(var5, (byte) 117)) {
                stackIn_6_0 = ub.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!lc.a(0, var5)) {
                  L1: {
                    if (!param1) {
                      break L1;
                    } else {
                      var6 = (String) null;
                      this.a((String) null, false);
                      break L1;
                    }
                  }
                  if (lh.a(var5, (byte) -112)) {
                    stackIn_15_0 = uh.field_P;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (!this.a((byte) 85, param0)) {
                      if (-1 <= (var7.length() ^ -1)) {
                        stackIn_33_0 = ik.field_a;
                        decompiledRegionSelector0 = 8;
                        break L0;
                      } else {
                        if (ne.a(var5, false, var7)) {
                          stackIn_23_0 = la.field_m;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          if (gl.a(var5, 124, var7)) {
                            stackIn_27_0 = wf.field_a;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            if (l.a(var7, var5, 0)) {
                              stackIn_31_0 = la.field_m;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            } else {
                              return ub.field_a;
                            }
                          }
                        }
                      }
                    } else {
                      stackIn_18_0 = ji.field_c;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_9_0 = kb.field_e;
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
            stackIn_36_0 = (RuntimeException) (var3);

            stackIn_36_1 = new StringBuilder().append("uk.K(");

            if (param0 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L2;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_27_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_31_0;
                      } else {
                        return stackIn_33_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final qf a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        qf stackIn_3_0 = null;
        qf stackIn_6_0 = null;
        qf stackIn_11_0 = null;
        qf stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_j.field_i.toLowerCase();
            var4 = param0.toLowerCase();
            if (-1 == (var4.length() ^ -1)) {
              stackIn_3_0 = rg.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (bg.a(var3, 74, var4)) {
                L1: {
                  if (param1 < -109) {
                    break L1;
                  } else {
                    uk.a((byte) -12, 94);
                    break L1;
                  }
                }
                if (!this.a((byte) 82, param0)) {
                  stackIn_13_0 = ph.field_g;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = rg.field_f;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = rg.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("uk.J(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    final static boolean h(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 250) {
          L0: {
            uk.i(78);
            if (250 >= ad.field_h) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (250 >= ad.field_h) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    uk(vg param0, vg param1, vg param2) {
        super(param0);
        try {
            this.field_l = param2;
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "uk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(byte param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        param1 = param1 & 8191;
        if (param0 == -64) {
          if (param1 < 4096) {
            L0: {
              if (2048 > param1) {
                stackIn_10_0 = db.field_m[param1];
                break L0;
              } else {
                stackIn_10_0 = db.field_m[4096 - param1];
                break L0;
              }
            }
            return stackIn_10_0;
          } else {
            L1: {
              if (6144 > param1) {
                stackIn_6_0 = -db.field_m[param1 + -4096];
                break L1;
              } else {
                stackIn_6_0 = -db.field_m[8192 - param1];
                break L1;
              }
            }
            return stackIn_6_0;
          }
        } else {
          return 94;
        }
    }

    private final boolean a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int stackIn_9_0 = 0;
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
              var8 = this.field_l.field_i.toLowerCase();
              var4 = param1.toLowerCase();
              if (param0 >= 3) {
                break L1;
              } else {
                field_k = (o) null;
                break L1;
              }
            }
            L2: {
              if (-1 <= (var8.length() ^ -1)) {
                break L2;
              } else {
                if ((var4.length() ^ -1) >= -1) {
                  break L2;
                } else {
                  var5 = var8.lastIndexOf("@");
                  if ((var5 ^ -1) > -1) {
                    break L2;
                  } else {
                    if (-1 + var8.length() > var5) {
                      var6 = var8.substring(0, var5);
                      var7 = var8.substring(1 + var5);
                      if (-1 < (var4.indexOf(var6) ^ -1)) {
                        if (0 > var4.indexOf(var7)) {
                          break L2;
                        } else {
                          stackIn_12_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      return false;
                    }
                  }
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

            stackIn_17_1 = new StringBuilder().append("uk.M(").append(param0).append(',');

            if (param1 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final static int[] i(int param0) {
        if (param0 != -1) {
            uk.h(48);
            return new int[8];
        }
        return new int[8];
    }

    public static void j(int param0) {
        field_k = null;
        if (param0 != 8191) {
            uk.a((byte) -70, 101);
        }
    }

    static {
    }
}
