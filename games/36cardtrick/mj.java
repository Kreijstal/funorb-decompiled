/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mj {
    static int field_e;
    di[] field_d;
    static String[] field_c;
    static int[] field_b;
    static String field_a;

    final int a(boolean param0, int param1) {
        int var4 = 0;
        di var5 = null;
        int var6 = Main.field_T;
        if (!param0) {
            return 120;
        }
        di[] var7 = this.field_d;
        di[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5.field_a.length > param1) {
                return var5.field_a[param1];
            }
            param1 = param1 - (-1 + var5.field_a.length);
        }
        return 0;
    }

    final static String a(int param0) {
        String discarded$0 = null;
        if (!(g.field_A >= 2)) {
            return ti.field_c;
        }
        if (param0 != -1) {
            discarded$0 = mj.a(30);
        }
        if (!(lb.field_a == null)) {
            if (!(lb.field_a.b(4))) {
                return oe.field_d;
            }
            return fg.field_j;
        }
        if (!(jk.field_c.b(4))) {
            return kf.field_j;
        }
        if (!jk.field_c.b(4, "commonui")) {
            return bk.field_f + " - " + jk.field_c.a("commonui", 0) + "%";
        }
        if (!aa.field_db.b(4)) {
            return ak.field_L;
        }
        if (!aa.field_db.b(4, "commonui")) {
            return nc.field_b + " - " + aa.field_db.a("commonui", 0) + "%";
        }
        if (!sg.field_a.b(4)) {
            return tb.field_e;
        }
        if (!sg.field_a.a((byte) 88)) {
            return rj.field_w + " - " + sg.field_a.a(2) + "%";
        }
        return tj.field_H;
    }

    final int b(byte param0) {
        int var2 = 0;
        di[] var3 = null;
        int var4 = 0;
        di var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Main.field_T;
        if (param0 == -5) {
          L0: {
            var2 = -1;
            if (null != this.field_d) {
              var3 = this.field_d;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var3.length) {
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var6 = var5.a((byte) 117);
                    if (var2 < var6) {
                      var2 = var6;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          return -56;
        }
    }

    final int a(int param0, int param1, int param2) {
        int discarded$2 = 0;
        int var4 = 0;
        int var5 = 0;
        di var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Main.field_T;
          if (null == this.field_d) {
            break L0;
          } else {
            if (-1 == (this.field_d.length ^ -1)) {
              break L0;
            } else {
              if (param0 < this.field_d[0].field_b) {
                break L0;
              } else {
                if (param0 <= this.field_d[this.field_d.length + -1].field_c) {
                  if (this.field_d.length == 1) {
                    return this.field_d[0].a(1, param1);
                  } else {
                    L1: {
                      if (param2 <= -26) {
                        break L1;
                      } else {
                        discarded$2 = mj.a(42, 19, true, true);
                        break L1;
                      }
                    }
                    var4 = 0;
                    var5 = 0;
                    L2: while (true) {
                      if (this.field_d.length <= var5) {
                        return -1;
                      } else {
                        L3: {
                          var6 = this.field_d[var5];
                          if (var6.field_b > param0) {
                            break L3;
                          } else {
                            if (param0 > var6.field_c) {
                              break L3;
                            } else {
                              var7 = var6.a(1, param1);
                              if (-1 != var7) {
                                return var4 - -var7;
                              } else {
                                return -1;
                              }
                            }
                          }
                        }
                        var4 = var4 + (-1 + var6.field_a.length);
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  return -1;
                }
              }
            }
          }
        }
        return -1;
    }

    public static void a(byte param0) {
        int discarded$0 = 0;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 < 109) {
            discarded$0 = mj.a(9, 26, false, false);
        }
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            this.field_d = (di[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_d == null) {
              break L2;
            } else {
              if (-1 <= (this.field_d.length ^ -1)) {
                break L2;
              } else {
                stackOut_4_0 = this.field_d[this.field_d.length - 1].field_c - this.field_d[0].field_b;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1, String param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = Main.field_T;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param2.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                L2: {
                  if (param3 == -53) {
                    break L2;
                  } else {
                    field_c = (String[]) null;
                    break L2;
                  }
                }
                if ((var5_int ^ -1) >= -1) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_16_0 = (-param1 + param0 << -1481667832) / var5_int;
                  stackIn_17_0 = stackOut_16_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  var9 = param2.charAt(var8);
                  if (var9 == 60) {
                    var6 = 1;
                    break L3;
                  } else {
                    if (var9 == 62) {
                      var6 = 0;
                      break L3;
                    } else {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L3;
                        } else {
                          var8++;
                          continue L1;
                        }
                      } else {
                        var8++;
                        continue L1;
                      }
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("mj.B(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0;
        } else {
          return stackIn_19_0;
        }
    }

    final static int a(int param0, int param1, boolean param2, boolean param3) {
        if (!param3) {
            return -86;
        }
        return vf.b((byte) 103);
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        di var4 = null;
        int var5 = Main.field_T;
        for (var3 = 0; this.field_d.length > var3; var3++) {
            var4 = this.field_d[var3];
            if (!(param1 >= var4.field_a.length)) {
                return var3;
            }
            param1 = param1 - (var4.field_a.length + -1);
        }
        if (param0 != -13453) {
            field_a = (String) null;
        }
        return this.field_d.length;
    }

    static {
        field_c = new String[]{"Showing by rating", "Showing by win percentage"};
        field_a = "Player Name: ";
    }
}
