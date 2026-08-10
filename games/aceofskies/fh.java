/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh extends vo {
    static String field_f;
    private bm field_i;
    private bm field_h;
    static String field_g;
    static boolean[] field_e;

    final static void a(int param0, float param1, String param2) {
        try {
            dq.field_b = param2;
            ct.field_I = param1;
            if (param0 >= -23) {
                field_g = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "fh.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean e(int param0) {
        if (param0 != 31574) {
            field_f = (String) null;
            return nf.field_a;
        }
        return nf.field_a;
    }

    final static String c(byte param0) {
        int var1 = 106 / ((-51 - param0) / 60);
        if (ht.field_g) {
            return null;
        }
        if (jp.field_b > ok.field_o) {
            return null;
        }
        if (!(ok.field_o >= ct.field_B + jp.field_b)) {
            return qj.field_s;
        }
        return null;
    }

    private final boolean b(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
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
              if (param1 == -1) {
                break L1;
              } else {
                field_e = (boolean[]) null;
                break L1;
              }
            }
            L2: {
              var8 = this.field_h.field_f.toLowerCase();
              var4 = param0.toLowerCase();
              if (0 >= var8.length()) {
                break L2;
              } else {
                if ((var4.length() ^ -1) < -1) {
                  var5 = var8.lastIndexOf("@");
                  if (var5 < 0) {
                    break L2;
                  } else {
                    if (var5 >= -1 + var8.length()) {
                      break L2;
                    } else {
                      var6 = var8.substring(0, var5);
                      var7 = var8.substring(1 + var5);
                      if ((var4.indexOf(var6) ^ -1) <= -1) {
                        stackIn_10_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        L3: {
                          if ((var4.indexOf(var7) ^ -1) <= -1) {
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
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("fh.F(");

            if (param0 == null) {
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
          throw pn.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
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

    public static void c(boolean param0) {
        field_e = null;
        field_f = null;
        if (!param0) {
            field_f = (String) null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_33_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = this.field_i.field_f.toLowerCase();
            var4 = param0.toLowerCase();
            if (0 != var4.length()) {
              if (param1 == 72) {
                var5 = var4;
                if (vr.a(var5, param1 ^ 74)) {
                  stackIn_9_0 = co.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!ul.a(var5, (byte) -115)) {
                    if (kc.a(var5, 26035)) {
                      stackIn_16_0 = mh.field_j;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (this.b(param0, -1)) {
                        stackIn_20_0 = fj.field_b;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (var6.length() > 0) {
                          if (ol.a(var6, -128, var5)) {
                            stackIn_27_0 = mr.field_a;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (!cr.a(var5, var6, (byte) 52)) {
                              if (!lb.a(var6, var5, -115)) {
                                stackIn_35_0 = co.field_a;
                                decompiledRegionSelector0 = 10;
                                break L0;
                              } else {
                                stackIn_33_0 = mr.field_a;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            } else {
                              stackIn_30_0 = qa.field_c;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        } else {
                          stackIn_23_0 = lk.field_g;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    }
                  } else {
                    stackIn_12_0 = ii.field_g;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } else {
                stackIn_5_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var3);

            stackIn_38_1 = new StringBuilder().append("fh.EA(");

            if (param0 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L1;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_16_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_23_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_27_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_30_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_33_0;
                          } else {
                            return stackIn_35_0;
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
    }

    final pt a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        pt stackIn_2_0 = null;
        pt stackIn_6_0 = null;
        pt stackIn_9_0 = null;
        pt stackIn_12_0 = null;
        pt stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 8192) {
              var3 = this.field_i.field_f.toLowerCase();
              var4 = param0.toLowerCase();
              if (var4.length() == 0) {
                stackIn_6_0 = bt.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (bu.a(118, var4, var3)) {
                  if (!this.b(param0, -1)) {
                    stackIn_14_0 = fd.field_a;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackIn_12_0 = bt.field_a;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_9_0 = bt.field_a;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = (pt) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("fh.DA(");

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
          throw pn.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                return stackIn_14_0;
              }
            }
          }
        }
    }

    fh(bm param0, bm param1, bm param2) {
        super(param0);
        try {
            this.field_i = param1;
            this.field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "fh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new boolean[64];
        field_g = "???";
        field_f = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
