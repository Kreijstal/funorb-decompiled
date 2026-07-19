/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends gd {
    static int field_j;
    private nk field_l;
    private nk field_i;
    static int field_k;

    final fd a(String param0, byte param1) {
        boolean discarded$2 = false;
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        fd stackIn_4_0 = null;
        fd stackIn_8_0 = null;
        fd stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fd stackOut_7_0 = null;
        fd stackOut_11_0 = null;
        fd stackOut_3_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 52) {
                break L1;
              } else {
                var5 = (String) null;
                discarded$2 = this.b((String) null, (byte) 79);
                break L1;
              }
            }
            var3 = this.field_i.field_q.toLowerCase();
            var4 = param0.toLowerCase();
            if (0 != var4.length()) {
              if (!ll.a(-103, var3, var4)) {
                stackOut_7_0 = g.field_k;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (this.b(param0, (byte) -57)) {
                  stackOut_11_0 = g.field_k;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return tg.field_d;
                }
              }
            } else {
              stackOut_3_0 = g.field_k;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3_ref);
            stackOut_13_1 = new StringBuilder().append("wa.N(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final static ij a(boolean param0, boolean param1) {
        int discarded$4 = 0;
        String discarded$5 = null;
        int discarded$6 = 0;
        String discarded$7 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        da var8 = null;
        on var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_22_0 = null;
        L0: {
          var7 = HoldTheLine.field_D;
          var8 = rd.field_e;
          var3 = var8.f((byte) -70);
          if ((128 & var3) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          jc.field_f = stackIn_3_0 != 0;
          ch.field_m = 127 & var3;
          pj.field_o = var8.f((byte) -104);
          fc.field_c = var8.d(true);
          if (-3 != (ch.field_m ^ -1)) {
            kf.field_H = 0;
            vn.field_f = 0;
            break L1;
          } else {
            kf.field_H = var8.k(-108);
            vn.field_f = var8.c(false);
            break L1;
          }
        }
        L2: {
          if (1 != var8.f((byte) -101)) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          wj.field_a = var8.j(-1231);
          if (!param1) {
            break L3;
          } else {
            field_k = 82;
            break L3;
          }
        }
        L4: {
          if (var4 == 0) {
            kl.field_u = wj.field_a;
            break L4;
          } else {
            kl.field_u = var8.j(-1231);
            break L4;
          }
        }
        L5: {
          if (1 == ch.field_m) {
            discarded$4 = var8.k(95);
            discarded$5 = var8.j(-1231);
            break L5;
          } else {
            if (ch.field_m != 4) {
              break L5;
            } else {
              discarded$6 = var8.k(95);
              discarded$7 = var8.j(-1231);
              break L5;
            }
          }
        }
        if (!param0) {
          fi.field_kb = ta.a(80, var8, param1);
          lm.field_d = null;
          return new ij(param0);
        } else {
          var5 = var8.k(99);
          try {
            L6: {
              L7: {
                var9 = hg.field_H.a(var5, 1);
                fi.field_kb = var9.f(245197136);
                if (kl.field_u.equals(ng.field_e)) {
                  stackOut_23_0 = null;
                  stackIn_24_0 = (int[]) ((Object) stackOut_23_0);
                  break L7;
                } else {
                  stackOut_22_0 = var9.field_o;
                  stackIn_24_0 = stackOut_22_0;
                  break L7;
                }
              }
              lm.field_d = stackIn_24_0;
              break L6;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            bl.a((Throwable) ((Object) var6), (byte) -49, "CC1");
            lm.field_d = null;
            fi.field_kb = null;
            return new ij(param0);
          }
          return new ij(param0);
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (nc.field_h == null) {
          return -1;
        } else {
          if (param0 > 114) {
            if (param2 >= qm.field_b) {
              if (param2 < nc.field_h.field_s + qm.field_b) {
                L0: {
                  if (param1 < pk.field_L) {
                    break L0;
                  } else {
                    if (pk.field_L + nc.field_h.field_y <= param1) {
                      break L0;
                    } else {
                      return 0;
                    }
                  }
                }
                if (vg.field_J <= param2) {
                  if (param2 < nc.field_h.field_s + vg.field_J) {
                    if (param1 >= le.field_t) {
                      if (le.field_t - -nc.field_h.field_y <= param1) {
                        return -1;
                      } else {
                        return 1;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                if (vg.field_J <= param2) {
                  if (param2 < nc.field_h.field_s + vg.field_J) {
                    if (param1 >= le.field_t) {
                      if (le.field_t - -nc.field_h.field_y > param1) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              }
            } else {
              if (vg.field_J <= param2) {
                if (param2 < nc.field_h.field_s + vg.field_J) {
                  if (param1 >= le.field_t) {
                    if (le.field_t - -nc.field_h.field_y > param1) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            }
          } else {
            return -100;
          }
        }
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_32_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_14_0 = null;
        String stackOut_18_0 = null;
        String stackOut_28_0 = null;
        String stackOut_33_0 = null;
        String stackOut_31_0 = null;
        String stackOut_24_0 = null;
        String stackOut_21_0 = null;
        String stackOut_10_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        try {
          L0: {
            var6 = this.field_i.field_q.toLowerCase();
            var4 = param0.toLowerCase();
            if (0 != var4.length()) {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  field_k = -118;
                  break L1;
                }
              }
              var5 = var4;
              if (wc.a(var5, (byte) -27)) {
                stackOut_7_0 = mf.field_b;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!t.a(0, var5)) {
                  if (aa.a(var5, 1)) {
                    stackOut_14_0 = ak.field_a;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (this.b(param0, (byte) -57)) {
                      stackOut_18_0 = pc.field_i;
                      stackIn_19_0 = stackOut_18_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (0 < var6.length()) {
                        if (!ka.a(var5, (byte) 126, var6)) {
                          if (jc.a(var5, var6, 95)) {
                            stackOut_28_0 = mc.field_c;
                            stackIn_29_0 = stackOut_28_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (!an.a((byte) -127, var5, var6)) {
                              stackOut_33_0 = mf.field_b;
                              stackIn_34_0 = stackOut_33_0;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              stackOut_31_0 = le.field_p;
                              stackIn_32_0 = stackOut_31_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        } else {
                          stackOut_24_0 = le.field_p;
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackOut_21_0 = vj.field_m;
                        stackIn_22_0 = stackOut_21_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackOut_10_0 = md.field_c;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
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
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var3);
            stackOut_35_1 = new StringBuilder().append("wa.L(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L2;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param1 + ')');
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
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
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

    final static hj[] a(int param0, int param1, int param2, int param3, int param4) {
        hj[] var5 = null;
        hj[] var6 = null;
        var6 = new hj[9];
        var5 = var6;
        hj dupTemp$4 = mk.a(param2, 124, param0);
        var6[6] = dupTemp$4;
        var5[3] = dupTemp$4;
        var5[2] = dupTemp$4;
        var5[param1] = dupTemp$4;
        var5[0] = dupTemp$4;
        hj dupTemp$5 = mk.a(param4, wb.a(param1, -97), param0);
        var5[8] = dupTemp$5;
        var5[7] = dupTemp$5;
        var5[5] = dupTemp$5;
        if (-1 != (param3 ^ -1)) {
          var5[4] = mk.a(param3, param1 + -108, 64);
          return var5;
        } else {
          return var5;
        }
    }

    wa(nk param0, nk param1, nk param2) {
        super(param0);
        try {
            this.field_l = param2;
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "wa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean b(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -57) {
                break L1;
              } else {
                this.field_i = (nk) null;
                break L1;
              }
            }
            L2: {
              var3 = this.field_l.field_q.toLowerCase();
              var4 = param0.toLowerCase();
              if ((var3.length() ^ -1) >= -1) {
                break L2;
              } else {
                if ((var4.length() ^ -1) >= -1) {
                  break L2;
                } else {
                  var5 = var3.lastIndexOf("@");
                  if (var5 < 0) {
                    break L2;
                  } else {
                    if (var3.length() - 1 > var5) {
                      var6 = var3.substring(0, var5);
                      var7 = var3.substring(var5 + 1);
                      if ((var4.indexOf(var6) ^ -1) > -1) {
                        if (var4.indexOf(var7) < 0) {
                          break L2;
                        } else {
                          stackOut_11_0 = 1;
                          stackIn_12_0 = stackOut_11_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        stackOut_8_0 = 1;
                        stackIn_9_0 = stackOut_8_0;
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
            stackOut_13_0 = 0;
            stackIn_14_0 = stackOut_13_0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("wa.V(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
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

    static {
    }
}
