/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends gt implements ai {
    static boolean field_ob;
    static char[] field_lb;
    private boolean field_nb;
    private boolean field_pb;
    private js field_mb;

    uk(dg param0, js param1) {
        super(param0, tq.field_a, su.field_c, false, false);
        try {
            this.field_mb = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "uk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(boolean param0) {
        field_lb = null;
        if (!param0) {
            return;
        }
        uk.g(false);
    }

    private final void a(boolean param0, byte param1, an param2) {
        wp discarded$3 = null;
        wp discarded$4 = null;
        wp discarded$5 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        int var5 = 0;
        lc var6 = null;
        int var7 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                this.field_nb = true;
                if (!param2.field_b) {
                  break L2;
                } else {
                  var4_ref = vl.field_b;
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param2.field_h == null) {
                  break L3;
                } else {
                  var4_ref = au.field_e;
                  if (null == this.field_mb) {
                    break L1;
                  } else {
                    this.field_mb.a((byte) -119);
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var4_ref = param2.field_g;
              if (-249 != (param2.field_e ^ -1)) {
                break L1;
              } else {
                L4: {
                  if (!param0) {
                    gj.c(0);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var4_ref = rn.field_a;
                this.field_pb = true;
                break L1;
              }
            }
            L5: {
              L6: {
                var5 = -1 / ((-1 - param1) / 45);
                var6 = new lc((gt) (this), tq.field_a, var4_ref);
                if (!param2.field_b) {
                  break L6;
                } else {
                  if (!param2.field_c) {
                    discarded$3 = var6.a(wd.field_h, (byte) -123, (qm) (this));
                    if (var7 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  } else {
                    this.b((byte) -95, new th((uk) (this)));
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              L7: {
                if (this.field_pb) {
                  discarded$4 = var6.a(wd.field_h, (byte) -123, (qm) (this));
                  break L7;
                } else {
                  L8: {
                    if ((param2.field_e ^ -1) != -6) {
                      break L8;
                    } else {
                      var6.a(vf.field_e, 11, true);
                      var6.a(of.field_k, 17, true);
                      if (var7 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var6.a(cq.field_c, -1, true);
                  if (var7 == 0) {
                    break L7;
                  } else {
                    discarded$5 = var6.a(wd.field_h, (byte) -123, (qm) (this));
                    break L7;
                  }
                }
              }
              L9: {
                if (param2.field_e == 3) {
                  break L9;
                } else {
                  if (param2.field_e == 6) {
                    var6.a(eq.field_w, 9, true);
                    if (var7 == 0) {
                      break L5;
                    } else {
                      break L9;
                    }
                  } else {
                    this.b((byte) -123, var6);
                    return;
                  }
                }
              }
              var6.a(lq.field_c, 7, true);
              break L5;
            }
            this.b((byte) -123, var6);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) (var4);
            stackOut_32_1 = new StringBuilder().append("uk.V(").append(param0).append(',').append(param1).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L10;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L10;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void f(boolean param0) {
        this.a(param0, (byte) 127, au.a(-91, rn.field_a, 248));
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        if (param1 != 710) {
            field_ob = true;
        }
        if (!(!this.field_pb)) {
            sm.a((byte) -40, false, true);
            return;
        }
        try {
            kh.a(false);
            this.n(-7);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "uk.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_13_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_19_0 = 0;
        boolean stackIn_27_0 = false;
        int stackIn_35_0 = 0;
        Object stackIn_37_0 = null;
        String stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_34_0 = 0;
        boolean stackOut_26_0 = false;
        String stackOut_38_0 = null;
        Object stackOut_36_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              var2_int = 0;
              var3 = param1.length();
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 <= var2_int) {
                      break L3;
                    } else {
                      stackOut_6_0 = wv.a((byte) -98, param1.charAt(var2_int));
                      stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          break L3;
                        } else {
                          var2_int++;
                          continue L1;
                        }
                      }
                    }
                  }
                  stackOut_10_0 = var2_int;
                  stackIn_13_0 = stackOut_10_0;
                  break L2;
                }
                L4: while (true) {
                  L5: {
                    L6: {
                      if (stackIn_13_0 >= var3) {
                        break L6;
                      } else {
                        stackOut_14_0 = wv.a((byte) -95, param1.charAt(var3 - 1));
                        stackIn_19_0 = stackOut_14_0 ? 1 : 0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var9 != 0) {
                          break L5;
                        } else {
                          if (!stackIn_15_0) {
                            break L6;
                          } else {
                            var3--;
                            stackOut_12_0 = var2_int;
                            stackIn_13_0 = stackOut_12_0;
                            continue L4;
                          }
                        }
                      }
                    }
                    stackOut_18_0 = var3 - var2_int;
                    stackIn_19_0 = stackOut_18_0;
                    break L5;
                  }
                  var4 = stackIn_19_0;
                  if ((var4 ^ -1) <= -2) {
                    if (12 >= var4) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L7: while (true) {
                        L8: {
                          if (var3 <= var6) {
                            stackOut_34_0 = var5.length() ^ -1;
                            stackIn_35_0 = stackOut_34_0;
                            break L8;
                          } else {
                            var7 = param1.charAt(var6);
                            stackOut_26_0 = or.a((byte) 61, (char) var7);
                            stackIn_35_0 = stackOut_26_0 ? 1 : 0;
                            stackIn_27_0 = stackOut_26_0;
                            if (var9 != 0) {
                              break L8;
                            } else {
                              L9: {
                                if (!stackIn_27_0) {
                                  break L9;
                                } else {
                                  var8 = iv.a(241, (char) var7);
                                  if (var8 != 0) {
                                    discarded$2 = var5.append((char) var8);
                                    break L9;
                                  } else {
                                    if (var9 == 0) {
                                      break L9;
                                    } else {
                                      discarded$3 = var5.append((char) var8);
                                      break L9;
                                    }
                                  }
                                }
                              }
                              var6++;
                              continue L7;
                            }
                          }
                        }
                        if (stackIn_35_0 != param0) {
                          stackOut_38_0 = var5.toString();
                          stackIn_39_0 = stackOut_38_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          stackOut_36_0 = null;
                          stackIn_37_0 = stackOut_36_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var2);
            stackOut_40_1 = new StringBuilder().append("uk.P(").append(param0).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L10;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L10;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_37_0);
        } else {
          return stackIn_39_0;
        }
    }

    final boolean g(int param0) {
        an var2 = null;
        L0: {
          if (!this.field_D) {
            break L0;
          } else {
            if (!this.field_nb) {
              var2 = ki.c((byte) 94);
              if (var2 != null) {
                this.a(false, (byte) -128, var2);
                break L0;
              } else {
                if (param0 != -28778) {
                  return false;
                } else {
                  return super.g(param0 + 0);
                }
              }
            } else {
              if (param0 != -28778) {
                return false;
              } else {
                return super.g(param0 + 0);
              }
            }
          }
        }
        if (param0 != -28778) {
          return false;
        } else {
          return super.g(param0 + 0);
        }
    }

    static {
        field_ob = false;
        field_lb = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
