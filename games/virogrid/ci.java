/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends qe {
    static p field_o;
    private wa field_p;
    static int field_q;
    static int field_r;
    static String field_n;
    static mg field_s;

    public static void h(int param0) {
        if (param0 >= -6) {
            return;
        }
        field_s = null;
        field_n = null;
        field_o = null;
    }

    final static boolean i(int param0) {
        if (param0 != 24410) {
            return true;
        }
        return !w.field_I.b(-95) ? true : false;
    }

    final String a(int param0, String param1) {
        le var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_2_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -26358) {
              L1: {
                if (!(this.field_p instanceof fg)) {
                  break L1;
                } else {
                  var3 = ((fg) ((Object) this.field_p)).a(-1);
                  if (var3 == null) {
                    break L1;
                  } else {
                    L2: {
                      if (var3.a(-22243) != bm.field_i) {
                        break L2;
                      } else {
                        if (!param1.equals(this.field_p.field_n)) {
                          stackIn_9_0 = od.field_t;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_11_0 = var3.b(28433);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              if (!param1.equals(this.field_p.field_n)) {
                stackIn_15_0 = od.field_t;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("ci.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    final static void c(byte param0) {
        oh.field_c = null;
        if (param0 != 45) {
            ci.a(-6L, -103);
            oj.field_Gb = null;
            return;
        }
        oj.field_Gb = null;
    }

    final wl a(String param0, boolean param1) {
        le var3 = null;
        RuntimeException var3_ref = null;
        wl stackIn_7_0 = null;
        wl stackIn_11_0 = null;
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
              if (param1) {
                break L1;
              } else {
                field_s = (mg) null;
                break L1;
              }
            }
            L2: {
              if (this.field_p instanceof fg) {
                var3 = ((fg) ((Object) this.field_p)).a(-1);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.a(-22243) == bm.field_i) {
                    break L2;
                  } else {
                    stackIn_7_0 = ee.field_c;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (!param0.equals(this.field_p.field_n)) {
                stackIn_11_0 = ee.field_c;
                break L3;
              } else {
                stackIn_11_0 = bm.field_i;
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("ci.E(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static String a(long param0, int param1) {
        StringBuilder discarded$1 = null;
        int var3;
        long var4;
        StringBuilder var6;
        long var7;
        int var9;
        int var10;
        int var11;
        var11 = Virogrid.field_F ? 1 : 0;
        if ((param0 ^ -1L) < -1L) {
          if (6582952005840035281L > param0) {
            if (-1L != (param0 % 37L ^ -1L)) {
              var3 = 0;
              var4 = param0;
              L0: while (true) {
                if (0L == var4) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if ((param0 ^ -1L) == -1L) {
                      var6.reverse();
                      if (param1 <= 64) {
                        ci.i(-57);
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      } else {
                        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                        return var6.toString();
                      }
                    } else {
                      L2: {
                        var7 = param0;
                        param0 = param0 / 37L;
                        var9 = h.field_f[(int)(-(param0 * 37L) + var7)];
                        if (var9 != 95) {
                          break L2;
                        } else {
                          var10 = var6.length() + -1;
                          var9 = 160;
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          break L2;
                        }
                      }
                      discarded$1 = var6.append((char) var9);
                      continue L1;
                    }
                  }
                } else {
                  var4 = var4 / 37L;
                  var3++;
                  continue L0;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void b(boolean param0, int param1) {
        tm.field_l.a(0, 0, 0);
        if (param1 >= -125) {
            ci.j(39);
        }
    }

    ci(wa param0, wa param1) {
        super(param0);
        try {
            this.field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "ci.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static km j(int param0) {
        if (param0 >= -109) {
            return (km) null;
        }
        return cg.b(1463);
    }

    static {
        field_q = -1;
        field_n = "<%0> has not yet unlocked this option for use.";
    }
}
