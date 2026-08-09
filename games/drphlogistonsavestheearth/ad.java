/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends ei {
    static String field_r;
    static nh field_t;
    static ok field_q;
    static String field_p;
    private kl field_u;
    private kl field_w;
    static he[] field_v;
    static he[] field_s;

    final static boolean a(vj param0, byte param1, vj param2, vj param3) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param3.a(0)) {
                break L1;
              } else {
                if (!param3.a(255, "commonui")) {
                  break L1;
                } else {
                  L2: {
                    if (param1 <= -53) {
                      break L2;
                    } else {
                      field_v = (he[]) null;
                      break L2;
                    }
                  }
                  L3: {
                    if (!param2.a(0)) {
                      break L3;
                    } else {
                      if (!param2.a(255, "commonui")) {
                        break L3;
                      } else {
                        if (!param0.a(0)) {
                          stackIn_16_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          if (param0.a(255, "button.gif")) {
                            stackIn_18_0 = 1;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackIn_4_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("ad.C(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_22_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
        }
    }

    ad(kl param0, kl param1, kl param2) {
        super(param0);
        try {
            this.field_u = param1;
            this.field_w = param2;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
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
            L1: {
              var6 = this.field_u.field_p.toLowerCase();
              if (param0 > 47) {
                break L1;
              } else {
                field_q = (ok) null;
                break L1;
              }
            }
            var4 = param1.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              if (!kj.a(var5, (byte) 59)) {
                if (oi.a(8975, var5)) {
                  stackIn_11_0 = (String) (field_p);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (g.b((byte) 111, var5)) {
                    stackIn_15_0 = rg.field_b;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    if (!this.b(-113, param1)) {
                      if (-1 <= (var6.length() ^ -1)) {
                        stackIn_33_0 = ae.field_jb;
                        decompiledRegionSelector0 = 8;
                        break L0;
                      } else {
                        if (!rb.a(var6, var5, -1)) {
                          if (gk.a(-1, var6, var5)) {
                            stackIn_26_0 = vg.field_x;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            if (!pc.a((byte) -115, var6, var5)) {
                              stackIn_31_0 = nj.field_e;
                              decompiledRegionSelector0 = 7;
                              break L0;
                            } else {
                              stackIn_29_0 = nj.field_c;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            }
                          }
                        } else {
                          stackIn_22_0 = nj.field_c;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_18_0 = rd.field_E;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  }
                }
              } else {
                stackIn_7_0 = nj.field_e;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var3);

            stackIn_36_1 = new StringBuilder().append("ad.D(").append(param0).append(',');

            if (param1 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_26_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_29_0;
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

    final static hg a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        hg var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        hg stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (null != vg.field_j) {
              L1: {
                var6 = (CharSequence) ((Object) param0);
                var2 = rh.a(-115, var6);
                if (var2 != null) {
                  break L1;
                } else {
                  var2 = param0;
                  break L1;
                }
              }
              var3 = (hg) ((Object) vg.field_j.a((long)var2.hashCode(), -122));
              L2: while (true) {
                if (var3 == null) {
                  var4 = -26 / ((25 - param1) / 55);
                  stackIn_15_0 = null;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var7 = (CharSequence) ((Object) var3.field_V);
                    var4_ref_String = rh.a(125, var7);
                    if (var4_ref_String != null) {
                      break L3;
                    } else {
                      var4_ref_String = var3.field_V;
                      break L3;
                    }
                  }
                  if (!var4_ref_String.equals(var2)) {
                    var3 = (hg) ((Object) vg.field_j.b(-1));
                    continue L2;
                  } else {
                    stackIn_12_0 = (hg) (var3);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2_ref);

            stackIn_18_1 = new StringBuilder().append("ad.E(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return (hg) ((Object) stackIn_15_0);
        }
    }

    final vh a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        vj var5 = null;
        vh stackIn_4_0 = null;
        vh stackIn_7_0 = null;
        vh stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 8192) {
                break L1;
              } else {
                var5 = (vj) null;
                ad.a((vj) null, (byte) -70, (vj) null, (vj) null);
                break L1;
              }
            }
            var3 = this.field_u.field_p.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() != 0) {
              if (u.a(var4, false, var3)) {
                if (this.b(116, param1)) {
                  stackIn_11_0 = u.field_b;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return ce.field_e;
                }
              } else {
                stackIn_7_0 = u.field_b;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_4_0 = u.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("ad.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = this.field_w.field_p.toLowerCase();
              var4 = 88 % ((param0 - 35) / 57);
              var5 = param1.toLowerCase();
              if (var3.length() <= 0) {
                break L1;
              } else {
                if ((var5.length() ^ -1) >= -1) {
                  break L1;
                } else {
                  var6 = var3.lastIndexOf("@");
                  if ((var6 ^ -1) > -1) {
                    break L1;
                  } else {
                    if (-1 + var3.length() <= var6) {
                      break L1;
                    } else {
                      var7 = var3.substring(0, var6);
                      var8 = var3.substring(1 + var6);
                      if (0 <= var5.indexOf(var7)) {
                        stackIn_7_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if ((var5.indexOf(var8) ^ -1) <= -1) {
                          stackIn_11_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackIn_13_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("ad.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw ie.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    public static void e(int param0) {
        field_t = null;
        field_r = null;
        field_q = null;
        field_v = null;
        field_p = null;
        field_s = null;
        if (param0 != 0) {
            field_s = (he[]) null;
        }
    }

    static {
        field_r = "Type your email address again to make sure it's correct";
        field_t = null;
        field_p = "Passwords can only contain letters and numbers";
    }
}
