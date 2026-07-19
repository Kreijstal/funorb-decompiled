/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends gn {
    static String field_m;
    int field_f;
    static String field_e;
    static String field_n;
    int field_k;
    static int field_g;
    static int field_l;
    static String field_i;
    String field_h;
    tf field_j;

    final static void a(int param0, nu param1, int param2, nl param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        nl var7 = null;
        nl stackIn_1_0 = null;
        nl stackIn_2_0 = null;
        nl stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nl stackOut_0_0 = null;
        nl stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        nl stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
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
              stackOut_0_0 = (nl) (param3);
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if ((param0 ^ -1) == -2) {
                stackOut_2_0 = (nl) ((Object) stackIn_2_0);
                stackOut_2_1 = 1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = (nl) ((Object) stackIn_1_0);
                stackOut_1_1 = -1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            stackIn_3_0.field_n = stackIn_3_1;
            param3.field_j = 0;
            param3.field_z = -hf.a(param0, param1, 27);
            var7 = param1.field_P[param0][-param3.field_z];
            var5 = var7.field_w;
            var6 = var7.field_M;
            if (param2 <= -12) {
              L2: {
                if (0 > var6) {
                  var5 = 44040192;
                  var6 = 29360128;
                  break L2;
                } else {
                  break L2;
                }
              }
              param3.field_h = uv.a(true, var5 + -param3.field_w, var6 - param3.field_M);
              param3.a((byte) -31, 2);
              param3.field_L = param3.field_L + 25;
              if (15 > param3.field_o) {
                param3.field_o = param3.field_o + 1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("lk.A(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_m = null;
        if (param0 != 0) {
            return;
        }
        field_n = null;
        field_i = null;
    }

    final li a(boolean param0, tm[] param1) throws dw, fi {
        int incrementValue$1 = 0;
        NumberFormatException var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        lk var5 = null;
        int var6 = 0;
        li[] var7 = null;
        li[] var8 = null;
        String var9 = null;
        tf stackIn_4_0 = null;
        tf stackIn_5_0 = null;
        tf stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        li stackIn_10_0 = null;
        li stackIn_15_0 = null;
        li stackIn_18_0 = null;
        li stackIn_21_0 = null;
        li stackIn_23_0 = null;
        li stackIn_27_0 = null;
        li stackIn_30_0 = null;
        li stackIn_36_0 = null;
        li stackIn_40_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        tf stackOut_3_0 = null;
        tf stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        tf stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        li stackOut_9_0 = null;
        li stackOut_26_0 = null;
        li stackOut_39_0 = null;
        li stackOut_35_0 = null;
        li stackOut_29_0 = null;
        li stackOut_14_0 = null;
        li stackOut_22_0 = null;
        li stackOut_20_0 = null;
        li stackOut_17_0 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            try {
              L1: {
                if (this.field_k == vu.field_Ab) {
                  L2: {
                    stackOut_3_0 = this.field_j;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (param0) {
                      stackOut_5_0 = (tf) ((Object) stackIn_5_0);
                      stackOut_5_1 = 0;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L2;
                    } else {
                      stackOut_4_0 = (tf) ((Object) stackIn_4_0);
                      stackOut_4_1 = 1;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L2;
                    }
                  }
                  var7 = new li[((tf) (Object) stackIn_6_0).a(stackIn_6_1 != 0)];
                  var8 = var7;
                  var4 = 0;
                  var5 = (lk) ((Object) this.field_j.g(24009));
                  L3: while (true) {
                    if (var5 == null) {
                      stackOut_9_0 = lo.a(var8, false, param1, this.field_h);
                      stackIn_10_0 = stackOut_9_0;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    } else {
                      incrementValue$1 = var4;
                      var4++;
                      var7[incrementValue$1] = var5.a(true, param1);
                      var5 = (lk) ((Object) this.field_j.c(33));
                      continue L3;
                    }
                  }
                } else {
                  if (this.field_k != pv.field_H) {
                    if (this.field_k == ra.field_N) {
                      stackOut_26_0 = new li(this.field_h.equals("true"));
                      stackIn_27_0 = stackOut_26_0;
                      decompiledRegionSelector0 = 5;
                      break L1;
                    } else {
                      if (param0) {
                        if (this.field_k != v.field_d) {
                          if (rb.field_Mb == this.field_k) {
                            stackOut_39_0 = new li(this.field_h.substring(1, -1 + this.field_h.length()));
                            stackIn_40_0 = stackOut_39_0;
                            decompiledRegionSelector0 = 9;
                            break L1;
                          } else {
                            decompiledRegionSelector0 = 8;
                            break L1;
                          }
                        } else {
                          var9 = this.field_h.substring(1, this.field_h.length() - 1);
                          if (-2 != (var9.length() ^ -1)) {
                            throw new dw("Invalid char value: " + var9);
                          } else {
                            stackOut_35_0 = new li(var9.charAt(0));
                            stackIn_36_0 = stackOut_35_0;
                            decompiledRegionSelector0 = 7;
                            break L1;
                          }
                        }
                      } else {
                        stackOut_29_0 = (li) null;
                        stackIn_30_0 = stackOut_29_0;
                        decompiledRegionSelector0 = 6;
                        break L1;
                      }
                    }
                  } else {
                    var3_int = Character.toLowerCase(this.field_h.charAt(this.field_h.length() - 1));
                    if (var3_int == 102) {
                      stackOut_14_0 = new li(Float.valueOf(this.field_h).floatValue());
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      if (108 != var3_int) {
                        if (-1 == this.field_h.indexOf('.')) {
                          stackOut_22_0 = new li(Integer.parseInt(this.field_h));
                          stackIn_23_0 = stackOut_22_0;
                          decompiledRegionSelector0 = 4;
                          break L1;
                        } else {
                          stackOut_20_0 = new li(Double.valueOf(this.field_h).doubleValue());
                          stackIn_21_0 = stackOut_20_0;
                          decompiledRegionSelector0 = 3;
                          break L1;
                        }
                      } else {
                        stackOut_17_0 = new li(Long.parseLong(this.field_h.substring(0, -1 + this.field_h.length())));
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (NumberFormatException) (Object) decompiledCaughtException;
              throw new dw("NumberFormatException on: " + this.field_h);
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    decompiledRegionSelector1 = 3;
                    break L0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      decompiledRegionSelector1 = 4;
                      break L0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        decompiledRegionSelector1 = 5;
                        break L0;
                      } else {
                        if (decompiledRegionSelector0 == 6) {
                          decompiledRegionSelector1 = 6;
                          break L0;
                        } else {
                          if (decompiledRegionSelector0 == 7) {
                            decompiledRegionSelector1 = 7;
                            break L0;
                          } else {
                            if (decompiledRegionSelector0 == 8) {
                              throw new IllegalArgumentException();
                            } else {
                              decompiledRegionSelector1 = 8;
                              break L0;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var3_ref);
            stackOut_44_1 = new StringBuilder().append("lk.C(").append(param0).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L4;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_10_0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_15_0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_18_0;
            } else {
              if (decompiledRegionSelector1 == 3) {
                return stackIn_21_0;
              } else {
                if (decompiledRegionSelector1 == 4) {
                  return stackIn_23_0;
                } else {
                  if (decompiledRegionSelector1 == 5) {
                    return stackIn_27_0;
                  } else {
                    if (decompiledRegionSelector1 == 6) {
                      return stackIn_30_0;
                    } else {
                      if (decompiledRegionSelector1 == 7) {
                        return stackIn_36_0;
                      } else {
                        return stackIn_40_0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    lk(int param0, int param1) {
        this(param0, param1, (String) null);
    }

    public final String toString() {
        if (vu.field_Ab == this.field_k) {
            return "Method{" + this.field_h + "}";
        }
        if (!(pv.field_H != this.field_k)) {
            return "Number{" + this.field_h + "}";
        }
        if (!(ra.field_N != this.field_k)) {
            return "Boolean{" + this.field_h + "}";
        }
        if (this.field_k == v.field_d) {
            return "Char{" + this.field_h + "}";
        }
        if (this.field_k == rb.field_Mb) {
            return "String{" + this.field_h + "}";
        }
        if (si.field_g == this.field_k) {
            return "ArgStart";
        }
        if (this.field_k == og.field_c) {
            return "ArgEnd";
        }
        if (!(this.field_k != bp.field_Gb)) {
            return "ArgComma";
        }
        return "Unknown";
    }

    lk(int param0, int param1, String param2) {
        try {
            this.field_k = param0;
            this.field_f = param1;
            this.field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "lk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Invite only";
        field_e = "You have won this auction! The player now appears in your squad under the Management menu.";
        field_i = "ok";
        field_n = "Friends";
    }
}
