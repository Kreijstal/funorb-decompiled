/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends tc {
    static int field_m;
    static String field_t;
    at field_k;
    int field_q;
    static int[] field_p;
    static String field_l;
    String field_o;
    static String field_n;
    static String field_r;
    static String field_u;
    int field_s;

    og(int param0, int param1) {
        this(param0, param1, (String) null);
    }

    final static void a(int param0, boolean param1) {
        if (ik.field_d != null) {
          if (ik.field_d.a((byte) 102, param1)) {
            ik.field_d = null;
            if (param0 != 16756) {
              og.a(-87, true);
              return;
            } else {
              return;
            }
          } else {
            if (param0 == 16756) {
              return;
            } else {
              og.a(-87, true);
              return;
            }
          }
        } else {
          if (param0 == 16756) {
            return;
          } else {
            og.a(-87, true);
            return;
          }
        }
    }

    public final String toString() {
        if (!(this.field_q != rn.field_c)) {
            return "Method{" + this.field_o + "}";
        }
        if (!(gg.field_G != this.field_q)) {
            return "Number{" + this.field_o + "}";
        }
        if (gb.field_z == this.field_q) {
            return "Boolean{" + this.field_o + "}";
        }
        if (!(this.field_q != hf.field_h)) {
            return "Char{" + this.field_o + "}";
        }
        if (!(this.field_q != iu.field_x)) {
            return "String{" + this.field_o + "}";
        }
        if (!(mo.field_j != this.field_q)) {
            return "ArgStart";
        }
        if (gm.field_d == this.field_q) {
            return "ArgEnd";
        }
        if (!(this.field_q != sb.field_d)) {
            return "ArgComma";
        }
        return "Unknown";
    }

    final static void a(long param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        CharSequence var5 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              qd.field_G = param2;
              rs.field_t = 2;
              var5 = (CharSequence) ((Object) param2);
              wm.field_b = k.a(var5, false);
              dj.field_e = param0;
              hh.a((byte) 118);
              if (param1 == 1) {
                break L1;
              } else {
                field_r = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("og.D(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final nd a(int param0, dr[] param1) throws cb, ef {
        int incrementValue$1 = 0;
        NumberFormatException var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        og var5 = null;
        int var6 = 0;
        nd[] var7 = null;
        nd[] var8 = null;
        String var9 = null;
        nd stackIn_9_0 = null;
        nd stackIn_14_0 = null;
        nd stackIn_17_0 = null;
        nd stackIn_21_0 = null;
        nd stackIn_23_0 = null;
        nd stackIn_27_0 = null;
        nd stackIn_33_0 = null;
        nd stackIn_36_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        nd stackOut_8_0 = null;
        nd stackOut_20_0 = null;
        nd stackOut_22_0 = null;
        nd stackOut_16_0 = null;
        nd stackOut_13_0 = null;
        nd stackOut_26_0 = null;
        nd stackOut_32_0 = null;
        nd stackOut_35_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (param0 == 1) {
                    break L2;
                  } else {
                    og.a(64, true);
                    break L2;
                  }
                }
                if (this.field_q == rn.field_c) {
                  var7 = new nd[this.field_k.b(false)];
                  var8 = var7;
                  var4 = 0;
                  var5 = (og) ((Object) this.field_k.e((byte) 106));
                  L3: while (true) {
                    L4: {
                      if (var5 == null) {
                        break L4;
                      } else {
                        incrementValue$1 = var4;
                        var4++;
                        var7[incrementValue$1] = var5.a(1, param1);
                        var5 = (og) ((Object) this.field_k.a((byte) 123));
                        if (var6 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    stackOut_8_0 = na.a(param1, (byte) 2, var8, this.field_o);
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 0;
                    break L1;
                  }
                } else {
                  if (this.field_q == gg.field_G) {
                    var3_int = Character.toLowerCase(this.field_o.charAt(-1 + this.field_o.length()));
                    if (102 != var3_int) {
                      if (var3_int != 108) {
                        if (0 != (this.field_o.indexOf('.') ^ -1)) {
                          stackOut_20_0 = new nd(Double.valueOf(this.field_o).doubleValue());
                          stackIn_21_0 = stackOut_20_0;
                          decompiledRegionSelector0 = 3;
                          break L1;
                        } else {
                          stackOut_22_0 = new nd(Integer.parseInt(this.field_o));
                          stackIn_23_0 = stackOut_22_0;
                          decompiledRegionSelector0 = 4;
                          break L1;
                        }
                      } else {
                        stackOut_16_0 = new nd(Long.parseLong(this.field_o.substring(0, this.field_o.length() + -1)));
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      }
                    } else {
                      stackOut_13_0 = new nd(Float.valueOf(this.field_o).floatValue());
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    }
                  } else {
                    if (gb.field_z == this.field_q) {
                      stackOut_26_0 = new nd(this.field_o.equals("true"));
                      stackIn_27_0 = stackOut_26_0;
                      decompiledRegionSelector0 = 5;
                      break L1;
                    } else {
                      if (hf.field_h == this.field_q) {
                        var9 = this.field_o.substring(1, -1 + this.field_o.length());
                        if (var9.length() == 1) {
                          stackOut_32_0 = new nd(var9.charAt(0));
                          stackIn_33_0 = stackOut_32_0;
                          decompiledRegionSelector0 = 6;
                          break L1;
                        } else {
                          throw new cb("Invalid char value: " + var9);
                        }
                      } else {
                        if (iu.field_x != this.field_q) {
                          decompiledRegionSelector0 = 7;
                          break L1;
                        } else {
                          stackOut_35_0 = new nd(this.field_o.substring(1, this.field_o.length() - 1));
                          stackIn_36_0 = stackOut_35_0;
                          decompiledRegionSelector0 = 8;
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (NumberFormatException) (Object) decompiledCaughtException;
              throw new cb("NumberFormatException on: " + this.field_o);
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
                            throw new IllegalArgumentException();
                          } else {
                            decompiledRegionSelector1 = 7;
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var3_ref);
            stackOut_40_1 = new StringBuilder().append("og.B(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_14_0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_17_0;
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
                      return stackIn_33_0;
                    } else {
                      return stackIn_36_0;
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_p = null;
        field_l = null;
        field_r = null;
        if (!param0) {
            return;
        }
        field_t = null;
        field_u = null;
    }

    og(int param0, int param1, String param2) {
        try {
            this.field_q = param0;
            this.field_o = param2;
            this.field_s = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "og.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = "Most Mana spent";
        field_n = "Tower";
        field_l = "Missions completed: <%0> of <%1>";
        field_r = "(Leader)";
        field_u = "Campaign Selection";
    }
}
