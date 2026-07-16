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
        int var5 = 0;
        int var6 = 0;
        nl var7 = null;
        nl stackIn_1_0 = null;
        nl stackIn_2_0 = null;
        nl stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        nl stackOut_0_0 = null;
        nl stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        nl stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = (nl) param3;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((param0 ^ -1) == -2) {
            stackOut_2_0 = (nl) (Object) stackIn_2_0;
            stackOut_2_1 = 1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (nl) (Object) stackIn_1_0;
            stackOut_1_1 = -1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_n = stackIn_3_1;
        param3.field_j = 0;
        param3.field_z = -hf.a(param0, param1, 27);
        var7 = param1.field_P[param0][-param3.field_z];
        var5 = var7.field_w;
        var6 = var7.field_M;
        if (param2 > -12) {
          return;
        } else {
          L1: {
            if (0 > var6) {
              var5 = 44040192;
              var6 = 29360128;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            param3.field_h = uv.a(true, var5 + -param3.field_w, var6 - param3.field_M);
            param3.a((byte) -31, 2);
            param3.field_L = param3.field_L + 25;
            if (15 > param3.field_o) {
              param3.field_o = param3.field_o + 1;
              break L2;
            } else {
              break L2;
            }
          }
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
        NumberFormatException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        Object var5 = null;
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
        Object stackIn_30_0 = null;
        li stackIn_36_0 = null;
        li stackIn_40_0 = null;
        int decompiledRegionSelector0 = 0;
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
        Object stackOut_29_0 = null;
        li stackOut_14_0 = null;
        li stackOut_22_0 = null;
        li stackOut_20_0 = null;
        li stackOut_17_0 = null;
        var5 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            if (((lk) this).field_k == vu.field_Ab) {
              L1: {
                stackOut_3_0 = ((lk) this).field_j;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (param0) {
                  stackOut_5_0 = (tf) (Object) stackIn_5_0;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = (tf) (Object) stackIn_4_0;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              var7 = new li[((tf) (Object) stackIn_6_0).a(stackIn_6_1 != 0)];
              var8 = var7;
              var4 = 0;
              var5 = (Object) (Object) (lk) (Object) ((lk) this).field_j.g(24009);
              L2: while (true) {
                if (var5 == null) {
                  stackOut_9_0 = lo.a(var8, false, param1, ((lk) var5).field_h);
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                } else {
                  int incrementValue$1 = var4;
                  var4++;
                  var7[incrementValue$1] = ((lk) var5).a(true, param1);
                  var5 = (Object) (Object) (lk) (Object) ((lk) var5).field_j.c(33);
                  continue L2;
                }
              }
            } else {
              if (((lk) var5).field_k != pv.field_H) {
                if (((lk) var5).field_k == ra.field_N) {
                  stackOut_26_0 = new li(((lk) var5).field_h.equals((Object) (Object) "true"));
                  stackIn_27_0 = stackOut_26_0;
                  return stackIn_27_0;
                } else {
                  if (param0) {
                    if (((lk) var5).field_k != v.field_d) {
                      if (rb.field_Mb == ((lk) var5).field_k) {
                        stackOut_39_0 = new li((Object) (Object) ((lk) var5).field_h.substring(1, -1 + ((lk) var5).field_h.length()));
                        stackIn_40_0 = stackOut_39_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      var9 = ((lk) var5).field_h.substring(1, ((lk) var5).field_h.length() - 1);
                      if (-2 != (var9.length() ^ -1)) {
                        throw new dw("Invalid char value: " + var9);
                      } else {
                        stackOut_35_0 = new li(var9.charAt(0));
                        stackIn_36_0 = stackOut_35_0;
                        return stackIn_36_0;
                      }
                    }
                  } else {
                    stackOut_29_0 = null;
                    stackIn_30_0 = stackOut_29_0;
                    return (li) (Object) stackIn_30_0;
                  }
                }
              } else {
                var3_int = Character.toLowerCase(((lk) var5).field_h.charAt(((lk) var5).field_h.length() - 1));
                if (var3_int == 102) {
                  stackOut_14_0 = new li(Float.valueOf(((lk) var5).field_h).floatValue());
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                } else {
                  if (108 != var3_int) {
                    if (-1 == ((lk) var5).field_h.indexOf('.')) {
                      stackOut_22_0 = new li(Integer.parseInt(((lk) var5).field_h));
                      stackIn_23_0 = stackOut_22_0;
                      return stackIn_23_0;
                    } else {
                      stackOut_20_0 = new li(Double.valueOf(((lk) var5).field_h).doubleValue());
                      stackIn_21_0 = stackOut_20_0;
                      return stackIn_21_0;
                    }
                  } else {
                    stackOut_17_0 = new li(Long.parseLong(((lk) var5).field_h.substring(0, -1 + ((lk) var5).field_h.length())));
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (NumberFormatException) (Object) decompiledCaughtException;
          throw new dw("NumberFormatException on: " + ((lk) var5).field_h);
        }
        if (decompiledRegionSelector0 == 0) {
          throw new IllegalArgumentException();
        } else {
          return stackIn_40_0;
        }
    }

    lk(int param0, int param1) {
        this(param0, param1, (String) null);
    }

    public final String toString() {
        if (vu.field_Ab == ((lk) this).field_k) {
            return "Method{" + ((lk) this).field_h + "}";
        }
        if (!(pv.field_H != ((lk) this).field_k)) {
            return "Number{" + ((lk) this).field_h + "}";
        }
        if (!(ra.field_N != ((lk) this).field_k)) {
            return "Boolean{" + ((lk) this).field_h + "}";
        }
        if (((lk) this).field_k == v.field_d) {
            return "Char{" + ((lk) this).field_h + "}";
        }
        if (((lk) this).field_k == rb.field_Mb) {
            return "String{" + ((lk) this).field_h + "}";
        }
        if (si.field_g == ((lk) this).field_k) {
            return "ArgStart";
        }
        if (((lk) this).field_k == og.field_c) {
            return "ArgEnd";
        }
        if (!(((lk) this).field_k != bp.field_Gb)) {
            return "ArgComma";
        }
        return "Unknown";
    }

    lk(int param0, int param1, String param2) {
        ((lk) this).field_k = param0;
        ((lk) this).field_f = param1;
        ((lk) this).field_h = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Invite only";
        field_e = "You have won this auction! The player now appears in your squad under the Management menu.";
        field_i = "ok";
        field_n = "Friends";
    }
}
