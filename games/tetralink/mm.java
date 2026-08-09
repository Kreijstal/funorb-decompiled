/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm extends um {
    static om field_y;
    static int field_w;
    static sd field_u;
    static je field_s;
    private nn field_r;
    static String field_q;
    private nn field_t;
    static String[] field_x;
    static String[] field_v;

    final static void a(ri param0, byte param1, boolean param2) {
        if (param1 >= -44) {
            return;
        }
        try {
            fe.a(param0, 256, param2, 113);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "mm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final jk a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        jk stackIn_3_0 = null;
        jk stackIn_7_0 = null;
        jk stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = this.field_t.field_A.toLowerCase();
            var4 = param1.toLowerCase();
            if (var4.length() == 0) {
              stackIn_3_0 = db.field_h;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (!oe.a((byte) -41, var4, var3)) {
                stackIn_7_0 = db.field_h;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0 == 0) {
                    break L1;
                  } else {
                    field_v = (String[]) null;
                    break L1;
                  }
                }
                if (this.a(param1, (byte) 47)) {
                  stackIn_13_0 = db.field_h;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return pf.field_a;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("mm.C(").append(param0).append(',');

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
          throw oi.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    mm(nn param0, nn param1, nn param2) {
        super(param0);
        try {
            this.field_r = param2;
            this.field_t = param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "mm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        ri var2;
        field_v = null;
        field_x = null;
        if (param0 != 0) {
          var2 = (ri) null;
          mm.a((ri) null, (byte) 14, false);
          field_s = null;
          field_y = null;
          field_u = null;
          field_q = null;
          return;
        } else {
          field_s = null;
          field_y = null;
          field_u = null;
          field_q = null;
          return;
        }
    }

    private final boolean a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        int stackIn_8_0 = 0;
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
              var3 = this.field_r.field_A.toLowerCase();
              var4 = 124 / ((param1 - -5) / 36);
              var5 = param0.toLowerCase();
              if (-1 <= (var3.length() ^ -1)) {
                break L1;
              } else {
                if ((var5.length() ^ -1) < -1) {
                  var6 = var3.lastIndexOf("@");
                  if (var6 < 0) {
                    break L1;
                  } else {
                    if (var3.length() + -1 > var6) {
                      var7 = var3.substring(0, var6);
                      var8 = var3.substring(var6 - -1);
                      if (-1 < (var5.indexOf(var7) ^ -1)) {
                        if (0 > var5.indexOf(var8)) {
                          break L1;
                        } else {
                          stackIn_11_0 = 1;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        stackIn_8_0 = 1;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                } else {
                  return false;
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

            stackIn_16_1 = new StringBuilder().append("mm.B(");

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
          throw oi.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final String a(String param0, int param1) {
        boolean discarded$1 = false;
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
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
            var7 = this.field_t.field_A.toLowerCase();
            var4 = param0.toLowerCase();
            if (var4.length() != 0) {
              var5 = var4;
              if (pi.a(var5, 17510)) {
                stackIn_6_0 = ka.field_i;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (!q.a(false, var5)) {
                  if (ha.a(var5, -78)) {
                    stackIn_13_0 = ac.field_d;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L1: {
                      if (param1 == 26202) {
                        break L1;
                      } else {
                        var6 = (String) null;
                        discarded$1 = this.a((String) null, (byte) -27);
                        break L1;
                      }
                    }
                    if (!this.a(param0, (byte) 89)) {
                      if ((var7.length() ^ -1) < -1) {
                        if (jd.a(var5, -6270, var7)) {
                          stackIn_25_0 = oj.field_f;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (!mf.a((byte) -28, var7, var5)) {
                            if (qa.a(16732, var5, var7)) {
                              stackIn_32_0 = oj.field_f;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              return ka.field_i;
                            }
                          } else {
                            stackIn_28_0 = ei.field_h;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      } else {
                        stackIn_21_0 = nb.field_W;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_18_0 = nl.field_l;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_9_0 = ic.field_d;
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
            stackIn_35_0 = (RuntimeException) (var3);

            stackIn_35_1 = new StringBuilder().append("mm.A(");

            if (param0 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L2;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param1 + ')');
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
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_28_0;
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

    static {
        field_q = "Try again";
        field_x = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_v = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
